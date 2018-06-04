package cn.guzzu.shoppingmall.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;


import java.util.ArrayList;
import java.util.List;

import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.BlockBanner;
import cn.guzzu.shoppingmall.ui.MainActivity;
import cn.guzzu.shoppingmall.ui.ProductActivity;
import cn.guzzu.shoppingmall.ui.StoreActivity;
import cn.guzzu.baselibrary.util.Utils;


public class BannerViewHolder extends RecyclerView.ViewHolder {
    private final Banner banner;

    public BannerViewHolder(View itemView) {
        super(itemView);
        banner =  itemView.findViewById(R.id.banner);
    }

    public void setData(final List<BlockBanner.Items> banner_info) {

        //图片url集合
        List<String> imageUris = new ArrayList<>();
        for (int i=0;i<banner_info.size();i++) {
            imageUris.add(banner_info.get(i).getImage().getThumb().getUrl());

        }
        ViewGroup.LayoutParams lp = banner.getLayoutParams();
        DisplayMetrics dm = itemView.getContext().getResources().getDisplayMetrics();
        if (banner_info.get(0).getImage().getOriginal()!=null){
            lp.height = dm.widthPixels*banner_info.get(0).getImage().getOriginal().getHeight()/banner_info.get(0).getImage().getOriginal().getWidth();
        }
        banner.setLayoutParams(lp);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.isAutoPlay(true);
        banner.setBannerAnimation(Transformer.Default);
        banner.setDelayTime(2500);

        //设置图片集合并加载图片
        banner.setImages(imageUris).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        }).start();
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Log.d("banner", "OnBannerClick: "+position);
                if (banner_info.get(position).getLinkType()!=null){
                    switch (banner_info.get(position).getLinkType()){
                        case "product":
                            Utils.start_Activity(itemView.getContext(), ProductActivity.class,"productId",banner_info.get(position).getProduct());
                            break;
                        case "store":
                            Utils.start_Activity(itemView.getContext(), StoreActivity.class,"storeId",banner_info.get(position).getStore());
                            break;
                        case "category":
                            Utils.start_Activity(itemView.getContext(), MainActivity.class,"categoryId",banner_info.get(position).getCategory());
                            break;
                    }
                }
            }
        });
    }
}
