package cn.guzzu.shoppingmall.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.base.BaseFragment;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.ContentView;
import cn.guzzu.baselibrary.util.LanguageUtil;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Session;
import cn.guzzu.shoppingmall.bean.UnLoginEvent;
import cn.guzzu.shoppingmall.ui.AddressManagerActivity;
import cn.guzzu.shoppingmall.ui.LoginActivity;
import cn.guzzu.shoppingmall.ui.MainActivity;
import cn.guzzu.shoppingmall.ui.OrderActivity;
import cn.guzzu.shoppingmall.ui.SettingActivity;
import cn.guzzu.shoppingmall.ui.StartActivity;
import okhttp3.Call;


@ContentView(R.layout.fragment_me)
public class MeFragment extends BaseFragment<MainActivity> {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.ll_login)
    LinearLayout llLogin;
    @BindView(R.id.tv_status)
    TextView mTvStatus;
    @BindView(R.id.tv_unpaid)
    TextView mTvUnpaid;
    @BindView(R.id.tv_unshipped)
    TextView mTvUnshipped;
    @BindView(R.id.tv_shipped)
    TextView mTvShipped;
    @BindView(R.id.tv_recevied)
    TextView mTvRecevied;
    @BindView(R.id.ll_orders)
    LinearLayout llOrders;
    @BindView(R.id.ll_address)
    LinearLayout llAddress;
    @BindView(R.id.cb_english)
    CheckBox mCbEnglish;
    @BindView(R.id.ll_language_english)
    LinearLayout llLanguageEnglish;
    @BindView(R.id.cb_chinese)
    CheckBox mCbChinese;
    @BindView(R.id.ll_language_chinese)
    LinearLayout llLanguageChinese;
    @BindView(R.id.btn_logout)
    ButtonRectangle mBtnLogout;


    public MeFragment() {
    }



    @Override
    protected void initialToolbar() {
        if (mToolbar != null) {
            mToolbar.setTitle("");
            mToolbar.inflateMenu(R.menu.me_toolbar);

        }
    }


    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.setting_item:
                        Utils.start_Activity(activity,SettingActivity.class);
                        break;

                }
                return true;
            }
        });
        String lang = Utils.getValue(activity,"lang").isEmpty()?BaseApp.getInstance().getCurLocale().getLanguage():Utils.getValue(activity,"lang");
        if (lang.contains("zh")) {
            mCbChinese.setChecked(true);
        } else {
            mCbEnglish.setChecked(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        OkHttp3Utils.doPost(Api.GUZZU + Api.SESSION, BaseApp.Constant.userId, "zh", new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code==200){
                    if (json.contains("no session")){
                        Utils.putBoolean(activity,"isLogin",false);
                    } else {
                        Gson gson = new Gson();
                        Session session = gson.fromJson(json, Session.class);
                        mTvStatus.setText(session.getUser().getName());
                        Utils.putBoolean(activity,"isLogin",true);
                    }
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
        if (BaseApp.getInstance().isLogin()){
            mTvStatus.setText("");
            mBtnLogout.setVisibility(View.VISIBLE);
        }else {
            mTvStatus.setText(getString(R.string.tv_unlogin));
            mBtnLogout.setVisibility(View.GONE);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }


    @OnClick({R.id.ll_login, R.id.tv_unpaid, R.id.tv_unshipped, R.id.tv_shipped, R.id.tv_recevied, R.id.ll_orders, R.id.ll_address, R.id.cb_english, R.id.cb_chinese,R.id.btn_logout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_login:
                if (BaseApp.getInstance().isLogin()) {
                } else {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    activity.startActivity(intent);
                }
                break;
            case R.id.tv_unpaid:
                if (BaseApp.getInstance().isLogin()) {
                    Utils.start_Activity(activity, OrderActivity.class,"status","Pending");
                } else {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    activity.startActivity(intent);
                }
                break;
            case R.id.tv_unshipped:
                if (BaseApp.getInstance().isLogin()) {
                    Utils.start_Activity(activity, OrderActivity.class,"status","Paid");
                } else {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    activity.startActivity(intent);
                }
                break;
            case R.id.tv_shipped:
                if (BaseApp.getInstance().isLogin()) {
                    Utils.start_Activity(activity, OrderActivity.class,"status","Shipped");
                } else {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    activity.startActivity(intent);
                }
                break;
            case R.id.tv_recevied:
                if (BaseApp.getInstance().isLogin()) {
                    Utils.start_Activity(activity, OrderActivity.class,"status","Received");
                } else {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    activity.startActivity(intent);
                }
                break;
            case R.id.ll_orders:
                if (BaseApp.getInstance().isLogin()) {
                    Utils.start_Activity(activity, OrderActivity.class);
                } else {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    activity.startActivity(intent);
                }
                break;
            case R.id.ll_address:
                if (BaseApp.getInstance().isLogin()) {
                    Utils.start_Activity(activity, AddressManagerActivity.class);
                } else {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    activity.startActivity(intent);
                }
                break;
            case R.id.cb_english:
                Utils.putValue(activity,"lang","en");
                LanguageUtil.set(activity);
                mCbChinese.setChecked(false);
                Intent intent = new Intent(activity,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                activity.startActivity(intent);
                break;
            case R.id.cb_chinese:
                Utils.putValue(activity,"lang","zh");
                LanguageUtil.set(activity);
                mCbEnglish.setChecked(false);
                Intent intent1 = new Intent(activity,MainActivity.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                activity.startActivity(intent1);
                break;
            case R.id.btn_logout:
                OkHttp3Utils.doPost(Api.GUZZU + Api.REMOVE_SESSION, BaseApp.Constant.userId, "zh", new JsonCallback() {
                    @Override
                    public void onUiThread(int code, String json) {
                        if (code==200){
                            Utils.showShortToast(getContext(),"已退出登录");
                            mTvStatus.setText(getString(R.string.tv_unlogin));
                            mBtnLogout.setVisibility(View.GONE);
                            Utils.putBoolean(activity,"isLogin",false);
                            EventBus.getDefault().post(new UnLoginEvent());
                        }
                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {

                    }
                });

                break;
        }

    }



}
