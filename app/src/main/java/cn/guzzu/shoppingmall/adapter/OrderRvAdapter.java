package cn.guzzu.shoppingmall.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import cn.guzzu.baselibrary.base.BaseAdapter;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Order;
import cn.guzzu.shoppingmall.viewholder.OrderItemViewHolder;

public class OrderRvAdapter extends BaseAdapter<Order> {

    @Override
    public int getViewLayoutId(int viewType) {
        return R.layout.layout_order_item;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(View view, int viewType) {
        return new OrderItemViewHolder(view);
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder, Order item, int position) {
        if (holder instanceof OrderItemViewHolder) {
            ((OrderItemViewHolder) holder).bind(item);
        }

    }
}
