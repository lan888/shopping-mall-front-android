package cn.guzzu.shoppingmall.fragment;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

import com.mancj.materialsearchbar.MaterialSearchBar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.base.BaseFragment;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.util.ContentView;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.ui.MainActivity;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Pages;
import cn.guzzu.shoppingmall.ui.SearchDetailActivity;
import okhttp3.Call;

@ContentView(R.layout.fragment_home)
public class HomeFragment extends BaseFragment<MainActivity> {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.mViewPager)
    ViewPager mViewPager;
    @BindView(R.id.tab)
    TabLayout mTab;
    @BindView(R.id.searchBar)
    MaterialSearchBar searchBar;
    private ArrayList<Fragment> mFragments;
    private List<Pages> pagesList;
    private String mShoppingMallPageId;
    private FragmentStatePagerAdapter mPagerAdapter;

    public HomeFragment() {
    }

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
            public void onUiThread(int code,String json,List<Pages> list) {
                pagesList =list;
                mFragments = new ArrayList<>();
                for (int i = 0;i<pagesList.size();i++){
                    mTab.addTab(mTab.newTab().setText(pagesList.get(i).getPageTitle()));
                    mShoppingMallPageId = pagesList.get(i).get_id();
                    mFragments.add(HomeTabFragment.newInstance(mShoppingMallPageId));
                }
                mPagerAdapter=new FragmentStatePagerAdapter(getChildFragmentManager()) {
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
                mViewPager.setPageMargin(BaseApp.width);
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
            searchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {
                @Override
                public void onSearchStateChanged(boolean enabled) {

                }

                @Override
                public void onSearchConfirmed(CharSequence text) {
                    hideKeyboard();
                    searchBar.disableSearch();
                    Utils.start_Activity(activity, SearchDetailActivity.class,"keyWord",text.toString());
                }

                @Override
                public void onButtonClicked(int buttonCode) {

                }
            });


        }
    private void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive() && activity.getCurrentFocus() != null) {
            if (activity.getCurrentFocus().getWindowToken() != null) {
                imm.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
    }
    }
