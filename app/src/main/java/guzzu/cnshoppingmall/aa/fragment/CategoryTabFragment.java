package guzzu.cnshoppingmall.aa.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.youngkaaa.yviewpager.YViewPager;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.adapter.CategoryAdapter;
import guzzu.cnshoppingmall.aa.bean.Categories;
import guzzu.cnshoppingmall.aa.widget.MySwipeRecyclerView;
import guzzu.cnshoppingmall.baselibrary.util.Utils;

import static android.support.constraint.Constraints.TAG;

public class CategoryTabFragment extends Fragment {

    private Context mContext;
//    private ImageView mTv;
//    private GridView mGv;
//    private ArrayList<Map<String,Object>>dataList ;
    private MySwipeRecyclerView mRv;
    private Categories categories;

    public static CategoryTabFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("content", content);
        CategoryTabFragment fragment = new CategoryTabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public CategoryTabFragment() {
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
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Gson gson = new Gson();
//        String[] from={"img","text"};
//        int[] to={R.id.img,R.id.text};
//        initData();
        String img = getArguments().getString("content");
        categories = gson.fromJson(img,Categories.class);
//        ViewGroup.LayoutParams lp = mTv.getLayoutParams();
//        lp.height = categories.getImage().getOriginal().getHeight();
//        mTv.setLayoutParams(lp);
//        Glide.with(mContext).load(categories.getImage().getUrl()).apply(RequestOptions.centerCropTransform()).into(mTv);
//        mGv.setAdapter(new SimpleAdapter(mContext,dataList,R.layout.gridview_item,from,to));
//        Log.d(TAG, "onActivityCreated: "+img);
        CategoryAdapter categoryAdapter = new CategoryAdapter(mContext,categories);
        LinearLayoutManager flexboxLayoutManager = new LinearLayoutManager(mContext);
        mRv.setLayoutManager(flexboxLayoutManager);
        mRv.setAdapter(categoryAdapter);



    }

}
