package guzzu.cnshoppingmall.aa.viewholder;

import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnLoadImageListener;

import java.util.ArrayList;
import java.util.List;

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.BlockBanner;


public class BannerViewHolder extends RecyclerView.ViewHolder {
    private final Banner banner;

    public BannerViewHolder(View itemView) {
        super(itemView);
        banner =  itemView.findViewById(R.id.banner);
    }

    public void setData(final List<BlockBanner.Items.Image> banner_info) {
        //图片url集合
        List<String> imageUris = new ArrayList<>();
        for (int i = 0; i < banner_info.size(); i++) {
            imageUris.add(banner_info.get(i).getUrl());
        }
        ViewGroup.LayoutParams lp = banner.getLayoutParams();
        DisplayMetrics dm = itemView.getContext().getResources().getDisplayMetrics();
        if (banner_info.get(0).getOriginal()!=null){
            lp.height = dm.widthPixels*banner_info.get(0).getOriginal().getHeight()/banner_info.get(0).getOriginal().getWidth();
        }
        banner.setLayoutParams(lp);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.isAutoPlay(true);
        banner.setBannerAnimation(Transformer.Default);
        banner.setDelayTime(2500);

        //设置图片集合并加载图片
        banner.setImages(imageUris, new OnLoadImageListener() {
            @Override
            public void OnLoadImage(ImageView view, Object url) {
                Glide.with(itemView.getContext()).load(url).into(view);

            }
        });
    }
}
