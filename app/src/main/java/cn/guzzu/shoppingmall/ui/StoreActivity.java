package cn.guzzu.shoppingmall.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.HeaderAndFooterWrapper;
import cn.guzzu.shoppingmall.adapter.StoreAdapter;
import cn.guzzu.shoppingmall.bean.Products;
import cn.guzzu.shoppingmall.bean.Store;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.callback.GsonArrayGetHeaderCallback;
import cn.guzzu.baselibrary.callback.GsonObjectCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import okhttp3.Call;
import okhttp3.Headers;

public class StoreActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.mRv)
    RecyclerView mRv;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout mRefreshLayout;


    private List<Products> products = new ArrayList<>();
    private StoreAdapter storeAdapter;
    private int i = 1;
    private  AppCompatImageView mStoreImg;
    private  AppCompatTextView mStoreName;
    private HeaderAndFooterWrapper mHeaderAndFooterWrapper;

    @Override
    public int initLayout() {
        return R.layout.activity_store;
    }

    @Override
    public void initView() {
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.finish(context);
            }
        });
        View view = LayoutInflater.from(this).inflate(R.layout.layout_store_item,null);
        mStoreImg = view.findViewById(R.id.store_img);
        mStoreName = view.findViewById(R.id.store_name);
        storeAdapter = new StoreAdapter(context);
        mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(storeAdapter);
        mHeaderAndFooterWrapper.addHeaderView(view);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        mRv.setLayoutManager(manager);

        mRefreshLayout.setRefreshFooter(new ClassicsFooter(this).setSpinnerStyle(SpinnerStyle.Scale));
        mRefreshLayout.setRefreshHeader(new ClassicsHeader(this).setSpinnerStyle(SpinnerStyle.Scale));
    }

    @Override
    public void initData() {
        final String storeId = getIntent().getStringExtra("storeId");
        OkHttp3Utils.doGet(Api.STORE + storeId, new GsonObjectCallback<Store>() {
            @Override
            public void onUiThread(Store store, String json) {
                mToolbar.setTitle(store.getName());
                mStoreName.setText(store.getName());
                try {
                    Glide.with(context).load(store.getLogo().getUrl()).apply(RequestOptions.fitCenterTransform()).into(mStoreImg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
        OkHttp3Utils.doGet(Api.STORE + storeId + "/products", new GsonArrayGetHeaderCallback<Products>() {
            @Override
            public void onUiThread(int code, Headers headers, List<Products> list) {
                products = list;
                String counter = headers.get("x-total-count");
                final int page = (int) Math.ceil(Double.valueOf(counter) / 10);
                storeAdapter.setItems(products);
                mRv.setAdapter(mHeaderAndFooterWrapper);
                mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh(@NonNull final RefreshLayout refreshLayout) {
                        refreshLayout.setNoMoreData(false);
                        OkHttp3Utils.doGet(Api.STORE + storeId + "/products", new GsonArrayGetHeaderCallback<Products>() {
                            @Override
                            public void onUiThread(int code, Headers headers, List<Products> list) {
                                products.clear();
                                products.addAll(list);
                                i = 0;
                                storeAdapter.setItems(products);
                                mHeaderAndFooterWrapper.notifyDataSetChanged();
                                refreshLayout.finishRefresh();
                            }

                            @Override
                            public void onFailed(Call call, IOException exception) {

                            }
                        });
                        refreshLayout.finishRefresh();
                    }
                });
                mRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
                    @Override
                    public void onLoadMore(@NonNull final RefreshLayout refreshLayout) {
                        if (i < page) {
                            Log.d(TAG, "onLoadMore: " + page + "," + i);
                            Pair<String, String> pair = new Pair<>("p", String.valueOf(i));
                            i++;
                            OkHttp3Utils.doGet(Api.STORE + storeId + "/products", pair, new GsonArrayCallback<Products>() {
                                @Override
                                public void onUiThread(int code,List<Products> list) {
                                    products.addAll(list);
                                    storeAdapter.setItems(products);
                                    mHeaderAndFooterWrapper.notifyDataSetChanged();
                                    refreshLayout.finishLoadMore();
                                }

                                @Override
                                public void onFailed(Call call, IOException e) {

                                }
                            });

                        } else {
                            refreshLayout.finishLoadMoreWithNoMoreData();
                        }

                    }
                });
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void initListener() {


    }


}
