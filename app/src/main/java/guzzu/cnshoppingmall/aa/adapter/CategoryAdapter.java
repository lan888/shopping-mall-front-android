package guzzu.cnshoppingmall.aa.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import butterknife.BindView;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Categories;
import guzzu.cnshoppingmall.aa.viewholder.CategoryViewHolder;

import static android.support.constraint.Constraints.TAG;


public class CategoryAdapter extends RecyclerView.Adapter {
    private Categories categories;
    private final LayoutInflater mLayoutInflater;
    public CategoryAdapter(Context mContext,Categories categories) {
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
            ((CategoryViewHolder) holder).bind(mLayoutInflater.getContext(),categories.get_id());
            Log.d(TAG, "onBindViewHolder: "+categories);
        }

    }

    @Override
    public int getItemCount() {
        return 1;
    }

}
