package guzzu.ian.guzzushoppingmall.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayout;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.flexbox.FlexboxLayout;

import java.util.List;

import guzzu.ian.baselibrary.util.DataBindingViewUtil;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.bean.BlockNavGroup;
import guzzu.ian.guzzushoppingmall.widget.MyImageView;

public class NavGroupViewHolder extends RecyclerView.ViewHolder {
    private MyImageView imageView;
    private TextView textView;
    private FlexboxLayout flexboxLayout;
        public NavGroupViewHolder(View itemView) {
        super(itemView);
        flexboxLayout = itemView.findViewById(R.id.nav_group);
    }

    public void setData(final List<BlockNavGroup.Items> nav_info, final String template){
        DataBindingViewUtil.bindDataToLayout(nav_info, flexboxLayout, R.layout.layout_navgroup_item, new DataBindingViewUtil.OnBindingDataWithLayoutParamsListener<BlockNavGroup.Items>() {
            @Override
            public ViewGroup.LayoutParams onCreateLayoutParams(View v) {
                FlexboxLayout.LayoutParams lp = new FlexboxLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                lp.setFlexBasisPercent((float) 1/nav_info.size());
                return lp;
            }

            @Override
            public ViewGroup.LayoutParams onCreateLayoutParams(View v, int position) {
//                GridLayout.Spec row = GridLayout.spec(0,1,1.0f);
//                GridLayout.Spec column = GridLayout.spec(position,1,1.0f);
//                GridLayout.LayoutParams lp = new GridLayout.LayoutParams(row,column);
                return null;
            }

            @Override
            public void onBindData(@NonNull View v, BlockNavGroup.Items data, int position) {
                imageView = v.findViewById(R.id.nav_pic);
                textView = v.findViewById(R.id.nav_title);
                DisplayMetrics dm = itemView.getContext().getResources().getDisplayMetrics();

                if (template.equals("image-text")){
                    Glide.with(itemView.getContext()).load(data.getImage().getUrl()).apply(RequestOptions.overrideOf(dm.widthPixels/nav_info.size(),dm.widthPixels/nav_info.size())).into(imageView);
                    textView.setText(data.getTitle());
                    imageView.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                }else if (template.equals("image-only")){
                    Glide.with(itemView.getContext()).load(data.getImage().getUrl()).apply(RequestOptions.overrideOf(dm.widthPixels/nav_info.size(),dm.widthPixels/nav_info.size())).into(imageView);
                    imageView.setVisibility(View.VISIBLE);
                }else {
                    textView.setText(data.getTitle());
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
