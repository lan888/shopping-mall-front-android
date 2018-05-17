package guzzu.cnshoppingmall.aa.ui;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;

import java.util.ArrayList;

import butterknife.BindView;
import guzzu.cnshoppingmall.baselibrary.base.BaseActivity;
import guzzu.cnshoppingmall.baselibrary.base.BaseFragment;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.fragment.CategoryFragment;
import guzzu.cnshoppingmall.aa.fragment.HomeFragment;
import guzzu.cnshoppingmall.aa.util.BottomNavigationViewHelper;

public class MainActivity extends BaseActivity {

    @BindView(R.id.mBottom)
    BottomNavigationView mBottom;
    private ArrayList<BaseFragment> mFragments;
    private BaseFragment mContext;
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
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new CategoryFragment());

    }

    @Override
    public void initListener() {
        switchFragment(mContext,mFragments.get(0));
        mBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int curPosition = 0;
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
                        curPosition = 0;
                        mBottom.getMenu().getItem(curPosition).setChecked(true);
                        break;
                    case R.id.my_item:
                        curPosition = 0;
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
                    transaction.add(R.id.mViewPager, nextFragment).commit();
                } else {
                    //nextFragment被添加过

                    //隐藏当前Fragment  显示nextFragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.show(nextFragment).commit();
                }
            }
        }
    }


}
