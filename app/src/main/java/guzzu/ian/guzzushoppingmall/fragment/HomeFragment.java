package guzzu.ian.guzzushoppingmall.fragment;

import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import guzzu.ian.baselibrary.base.BaseFragment;
import guzzu.ian.baselibrary.callback.GsonArrayCallback;
import guzzu.ian.baselibrary.callback.JsonCallback;
import guzzu.ian.baselibrary.util.ContentView;
import guzzu.ian.baselibrary.util.OkHttp3Utils;
import guzzu.ian.guzzushoppingmall.Api;
import guzzu.ian.guzzushoppingmall.ui.MainActivity;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.adapter.HomeRvAdapter;
import guzzu.ian.guzzushoppingmall.bean.BlockBanner;
import guzzu.ian.guzzushoppingmall.bean.BlockNavGroup;
import guzzu.ian.guzzushoppingmall.bean.BlockProductGroup;
import guzzu.ian.guzzushoppingmall.bean.BlockSpacer;
import guzzu.ian.guzzushoppingmall.bean.BlockTitle;
import guzzu.ian.guzzushoppingmall.bean.Blocks;
import guzzu.ian.guzzushoppingmall.bean.Pages;
import okhttp3.Call;

@ContentView(R.layout.fragment_home)
public class HomeFragment extends BaseFragment<MainActivity> {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.rv_home)
    RecyclerView mRvHome;
    @BindView(R.id.tab)
    TabLayout mTab;
    private List<Pages> pagesList;
    private String mShoppingMallPageId;
    private Gson gson;
    private String jsonBlocks;
    private String jsonBlock;
    private BlockNavGroup blockNavGroup;
    private BlockProductGroup blockProductGroup;
    private BlockBanner blockBanner;
    private BlockTitle blockTitle;
    private BlockSpacer blockSpacer;
    private Blocks blocks;
    private List<Blocks> blocksList = new ArrayList<>();

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
                for (int i = 0;i<pagesList.size();i++)
                    mTab.addTab(mTab.newTab().setText(pagesList.get(i).getTabLabel()));

            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });

    }

        @Override
        protected void initListener() {
            mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    mShoppingMallPageId = pagesList.get(tab.getPosition()).get_id();
                    OkHttp3Utils.doGet(Api.GUZZU_API+"/"+mShoppingMallPageId, new JsonCallback() {
                        @Override
                        public void onUiThread(String json) {
                            gson = new Gson();
                            int j ;
                            blocksList.clear();
                            try {
                                JSONObject jsonObject = new JSONObject(json);
                                jsonBlocks = jsonObject.optString("blocks");
                                JSONArray jsonArray = new JSONArray(jsonBlocks);
                                j = jsonArray.length();
                                for (int i = 0; i<j ; i++){
                                    jsonBlock = jsonArray.optString(i);
                                    if (jsonBlock.contains("navgroup")){
                                        blockNavGroup = gson.fromJson(jsonBlock,BlockNavGroup.class);
                                        blocks = new Blocks();
                                        blocks.setIndex(i);
                                        blocks.setType("navgroup");
                                        blocks.setBlockNavGroup(blockNavGroup);
                                        blocksList.add(blocks);

                                    }
                                    if (jsonBlock.contains("productgroup")){
                                        blockProductGroup = gson.fromJson(jsonBlock,BlockProductGroup.class);
                                        blocks = new Blocks();
                                        blocks.setIndex(i);
                                        blocks.setType("productgroup");
                                        blocks.setBlockProductGroup(blockProductGroup);
                                        blocksList.add(blocks);

                                    }
                                    if (jsonBlock.contains("subtitle")){
                                        blockTitle = gson.fromJson(jsonBlock,BlockTitle.class);
                                        blocks = new Blocks();
                                        blocks.setIndex(i);
                                        blocks.setType("subtitle");
                                        blocks.setBlockTitle(blockTitle);
                                        blocksList.add(blocks);
                                    }
                                    if (jsonBlock.contains("banner")){
                                        blockBanner = gson.fromJson(jsonBlock,BlockBanner.class);
                                        blocks = new Blocks();
                                        blocks.setIndex(i);
                                        blocks.setType("banner");
                                        blocks.setBlockBanner(blockBanner);
                                        blocksList.add(blocks);
                                    }
                                    if (jsonBlock.contains("spacer")){
                                        blockSpacer = gson.fromJson(jsonBlock,BlockSpacer.class);
                                        blocks = new Blocks();
                                        blocks.setIndex(i);
                                        blocks.setType("spacer");
                                        blocks.setBlockSpacer(blockSpacer);
                                        blocksList.add(blocks);
                                    }

                                }



                            }catch (JSONException e){
                                e.printStackTrace();

                            }
                            initRv();



                        }

                        @Override
                        public void onFailed(Call call, IOException exception) {

                        }
                    });

                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
        }
        private void initRv(){
            HomeRvAdapter homeRvAdapter = new HomeRvAdapter(mContext,blocksList);
            FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(mContext);
            mRvHome.setLayoutManager(layoutManager);
            mRvHome.setAdapter(homeRvAdapter);
        }
    }
