package cn.guzzu.shoppingmall.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.LayoutRipple;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.OrderProductListAdapter;
import cn.guzzu.shoppingmall.bean.Order;
import cn.guzzu.shoppingmall.bean.PayResult;
import cn.guzzu.shoppingmall.util.PayUtil;
import okhttp3.Call;

public class OrderDetailActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_name)
    TextView mTvName;
    @BindView(R.id.mobilePhone)
    TextView mTvmobilePhone;
    @BindView(R.id.address)
    TextView mTvAddress;
    @BindView(R.id.tv_store)
    TextView mTvStore;
    @BindView(R.id.tv_status)
    TextView mTvStatus;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.tv_subtotal)
    TextView mTvSubtotal;
    @BindView(R.id.tv_discount)
    TextView mTvDiscount;
    @BindView(R.id.tv_shipping_cost)
    TextView mTvShippingCost;
    @BindView(R.id.tv_total_cost)
    TextView mTvTotalCost;
    @BindView(R.id.cb_wx)
    CheckBox mCbWx;
    @BindView(R.id.cb_ali)
    CheckBox mCbAli;
    @BindView(R.id.ll_pay)
    LinearLayout llPay;
    @BindView(R.id.tv_total_paid)
    TextView tvTotalPaid;
    @BindView(R.id.tv_buy)
    LayoutRipple tvBuy;
    @BindView(R.id.bottom)
    LinearLayout bottom;

    private OrderProductListAdapter mOrderProductListAdapter;
    private Order order;
    private Map<String, String> map;
    private Gson gson;
    private String orderId;
    private int payType = 1;//1-微信支付，2-支付
    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1: {
                    @SuppressWarnings("unchecked")
                    PayResult payResult = new PayResult((Map<String, String>) msg.obj);
                    /**
                     对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
                     */
                    String resultInfo = payResult.getResult();// 同步返回需要验证的信息
                    String resultStatus = payResult.getResultStatus();
                    // 判断resultStatus 为9000则代表支付成功
                    if (TextUtils.equals(resultStatus, "9000")) {
                        // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。
                        Utils.start_Activity(context,OrderDetailActivity.class,"orderId",orderId);
                        finish();
                        Toast.makeText(OrderDetailActivity.this, "支付成功", Toast.LENGTH_SHORT).show();
                    } else {
                        // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                        Toast.makeText(OrderDetailActivity.this, "支付失败", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                default:
                    break;
            }
        };
    };
    @Override
    public int initLayout() {
        return R.layout.activity_order_detail;
    }

    @Override
    public void initView() {
        showLoading("loading");
        if (mToolbar != null) {
            mToolbar.setTitle("订单详情");
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mOrderProductListAdapter = new OrderProductListAdapter();
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mOrderProductListAdapter);
        mCbWx.setChecked(true);
    }

    @Override
    public void initData() {
        orderId = getIntent().getStringExtra("orderId");
        map = new ArrayMap<>();
        map.put("orderId", orderId);
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_GET, map, BaseApp.Constant.userId, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code == 200) {
                    gson = new Gson();
                    order = gson.fromJson(json, Order.class);
                    if (!TextUtils.equals(order.getPaymentStatus(),"pending")){
                        llPay.setVisibility(View.GONE);
                        bottom.setVisibility(View.GONE);
                    }
                    cancelLoading();
                    mOrderProductListAdapter.setItems(order.getItems());
                    if (order.getShippingAddress() != null) {
                        mTvName.setText(order.getShippingAddress().getName());
                        mTvAddress.setText(order.getShippingAddress().getProvince() + order.getShippingAddress().getCity() + order.getShippingAddress().getDistrict() + order.getShippingAddress().getStreet() + order.getShippingAddress().getAddress());
                        mTvmobilePhone.setText(order.getShippingAddress().getMobilePhone());
                    }
                    mTvStore.setText(order.getStore().getName());
                    mTvStatus.setText(order.getPaymentStatus());
                    mTvDiscount.setText(getString(R.string.label_discount_price, (double) order.getDiscount() / 100));
                    mTvShippingCost.setText(getString(R.string.label_price, (double) order.getShippingCost() / 100));
                    mTvSubtotal.setText(getString(R.string.label_price, (double) order.getSubtotal() / 100));
                    mTvTotalCost.setText(getString(R.string.label_price, (double) order.getTotalCost() / 100));
                    tvTotalPaid.setText("合计：¥" + (double) order.getTotalCost() / 100);
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    @Override
    public void initListener() {
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Utils.back_Activity(context,OrderActivity.class);
            }
        });
    }


    @OnClick({R.id.tv_store,R.id.cb_wx, R.id.cb_ali, R.id.tv_buy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_store:
                Utils.start_Activity(context, StoreActivity.class, "storeId", order.getStore().get_id());
                break;
            case R.id.cb_wx:
                mCbAli.setChecked(false);
                payType =1 ;
                break;
            case R.id.cb_ali:
                mCbWx.setChecked(false);
                payType = 2;
                break;
            case R.id.tv_buy:
                PayUtil.goPay(payType,map,OrderDetailActivity.this,gson,mHandler);
                break;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            finish();
            Utils.back_Activity(context,OrderActivity.class);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
