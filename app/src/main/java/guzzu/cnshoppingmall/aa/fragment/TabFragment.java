package guzzu.cnshoppingmall.aa.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

import guzzu.cnshoppingmall.baselibrary.callback.JsonCallback;
import guzzu.cnshoppingmall.baselibrary.util.OkHttp3Utils;
import guzzu.cnshoppingmall.aa.Api;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.adapter.HomeRvAdapter;
import guzzu.cnshoppingmall.aa.bean.BlockBanner;
import guzzu.cnshoppingmall.aa.bean.BlockNavGroup;
import guzzu.cnshoppingmall.aa.bean.BlockProductGroup;
import guzzu.cnshoppingmall.aa.bean.BlockSpacer;
import guzzu.cnshoppingmall.aa.bean.BlockTitle;
import guzzu.cnshoppingmall.aa.bean.Blocks;
import okhttp3.Call;

public class TabFragment extends Fragment{

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
    public static TabFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("content", content);
        TabFragment fragment = new TabFragment();
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
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mShoppingMallPageId = getArguments().getString("content");
        OkHttp3Utils.doGet(Api.GUZZU_API+"/"+mShoppingMallPageId, new JsonCallback() {
            @Override
            public void onUiThread(final String json) {
                blocksList.clear();
                        try {
                            int j ;
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
                            initRv();

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
