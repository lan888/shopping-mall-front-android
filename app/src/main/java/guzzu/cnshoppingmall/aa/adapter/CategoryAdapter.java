package guzzu.cnshoppingmall.aa.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import butterknife.BindView;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Categories;
import guzzu.cnshoppingmall.aa.viewholder.CategoryViewHolder;


public class CategoryAdapter extends RecyclerView.Adapter {
    private String categories;
    private final LayoutInflater mLayoutInflater;
    public CategoryAdapter(Context mContext,String categories) {
        this.categories = categories;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new CategoryViewHolder(mLayoutInflater.inflate(R.layout.layout_categoryview,null));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CategoryViewHolder){
            ((CategoryViewHolder) holder).bind(mLayoutInflater.getContext(),categories);
        }

    }

    @Override
    public int getItemCount() {
        return 1;
    }


}
