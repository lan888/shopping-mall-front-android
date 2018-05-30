package guzzu.cnshoppingmall.aa.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Categories;
import guzzu.cnshoppingmall.aa.bean.Products;
import guzzu.cnshoppingmall.aa.viewholder.CategoryViewHolder;
import guzzu.cnshoppingmall.aa.viewholder.ProductsViewHolder;
import guzzu.cnshoppingmall.baselibrary.base.BaseAdapter;

import static android.support.constraint.Constraints.TAG;


public class StoreAdapter extends BaseAdapter<Products> {
    private final LayoutInflater mLayoutInflater;
    public StoreAdapter(Context mContext) {
        mLayoutInflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getViewLayoutId(int viewType) {
        return R.layout.layout_productgroup_item_single;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(View view, int viewType) {
        return new ProductsViewHolder(view);
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder, Products item, int position) {
        if (holder instanceof ProductsViewHolder){
            ((ProductsViewHolder) holder).bind(mLayoutInflater.getContext(),item);
            Log.d(TAG, "onBindViewHolder: ");
        }
    }


}
