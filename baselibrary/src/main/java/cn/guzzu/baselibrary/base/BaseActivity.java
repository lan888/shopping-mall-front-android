package cn.guzzu.baselibrary.base;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.gyf.barlibrary.ImmersionBar;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import cn.guzzu.baselibrary.R;
import cn.guzzu.baselibrary.util.LanguageUtil;


/**
 * Created by Ian on 2018/3/9.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected Activity context;
    private ImmersionBar mImmersionBar;
    BaseApp myApp ;

    /***获取TAG的activity名称**/
    protected final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        myApp = (BaseApp) getApplication();
        //设置布局
        setContentView(initLayout());
        LanguageUtil.set(this);
        ButterKnife.bind(this);
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar
                .statusBarColor(R.color.colorPrimary)
                .init();   //所有子类都将继承这些相同的属性
        //设置沉浸状态栏
        //初始化控件
        initView();
        //设置数据
        initData();
        //设置监听
        initListener();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }


    /**
     * 设置布局
     *
     * @return
     */
    public abstract int initLayout();

    /**
     * 初始化布局
     */
    public abstract void initView();

    /**
     * 设置数据
     */
    public abstract void initData();
    /**
     * 设置监听
     */
    public abstract void initListener();



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mImmersionBar != null){
            mImmersionBar.destroy();  //必须调用该方法，防止内存泄漏，不调用该方法，如果界面bar发生改变，在不关闭app的情况下，退出此界面再进入将记忆最后一次bar改变的状态
    }

    }
}
