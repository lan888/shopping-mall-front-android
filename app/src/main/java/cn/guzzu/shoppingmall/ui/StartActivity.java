package cn.guzzu.shoppingmall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;


import cn.guzzu.baselibrary.util.LanguageUtil;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.R;


/**
 * Created by Ian on 2018/3/16.
 */
//8.0不支持在透明主题下设置竖屏
public class StartActivity extends AppCompatActivity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        LanguageUtil.set(this);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Utils.start_Activity(StartActivity.this,MainActivity.class);
                finish();
                //取消界面跳转时的动画，使启动页的logo图片与注册、登录主页的logo图片完美衔接
                overridePendingTransition(0, 0);
            }
        }, 2000);
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
