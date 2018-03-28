package guzzu.ian.guzzudemo;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import com.gyf.barlibrary.ImmersionBar;

import butterknife.ButterKnife;

/**
 * Created by Ian on 2018/3/9.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected Activity context;
    private ImmersionBar mImmersionBar;
    MyApp myApp ;
    /***封装toast对象**/
    private static Toast toast;
    /***获取TAG的activity名称**/
    protected final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        myApp = (MyApp) getApplication();
        //设置布局
        setContentView(initLayout());
        ButterKnife.bind(this);
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar
                .statusBarColor(R.color.md_blue_700)
                .init();   //所有子类都将继承这些相同的属性
        //设置沉浸状态栏
        //初始化控件
        initView();
        //设置数据
        initData();
        //设置监听
        initListener();


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

//    /**
//     * [沉浸状态栏]
//     */
//    private void steepStatusBar() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            // 透明状态栏
//            getWindow().addFlags(
//                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            // 透明导航栏
//            getWindow().addFlags(
//                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//        }
//    }
//
//    /**
//     * [是否设置沉浸状态栏]
//     *
//     * @param isSetStatusBar
//     */
//    public void setSteepStatusBar(boolean isSetStatusBar) {
//        this.isSetStatusBar = isSetStatusBar;
//    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mImmersionBar != null){
            mImmersionBar.destroy();  //必须调用该方法，防止内存泄漏，不调用该方法，如果界面bar发生改变，在不关闭app的情况下，退出此界面再进入将记忆最后一次bar改变的状态
    }
    }
}
