package cn.guzzu.shoppingmall.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.StoresAdapter;
import cn.guzzu.shoppingmall.bean.Store;
import cn.guzzu.shoppingmall.widget.MySwipeRecyclerView;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import okhttp3.Call;

public class CategoryStoreTabFragment extends Fragment {

    private Context mContext;
//    private ImageView mTv;
//    private GridView mGv;
//    private ArrayList<Map<String,Object>>dataList ;
    private MySwipeRecyclerView mRv;
    private TextView mName;
    private Store store;


    public CategoryStoreTabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_category,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        mTv = view.findViewById(R.id.tv);
//        mGv = view.findViewById(R.id.gv);
        mRv = view.findViewById(R.id.rv_category);
        mName =view.findViewById(R.id.shoppingmall_name);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mName.setVisibility(View.VISIBLE);
        GridLayoutManager flexboxLayoutManager = new GridLayoutManager(mContext,3);
        mRv.setLayoutManager(flexboxLayoutManager);
        OkHttp3Utils.doGet(Api.STORES, new GsonArrayCallback<Store>() {
            @Override
            public void onUiThread(int code,List<Store> list) {
                if (code==200){
                    StoresAdapter storesAdapter = new StoresAdapter(mContext);
                    storesAdapter.setItems(list);
                    mRv.setAdapter(storesAdapter);
                }
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });




    }

}
