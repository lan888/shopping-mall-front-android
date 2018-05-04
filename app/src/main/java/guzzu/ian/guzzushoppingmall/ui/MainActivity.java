package guzzu.ian.guzzushoppingmall.ui;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import java.util.ArrayList;

import butterknife.BindView;
import guzzu.ian.baselibrary.base.BaseActivity;
import guzzu.ian.baselibrary.base.BaseFragment;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.fragment.CategoryFragment;
import guzzu.ian.guzzushoppingmall.fragment.HomeFragment;
import guzzu.ian.guzzushoppingmall.util.BottomNavigationViewHelper;

public class MainActivity extends BaseActivity {

    @BindView(R.id.mViewPager)
    ViewPager mViewPager;
    @BindView(R.id.mBottom)
    BottomNavigationView mBottom;
    private ArrayList<BaseFragment> mFragments;
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
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBottom.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_item:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.category_item:
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.shoppingcart_item:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.my_item:
                        mViewPager.setCurrentItem(0);
                        break;
                }

                return false;
            }
        });
        //设置适配器用于装载Fragment
        FragmentPagerAdapter mPagerAdapter=new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragments.get(position);  //得到Fragment
            }

            @Override
            public int getCount() {
                return mFragments.size();  //得到数量
            }
        };
        mViewPager.setAdapter(mPagerAdapter);   //设置适配器
        mViewPager.setOffscreenPageLimit(1); //预加载剩下两页



    }



}
