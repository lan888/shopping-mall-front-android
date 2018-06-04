package cn.guzzu.shoppingmall.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.HomeRvAdapter;
import cn.guzzu.shoppingmall.bean.BlockBanner;
import cn.guzzu.shoppingmall.bean.BlockNavGroup;
import cn.guzzu.shoppingmall.bean.BlockProductGroup;
import cn.guzzu.shoppingmall.bean.BlockSpacer;
import cn.guzzu.shoppingmall.bean.BlockTitle;
import cn.guzzu.shoppingmall.bean.Blocks;
import okhttp3.Call;

public class HomeTabFragment extends Fragment{

    private List<Blocks> blocksList = new ArrayList<>();
    private RecyclerView mRv;
    private Context mContext;
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
    private FloatingActionButton fab_up_slide;

    public HomeTabFragment() {
    }

    public static HomeTabFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("content", content);
        HomeTabFragment fragment = new HomeTabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
        gson = new Gson();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRv = view.findViewById(R.id.rv_home);
        fab_up_slide = view.findViewById(R.id.fab_up_slide);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fab_up_slide.hide();
        mShoppingMallPageId = getArguments().getString("content");
        OkHttp3Utils.doGet(Api.GUZZU_API+"/"+mShoppingMallPageId, new JsonCallback() {
            @Override
            public void onUiThread(int code,final String json) {
                blocksList.clear();
                        try {
                            int j ;
                            JSONObject jsonObject = new JSONObject(json);
                            jsonBlocks = jsonObject.optString("blocks");
                            JSONArray jsonArray = new JSONArray(jsonBlocks);
                            j = jsonArray.length();
                            for (int i = 0; i<j ; i++){
                                jsonBlock = jsonArray.optString(i);
                                JSONObject object = new JSONObject(jsonBlock);
                                String type = object.optString("type");
                                if (type.contains("navgroup")){
                                    blockNavGroup = gson.fromJson(jsonBlock,BlockNavGroup.class);
                                    blocks = new Blocks();
                                    blocks.setIndex(i);
                                    blocks.setType("navgroup");
                                    blocks.setBlockNavGroup(blockNavGroup);
                                    blocksList.add(blocks);

                                }
                                if (type.contains("productgroup")){
                                    blockProductGroup = gson.fromJson(jsonBlock,BlockProductGroup.class);
                                    blocks = new Blocks();
                                    blocks.setIndex(i);
                                    blocks.setType("productgroup");
                                    blocks.setBlockProductGroup(blockProductGroup);
                                    blocksList.add(blocks);

                                }
                                if (type.contains("title")){
                                    blockTitle = gson.fromJson(jsonBlock,BlockTitle.class);
                                    blocks = new Blocks();
                                    blocks.setIndex(i);
                                    blocks.setType("title");
                                    blocks.setBlockTitle(blockTitle);
                                    blocksList.add(blocks);
                                }
                                if (type.contains("banner")){
                                    blockBanner = gson.fromJson(jsonBlock,BlockBanner.class);
                                    blocks = new Blocks();
                                    blocks.setIndex(i);
                                    blocks.setType("banner");
                                    blocks.setBlockBanner(blockBanner);
                                    blocksList.add(blocks);
                                }
                                if (type.contains("spacer")){
                                    blockSpacer = gson.fromJson(jsonBlock,BlockSpacer.class);
                                    blocks = new Blocks();
                                    blocks.setIndex(i);
                                    blocks.setType("spacer");
                                    blocks.setBlockSpacer(blockSpacer);
                                    blocksList.add(blocks);
                                }

                            }
                            initRv();
                            mRv.addOnScrollListener(new RecyclerView.OnScrollListener() {
                                @Override
                                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                                    FlexboxLayoutManager manager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
                                    if (manager.findFirstVisibleItemPosition()==0){
                                        fab_up_slide.hide();
                                    }else {
                                        fab_up_slide.show();
                                    }
                                }
                            });

                            fab_up_slide.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mRv.smoothScrollToPosition(0);
                                }
                            });
                        }catch (JSONException e){
                            e.printStackTrace();

                        }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    private void initRv(){
        HomeRvAdapter homeRvAdapter = new HomeRvAdapter(mContext,blocksList);
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(mContext);
        mRv.setLayoutManager(layoutManager);
        mRv.setAdapter(homeRvAdapter);
    }
}
