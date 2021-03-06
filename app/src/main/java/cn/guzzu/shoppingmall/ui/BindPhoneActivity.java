package cn.guzzu.shoppingmall.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.gc.materialdesign.views.ButtonRectangle;
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
import cn.guzzu.shoppingmall.bean.User;
import okhttp3.Call;

public class BindPhoneActivity extends BaseActivity implements TextWatcher {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.et_phone)
    AppCompatEditText mEtPhone;
    @BindView(R.id.et_code)
    AppCompatEditText mEtCode;
    @BindView(R.id.btn_code)
    AppCompatButton mBtnCode;
    @BindView(R.id.btn_login)
    ButtonRectangle mBtnLogin;

    private TimeCount time;
    private String mPhoneNum;
    @Override
    public int initLayout() {
        return R.layout.activity_bind_phone;
    }

    @Override
    public void initView() {
        if (mToolbar != null) {
            mToolbar.setTitle("微信登录");
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        mBtnLogin.setEnabled(false);
    }

    @Override
    public void initData() {
        time = new TimeCount(60000, 1000);
    }

    @Override
    public void initListener() {
        mEtPhone.addTextChangedListener(this);
        mEtCode.addTextChangedListener(this);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseApp.Constant.userId="";
                finish();
            }
        });
    }

    @OnClick({R.id.btn_code, R.id.btn_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_code:
                mPhoneNum = mEtPhone.getText().toString();
                if (Utils.isMobileNO(mPhoneNum)) {
                    time.start();
                    Map<String, String> key = new ArrayMap<>();
                    key.put("mobilePhone", mPhoneNum);
                    String url = Api.GUZZU + Api.REQ_SMS;
                    OkHttp3Utils.doJsonPost(url, key, new JsonCallback() {
                        @Override
                        public void onUiThread(int code, String json) {
                            if (code == 200) {
                                Utils.showShortToast(context, "验证码已发送成功");
                            }
                        }

                        @Override
                        public void onFailed(Call call, IOException exception) {

                        }
                    });

                } else {
                    Utils.showShortToast(this, "手机号码格式不正确");
                }
                break;
            case R.id.btn_login:
                mPhoneNum = mEtPhone.getText().toString();
                String smsCode = mEtCode.getText().toString();
                Map<String, String> key = new ArrayMap<>();
                key.put("mobilePhone", mPhoneNum);
                key.put("verifyCode", smsCode);
                mBtnLogin.setText(getResources().getString(R.string.btn_logining));
                mBtnLogin.setEnabled(false);
                OkHttp3Utils.doJsonPost(Api.GUZZU + Api.BIND_PHONE, key, BaseApp.Constant.userId, new JsonCallback() {
                    @Override
                    public void onUiThread(int code, String json) {
                        if (code == 200) {
                            Gson gson = new Gson();
                            User user = gson.fromJson(json, User.class);
                            if (user != null) {
                                BaseApp.Constant.userId = user.getSessionId();
                                Log.d(TAG, "initData: " + BaseApp.Constant.userId);
                                Utils.putValue(context,"userId",user.getSessionId());
                                Utils.putBoolean(context, "isLogin", true);
                                hideKeyboard();
                                finish();
                            }
                        } else {
                            mBtnLogin.setText(getResources().getString(R.string.btn_login));
                            mBtnLogin.setEnabled(true);
                            Utils.showShortToast(context, getString(R.string.toast_err_code));
                        }
                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {
                        Utils.showShortToast(context, exception.getMessage());
                    }
                });
                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        mPhoneNum = mEtPhone.getText().toString();
        if (Utils.isMobileNO(mPhoneNum)) {
            mBtnLogin.setEnabled(true);
        } else {
            mBtnLogin.setEnabled(false);
        }
    }

    private void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive() && getCurrentFocus() != null) {
            if (getCurrentFocus().getWindowToken() != null) {
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            finish();
            BaseApp.Constant.userId="";
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    class TimeCount extends CountDownTimer {

        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            mBtnCode.setClickable(false);
            mBtnCode.setText(millisUntilFinished / 1000 + "s");
        }

        @Override
        public void onFinish() {
            mBtnCode.setText("重新获取验证码");
            mBtnCode.setClickable(true);

        }
    }
}
