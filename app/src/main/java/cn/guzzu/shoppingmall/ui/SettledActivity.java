package cn.guzzu.shoppingmall.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;
import com.gc.materialdesign.views.LayoutRipple;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.DataBindingViewUtil;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.baselibrary.util.UtilsLog;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.ProductOrderListAdapter;
import cn.guzzu.shoppingmall.bean.Discount;
import cn.guzzu.shoppingmall.bean.GoHomeEvent;
import cn.guzzu.shoppingmall.bean.OrderPreviewRequest;
import cn.guzzu.shoppingmall.bean.OrderPreviewResponse;
import cn.guzzu.shoppingmall.bean.ProductItem;
import cn.guzzu.shoppingmall.bean.WXPay;
import cn.guzzu.shoppingmall.bean.WxPayEvent;
import cn.guzzu.shoppingmall.util.LoginUtil;
import cn.guzzu.shoppingmall.util.WXPayUtil;
import okhttp3.Call;

public class SettledActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_name)
    TextView mTvName;
    @BindView(R.id.mobilePhone)
    TextView mMobilePhone;
    @BindView(R.id.address)
    TextView mAddress;
    @BindView(R.id.btn_select)
    ButtonRectangle mBtnSelect;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.tv_subtotal)
    TextView mTvSubtotal;
    @BindView(R.id.tv_shipping_cost)
    TextView mTvShippingCost;
    @BindView(R.id.tv_total_cost)
    TextView mTvTotalCost;
    @BindView(R.id.sp_discount)
    TextView mSpDiscount;
    @BindView(R.id.tv_total_paid)
    TextView mTvTotalPaid;
    @BindView(R.id.tv_buy)
    LayoutRipple mTvBuy;
    @BindView(R.id.ll_discount)
    LinearLayout mllDiscount;
    @BindView(R.id.tv_discount)
    TextView mTvDiscount;
    @BindView(R.id.cb_wx)
    CheckBox mCbWx;
    @BindView(R.id.cb_ali)
    CheckBox mCbAli;

    private Gson gson;
    private String mProduct;
    private String mPreviewJson;
    private Dialog bottomDialog;
    private String orderId;
    private ProductItem productItem;
    private OrderPreviewRequest.ShippingAddress addressLastUsed;
    private ProductOrderListAdapter mProductOrderListAdapter;
    private boolean isAddressNull;
    private int lastPosition = -1;
    private int payType = 1;//1-微信支付，2-支付宝
    private boolean isPaid = false;

    @Override
    public int initLayout() {
        return R.layout.activity_settled;
    }

    @Override
    public void initView() {
        if (mToolbar != null) {
            mToolbar.setTitle(getString(R.string.title_order_detail));
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mProductOrderListAdapter = new ProductOrderListAdapter();
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mProductOrderListAdapter);
        bottomDialog = new Dialog(this, R.style.BottomDialog);
        mCbWx.setChecked(true);
    }

    @Override
    public void initData() {
        mProduct = getIntent().getStringExtra("product");
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.DISCOUNT_FIND, mProduct, BaseApp.Constant.userId, new GsonArrayCallback<Discount>() {
            @Override
            public void onUiThread(int code, String json, List<Discount> list) {
                if (code == 200) {
                    if (list.size() == 0) {
                        mSpDiscount.setText("无可用");
                        mllDiscount.setClickable(false);
                    } else {
                        mSpDiscount.setText(list.size() + "张可用");
                        initBottom(list);
                    }
                }
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }

    @Override
    public void initListener() {
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.finish(context);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isPaid){
            Utils.start_Activity(this,OrderDetailActivity.class,"orderId",orderId);
            finish();
        }
        gson = new Gson();
        OkHttp3Utils.doPost(Api.GUZZU + Api.ADDRESS_LASTUSED, BaseApp.Constant.userId, "zh", new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code == 200) {
                    final OrderPreviewRequest orderPreviewRequest = new OrderPreviewRequest();
                    Date date = new Date(System.currentTimeMillis());
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                    if (json.equals("null")) {
                        mBtnSelect.setText("新增收货地址");
                        mTvName.setVisibility(View.GONE);
                        mAddress.setVisibility(View.GONE);
                        mMobilePhone.setVisibility(View.GONE);
                        mTvBuy.setBackgroundColor(getResources().getColor(R.color.gray_light));
                        mTvBuy.setClickable(false);
                        isAddressNull = true;
                        JSONObject obj = new JSONObject();
                        try {
                            obj.put("shoppingMall", "5adedc43de3c90022eb25d3b");
                            obj.put("shippingAddress", new JSONObject());
                            obj.put("shippingType", "regular");
                            obj.put("nonce", simpleDateFormat.format(date));
                            obj.put("type", "default");
                            JSONObject object = new JSONObject(mProduct);
                            obj.put("items", object.optJSONArray("items"));
                            obj.put("storeId", object.optString("storeId"));
                            mPreviewJson = obj.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    } else {
                        mTvBuy.setBackgroundColor(getResources().getColor(R.color.md_red_500));
                        mTvBuy.setClickable(true);
                        isAddressNull = false;
                        mBtnSelect.setText("选择收货地址");
                        addressLastUsed = gson.fromJson(json, OrderPreviewRequest.ShippingAddress.class);
                        mTvName.setVisibility(View.VISIBLE);
                        mAddress.setVisibility(View.VISIBLE);
                        mMobilePhone.setVisibility(View.VISIBLE);
                        mTvName.setText(addressLastUsed.getName());
                        mAddress.setText(addressLastUsed.getProvince() + addressLastUsed.getCity() + addressLastUsed.getDistrict() + addressLastUsed.getStreet() + addressLastUsed.getAddress());
                        mMobilePhone.setText(addressLastUsed.getMobilePhone());
                        orderPreviewRequest.setShoppingMall("5adedc43de3c90022eb25d3b");
                        orderPreviewRequest.setShippingAddress(addressLastUsed);
                        orderPreviewRequest.setShippingType("regular");
                        orderPreviewRequest.setNonce(simpleDateFormat.format(date));
                        orderPreviewRequest.setType("default");
                        List<OrderPreviewRequest.Items> itemsList = new ArrayList<>();
                        try {
                            JSONObject object = new JSONObject(mProduct);
                            JsonArray array = new JsonParser().parse(object.optString("items")).getAsJsonArray();
                            for (final JsonElement elem : array) {
                                //循环遍历把对象添加到集合
                                itemsList.add(gson.fromJson(elem, OrderPreviewRequest.Items.class));
                            }
                            orderPreviewRequest.setStoreId(object.optString("storeId"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Log.d(TAG, "onUiThread: " + mProduct);
                        orderPreviewRequest.setItems(itemsList);
                        mPreviewJson = gson.toJson(orderPreviewRequest);
                    }
                    OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_PREVIEW, mPreviewJson, BaseApp.Constant.userId, new JsonCallback() {
                        @Override
                        public void onUiThread(int code, String json) {
                            if (code == 200) {
                                OrderPreviewResponse orderPreviewResponse = gson.fromJson(json, OrderPreviewResponse.class);
                                List<ProductItem> productItemList = new ArrayList<>();
                                for (int i = 0; i < orderPreviewResponse.getOrder().getItems().size(); i++) {
                                    productItem = new ProductItem();
                                    productItem.setName(orderPreviewResponse.getOrder().getItems().get(i).getName());
                                    productItem.setPrice(orderPreviewResponse.getOrder().getItems().get(i).getPrice());
                                    ProductItem.Image image = new ProductItem.Image();
                                    image.setUrl(orderPreviewResponse.getOrder().getItems().get(i).getProduct().getImage().getThumb().getUrl());
                                    productItem.setImage(image);
                                    productItem.setQuantity(orderPreviewResponse.getOrder().getItems().get(i).getQuantity());
                                    productItemList.add(productItem);

                                }

                                mProductOrderListAdapter.setItems(productItemList);
                                Log.d(TAG, "onUiThread: " + orderPreviewResponse.getOrder().getTotalCost());
                                mTvDiscount.setText(getString(R.string.label_discount_price, (double) orderPreviewResponse.getOrder().getDiscount() / 100));
                                mTvShippingCost.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getShippingCost() / 100));
                                mTvSubtotal.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getSubtotal() / 100));
                                mTvTotalCost.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getTotalCost() / 100));
                                mTvTotalPaid.setText("合计：¥" + (double) orderPreviewResponse.getOrder().getTotalCost() / 100);
                            } else {
                                try {
                                    JSONObject object = new JSONObject(json);
                                    String err = object.optString("error");
                                    showLoading(err);
                                    new Thread() {
                                        @Override
                                        public void run() {
                                            super.run();
                                            try {
                                                Thread.sleep(1000);//休眠1秒
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
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                            }

                        }

                        @Override
                        public void onFailed(Call call, IOException exception) {

                        }
                    });

                } else {
                    if (LoginUtil.isLogin(context, json)) {
                        showLoading("The product is not available\n找不到该订单");
                        new Thread() {
                            @Override
                            public void run() {
                                super.run();
                                try {
                                    Thread.sleep(1000);//休眠1秒
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
                    }
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    private void initBottom(final List<Discount> list) {
        View contentView = LayoutInflater.from(this).inflate(R.layout.dialog_layout_discount, null);
        final LinearLayout mllDiscounts = contentView.findViewById(R.id.ll_items);
        ButtonRectangle mBtnNoDiscount = contentView.findViewById(R.id.btn_no_discount);
        DataBindingViewUtil.bindDataToLayout(list, mllDiscounts, R.layout.layout_discount_item, new DataBindingViewUtil.OnBindingDataListener<Discount>() {
            @Override
            public void onBindData(@NonNull View v, final Discount data, final int position) {
                TextView tvDiscountPercent = v.findViewById(R.id.tv_percent);
                TextView tvDiscountMin = v.findViewById(R.id.tv_min);
                TextView tvDiscountName = v.findViewById(R.id.tv_name);
                TextView tvDiscountDate = v.findViewById(R.id.tv_date);
                final CheckBox cb_select = v.findViewById(R.id.checkBox);
                cb_select.setTag(position);
                cb_select.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        UtilsLog.d(isChecked + "" + position + "" + lastPosition);
                        if (isChecked) {
                            if (lastPosition != -1) {
                                CheckBox lastCheckBox = mllDiscounts.getChildAt(lastPosition).findViewById(R.id.checkBox);
                                if (lastCheckBox != null) {
                                    lastCheckBox.setChecked(false);
                                }
                            }
                            lastPosition = (int) buttonView.getTag();
                            addDiscount(list, lastPosition);
                        } else {
                            removeDiscount(list);
                            lastPosition = -1;
                        }
                    }
                });
                if (position == lastPosition) {
                    cb_select.setChecked(true);
                } else {
                    cb_select.setChecked(false);
                }
                tvDiscountPercent.setText((100 - data.getCondition().getPercentage()) / 10 + "折");
                tvDiscountName.setText(data.getName());
                if (data.getCondition().getMinPurchase() == 0) {
                    tvDiscountMin.setText("无使用门槛");
                } else {
                    tvDiscountMin.setText("满" + (double) data.getCondition().getMinPurchase() / 100 + "元可用");
                }
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cb_select.setChecked(true);
                        addDiscount(list, position);
                    }
                });
            }
        });
        mBtnNoDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lastPosition != -1) {
                    CheckBox cb = mllDiscounts.getChildAt(lastPosition).findViewById(R.id.checkBox);
                    if (cb != null) {
                        cb.setChecked(false);
                        removeDiscount(list);
                    }
                } else {
                    bottomDialog.dismiss();
                }


            }
        });
        bottomDialog.setContentView(contentView);
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = getResources().getDisplayMetrics().widthPixels;
        contentView.setLayoutParams(layoutParams);
        bottomDialog.getWindow().setGravity(Gravity.BOTTOM);
        bottomDialog.getWindow().setWindowAnimations(R.style.BottomDialog_Animation);
    }

    private void addDiscount(List<Discount> list, int position) {
        try {
            JSONObject obj = new JSONObject(mPreviewJson);
            obj.put("discountId", list.get(position).getDiscountId());
            mPreviewJson = obj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_PREVIEW, mPreviewJson, BaseApp.Constant.userId, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code == 200) {
                    OrderPreviewResponse orderPreviewResponse = gson.fromJson(json, OrderPreviewResponse.class);
                    mTvDiscount.setText(getString(R.string.label_discount_price, (double) orderPreviewResponse.getOrder().getDiscount() / 100));
                    mTvShippingCost.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getShippingCost() / 100));
                    mTvSubtotal.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getSubtotal() / 100));
                    mTvTotalCost.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getTotalCost() / 100));
                    mTvTotalPaid.setText("合计：¥" + (double) orderPreviewResponse.getOrder().getTotalCost() / 100);
                    mSpDiscount.setText("优惠" + (double) orderPreviewResponse.getOrder().getDiscount() / 100);
                    bottomDialog.dismiss();
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    private void removeDiscount(final List<Discount> list) {
        try {
            JSONObject obj = new JSONObject(mPreviewJson);
            obj.remove("discountId");
            mPreviewJson = obj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_PREVIEW, mPreviewJson, BaseApp.Constant.userId, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code == 200) {
                    OrderPreviewResponse orderPreviewResponse = gson.fromJson(json, OrderPreviewResponse.class);
                    mTvDiscount.setText(getString(R.string.label_discount_price, (double) orderPreviewResponse.getOrder().getDiscount() / 100));
                    mTvShippingCost.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getShippingCost() / 100));
                    mTvSubtotal.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getSubtotal() / 100));
                    mTvTotalCost.setText(getString(R.string.label_price, (double) orderPreviewResponse.getOrder().getTotalCost() / 100));
                    mTvTotalPaid.setText("合计：¥" + (double) orderPreviewResponse.getOrder().getTotalCost() / 100);
                    mSpDiscount.setText(list.size() + "张可用");
                }
                bottomDialog.dismiss();
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    @OnClick({R.id.btn_select, R.id.tv_buy, R.id.ll_discount,R.id.cb_wx,R.id.cb_ali})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_select:
                if (isAddressNull) {
                    Utils.start_Activity(this, AddressAddActivity.class);
                } else {
                    Utils.start_Activity(this, AddressManagerActivity.class);
                }

                break;
            case R.id.tv_buy:
                try {
                    JSONObject object = new JSONObject(mPreviewJson);
                    object.put("clientType", "cn.guzzu.shoppingmall");
                    mPreviewJson = object.toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_CREATE, mPreviewJson, BaseApp.Constant.userId, new JsonCallback() {
                    @Override
                    public void onUiThread(int code, String json) {
                        if (code == 200) {
                            try {
                                JSONObject obj = new JSONObject(json);
                                orderId = obj.optString("_id");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Utils.showShortToast(context, "生成订单成功");
                            Map<String, String> map = new ArrayMap<>();
                            map.put("orderId", orderId);
                            OkHttp3Utils.doJsonPost(Api.GUZZU+Api.WX_PAY, map, BaseApp.Constant.userId, new JsonCallback() {
                                @Override
                                public void onUiThread(int code, String json) {
                                    if (code==200){
                                        WXPay wxPay = gson.fromJson(json, WXPay.class);
                                        if (BaseApp.mWxApi != null && BaseApp.mWxApi.isWXAppInstalled()){
                                            WXPayUtil.WXPayBuilder builder = new WXPayUtil.WXPayBuilder();
                                            builder.setAppId(BaseApp.Constant.APP_ID_WX);
                                            builder.setPartnerId(wxPay.getPartnerId());
                                            builder.setPrepayId(wxPay.getPrepayId());
                                            builder.setNonceStr(wxPay.getNonceStr());
                                            builder.setTimeStamp(wxPay.getTimeStamp());
                                            builder.setPackageValue(wxPay.getPackageX());
                                            builder.setSign(wxPay.getSign()).build().toWXPayNotSign();
                                        }else {
                                            Utils.showShortToast(context, "用户未安装微信");
                                        }

                                    }

                                }

                                @Override
                                public void onFailed(Call call, IOException exception) {

                                }
                            });
                        }
                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {

                    }
                });
                break;
            case R.id.ll_discount:
                bottomDialog.show();
                break;
            case R.id.cb_wx:
                mCbAli.setChecked(false);
                payType =1 ;
                break;
            case R.id.cb_ali:
                mCbWx.setChecked(false);
                payType = 2;
                break;
        }
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
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void goOrder(WxPayEvent event){
        isPaid = event.isPaid();
    }

}
