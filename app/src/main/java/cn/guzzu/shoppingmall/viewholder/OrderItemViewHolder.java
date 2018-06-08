package cn.guzzu.shoppingmall.viewholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.gc.materialdesign.views.ButtonRectangle;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.guzzu.baselibrary.base.BaseViewHolder;
import cn.guzzu.baselibrary.util.DataBindingViewUtil;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Order;
import cn.guzzu.shoppingmall.ui.StoreActivity;


public class OrderItemViewHolder extends BaseViewHolder<Order> {
    @BindView(R.id.tv_status)
    TextView tvStatus;
    @BindView(R.id.tv_total_cost)
    TextView tvTotalCost;
    @BindView(R.id.tv_store)
    TextView tvStore;
    @BindView(R.id.btn_check)
    ButtonRectangle btnCheck;
    @BindView(R.id.ll_product)
    LinearLayout llProduct;


    public OrderItemViewHolder(View view) {
        super(view);
    }

    public void bind(final Order order) {
        tvStatus.setText(order.getPaymentStatus());
        tvTotalCost.setText("共"+order.getItems().size()+"件商品 "+"合计：¥"+(double)order.getTotalCost()/100);
        tvStore.setText(order.getStore().getName());
        tvStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.start_Activity(itemView.getContext(), StoreActivity.class,"storeId",order.getStore().get_id());
            }
        });
        DataBindingViewUtil.bindDataToLayout(order.getItems(), llProduct, R.layout.layout_order_item_one, new DataBindingViewUtil.OnBindingDataListener<Order.Items>() {
            @Override
            public void onBindData(@NonNull View v, Order.Items data, int position) {
                ImageView ivImage = v.findViewById(R.id.iv_image);
                TextView tvName = v.findViewById(R.id.tv_name);
                TextView tvOption = v.findViewById(R.id.tv_option);
                TextView tvPrice = v.findViewById(R.id.tv_price);
                TextView tvQuantity = v.findViewById(R.id.tv_quantity);
                Glide.with(itemView.getContext()).load(data.getProduct().getImage().getThumb().getUrl()).into(ivImage);
                tvName.setText(data.getName());
                tvPrice.setText("¥"+(double)data.getPrice()/100);
                tvQuantity.setText("x"+data.getQuantity());
            }
        });

    }

}
