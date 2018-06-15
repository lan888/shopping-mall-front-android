package cn.guzzu.shoppingmall.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import com.google.gson.Gson;
import com.mancj.materialsearchbar.MaterialSearchBar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.base.BaseFragment;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.util.ContentView;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Categories;
import cn.guzzu.shoppingmall.ui.MainActivity;
import cn.guzzu.shoppingmall.ui.SearchDetailActivity;
import cn.youngkaaa.yviewpager.YFragmentPagerAdapter;
import cn.youngkaaa.yviewpager.YViewPager;
import okhttp3.Call;
import q.rorbin.verticaltablayout.VerticalTabLayout;
import q.rorbin.verticaltablayout.adapter.TabAdapter;
import q.rorbin.verticaltablayout.widget.ITabView;
import q.rorbin.verticaltablayout.widget.TabView;

import static android.support.constraint.Constraints.TAG;

@ContentView(R.layout.fragment_category)
public class CategoryFragment extends BaseFragment<MainActivity> {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.vTab)
    VerticalTabLayout mVTab;
    @BindView(R.id.viewpager)
    YViewPager mViewpager;
    @BindView(R.id.searchBar)
    MaterialSearchBar searchBar;
    private ArrayList<Fragment> mFragments;
    private List<String> categoryIdList;
    private String categoryId;

    public CategoryFragment() {
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

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
        categoryIdList = new ArrayList<>();
        final Gson gson = new Gson();
        OkHttp3Utils.doGet(Api.CATEGORIES, new GsonArrayCallback<Categories>() {
            @Override
            public void onUiThread(int code, String json, final List<Categories> list) {
                if (code == 200) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        mFragments.add(CategoryTabFragment.newInstance(gson.toJson(list.get(i))));
                        categoryIdList.add(list.get(i).get_id());
                    }
                    mFragments.add(new CategoryStoreTabFragment());
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
                            List<String> categoryName = new ArrayList<>();
                            for (int i = 0; i < list.size(); i++) {
                                categoryName.add(list.get(i).getName());
                            }
                            categoryName.add("Stores");

                            return new ITabView.TabTitle.Builder().setContent(categoryName.get(position)).setTextColor(getContext().getResources().getColor(R.color.colorPrimaryDark), 0xFF757575).build();
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
                            Log.d(TAG, "onPageScrolled: " + position + positionOffset);
                        }

                        @Override
                        public void onPageSelected(int position) {
                            mVTab.setTabSelected(position);
                        }

                        @Override
                        public void onPageScrollStateChanged(int state) {

                        }
                    });
                    Log.d("Nav", "onBindData: " + categoryId + "," + categoryIdList.indexOf(categoryId) + categoryIdList.toString());
                    mViewpager.setOffscreenPageLimit(2);
                    mViewpager.setPageMargin(BaseApp.height / 3);
                    int index = categoryIdList.indexOf(categoryId);
                    if (index != -1) {
                        mVTab.setTabSelected(categoryIdList.indexOf(categoryId));
                        mViewpager.setCurrentItem(categoryIdList.indexOf(categoryId));
                    }

                }

            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });


    }

    @Override
    protected void initListener() {
        searchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {
            @Override
            public void onSearchStateChanged(boolean enabled) {

            }

            @Override
            public void onSearchConfirmed(CharSequence text) {
                hideKeyboard();
                Utils.start_Activity(activity, SearchDetailActivity.class,"keyWord",text.toString());
            }

            @Override
            public void onButtonClicked(int buttonCode) {

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

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
