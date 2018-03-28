package guzzu.ian.guzzudemo.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;

import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory;
import com.gc.materialdesign.views.ButtonRectangle;
import com.gyf.barlibrary.ImmersionBar;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.victor.loading.rotate.RotateLoading;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import guzzu.ian.guzzudemo.Api;
import guzzu.ian.guzzudemo.BaseActivity;
import guzzu.ian.guzzudemo.MyApp;
import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.ThreadPoolManager;
import guzzu.ian.guzzudemo.bean.Session;
import guzzu.ian.guzzudemo.bean.User;
import guzzu.ian.guzzudemo.callback.GsonObjectCallback;
import guzzu.ian.guzzudemo.utils.NetWorkUtils;
import guzzu.ian.guzzudemo.utils.OkHttp3Utils;
import guzzu.ian.guzzudemo.utils.Utils;
import okhttp3.Call;

/**
 * Created by Ian on 2018/3/9.
 */

public class LoginActivity extends BaseActivity {
    public User user;
    public Handler handler;
    public Runnable runnable;
    public Map<String, String> loginInfo;
    @BindView(R.id.scrollview)
    ScrollView scrollview;
    private ImmersionBar mImmersionBar;


    String userId;
    @BindView(R.id.email)
    MaterialEditText email;
    @BindView(R.id.password)
    MaterialEditText password;
    @BindView(R.id.btn_login)
    ButtonRectangle btnLogin;

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        final String et_email;
        String et_password;
        et_email = email.getText().toString();
        et_password = password.getText().toString();

        if (et_email.equals("")||et_password.equals("")){
            Utils.showShortToast(this,getResources().getString(R.string.APP_LOGIN_ERROR_EMPTY));
        }else {
            loginInfo.put("email", et_email);
            loginInfo.put("password", et_password);
            loginInfo.put("clientType", MyApp.Constant.CLIENT_TYPE);
            btnLogin.setText(getResources().getString(R.string.logining));
            btnLogin.setEnabled(false);
            signInWithEmail(Api.CUZZU_API + Api.SIGN_IN, loginInfo);
        }
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                ThreadPoolManager.getInstance().executeTask(runnable);
                    Utils.showShortToast(LoginActivity.this, getResources().getString(R.string.APP_WELCOME));
                    Utils.putValue(context, "email", et_email);


            }
        };
    }

    @Override
    public int initLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.transparentStatusBar().init();
        String email_keep = Utils.getValue(context, "email");
        if (email_keep != null) {
            email.setText(email_keep);
        }

        loginInfo = new HashMap<String, String>();
        if (NetWorkUtils.isNetWorkAvailable(this)) {

        } else {
            Utils.showShortToast(this, "无网络连接");
        }

    }

    @Override
    public void initData() {
        if (userId != null) {
            getUserData();
        }
        runnable = new Runnable() {
            @Override
            public void run() {
                getUserData();
            }
        };
    }

    @Override
    public void initListener() {


    }


    public void signInWithEmail(final String url, Map<String, String> loginInfo) {
        OkHttp3Utils.getInstance().doPost(url, loginInfo, new GsonObjectCallback<User>() {
            @Override
            public void onUiThread(final User object, final String json) {
                Log.d("json!!", "json:" + json);
                user = object;
                Utils.putValue(LoginActivity.this, "userId", user.get_id());
                userId = Utils.getValue(LoginActivity.this, "userId");
                if (json.contains("ERR_AUTH_SIGNIN")||json.contains("ERR_INVALID_PARAM")) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Utils.showShortToast(LoginActivity.this, getResources().getString(R.string.APP_LOGIN_ERROR_NOT_FOUND));
                            btnLogin.setText(getResources().getString(R.string.login));
                            btnLogin.setEnabled(true);
                        }
                    });
                } else {
                    Utils.putValue(context, "username", user.getUser().getName());
                    PushServiceFactory.getCloudPushService().bindAccount(object.getUser().get_id(), new CommonCallback() {
                        @Override
                        public void onSuccess(String s) {
                            Log.i("DeviceId:",PushServiceFactory.getCloudPushService().getDeviceId()+"注册成功");
                        }

                        @Override
                        public void onFailed(String s, String s1) {

                        }
                    });
                    handler.sendEmptyMessage(0);
                }


            }

            @Override
            public void onFailed(Call call, IOException exception) {
                Log.d("call!!", "call:" + call);
                Log.d("e!!", "e:" + exception);
                if (exception != null) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Utils.showShortToast(LoginActivity.this, "网络错误！");
                        }
                    });


                }

            }
        });


    }

    public void getUserData() {
        Map<String, String> map = new HashMap<String, String>();
        OkHttp3Utils.doAuthPost(Api.CUZZU_API + Api.GET_STORE, map, userId, new GsonObjectCallback<Session>() {
            @Override
            public void onUiThread(Session session, String json) {
                if (json.contains("ERR_INVALID_AUTH")) {
                    Utils.showShortToast(context, getResources().getString(R.string.login_loss));
                } else if (session.getAccessRights().size()>1){
                    Intent intent = new Intent(LoginActivity.this, StoreSelectActivity.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(LoginActivity.this, OrderActivity.class);
                    Utils.putValue(LoginActivity.this, "storeId", session.getAccessRights().get(0).getStore().get_id());
                    startActivity(intent);
                }

            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });


    }
    private void start(){
        AnimationSet animationSet=new AnimationSet(true);
        TranslateAnimation translateAnimation=new TranslateAnimation(
                Animation.RELATIVE_TO_SELF,
                0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                -1.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                btnLogin.offsetTopAndBottom(-btnLogin.getHeight());
                btnLogin.clearAnimation();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setRepeatCount(0);//设置重复次数
        btnLogin.startAnimation(translateAnimation);


    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }



}
