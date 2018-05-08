package guzzu.ian.guzzushoppingmall.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.Gson;
import com.gyf.barlibrary.ImmersionBar;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import guzzu.ian.baselibrary.base.BaseActivity;
import guzzu.ian.baselibrary.callback.JsonCallback;
import guzzu.ian.baselibrary.util.OkHttp3Utils;
import guzzu.ian.baselibrary.util.Utils;
import guzzu.ian.baselibrary.widget.LoadingDialog;
import guzzu.ian.guzzushoppingmall.Api;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.adapter.ProductRvAdapter;
import guzzu.ian.guzzushoppingmall.bean.Product;
import guzzu.ian.guzzushoppingmall.widget.FlowRadioGroup;
import okhttp3.Call;

public class ProductActivity extends BaseActivity {

    @BindView(R.id.rv_product)
    RecyclerView mRvProduct;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tab)
    TabLayout mTab;
    @BindView(R.id.tv_addcart)
    TextView mTvAddcart;
    @BindView(R.id.tv_buy)
    TextView mTvBuy;

    private Product product;
    private ProductRvAdapter productRvAdapter;
    private LinearLayoutManager manager;
    private int imgHeight;
    private LoadingDialog mLoading;
    private Dialog bottomDialog;
    int mIndex = 0;
    int top = 0;
    int middle = 0;
    float percent = 0;
    int selected = 0;

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
        bottomDialog = new Dialog(this, R.style.BottomDialog);
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
                initBottom();
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
                Log.d(TAG, "onScrollStateChanged: " + newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                mIndex = manager.findFirstVisibleItemPosition();
                if (mIndex < recyclerView.getChildCount() && mIndex < 1) {
                    top = recyclerView.getChildAt(mIndex).getTop();
                    middle = recyclerView.getChildAt(mIndex + 1).getTop();
                    imgHeight = Utils.getIntValue(context, "imgHeight");
                    if (imgHeight != 0) {
                        percent = (float) Math.abs(top) / (float) imgHeight;
                    }
                    Log.d(TAG, "product: " + percent + "," + top + "," + imgHeight);
                    mToolbar.setAlpha(percent);
                    mTab.setAlpha(percent);
                }
                if (percent == 0) {
                    mToolbar.setVisibility(View.GONE);
                } else {
                    mToolbar.setVisibility(View.VISIBLE);

                }
                if (mIndex == 1) {
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
                        switch (tab.getPosition()) {
                            case 0:
                                mRvProduct.smoothScrollToPosition(0);
                                break;
                            case 1:
                                mRvProduct.smoothScrollBy(0, middle);
                                percent = 1f;
                                break;
                        }
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {
                        switch (tab.getPosition()) {
                            case 0:
                                mRvProduct.smoothScrollToPosition(0);
                                break;
                            case 1:
                                mRvProduct.smoothScrollToPosition(1);
                                percent = 1f;
                                break;
                        }
                    }
                });
                Log.d(TAG, "onScrolled: " + percent + "," + dy + "," + recyclerView.getChildAt(0).getTop());
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

    private void cancelLoading() {
        if (mLoading != null && mLoading.isShowing()) {
            mLoading.dismiss();
        }
    }

    private void initBottom() {
        View contentView = LayoutInflater.from(this).inflate(R.layout.dialog_product_option, null);
        final TextView tv_name = contentView.findViewById(R.id.name);
        final TextView tv_price = contentView.findViewById(R.id.price);
        final ImageView iv = contentView.findViewById(R.id.img);
        FlowRadioGroup frg = contentView.findViewById(R.id.option);
        int i = 0;
        for (; i < product.getProductOptions().size(); i++) {
            RadioButton button = new RadioButton(this);
            setRdBtnAttribute(button, i);
            RadioGroup.LayoutParams rlp = new RadioGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            rlp.setMargins(Utils.dp2px(context, 6), Utils.dp2px(context, 6), Utils.dp2px(context, 6), Utils.dp2px(context, 6));
            frg.addView(button, rlp);
        }

        frg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = checkedId;
                tv_name.setText(product.getProductOptions().get(checkedId).getName());
                tv_price.setText("￥" + String.valueOf(product.getPrice() / 100));
                Log.d(TAG, "onCheckedChanged: " + checkedId);
            }
        });
        tv_name.setText(product.getName());
        tv_price.setText("￥" + String.valueOf(product.getPrice() / 100));
        Glide.with(context).load(product.getImage().getUrl()).apply(RequestOptions.fitCenterTransform()).into(iv);
        bottomDialog.setContentView(contentView);
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = getResources().getDisplayMetrics().widthPixels;
        contentView.setLayoutParams(layoutParams);
        bottomDialog.getWindow().setGravity(Gravity.BOTTOM);
        bottomDialog.getWindow().setWindowAnimations(R.style.BottomDialog_Animation);
        productRvAdapter.setDialog(bottomDialog);
    }

    private void setRdBtnAttribute(final RadioButton rdBtn, int pos) {
        if (null == rdBtn) {
            return;
        }
        if (selected == pos) {
            rdBtn.setChecked(true);
        }
        rdBtn.setBackgroundResource(R.drawable.rdbtn_selector);
        rdBtn.setTextColor(getResources().getColorStateList(R.color.color_radiobutton));
        //codeBtn.setTextSize( ( textSize > 16 )?textSize:24 );
        rdBtn.setId(pos);
        rdBtn.setTextSize(18);
        rdBtn.setButtonDrawable(new ColorDrawable(Color.TRANSPARENT));
        rdBtn.setText(product.getProductOptions().get(pos).getName());
        rdBtn.setPadding(Utils.dp2px(this, 12), Utils.dp2px(this, 6), Utils.dp2px(this, 12), Utils.dp2px(this, 12));
        rdBtn.setGravity(Gravity.CENTER);
        rdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }



    @OnClick({R.id.tv_buy, R.id.tv_addcart})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_buy:
                bottomDialog.dismiss();
                bottomDialog.show();
                break;
            case R.id.tv_addcart:
                bottomDialog.dismiss();
                bottomDialog.show();
                break;
        }
    }
}
