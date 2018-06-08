package cn.guzzu.shoppingmall.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.callback.GsonObjectCallback;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.baselibrary.widget.MultiStateView;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.OrderRvAdapter;
import cn.guzzu.shoppingmall.bean.Order;
import okhttp3.Call;

public class OrderActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tab)
    TabLayout mTab;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.multi_state_view)
    MultiStateView mMultiStateView;

    private OrderRvAdapter mOrderRvAdapter;
    private String mStatusJson;
    private Gson gson;
    private Order order;

    @Override
    public int initLayout() {
        return R.layout.activity_order;
    }

    @Override
    public void initView() {
        if (mToolbar != null) {
            mToolbar.setTitle("我的订单");
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mOrderRvAdapter = new OrderRvAdapter();
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mOrderRvAdapter);

    }

    @Override
    public void initData() {
        gson = new Gson();
        JSONObject obj = new JSONObject();
        try {
            obj.put("paymentStatus",new JSONObject().put("$ne","expired"));
            mStatusJson = obj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_FIND, mStatusJson, BaseApp.Constant.userId, new GsonArrayCallback<Order>() {
            @Override
            public void onUiThread(int code, List<Order> list) {
                if (code==200){
                    if (list.size()==0){
                        mMultiStateView.setState(MultiStateView.STATE_EMPTY).setButton(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getOrdersData(mStatusJson);
                            }
                        });
                    }else {
                        mOrderRvAdapter.setItems(list);
                        mMultiStateView.setState(MultiStateView.STATE_CONTENT);
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

        mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        mMultiStateView.setState(MultiStateView.STATE_LOADING);
                        JSONObject obj = new JSONObject();
                        try {
                            obj.put("paymentStatus",new JSONObject().put("$ne","expired"));
                            mStatusJson = obj.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        getOrdersData(mStatusJson);
                        break;
                    case 1:
                        mMultiStateView.setState(MultiStateView.STATE_LOADING);
                        JSONObject pending = new JSONObject();
                        try {
                            pending.put("paymentStatus","pending");
                            mStatusJson = pending.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        getOrdersData(mStatusJson);
                        break;
                    case 2:
                        mMultiStateView.setState(MultiStateView.STATE_LOADING);
                        JSONObject paid = new JSONObject();
                        try {
                            paid.put("paymentStatus","paid");
                            paid.put("shippingStatus","unshipped");
                            mStatusJson = paid.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        getOrdersData(mStatusJson);
                        break;
                    case 3:
                        mMultiStateView.setState(MultiStateView.STATE_LOADING);
                        JSONObject shipped = new JSONObject();
                        try {
                            shipped.put("paymentStatus","paid");
                            shipped.put("shippingStatus","shipped");
                            mStatusJson = shipped.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        getOrdersData(mStatusJson);
                        break;
                    case 4:
                        mMultiStateView.setState(MultiStateView.STATE_LOADING);
                        JSONObject received = new JSONObject();
                        try {
                            received.put("paymentStatus","paid");
                            received.put("shippingStatus","received");
                            mStatusJson = received.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        getOrdersData(mStatusJson);
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

    }

    public void getOrdersData(String json){
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_FIND, json, BaseApp.Constant.userId, new GsonArrayCallback<Order>() {
            @Override
            public void onUiThread(int code, List<Order> list) {
                if (code==200){
                    if (list.size()==0){
                        mMultiStateView.setState(MultiStateView.STATE_EMPTY).setButton(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getOrdersData(mStatusJson);
                            }
                        });
                    }else {
                        mOrderRvAdapter.setItems(list);
                        mMultiStateView.setState(MultiStateView.STATE_CONTENT);
                    }

                }

            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });

    }

}
