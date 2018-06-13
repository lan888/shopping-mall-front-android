package cn.guzzu.shoppingmall.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.Gson;
import com.gyf.barlibrary.ImmersionBar;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.util.UtilsLog;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.ItemTitlePagerAdapter;
import cn.guzzu.shoppingmall.bean.CartAll;
import cn.guzzu.shoppingmall.bean.FragmentChangeEvent;
import cn.guzzu.shoppingmall.bean.Product;
import cn.guzzu.shoppingmall.fragment.GoodsDetailFragment;
import cn.guzzu.shoppingmall.fragment.GoodsInfoFragment;
import cn.guzzu.shoppingmall.widget.FlowRadioGroup;
import cn.guzzu.shoppingmall.widget.NoScrollViewPager;
import cn.guzzu.shoppingmall.widget.ShoppingCartAmountView;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.baselibrary.widget.CircleImageView;
import cn.guzzu.baselibrary.widget.LoadingDialog;
import okhttp3.Call;
import q.rorbin.badgeview.QBadgeView;

public class ProductActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tab)
    TabLayout mTab;
    @BindView(R.id.tv_addcart)
    TextView mTvAddcart;
    @BindView(R.id.tv_buy)
    TextView mTvBuy;
    @BindView(R.id.tv_cart)
    TextView mTvCart;
    @BindView(R.id.iv_circle_back)
    CircleImageView mIvCircleBack;
    @BindView(R.id.vp_content)
    NoScrollViewPager mVpContent;

    private String optionName;
    private int optionCount;
    private Gson gson;
    private Product product;
    private int imgHeight;
    private Dialog bottomDialog;
    private TabLayout.OnTabSelectedListener mOnTabSelectedListener;
    private WebView mWebView;
    private List<Fragment> fragmentList = new ArrayList<>();
    private GoodsInfoFragment goodsInfoFragment;
    private boolean isHided = false;
    private boolean isShow = false;
    private int selected = 0;
    private int mAmount = 1;

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
        mIvCircleBack.setOnClickListener(new View.OnClickListener() {
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
        fragmentList.add(goodsInfoFragment = GoodsInfoFragment.newInstance(mProductId));
        fragmentList.add(GoodsDetailFragment.newInstance(mProductId));
        mVpContent.setAdapter(new ItemTitlePagerAdapter(getSupportFragmentManager(),
                fragmentList, new String[]{"商品", "详情"}));
        mVpContent.setOffscreenPageLimit(1);
        mTab.setupWithViewPager(mVpContent);
        OkHttp3Utils.doGet(Api.PRODUCT + mProductId, new JsonCallback() {
            @Override
            public void onUiThread(int code,String json) {
                if (code==404){
                    showLoading("The product is not available\n找不到该商品");
                    new Thread() {
                        @Override
                        public void run() {
                            super.run();
                            try {
                                Thread.sleep(1000);//休眠2秒
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            cancelLoading();
                            finish();
                            /**
                             * 要执行的操作
                             */
                        }
                    }.start();
                }else {
                    Gson gson = new Gson();
                    product = gson.fromJson(json, Product.class);
                    cancelLoading();
                    initBottom();
                    goodsInfoFragment.setBottomDialog(bottomDialog);
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
        OkHttp3Utils.doPost(Api.GUZZU + Api.CART_ALL, BaseApp.Constant.userId, "zh", new GsonArrayCallback<CartAll>() {
            @Override
            public void onUiThread(int code, List<CartAll> list) {
                if (code==200){
                    int cartCount=0;
                    for (int i = 0;i<list.size();i++){
                        cartCount += list.get(i).getItems().size();
                    }
                    new QBadgeView(context).bindTarget(mTvCart).setBadgeNumber(cartCount);

                }
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });

    }

    @Override
    public void initListener() {

        initOnTabSelectedListener();
        mTab.addOnTabSelectedListener(mOnTabSelectedListener);

    }

    private void initOnTabSelectedListener() {
        if (mOnTabSelectedListener != null) return;
        mOnTabSelectedListener = new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        if (isHided){
                            mToolbar.setVisibility(View.GONE);
                            mIvCircleBack.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 1:
                        mToolbar.setVisibility(View.VISIBLE);
                        mToolbar.setAlpha(1f);
                        mTab.setAlpha(1f);
                        mIvCircleBack.setVisibility(View.GONE);
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

                        break;
                    case 1:

                        break;
                }
            }
        };
    }

    /* @param context context
     * @return 状态栏高度
     */
    private int getStatusBarHeight(Context context) {
        // 获得状态栏高度
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return context.getResources().getDimensionPixelSize(resourceId);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPositionChanged(FragmentChangeEvent event){
        Log.d(TAG, "onPositionChanged: "+event.getDy()+event.isShow());

        if (event.getDy()>0){
            mToolbar.setVisibility(View.VISIBLE);
            mToolbar.setAlpha(1f);
            mTab.setAlpha(1f);
            mIvCircleBack.setVisibility(View.GONE);
            isHided = false;
        }else {
            isHided = true;
            mToolbar.setVisibility(View.GONE);
            mIvCircleBack.setVisibility(View.VISIBLE);
        }
        isShow = event.isShow();
        if (isShow){
                mToolbar.setVisibility(View.VISIBLE);
                mToolbar.setAlpha(1f);
                mTab.setAlpha(1f);
                mIvCircleBack.setVisibility(View.GONE);
                isShow = false;
        }
        mVpContent.setNoScroll(event.isDetailShow());


    }




    private void initBottom() {
        View contentView = LayoutInflater.from(this).inflate(R.layout.dialog_product_option, null);
        final TextView tv_name = contentView.findViewById(R.id.name);
        final TextView tv_price = contentView.findViewById(R.id.price);
        final TextView mBtnBuy = contentView.findViewById(R.id.btn_buy);
        final TextView mBtnCart = contentView.findViewById(R.id.tv_addcart);
        TextView tv_opt = contentView.findViewById(R.id.tv_opt);
        ScrollView sv = contentView.findViewById(R.id.sv);
        final ImageView iv = contentView.findViewById(R.id.img);
        final ShoppingCartAmountView mAmountView = contentView.findViewById(R.id.amount_view);
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
                tv_price.setText("¥" + String.valueOf((double)product.getProductOptions().get(checkedId).getPrice() / 100));
                if (product.getProductOptions().get(checkedId).getInventoryPolicy().equals("unlimited")){
                    mAmountView.setGoods_storage(99).setAmount(1);
                    mAmountView.setOnAmountChangeListener(new ShoppingCartAmountView.OnAmountChangeListener() {
                        @Override
                        public void onAmountChange(View view, int amount) {
                            listener.process(product.getProductOptions().get(selected).getName(),amount);
                            mAmount = amount;
                        }
                    });
                }else {
                    mAmountView.setGoods_storage(product.getProductOptions().get(checkedId).getMaxQuantity()).setAmount(1);
                    mAmountView.setOnAmountChangeListener(new ShoppingCartAmountView.OnAmountChangeListener() {
                        @Override
                        public void onAmountChange(View view, int amount) {
                            listener.process(product.getProductOptions().get(selected).getName(),amount);
                            mAmount = amount;
                        }
                    });
                }


                Log.d(TAG, "onCheckedChanged: " + checkedId+product.getProductOptions().get(checkedId).getMaxQuantity());



            }
        });

        tv_name.setText(product.getName());
        tv_price.setText("¥" + String.valueOf((double) product.getPrice() / 100));
        //判断库存有无限制
        if (product.getProductOptions().size()>0){
            tv_opt.setVisibility(View.VISIBLE);
            sv.setVisibility(View.VISIBLE);
            if (product.getProductOptions().get(0).getInventoryPolicy().equals("unlimited")){
                mAmountView.setGoods_storage(99).setAmount(1);
                mAmountView.setOnAmountChangeListener(new ShoppingCartAmountView.OnAmountChangeListener() {
                    @Override
                    public void onAmountChange(View view, int amount) {
                        listener.process(product.getName(),amount);
                        mAmount = amount;

                    }
                });
            }else {
                mAmountView.setGoods_storage(product.getProductOptions().get(0).getMaxQuantity()).setAmount(1);
                mAmountView.setOnAmountChangeListener(new ShoppingCartAmountView.OnAmountChangeListener() {
                    @Override
                    public void onAmountChange(View view, int amount) {
                        listener.process(product.getName(),amount);
                        mAmount = amount;

                    }
                });
            }
            mBtnBuy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (BaseApp.getInstance().isLogin()){
                        gson = new Gson();
                        Map<String,Object> map = new ArrayMap<>();
                        Map<String,String> productMap = new ArrayMap<>();
                        List<Map<String,String>> list = new ArrayList<>();
                        map.put("storeId",product.getStore());
                        productMap.put("productId",product.get_id());
                        productMap.put("quantity",String.valueOf(mAmount));
                        productMap.put("productOptionId",product.getProductOptions().get(selected).get_id());
                        list.add(productMap);
                        map.put("items",list);
                        Utils.start_Activity(context,SettledActivity.class,"product",gson.toJson(map));
                    }else {
                        Utils.start_Activity(context,LoginActivity.class);
                    }

                }
            });

            mBtnCart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (BaseApp.getInstance().isLogin()) {
                        Map<String, String> productMap = new ArrayMap<>();
                        productMap.put("productId", product.get_id());
                        productMap.put("quantity", String.valueOf(mAmount));
                        productMap.put("productOptionId", product.getProductOptions().get(selected).get_id());
                        productMap.put("storeId", product.getStore());
                        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.CART_ADD, productMap, BaseApp.Constant.userId, new JsonCallback() {
                            @Override
                            public void onUiThread(int code, String json) {
                                if (code == 200) {
                                    bottomDialog.dismiss();
                                    OkHttp3Utils.doPost(Api.GUZZU + Api.CART_ALL, BaseApp.Constant.userId, "zh", new GsonArrayCallback<CartAll>() {
                                        @Override
                                        public void onUiThread(int code, List<CartAll> list) {
                                            if (code == 200) {
                                                int cartCount = 0;
                                                for (int i = 0; i < list.size(); i++) {
                                                    cartCount += list.get(i).getItems().size();
                                                }
                                                new QBadgeView(context).bindTarget(mTvCart).setBadgeNumber(cartCount);

                                            }
                                        }

                                        @Override
                                        public void onFailed(Call call, IOException e) {

                                        }
                                    });
                                }
                            }

                            @Override
                            public void onFailed(Call call, IOException exception) {

                            }
                        });

                    }else {
                        Utils.start_Activity(context,LoginActivity.class);
                    }
                }
            });
        }else {
            tv_opt.setVisibility(View.GONE);
            sv.setVisibility(View.GONE);
            if (product.getInventoryPolicy().equals("unlimited")){
                mAmountView.setGoods_storage(99).setAmount(1);
                mAmountView.setOnAmountChangeListener(new ShoppingCartAmountView.OnAmountChangeListener() {
                    @Override
                    public void onAmountChange(View view, int amount) {
                        listener.process(product.getName(),amount);
                        mAmount = amount;

                    }
                });
            }else {
                mAmountView.setGoods_storage(product.getMaxQuantity());
                mAmountView.setOnAmountChangeListener(new ShoppingCartAmountView.OnAmountChangeListener() {
                    @Override
                    public void onAmountChange(View view, int amount) {
                        listener.process(product.getName(),amount);
                        mAmount = amount;
                    }
                });
            }
            mBtnBuy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (BaseApp.getInstance().isLogin()){
                        gson = new Gson();
                        Map<String,Object> map = new ArrayMap<>();
                        Map<String,String> productMap = new ArrayMap<>();
                        List<Map<String,String>> list = new ArrayList<>();
                        map.put("storeId",product.getStore());
                        productMap.put("productId",product.get_id());
                        productMap.put("quantity",String.valueOf(mAmount));
                        list.add(productMap);
                        map.put("items",list);
                        Utils.start_Activity(context,SettledActivity.class,"product",gson.toJson(map));
                    }else {
                        Utils.start_Activity(context,LoginActivity.class);
                    }



                }
            });

            mBtnCart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (BaseApp.getInstance().isLogin()) {
                        Map<String, String> productMap = new ArrayMap<>();
                        productMap.put("productId", product.get_id());
                        productMap.put("quantity", String.valueOf(mAmount));
                        productMap.put("storeId", product.getStore());
                        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.CART_ADD, productMap, BaseApp.Constant.userId, new JsonCallback() {
                            @Override
                            public void onUiThread(int code, String json) {
                                if (code == 200) {
                                    bottomDialog.dismiss();
                                    OkHttp3Utils.doPost(Api.GUZZU + Api.CART_ALL, BaseApp.Constant.userId, "zh", new GsonArrayCallback<CartAll>() {
                                        @Override
                                        public void onUiThread(int code, List<CartAll> list) {
                                            if (code == 200) {
                                                int cartCount = 0;
                                                for (int i = 0; i < list.size(); i++) {
                                                    cartCount += list.get(i).getItems().size();
                                                }
                                                new QBadgeView(context).bindTarget(mTvCart).setBadgeNumber(cartCount);

                                            }
                                        }

                                        @Override
                                        public void onFailed(Call call, IOException e) {

                                        }
                                    });

                                }
                            }

                            @Override
                            public void onFailed(Call call, IOException exception) {

                            }
                        });

                    }else {
                        Utils.start_Activity(context,LoginActivity.class);
                    }
                }
            });
        }

        Glide.with(context).load(product.getImage().getThumb().getUrl()).apply(RequestOptions.fitCenterTransform()).into(iv);
        bottomDialog.setContentView(contentView);
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = getResources().getDisplayMetrics().widthPixels;
        contentView.setLayoutParams(layoutParams);
        bottomDialog.getWindow().setGravity(Gravity.BOTTOM);
        bottomDialog.getWindow().setWindowAnimations(R.style.BottomDialog_Animation);
    }

    private void setRdBtnAttribute(final RadioButton rdBtn, int pos) {
        if (null == rdBtn) {
            return;
        }
        if (selected == pos) {
            rdBtn.setChecked(true);
        }
        rdBtn.setBackgroundResource(R.drawable.selector_rdbtn);
        rdBtn.setTextColor(getResources().getColorStateList(R.color.color_radiobutton));
        //codeBtn.setTextSize( ( textSize > 16 )?textSize:24 );
        rdBtn.setId(pos);
        rdBtn.setTextSize(16f);
        rdBtn.setEllipsize(TextUtils.TruncateAt.END);
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


    @OnClick({R.id.tv_buy, R.id.tv_addcart ,R.id.tv_cart})
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
            case R.id.tv_cart:
                Utils.start_Activity(this,MainActivity.class,"shoppingCart","2");
                break;
        }
    }
    // 2.1 定义用来与外部activity交互，获取到宿主activity
    private OnOptionClickListener listener;

    // 1 定义了所有activity必须实现的接口方法
    public interface OnOptionClickListener {
        void process(String str,int count);
    }

    public void setListener(OnOptionClickListener listener) {
        this.listener = listener;
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
