package cn.guzzu.shoppingmall.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;

import cn.guzzu.baselibrary.base.BaseAdapter;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Order;
import cn.guzzu.shoppingmall.bean.ProductItem;
import cn.guzzu.shoppingmall.viewholder.OrderProductItemViewHolder;
import cn.guzzu.shoppingmall.viewholder.OrderProductItemViewHolder;

public class OrderProductListAdapter extends BaseAdapter<Order.Items> {


    @Override
    public int getViewLayoutId(int viewType) {
        return R.layout.layout_order_product_item;
    }

    @Override
    public OrderProductItemViewHolder createViewHolder(View view, int viewType) {
        return new OrderProductItemViewHolder(view);
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder, Order.Items item, int position) {
        if (holder instanceof OrderProductItemViewHolder){
             ((OrderProductItemViewHolder) holder).bind(item);
        }


    }

}
