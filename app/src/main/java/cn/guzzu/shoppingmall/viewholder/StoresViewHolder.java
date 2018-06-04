package cn.guzzu.shoppingmall.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Store;
import cn.guzzu.shoppingmall.ui.StoreActivity;
import cn.guzzu.shoppingmall.widget.MyImageView;
import cn.guzzu.baselibrary.util.Utils;

public class StoresViewHolder extends RecyclerView.ViewHolder {
    private MyImageView pic;
    private TextView title;
    private TextView price;
    public StoresViewHolder(View itemView) {
        super(itemView);
        pic = itemView.findViewById(R.id.pic);
        title =itemView.findViewById(R.id.product_group_title);
        price = itemView.findViewById(R.id.product_group_price);
    }


    public void bind(final Context context, final Store stores){
        try {
            Glide.with(context).load(stores.getLogo().getThumb().getUrl()).into(pic);

            }catch (Exception e){
                    e.printStackTrace();
        }
        title.setText(stores.getName());
        price.setVisibility(View.GONE);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.start_Activity(context, StoreActivity.class,"storeId",stores.get_id());
                }
});

    }
}
