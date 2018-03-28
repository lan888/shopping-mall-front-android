package guzzu.ian.guzzudemo.ui;


import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import guzzu.ian.guzzudemo.Api;
import guzzu.ian.guzzudemo.BaseActivity;
import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.adapter.OrderRvAdapter;
import guzzu.ian.guzzudemo.bean.Filter;
import guzzu.ian.guzzudemo.bean.Order;
import guzzu.ian.guzzudemo.callback.GsonObjectCallback;
import guzzu.ian.guzzudemo.utils.ActivityUtil;
import guzzu.ian.guzzudemo.utils.OkHttp3Utils;
import guzzu.ian.guzzudemo.utils.Utils;
import guzzu.ian.guzzudemo.widget.CircleImageView;
import guzzu.ian.guzzudemo.widget.SwipeItemLayout;
import okhttp3.Call;

/**
 * Created by Ian on 2018/3/9.
 */

public class OrderActivity extends BaseActivity {
    LinearLayoutManager manager;
    SwipeRefreshLayout srl;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    private RecyclerView mRecyclerView;
    private OrderRvAdapter mAdapter;
    private TextView nUser;
    private CircleImageView nPic;


    Toolbar toolbar;
    String store_id;
    String user_id;
    String store;
    Filter filter = new Filter();
    Filter.Filters filters = new Filter.Filters();
    Filter.Filters.isArchived isArchived = new Filter.Filters.isArchived();
    String filtersInfo;
    private ArrayList<String> mBill_num = new ArrayList<String>();
    private ArrayList<String> mBill_createAt = new ArrayList<String>();
    private ArrayList<String> mOrder_status = new ArrayList<String>();
    private ArrayList<String> mPayment_status = new ArrayList<String>();
    private ArrayList<String> mShipping_status = new ArrayList<String>();
    private ArrayList<String> mTotal_pay = new ArrayList<String>();
    private ArrayList<String> mCustomer_name = new ArrayList<String>();
    private ArrayList<String> mOrder_id = new ArrayList<String>();
    private long exitTime;

    @Override
    public int initLayout() {
        return R.layout.activity_list;
    }

    @Override
    public void initView() {
        toolbar = findViewById(R.id.toolbar);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(manager);
        srl = (SwipeRefreshLayout) findViewById(R.id.refresh);
        mRecyclerView.addOnItemTouchListener(new SwipeItemLayout.OnSwipeItemTouchListener(this));
        toolbar.setNavigationIcon(R.mipmap.ic_menu);
        View headerView = navView.getHeaderView(0);
        nUser = headerView.findViewById(R.id.nav_user);
        nPic = headerView.findViewById(R.id.nav_civ);
        nUser.setText(Utils.getValue(context,"username"));
        Glide.with(context).load(Utils.getValue(context,"userpic")).into(nPic);


    }

    @Override
    public void initData() {
        store_id = Utils.getValue(OrderActivity.this, "storeId");
        user_id = Utils.getValue(OrderActivity.this, "userId");
        filter.setPage(1);
        filter.setPageSize(20);
        filter.setSort("-createdAt");
        filter.setStoreId(store_id);
        filters.setType("default");
        filters.setStatus("open");
        filters.setShippingStatus("unshipped");
        isArchived.set$ne(true);
        filters.setIsArchived(isArchived);
        filter.setFilters(filters);
        Gson gson = new Gson();
        filtersInfo = gson.toJson(filter, Filter.class);

        Log.e("filter", "f:" + filters);
        OkHttp3Utils.doPostJson(Api.CUZZU_API + Api.Order_FIND, filtersInfo, user_id, new GsonObjectCallback<Order>() {

            @Override
            public void onUiThread(Order order, String json) {
                if (json.contains("ERR_INVALID_AUTH")||json.contains("ERR_INVALID_PARAM")) {

                    Utils.showShortToast(context, getResources().getString(R.string.login_loss));
                    Utils.start_Activity(context, LoginActivity.class);
                    finish();

                } else {
                    if (order.getTotal()!=0){
                        store = order.getResults().get(0).getStore().getName().getZh();
                        int j = order.getResults().size();
                        for (int i = 0; i < j; i++) {
                            String orderId = order.getResults().get(i).get_id();
                            String refId = order.getResults().get(i).getRefId();
                            String createAt = order.getResults().get(i).getCreatedAt();
                            String orderStatus = order.getResults().get(i).getStatus();
                            String paymentStatus = order.getResults().get(i).getPaymentStatus();
                            String shippingStatus = order.getResults().get(i).getShippingStatus();
                            String totalPaid = Integer.toString(order.getResults().get(i).getTotalPaid());
//                           String customer = order.getResults().get(i).getCustomer();
//                           JSONObject jsonObject3 = new JSONObject(customer);
                            String customer_name = order.getResults().get(i).getShippingAddress().getName();
                            String createAtTime = Utils.getTimeFromUTC(createAt);
                            double paid = Double.parseDouble(totalPaid);
                            totalPaid = Double.toString(paid / 100);
                            mBill_createAt.add(createAtTime);
                            mBill_num.add(refId);
                            mOrder_status.add( orderStatus);
                            mPayment_status.add(paymentStatus);
                            mShipping_status.add(shippingStatus);
                            mTotal_pay.add("¥" + totalPaid);
                            mCustomer_name.add(customer_name);
                            mOrder_id.add(orderId);

                        }
                        toolbar.setTitle(store);


                        mAdapter = new OrderRvAdapter(OrderActivity.this, store_id, user_id, mOrder_id, mBill_num, mBill_createAt
                                , mOrder_status, mPayment_status, mShipping_status, mCustomer_name, mTotal_pay);
                        mRecyclerView.setAdapter(mAdapter);
                    }else {
                        Utils.showShortToast(context,"此店铺暂无订单");
                        if (!Utils.getValue(context,"storeName").equals("")){
                            store=Utils.getValue(context,"storeName");
                            toolbar.setTitle(store);
                        }
                    }



                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void initListener() {
        srl.setColorSchemeColors(getResources().getColor(R.color.md_blue_300));

        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mOrder_id.clear();
                        mBill_num.clear();
                        mBill_createAt.clear();
                        mOrder_status.clear();
                        mPayment_status.clear();
                        mShipping_status.clear();
                        mCustomer_name.clear();
                        mTotal_pay.clear();
                        OkHttp3Utils.doPostJson(Api.CUZZU_API + Api.Order_FIND, filtersInfo, user_id, new GsonObjectCallback<Order>() {
                            @Override
                            public void onUiThread(Order order, String json) {
                                if (json.contains("ERR_INVALID_AUTH")||json.contains("ERR_INVALID_PARAM")) {

                                    Utils.showShortToast(context, getResources().getString(R.string.login_loss));
                                    Utils.start_Activity(context, LoginActivity.class);
                                    finish();

                                } else {
                                    if (order.getTotal() != 0) {
                                        store = order.getResults().get(0).getStore().getName().getZh();
                                        int j = order.getResults().size();
                                        for (int i = 0; i < j; i++) {
                                            String orderId = order.getResults().get(i).get_id();
                                            String refId = order.getResults().get(i).getRefId();
                                            String createAt = order.getResults().get(i).getCreatedAt();
                                            String orderStatus = order.getResults().get(i).getStatus();
                                            String paymentStatus = order.getResults().get(i).getPaymentStatus();
                                            String shippingStatus = order.getResults().get(i).getShippingStatus();
                                            String totalPaid = Integer.toString(order.getResults().get(i).getTotalPaid());
                                            String customer_name = order.getResults().get(i).getShippingAddress().getName();
                                            String createAtTime = Utils.getTimeFromUTC(createAt);
                                            double paid = Double.parseDouble(totalPaid);
                                            totalPaid = Double.toString(paid / 100);
                                            mBill_createAt.add(createAtTime);
                                            mBill_num.add(refId);
                                            mOrder_status.add(orderStatus);
                                            mPayment_status.add(paymentStatus);
                                            mShipping_status.add(shippingStatus);
                                            mTotal_pay.add("¥" + totalPaid);
                                            mCustomer_name.add(customer_name);
                                            mOrder_id.add(orderId);

                                        }
                                    }

                                    mAdapter = new OrderRvAdapter(OrderActivity.this, store_id, user_id, mOrder_id, mBill_num, mBill_createAt
                                            , mOrder_status, mPayment_status, mShipping_status, mCustomer_name, mTotal_pay);
                                    mRecyclerView.setAdapter(mAdapter);
                                }
                            }

                            @Override
                            public void onFailed(Call call, IOException exception) {

                            }
                        });
                        mAdapter.notifyDataSetChanged();
                        srl.setRefreshing(false);
                    }
                }, 2000);
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.changeStore:
                        Utils.start_Activity(context,StoreSelectActivity.class);
                        break;

                    case R.id.exit:
                        Utils.start_Activity(context,LoginActivity.class);
                        Utils.putValue(context,"userId","");
                        PushServiceFactory.getCloudPushService().unbindAccount(new CommonCallback() {
                            @Override
                            public void onSuccess(String s) {
                                Log.i("DeviceId:",PushServiceFactory.getCloudPushService().getDeviceId()+"解绑成功");
                            }

                            @Override
                            public void onFailed(String s, String s1) {

                            }
                        });
                        finish();
                        break;
                }
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis() - exitTime > 2000) {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                //按返回键不退出程序，仅仅返回桌面
                Intent setIntent = new Intent(Intent.ACTION_MAIN);
                setIntent.addCategory(Intent.CATEGORY_HOME);
                setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(setIntent);
            }
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityUtil.addActivity(OrderActivity.this);
        ActivityUtil.removeAllActivity();
    }

}
