package guzzu.ian.guzzushoppingmall.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.flexbox.FlexboxLayout;

import java.util.List;

import guzzu.ian.baselibrary.util.DataBindingViewUtil;
import guzzu.ian.baselibrary.util.Utils;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.bean.BlockNavGroup;
import guzzu.ian.guzzushoppingmall.bean.BlockProductGroup;
import guzzu.ian.guzzushoppingmall.ui.ProductActivity;
import guzzu.ian.guzzushoppingmall.widget.MyImageView;

public class ProductGroupViewHolder extends RecyclerView.ViewHolder {
    private MyImageView pic;
    private TextView title;
    private TextView price;
    private FlexboxLayout flexboxLayout;
    private float flexPercent = 0;
    public ProductGroupViewHolder(View itemView) {
        super(itemView);
        flexboxLayout = itemView.findViewById(R.id.product_group);

    }

    public void setData(@NonNull final List<BlockProductGroup.Items> product_info, final String template){
        int itemLayout = 0 ;
        if (template.contains("single")){
            itemLayout = R.layout.layout_productgroup_item_single;
            flexPercent =  1;
        }else if (template.contains("double")){
            flexPercent = (float) 0.5;
            itemLayout = R.layout.layout_productgroup_item_double;
        }else if (template.contains("triple")){
            flexPercent = (float)0.33;
            itemLayout = R.layout.layout_productgroup_item_triple;
        }
        if (product_info.size()>0){
            DataBindingViewUtil.bindDataToLayout(product_info, flexboxLayout, itemLayout, new DataBindingViewUtil.OnBindingDataWithLayoutParamsListener<BlockProductGroup.Items>() {
                @Override
                public ViewGroup.LayoutParams onCreateLayoutParams(View v) {
                    FlexboxLayout.LayoutParams lp = new FlexboxLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    lp.setFlexBasisPercent(flexPercent);
                    return lp;
                }

                @Override
                public ViewGroup.LayoutParams onCreateLayoutParams(View v, int position) {
                    return null;
                }

                @Override
                public void onBindData(@NonNull View v, BlockProductGroup.Items data, int position) {
                    v.setTag(data.get_id());
                    pic = v.findViewById(R.id.pic);
                    title =v.findViewById(R.id.product_group_title);
                    price = v.findViewById(R.id.product_group_price);

                    if (data.getImage()!=null){
                        try {
                            Glide.with(itemView.getContext()).load(data.getImage().getUrl()).apply(RequestOptions.centerCropTransform()).into(pic);
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                    title.setText(data.getName());
                    price.setText("￥"+String.valueOf(data.getPrice()/100));

                    v.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Utils.start_Activity(itemView.getContext(), ProductActivity.class,"productId",v.getTag().toString());
                        }
                    });

                }
            });
        }
    }

}
