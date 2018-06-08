package cn.guzzu.shoppingmall.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.flexbox.FlexboxLayoutManager;

import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Products;
import cn.guzzu.shoppingmall.ui.ProductActivity;
import cn.guzzu.shoppingmall.widget.MyImageView;
import cn.guzzu.baselibrary.util.Utils;

public class ProductsViewHolder extends RecyclerView.ViewHolder {
    private MyImageView pic;
    private TextView title;
    private TextView price;
    public ProductsViewHolder(View itemView) {
        super(itemView);
        pic = itemView.findViewById(R.id.pic);
        title =itemView.findViewById(R.id.product_group_title);
        price = itemView.findViewById(R.id.product_group_price);
    }


    public void bind(final Context context, final Products products){
        try {
            Glide.with(context).load(products.getImage().getUrl()).into(pic);

            }catch (Exception e){
                    e.printStackTrace();
        }
        title.setText(products.getName());
        price.setText("¥"+String.valueOf((double) products.getPrice()/100));
        ViewGroup.LayoutParams lp = itemView.getLayoutParams();
        if (lp instanceof FlexboxLayoutManager.LayoutParams) {
            FlexboxLayoutManager.LayoutParams flexboxLp =
                    (FlexboxLayoutManager.LayoutParams) itemView.getLayoutParams();
            flexboxLp.setFlexBasisPercent(0.5f);
        }
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.start_Activity(context, ProductActivity.class,"productId",products.get_id());
                }
});

    }
}
