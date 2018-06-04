package cn.guzzu.shoppingmall.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Store;
import cn.guzzu.shoppingmall.viewholder.StoresViewHolder;
import cn.guzzu.baselibrary.base.BaseAdapter;

import static android.support.constraint.Constraints.TAG;


public class StoresAdapter extends BaseAdapter<Store> {
    private final LayoutInflater mLayoutInflater;
    public StoresAdapter(Context mContext) {
        mLayoutInflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getViewLayoutId(int viewType) {
        return R.layout.layout_productgroup_item_single;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(View view, int viewType) {
        return new StoresViewHolder(view);
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder, Store item, int position) {
        if (holder instanceof StoresViewHolder){
            ((StoresViewHolder) holder).bind(mLayoutInflater.getContext(),item);
            Log.d(TAG, "onBindViewHolder: ");
        }
    }


}
