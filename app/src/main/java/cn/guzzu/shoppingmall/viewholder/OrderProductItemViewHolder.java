package cn.guzzu.shoppingmall.viewholder;

import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import cn.guzzu.baselibrary.base.BaseViewHolder;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Order;
import cn.guzzu.shoppingmall.bean.ProductItem;
import cn.guzzu.shoppingmall.ui.ProductActivity;


public class OrderProductItemViewHolder extends BaseViewHolder<Order.Items> {
    @BindView(R.id.product_img)
    AppCompatImageView productImg;
    @BindView(R.id.product_name)
    TextView productName;
    @BindView(R.id.option_name)
    TextView optionName;
    @BindView(R.id.product_price)
    TextView productPrice;
    @BindView(R.id.product_quantity)
    TextView productQuantity;

    public OrderProductItemViewHolder(View view) {
        super(view);
    }

    public void bind(final Order.Items cartList){
        try {
            Glide.with(productImg).load(cartList.getImage().getUrl()).into(productImg);
        }catch (Exception e){
            e.printStackTrace();
        }
        productName.setText(cartList.getName());
        optionName.setText(cartList.getOptionName());
        productPrice.setText("¥"+(double)cartList.getPrice()/100);
        productQuantity.setText(String.valueOf(cartList.getQuantity()));
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.start_Activity(itemView.getContext(), ProductActivity.class,"productId",cartList.getProductId());
            }
        });
    }
}
