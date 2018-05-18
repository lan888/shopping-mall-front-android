package guzzu.cnshoppingmall.aa.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import guzzu.cnshoppingmall.baselibrary.base.BaseFragment;
import guzzu.cnshoppingmall.baselibrary.callback.GsonArrayCallback;
import guzzu.cnshoppingmall.baselibrary.util.ContentView;
import guzzu.cnshoppingmall.baselibrary.util.OkHttp3Utils;
import guzzu.cnshoppingmall.aa.Api;
import guzzu.cnshoppingmall.aa.ui.MainActivity;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Pages;
import okhttp3.Call;

@ContentView(R.layout.fragment_home)
public class HomeFragment extends BaseFragment<MainActivity> {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.mViewPager)
    ViewPager mViewPager;
    @BindView(R.id.tab)
    TabLayout mTab;
    private ArrayList<Fragment> mFragments;
    private List<Pages> pagesList;
    private String mShoppingMallPageId;
    private FragmentPagerAdapter mPagerAdapter;
        @Override
        protected void initialToolbar() {
            if (mToolbar != null) {
                mToolbar.setTitle("首页");
                setSupportActionBar(mToolbar);
            }
        }

    @Override
    protected void initData() {
        OkHttp3Utils.doGet(Api.GUZZU_API, new GsonArrayCallback<Pages>() {
            @Override
            public void onUiThread(List<Pages> list) {
                pagesList =list;
                mFragments = new ArrayList<>();
                for (int i = 0;i<pagesList.size();i++){
                    mTab.addTab(mTab.newTab().setText(pagesList.get(i).getTabLabel()));
                    mShoppingMallPageId = pagesList.get(i).get_id();
                    mFragments.add(HomeTabFragment.newInstance(mShoppingMallPageId));
                }
                mPagerAdapter=new FragmentPagerAdapter(getChildFragmentManager()) {
                    @Override
                    public Fragment getItem(int position) {
                        return mFragments.get(position);
                    }

                    @Override
                    public int getCount() {
                        return mFragments.size();
                    }
                };
                mViewPager.setAdapter(mPagerAdapter);
                mViewPager.setOffscreenPageLimit(3);
                Log.d("fragment", "onUiThread: "+mFragments.size());
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });

    }

        @Override
        protected void initListener() {
            mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    mTab.getTabAt(position).select();

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
            mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    mViewPager.setCurrentItem(tab.getPosition());

                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });



        }
    }
