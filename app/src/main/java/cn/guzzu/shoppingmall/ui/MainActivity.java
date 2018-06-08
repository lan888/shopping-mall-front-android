package cn.guzzu.shoppingmall.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.bean.GoHomeEvent;
import cn.guzzu.shoppingmall.fragment.MeFragment;
import cn.guzzu.shoppingmall.fragment.ShoppingCartFragment;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseFragment;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.fragment.CategoryFragment;
import cn.guzzu.shoppingmall.fragment.HomeFragment;
import cn.guzzu.shoppingmall.util.BottomNavigationViewHelper;
import okhttp3.Call;

public class MainActivity extends BaseActivity {

    @BindView(R.id.mBottom)
    BottomNavigationView mBottom;
    private ArrayList<BaseFragment> mFragments;
    private BaseFragment mContext;
    private String categoryId;
    private String cartAt;
    private int curPosition = 0;

    @Override
    public int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        BottomNavigationViewHelper.disableShiftMode(mBottom);

    }


    @Override
    public void initData() {
        getSession();
        categoryId = getIntent().getStringExtra("categoryId");
        cartAt = getIntent().getStringExtra("shoppingCart");
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new CategoryFragment());
        mFragments.add(new ShoppingCartFragment());
        mFragments.add(new MeFragment());

    }

    @Override
    public void initListener() {
        if (categoryId!=null){
            switchFragment(mContext,mFragments.get(1));
            mBottom.getMenu().getItem(1).setChecked(true);
            CategoryFragment categoryFragment = (CategoryFragment) mFragments.get(1);
            categoryFragment.setCategoryId(categoryId);
        }else if (cartAt!=null){
            switchFragment(mContext,mFragments.get(Integer.valueOf(cartAt)));
            mBottom.getMenu().getItem(Integer.valueOf(cartAt)).setChecked(true);
        }else {
                switchFragment(mContext,mFragments.get(0));
            }
        mBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_item:
                        curPosition = 0;
                        mBottom.getMenu().getItem(curPosition).setChecked(true);
                        break;
                    case R.id.category_item:
                        curPosition = 1;
                        mBottom.getMenu().getItem(curPosition).setChecked(true);
                        break;
                    case R.id.shoppingcart_item:
                        curPosition = 2;
                        mBottom.getMenu().getItem(curPosition).setChecked(true);
                        break;
                    case R.id.my_item:
                        curPosition = 3;
                        mBottom.getMenu().getItem(curPosition).setChecked(true);
                        break;
                }
                switchFragment(mContext,mFragments.get(curPosition));
                return false;
            }
        });


    }
    //切换fragment 每次都会初始化frgament数据
    public void switchFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mViewPager, fragment).commit();
    }

    //切换fragment fragment只初始化一次
    private void switchFragment(Fragment fromFragment, BaseFragment nextFragment) {
        //判断当前fragment和目标fragment是否是同一个
        if (mContext != nextFragment) {
            //不是同一个 当前要显示的fragment就是nextfragment
            mContext = nextFragment;
            if (nextFragment != null) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //判断nextFragment是否添加过
                if (!nextFragment.isAdded()) {
                    //nextFragment没被添加过

                    //隐藏当前Fragment 添加nextFragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.add(R.id.mViewPager, nextFragment).commitAllowingStateLoss();
                } else {
                    //nextFragment被添加过

                    //隐藏当前Fragment  显示nextFragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.show(nextFragment).commitAllowingStateLoss();
                }
            }
        }
    }


    private void getSession(){
        OkHttp3Utils.doPost(Api.GUZZU + Api.SESSION, BaseApp.Constant.userId, "zh", new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code==200){
                    if (json.contains("no session")){
                        Utils.putBoolean(context,"isLogin",false);
                    } else {
                        Utils.putBoolean(context,"isLogin",true);
                }
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void goHome(GoHomeEvent event){
        switchFragment(mContext,mFragments.get(0));
        mBottom.getMenu().getItem(0).setChecked(true);

    }
}
