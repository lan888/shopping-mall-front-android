package guzzu.ian.guzzushoppingmall.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.gyf.barlibrary.ImmersionBar;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import guzzu.ian.baselibrary.base.BaseActivity;
import guzzu.ian.baselibrary.callback.JsonCallback;
import guzzu.ian.baselibrary.util.OkHttp3Utils;
import guzzu.ian.baselibrary.util.Utils;
import guzzu.ian.baselibrary.widget.LoadingDialog;
import guzzu.ian.guzzushoppingmall.Api;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.adapter.ProductRvAdapter;
import guzzu.ian.guzzushoppingmall.bean.Product;
import okhttp3.Call;

public class ProductActivity extends BaseActivity {

    @BindView(R.id.rv_product)
    RecyclerView mRvProduct;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tab)
    TabLayout mTab;

    private Product product;
    private ProductRvAdapter productRvAdapter;
    private LinearLayoutManager manager;
    private int imgHeight;
    private LoadingDialog mLoading;
    int mIndex = 0;
    int top = 0;
    int middle = 0;
    float percent = 0;
    @Override
    public int initLayout() {
        return R.layout.activity_product;
    }

    @Override
    public void initView() {
        ImmersionBar.with(this).transparentStatusBar().init();
        showLoading("加载中");
        mTab.addTab(mTab.newTab().setText("商品"));
        mTab.addTab(mTab.newTab().setText("详情"));
    }

    @Override
    public void initData() {

        String mProductId = getIntent().getStringExtra("productId");
        OkHttp3Utils.doGet(Api.PRODUCT + mProductId, new JsonCallback() {
            @Override
            public void onUiThread(String json) {
                Gson gson = new Gson();
                product = gson.fromJson(json, Product.class);
                manager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
                mRvProduct.setLayoutManager(manager);
                productRvAdapter = new ProductRvAdapter(ProductActivity.this, product);
                mRvProduct.setAdapter(productRvAdapter);
                cancelLoading();
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    @Override
    public void initListener() {
        mRvProduct.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                Log.d(TAG, "onScrollStateChanged: "+newState );
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                mIndex = manager.findFirstVisibleItemPosition();
                if (mIndex<recyclerView.getChildCount()&&mIndex<1){
                    top = recyclerView.getChildAt(mIndex).getTop();
                    middle =recyclerView.getChildAt(mIndex+1).getTop();
                    imgHeight=Utils.getIntValue(context,"imgHeight");
                    if (imgHeight!=0){
                        percent=(float)Math.abs(top)/(float)imgHeight ;
                    }
                    Log.d(TAG, "product: "+percent+","+top+","+imgHeight);
                    mToolbar.setAlpha(percent);
                    mTab.setAlpha(percent);
                }
                if (mIndex==1) {
                    TabLayout.Tab tab = mTab.getTabAt(1);
                    if (tab != null) {
                        mTab.clearOnTabSelectedListeners();
                        tab.select();

                    }
                } else {
                    TabLayout.Tab tab = mTab.getTabAt(0);
                    if (tab != null) {
                        mTab.clearOnTabSelectedListeners();
                        tab.select();
                    }
                }
                mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        switch (tab.getPosition()){
                            case 0:
                                mRvProduct.smoothScrollToPosition(0);
                                break;
                            case 1:
                                mRvProduct.smoothScrollBy(0,middle);
                                percent = 1f;
                                break;
                        }
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });
                Log.d(TAG, "onScrolled: "+percent+","+dy+","+recyclerView.getChildAt(0).getTop());
            }
        });

//        mAppbarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                Log.e(TAG, "onOffsetChanged: " + verticalOffset + "," + appBarLayout.getTotalScrollRange());
//                float percent = Float.valueOf(Math.abs(verticalOffset)) / Float.valueOf(appBarLayout.getTotalScrollRange());
////                mTopContent.setAlpha(Math.abs(percent - 1));
//                mToolbar.setAlpha(percent);
//                if (percent == 1) {
//                    TabLayout.Tab tab = mTab.getTabAt(1);
//                    if (tab != null) {
//                        tab.select();
//                    }
//                } else {
//                    TabLayout.Tab tab = mTab.getTabAt(0);
//                    if (tab != null) {
//                        tab.select();
//                    }
//                }
//
//
//            }
//        });

    }


    /* @param context context
     * @return 状态栏高度
     */
    private int getStatusBarHeight(Context context) {
        // 获得状态栏高度
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return context.getResources().getDimensionPixelSize(resourceId);
    }
    private void showLoading(String text) {
        cancelLoading();
        if (mLoading == null) {
            mLoading = new LoadingDialog(context);
            mLoading.setCancelable(false);
            mLoading.setCanceledOnTouchOutside(false);
        }
        mLoading.setTitle(text);
        mLoading.show();
    }

    private  void cancelLoading() {
        if (mLoading != null && mLoading.isShowing()) {
            mLoading.dismiss();
        }
    }

}
