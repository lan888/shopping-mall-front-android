package guzzu.ian.guzzudemo.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory;
import com.bumptech.glide.Glide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import guzzu.ian.guzzudemo.Api;
import guzzu.ian.guzzudemo.BaseActivity;
import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.adapter.StoreRvAdapter;
import guzzu.ian.guzzudemo.bean.Session;
import guzzu.ian.guzzudemo.callback.GsonObjectCallback;
import guzzu.ian.guzzudemo.utils.OkHttp3Utils;
import guzzu.ian.guzzudemo.utils.Utils;
import guzzu.ian.guzzudemo.widget.CircleImageView;
import guzzu.ian.guzzudemo.widget.SwipeItemLayout;
import okhttp3.Call;

/**
 * Created by Ian on 2018/3/20.
 */

public class StoreSelectActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.refresh)
    SwipeRefreshLayout refresh;
    @BindView(R.id.nav_view)
    NavigationView navView;
    LinearLayoutManager manager;
    private StoreRvAdapter mAdapter;
    private ArrayList<String> mStore_name = new ArrayList<>();
    private ArrayList<String> storeId = new ArrayList<>();

    private TextView nUser;
    private CircleImageView nPic;

    @Override
    public int initLayout() {
        return R.layout.activity_list;
    }

    @Override
    public void initView() {
        toolbar.setTitle(getResources().getString(R.string.STORES_TITLE));
        toolbar.setNavigationIcon(R.mipmap.back);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.addOnItemTouchListener(new SwipeItemLayout.OnSwipeItemTouchListener(this));
        View headerView = navView.getHeaderView(0);
        nUser = headerView.findViewById(R.id.nav_user);
        nUser.setText(Utils.getValue(context,"username"));

    }

    @Override
    public void initData() {
        Map<String,String> map = new HashMap<String, String>();
        String user_id = Utils.getValue(context, "userId");
        OkHttp3Utils.doAuthPost(Api.CUZZU_API + Api.GET_STORE, map, user_id, new GsonObjectCallback<Session>() {
            @Override
            public void onUiThread(Session store, String json) {
                int j = store.getAccessRights().size();
                for (int i=0;i<j;i++){
                    mStore_name.add(store.getAccessRights().get(i).getStore().getName().getZh());
                    storeId.add(store.getAccessRights().get(i).getStore().get_id());
                }
                mAdapter = new StoreRvAdapter(StoreSelectActivity.this,mStore_name,storeId);
                recyclerView.setAdapter(mAdapter);

            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void initListener() {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.finish(context);
            }
        });
        refresh.setColorSchemeColors(getResources().getColor(R.color.md_blue_300));
        refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter.notifyDataSetChanged();
                        refresh.setRefreshing(false);
                    }
                }, 2000);
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
                return true;
            }
        });
    }

}
