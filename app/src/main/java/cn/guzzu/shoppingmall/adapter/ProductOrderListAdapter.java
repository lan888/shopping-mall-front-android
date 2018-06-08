package cn.guzzu.shoppingmall.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;

import cn.guzzu.baselibrary.base.BaseAdapter;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.ProductItem;
import cn.guzzu.shoppingmall.viewholder.ProductOrderItemViewHolder;

public class ProductOrderListAdapter extends BaseAdapter<ProductItem> {


    @Override
    public int getViewLayoutId(int viewType) {
        return R.layout.layout_order_product_item;
    }

    @Override
    public ProductOrderItemViewHolder createViewHolder(View view, int viewType) {
        return new ProductOrderItemViewHolder(view);
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder, ProductItem item, int position) {
        if (holder instanceof ProductOrderItemViewHolder){
             ((ProductOrderItemViewHolder) holder).bind(item);
        }


    }

}
