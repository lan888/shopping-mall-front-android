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
import android.view.View;
import android.view.ViewGroup;
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

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.adapter.CategoryAdapter;
import guzzu.cnshoppingmall.aa.bean.Categories;

import static android.support.constraint.Constraints.TAG;

public class CategoryTabFragment extends Fragment {

    private Context mContext;
//    private ImageView mTv;
//    private GridView mGv;
//    private ArrayList<Map<String,Object>>dataList ;
    private RecyclerView mRv;
    private Categories categories;
    public static CategoryTabFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("content", content);
        CategoryTabFragment fragment = new CategoryTabFragment();
        fragment.setArguments(args);
        return fragment;
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
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(mContext);
        mRv.setLayoutManager(flexboxLayoutManager);
        mRv.setAdapter(categoryAdapter);



    }
//    void initData() {
//        //图标
//        int icno[] = { R.drawable.ic_launcher_background };
//        //图标下的文字
//        String name[]={"时钟","信号","宝箱","秒钟","大象","FF","记事本","书签","印象","商店","主题","迅雷"};
//        dataList = new ArrayList<>();
//        for (int i = 0; i <name.length; i++) {
//            Map<String, Object> map=new HashMap<String, Object>();
//            map.put("img", icno[0]);
//            map.put("text",name[i]);
//            dataList.add(map);
//        }
//    }
}
