package guzzu.cnshoppingmall.aa.viewholder;

import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnLoadImageListener;

import java.util.ArrayList;
import java.util.List;

import guzzu.cnshoppingmall.baselibrary.util.Utils;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Product;

public class ProductTopViewHolder extends RecyclerView.ViewHolder {
    private final Banner banner;
    public ProductTopViewHolder(View itemView) {
        super(itemView);
        banner = itemView.findViewById(R.id.banner);

    }


    public void setData(Product product) {
        List<String> product_img = new ArrayList<>();
        if (product.getImage() != null) {
            product_img.add(product.getImage().getUrl());
        }
        if (product.getGallery().size() > 0) {
            for (int i = 0; i < product.getGallery().size(); i++) {
                product_img.add(product.getGallery().get(i).getUrl());
                Log.d("top", "setData: "+product.getGallery().get(i).getUrl());
            }
        }
        ViewGroup.LayoutParams lp = banner.getLayoutParams();
        DisplayMetrics dm = itemView.getContext().getResources().getDisplayMetrics();
        if (product.getImage().getOriginal()!=null){
            lp.height = dm.widthPixels*product.getImage().getOriginal().getHeight()/product.getImage().getOriginal().getWidth();
        }
        banner.setLayoutParams(lp);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.isAutoPlay(true);
        banner.setBannerAnimation(Transformer.Default);
        banner.setDelayTime(2500);

        //设置图片集合并加载图片
        banner.setImages(product_img, new OnLoadImageListener() {
            @Override
            public void OnLoadImage(ImageView view, Object url) {
                Glide.with(itemView.getContext()).load(url).into(view);

            }
        });
        ViewTreeObserver vto = banner.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                banner.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                Utils.putIntValue(itemView.getContext(),"imgHeight",banner.getMeasuredHeight());
            }
        });



    }
}
