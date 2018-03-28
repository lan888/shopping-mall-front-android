package guzzu.ian.guzzudemo.ui;

import android.os.Handler;
import android.view.KeyEvent;

import guzzu.ian.guzzudemo.BaseActivity;
import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.utils.Utils;

/**
 * Created by Ian on 2018/3/16.
 */

public class StartActivity extends BaseActivity {
    private Handler handler = new Handler();

    @Override
    public int initLayout() {
        return R.layout.activity_start;
    }

    @Override
    public void initView() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoLogin();
                // 判断是否是第一次开启应用
                Utils.putBoolean(StartActivity.this, Utils.FIRST_OPEN, false);
            }
        }, 2000);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }
    private void gotoLogin() {
        boolean isFirstOpen = Utils.getBoolean(this, Utils.FIRST_OPEN, true);
        if (isFirstOpen){
            Utils.start_Activity(this,LoginActivity.class);
            finish();
            //取消界面跳转时的动画，使启动页的logo图片与注册、登录主页的logo图片完美衔接
            overridePendingTransition(0, 0);
        }else {
            Utils.start_Activity(this,OrderActivity.class);
            finish();
        }
    }
    /**
     * 屏蔽物理返回键
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
