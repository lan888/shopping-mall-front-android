package cn.guzzu.shoppingmall.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import cn.guzzu.shoppingmall.ui.MainActivity;
import cn.guzzu.shoppingmall.ui.ProductActivity;
import cn.guzzu.shoppingmall.ui.StoreActivity;
import cn.guzzu.baselibrary.util.DataBindingViewUtil;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.BlockTitle;
import cn.guzzu.baselibrary.util.Utils;

public class TitleViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView subtitle;
    private AppCompatImageView src;
    private LinearLayout linearLayout;
    public TitleViewHolder(View itemView) {
        super(itemView);
        linearLayout = itemView.findViewById(R.id.layout_title);
    }

    public void setData(final List<BlockTitle.Items> title_info, final String template){
        DataBindingViewUtil.bindDataToLayout(title_info, linearLayout, R.layout.layout_title_item, new DataBindingViewUtil.OnBindingDataWithLayoutParamsListener<BlockTitle.Items>() {
            @Override
            public ViewGroup.LayoutParams onCreateLayoutParams(View v) {
                return null;
            }

            @Override
            public ViewGroup.LayoutParams onCreateLayoutParams(View v, int position) {
                return null;
            }

            @Override
            public void onBindData(@NonNull View v, final BlockTitle.Items data, int position) {
                title = v.findViewById(R.id.bigTitle);
                subtitle = v.findViewById(R.id.subtitle);
                src = v.findViewById(R.id.titleSrc);
                title.setText(data.getTitle());
                if (data.getSubtitle()!=null){
                    subtitle.setText(data.getSubtitle());
                }else {
                    subtitle.setVisibility(View.GONE);
                }
                if (data.getLinkType()==null){
                    src.setVisibility(View.GONE);
                }
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (data.getLinkType()!=null){
                            switch (data.getLinkType()){
                                case "product":
                                    Utils.start_Activity(itemView.getContext(), ProductActivity.class,"productId",data.getProduct());
                                    break;
                                case "store":
                                    Utils.start_Activity(itemView.getContext(), StoreActivity.class,"storeId",data.getStore());
                                    break;
                                case "category":
                                    Utils.start_Activity(itemView.getContext(), MainActivity.class,"categoryId",data.getCategory());
                                    break;
                            }
                        }
                    }
                });


            }
        });

    }
}
