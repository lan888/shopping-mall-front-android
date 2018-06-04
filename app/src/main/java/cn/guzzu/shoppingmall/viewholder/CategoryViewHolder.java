package cn.guzzu.shoppingmall.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.flexbox.FlexboxLayout;

import java.io.IOException;

import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Category;
import cn.guzzu.shoppingmall.ui.ProductActivity;
import cn.guzzu.shoppingmall.widget.MyImageView;
import cn.guzzu.baselibrary.callback.GsonObjectCallback;
import cn.guzzu.baselibrary.util.DataBindingViewUtil;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import okhttp3.Call;

import static android.support.constraint.Constraints.TAG;

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    private ImageView mCategoryImg;
    private TextView mTv;
    private FlexboxLayout mFbl;
    private int mImgViewWidth;
    private MyImageView pic;
    private TextView title;
    private TextView price;
    public CategoryViewHolder(View itemView) {
        super(itemView);
        mCategoryImg = itemView.findViewById(R.id.category_img);
        mTv = itemView.findViewById(R.id.tv);
        mFbl = itemView.findViewById(R.id.category_product);
    }


    public void bind(final Context context, String categoryId){
        final int itemLayout = R.layout.layout_productgroup_item_triple;

        OkHttp3Utils.doGet(Api.CATEGORIES + "/" + categoryId, new GsonObjectCallback<Category>() {
            @Override
            public void onUiThread(Category category, String json) {
                try {
                    final ViewGroup.LayoutParams lp = mCategoryImg.getLayoutParams();
                    final int h = category.getImage().getOriginal().getHeight();
                    final int w = category.getImage().getOriginal().getWidth();
                    ViewTreeObserver vto = mCategoryImg.getViewTreeObserver();
                    vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                        @Override
                        public void onGlobalLayout() {
                            mCategoryImg.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            mImgViewWidth = mCategoryImg.getMeasuredWidth();
                            Log.d(TAG, "onGlobalLayout: "+mImgViewWidth);
                            lp.height = h*mImgViewWidth/w;
                            mCategoryImg.setLayoutParams(lp);

                        }
                    });
                }catch (Exception e){
                    e.printStackTrace();
                }


                try {
                    Glide.with(context).load(category.getImage().getUrl()).into(mCategoryImg);

                }catch (Exception e){
                    e.printStackTrace();
                }
                mTv.setText(category.getDescription());
                if (category.getProducts()==null||category.getProducts().size()==0) return;
                DataBindingViewUtil.bindDataToLayout(category.getProducts(), mFbl, itemLayout, new DataBindingViewUtil.OnBindingDataWithLayoutParamsListener<Category.ProductsBean>() {
                    @Override
                    public ViewGroup.LayoutParams onCreateLayoutParams(View v) {
                        FlexboxLayout.LayoutParams lp = new FlexboxLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        lp.setFlexBasisPercent(0.33f);
                        return lp;
                    }

                    @Override
                    public ViewGroup.LayoutParams onCreateLayoutParams(View v, int position) {
                        return null;
                    }

                    @Override
                    public void onBindData(@NonNull View v, final Category.ProductsBean data, int position) {
                        pic = v.findViewById(R.id.pic);
                        title =v.findViewById(R.id.product_group_title);
                        price = v.findViewById(R.id.product_group_price);
                        if (data.getImage()!=null){
                            try {
                                Glide.with(itemView.getContext()).load(data.getImage().getThumb().getUrl()).apply(RequestOptions.fitCenterTransform()).into(pic);
                            }catch (Exception e){
                                e.printStackTrace();
                            }

                        }
                        title.setText(data.getName());
                        price.setText("¥"+String.valueOf((double)data.getPrice()/100));
                        v.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Utils.start_Activity(context, ProductActivity.class,"productId",data.get_id());
                            }
                        });
                    }
                });
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });




    }
}
