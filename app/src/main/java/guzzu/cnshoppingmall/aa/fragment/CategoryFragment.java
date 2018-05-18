package guzzu.cnshoppingmall.aa.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.youngkaaa.yviewpager.YFragmentPagerAdapter;
import cn.youngkaaa.yviewpager.YViewPager;
import guzzu.cnshoppingmall.aa.Api;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Categories;
import guzzu.cnshoppingmall.aa.ui.MainActivity;
import guzzu.cnshoppingmall.baselibrary.base.BaseFragment;
import guzzu.cnshoppingmall.baselibrary.callback.GsonArrayCallback;
import guzzu.cnshoppingmall.baselibrary.util.ContentView;
import guzzu.cnshoppingmall.baselibrary.util.OkHttp3Utils;
import okhttp3.Call;
import q.rorbin.badgeview.Badge;
import q.rorbin.verticaltablayout.VerticalTabLayout;
import q.rorbin.verticaltablayout.adapter.TabAdapter;
import q.rorbin.verticaltablayout.widget.ITabView;
import q.rorbin.verticaltablayout.widget.QTabView;
import q.rorbin.verticaltablayout.widget.TabView;

import static android.support.constraint.Constraints.TAG;

@ContentView(R.layout.fragment_category)
public class CategoryFragment extends BaseFragment<MainActivity> {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.vTab)
    VerticalTabLayout mVTab;
    Unbinder unbinder;
    @BindView(R.id.viewpager)
    YViewPager mViewpager;
    private ArrayList<Fragment> mFragments;
    @Override
    protected void initialToolbar() {
        if (mToolbar != null) {
            mToolbar.setTitle("分类");
            setSupportActionBar(mToolbar);
        }
    }

    @Override
    protected void initData() {
        mFragments = new ArrayList<>();
        final Gson gson = new Gson();
        OkHttp3Utils.doGet(Api.CATEGORIES, new GsonArrayCallback<Categories>() {
            @Override
            public void onUiThread(final List<Categories> list) {
                int size = list.size();
                for (int i=0 ; i<size ; i++){
                    mFragments.add(CategoryTabFragment.newInstance(gson.toJson(list.get(i))));
                }
                mVTab.setTabAdapter(new TabAdapter() {
                    @Override
                    public int getCount() {
                        return mFragments.size();
                    }

                    @Override
                    public ITabView.TabBadge getBadge(int position) {
                        return null;
                    }

                    @Override
                    public ITabView.TabIcon getIcon(int position) {
                        return null;
                    }

                    @Override
                    public ITabView.TabTitle getTitle(int position) {
                        Log.d(TAG, "getTitle: "+list.get(position).getName());
                        return new ITabView.TabTitle.Builder().setContent(list.get(position).getName()).setTextColor(getContext().getResources().getColor(R.color.colorPrimaryDark),0xFF757575).build();
                    }

                    @Override
                    public int getBackground(int position) {
                        return 0;
                    }
                });
                mVTab.addOnTabSelectedListener(new VerticalTabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabView tab, int position) {
                        mViewpager.setCurrentItem(position);
                    }

                    @Override
                    public void onTabReselected(TabView tab, int position) {

                    }
                });
                mViewpager.setAdapter(new YFragmentPagerAdapter(getChildFragmentManager()) {
                    @Override
                    public Fragment getItem(int position) {
                        return mFragments.get(position);
                    }

                    @Override
                    public int getCount() {
                        return mFragments.size();
                    }
                });
                mViewpager.addOnPageChangeListener(new YViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        mVTab.setTabSelected(position);
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                mViewpager.setOffscreenPageLimit(2);



            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });


    }

    @Override
    protected void initListener() {



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
