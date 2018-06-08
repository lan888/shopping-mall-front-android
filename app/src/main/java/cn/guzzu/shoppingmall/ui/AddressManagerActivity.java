package cn.guzzu.shoppingmall.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.gc.materialdesign.views.ButtonRectangle;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.AddressManagerListAdapter;
import cn.guzzu.shoppingmall.bean.Addresses;
import cn.guzzu.shoppingmall.bean.GoHomeEvent;
import okhttp3.Call;

public class AddressManagerActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.mRv)
    RecyclerView mRv;
    @BindView(R.id.btn_add)
    ButtonRectangle mBtnAdd;

    private AddressManagerListAdapter addressManagerListAdapter;
    @Override
    public int initLayout() {
        return R.layout.activity_address_manager;
    }

    @Override
    public void initView() {
        if (mToolbar != null) {
            mToolbar.setTitle("收货地址管理");
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        addressManagerListAdapter = new AddressManagerListAdapter();
        mRv.setLayoutManager(manager);
        mRv.setAdapter(addressManagerListAdapter);
    }

    @Override
    public void initData() {

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


    @OnClick(R.id.btn_add)
    public void onViewClicked() {
        Utils.start_Activity(this,AddressAddActivity.class);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateAddress(GoHomeEvent event){
        OkHttp3Utils.doPost(Api.GUZZU + Api.ADDRESS_FIND, BaseApp.Constant.userId, "zh", new GsonArrayCallback<Addresses>() {
            @Override
            public void onUiThread(int code, List<Addresses> list) {
                addressManagerListAdapter.setItems(list);
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        OkHttp3Utils.doPost(Api.GUZZU + Api.ADDRESS_FIND, BaseApp.Constant.userId, "zh", new GsonArrayCallback<Addresses>() {
            @Override
            public void onUiThread(int code, List<Addresses> list) {
                addressManagerListAdapter.setItems(list);
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
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
