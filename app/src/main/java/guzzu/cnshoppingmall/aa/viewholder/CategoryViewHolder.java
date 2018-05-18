package guzzu.cnshoppingmall.aa.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Categories;
import guzzu.cnshoppingmall.baselibrary.base.BaseViewHolder;

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    private ImageView mCategoryImg;
    public CategoryViewHolder(View itemView) {
        super(itemView);
        mCategoryImg = itemView.findViewById(R.id.category_img);
    }
    public void bind(Context context,String categories){
        try {
            Glide.with(context).load(categories).into(mCategoryImg);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
