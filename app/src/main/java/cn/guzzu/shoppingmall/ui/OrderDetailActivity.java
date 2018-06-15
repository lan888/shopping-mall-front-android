package cn.guzzu.shoppingmall.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.ArrayMap;
import android.view.View;
import android.widget.TextView;

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

    private OrderProductListAdapter mOrderProductListAdapter;
    private Order order;

    @Override
    public int initLayout() {
        return R.layout.activity_order_detail;
    }

    @Override
    public void initView() {
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
    }

    @Override
    public void initData() {
        final String orderId = getIntent().getStringExtra("orderId");
        Map<String, String> map = new ArrayMap<>();
        map.put("orderId", orderId);
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_GET, map, BaseApp.Constant.userId, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code == 200) {
                    Gson gson = new Gson();
                    order = gson.fromJson(json, Order.class);
                    mOrderProductListAdapter.setItems(order.getItems());
                    mTvName.setText(order.getShippingAddress().getName());
                    mTvAddress.setText(order.getShippingAddress().getProvince() + order.getShippingAddress().getCity() + order.getShippingAddress().getDistrict() + order.getShippingAddress().getStreet() + order.getShippingAddress().getAddress());
                    mTvmobilePhone.setText(order.getShippingAddress().getMobilePhone());
                    mTvStore.setText(order.getStore().getName());
                    mTvStatus.setText(order.getPaymentStatus());
                    mTvDiscount.setText(getString(R.string.label_discount_price, (double) order.getDiscount() / 100));
                    mTvShippingCost.setText(getString(R.string.label_price, (double) order.getShippingCost() / 100));
                    mTvSubtotal.setText(getString(R.string.label_price, (double) order.getSubtotal() / 100));
                    mTvTotalCost.setText(getString(R.string.label_price, (double) order.getTotalCost() / 100));
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
                Utils.finish(context);
            }
        });
    }


    @OnClick(R.id.tv_store)
    public void onViewClicked() {
        Utils.start_Activity(context, StoreActivity.class,"storeId",order.getStore().get_id());
    }
}
