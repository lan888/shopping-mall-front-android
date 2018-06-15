package cn.guzzu.shoppingmall.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.ArrayMap;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.mancj.materialsearchbar.MaterialSearchBar;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.callback.GsonArrayGetHeaderCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.baselibrary.util.UtilsLog;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.StoreAdapter;
import cn.guzzu.shoppingmall.bean.Products;
import okhttp3.Call;
import okhttp3.Headers;

public class SearchDetailActivity extends BaseActivity {
    @BindView(R.id.searchBar)
    MaterialSearchBar mSearchBar;
    @BindView(R.id.tv_all)
    TextView mTvAll;
    @BindView(R.id.tv_sort_price)
    TextView mTvSortPrice;
    @BindView(R.id.mRv)
    RecyclerView mRv;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout mRefreshLayout;

    private List<Products> products;
    private StoreAdapter storeAdapter;
    private Map<String, String> params;
    private int i = 1;
    private boolean isDesc = true;
    @Override
    public int initLayout() {
        return R.layout.activity_search;
    }

    @Override
    public void initView() {
        mTvAll.setTextColor(getResources().getColor(R.color.red));
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        mRv.setLayoutManager(manager);
        storeAdapter = new StoreAdapter(context);
        mRefreshLayout.setRefreshFooter(new ClassicsFooter(this).setSpinnerStyle(SpinnerStyle.Scale));
        mRefreshLayout.setRefreshHeader(new ClassicsHeader(this).setSpinnerStyle(SpinnerStyle.Scale));
        params = new ArrayMap<>();
    }

    @Override
    public void initData() {
        showLoading("loading");
        String key = getIntent().getStringExtra("keyWord");
        mSearchBar.setText(key);
        mSearchBar.setNavButtonEnabled(true);
        mSearchBar.enableSearch();
        mSearchBar.setFocusable(false);
        params.put("text", key);
        OkHttp3Utils.doGet(Api.SEARCH_PRODUCT, params, new GsonArrayGetHeaderCallback<Products>() {
            @Override
            public void onUiThread(int code, Headers headers, List<Products> list) {
                if (code==200){
                    products = list;
                    String counter = headers.get("x-total-count");
                    final int page = (int) Math.ceil(Double.valueOf(counter) / 10);
                    storeAdapter.setItems(products);
                    mRv.setAdapter(storeAdapter);
                    cancelLoading();
                    mRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
                        @Override
                        public void onLoadMore(@NonNull final RefreshLayout refreshLayout) {
                            if (i < page){
                                params.put("p",String.valueOf(i));
                                i++;
                                OkHttp3Utils.doGet(Api.SEARCH_PRODUCT, params, new GsonArrayCallback<Products>() {
                                    @Override
                                    public void onUiThread(int code, String json, List<Products> list) {
                                        if (code==200){
                                            products.addAll(list);
                                            storeAdapter.setItems(products);
                                            refreshLayout.finishLoadMore();
                                        }else {
                                            refreshLayout.finishLoadMore(false);
                                        }

                                    }

                                    @Override
                                    public void onFailed(Call call, IOException e) {

                                    }
                                });
                            }else {
                                refreshLayout.finishLoadMoreWithNoMoreData();
                            }
                        }
                    });
                }else {
                    Utils.showShortToast(context,"发生错误，请重试");
                    finish();
                }

            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void initListener() {
        hideKeyboard();
        mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull final RefreshLayout refreshLayout) {
                refreshLayout.setNoMoreData(false);
                params.put("p","0");
                OkHttp3Utils.doGet(Api.SEARCH_PRODUCT, params, new GsonArrayGetHeaderCallback<Products>() {
                    @Override
                    public void onUiThread(int code, Headers headers, List<Products> list) {
                        products.clear();
                        products.addAll(list);
                        i = 1;
                        storeAdapter.setItems(products);
                        refreshLayout.finishRefresh();
                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {

                    }
                });
                refreshLayout.finishRefresh();
            }
        });
        mSearchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {
            @Override
            public void onSearchStateChanged(boolean enabled) {

            }

            @Override
            public void onSearchConfirmed(CharSequence text) {
                hideKeyboard();
                params.put("text", text.toString());
                params.put("p","0");
                OkHttp3Utils.doGet(Api.SEARCH_PRODUCT, params, new GsonArrayGetHeaderCallback<Products>() {
                    @Override
                    public void onUiThread(int code, Headers headers, List<Products> list) {
                        products.clear();
                        products.addAll(list);
                        i = 1;
                        storeAdapter.setItems(products);
                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {

                    }
                });
            }

            @Override
            public void onButtonClicked(int buttonCode) {
                switch (buttonCode) {
                    case MaterialSearchBar.BUTTON_BACK:
                        hideKeyboard();
                        finish();
                        break;
                }
            }
        });
    }


    @OnClick({R.id.tv_all, R.id.tv_sort_price})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_all:
                mTvAll.setTextColor(getResources().getColor(R.color.red));
                mTvSortPrice.setTextColor(getResources().getColor(R.color.gray));
                Drawable drawable = getResources().getDrawable(R.drawable.ic_arrow);
                mTvSortPrice.setCompoundDrawablesWithIntrinsicBounds(drawable,null,null,null);
                params.remove("sort");
                params.put("p","0");
                i = 1;
                OkHttp3Utils.doGet(Api.SEARCH_PRODUCT, params, new GsonArrayCallback<Products>() {
                    @Override
                    public void onUiThread(int code, String json, List<Products> list) {
                        products.clear();
                        products.addAll(list);
                        storeAdapter.setItems(products);
                    }

                    @Override
                    public void onFailed(Call call, IOException e) {

                    }
                });
                break;
            case R.id.tv_sort_price:
                mTvAll.setTextColor(getResources().getColor(R.color.gray));
                mTvSortPrice.setTextColor(getResources().getColor(R.color.red));
                Drawable drawableLeft = getResources().getDrawable(R.drawable.ic_arrow_asc);
                Drawable drawable2Left = getResources().getDrawable(R.drawable.ic_arrow_desc);
                if (isDesc){
                    mTvSortPrice.setCompoundDrawablesWithIntrinsicBounds(drawableLeft,null,null,null);
                    isDesc =!isDesc;
                    params.put("sort","price");
                    params.put("p","0");
                    i = 1;
                    OkHttp3Utils.doGet(Api.SEARCH_PRODUCT, params, new GsonArrayCallback<Products>() {
                        @Override
                        public void onUiThread(int code, String json, List<Products> list) {
                            products.clear();
                            products.addAll(list);
                            storeAdapter.setItems(products);
                        }

                        @Override
                        public void onFailed(Call call, IOException e) {

                        }
                    });
                }else {
                    isDesc =!isDesc;
                    mTvAll.setTextColor(getResources().getColor(R.color.gray));
                    mTvSortPrice.setTextColor(getResources().getColor(R.color.red));
                    mTvSortPrice.setCompoundDrawablesWithIntrinsicBounds(drawable2Left,null,null,null);
                    params.put("sort","-price");
                    params.put("p","0");
                    OkHttp3Utils.doGet(Api.SEARCH_PRODUCT, params, new GsonArrayCallback<Products>() {
                        @Override
                        public void onUiThread(int code, String json, List<Products> list) {
                            products.clear();
                            products.addAll(list);
                            storeAdapter.setItems(list);
                        }

                        @Override
                        public void onFailed(Call call, IOException e) {

                        }
                    });
                }



                break;
        }
    }
    private void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive() && getCurrentFocus() != null) {
            if (getCurrentFocus().getWindowToken() != null) {
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
    }
}
