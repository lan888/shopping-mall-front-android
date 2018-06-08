package cn.guzzu.shoppingmall.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseAdapter;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Addresses;
import cn.guzzu.shoppingmall.viewholder.AddressManagerItemViewHolder;

public class AddressManagerListAdapter extends BaseAdapter<Addresses> {


    @Override
    public int getViewLayoutId(int viewType) {
        return R.layout.layout_address_manager_item;
    }

    @Override
    public AddressManagerItemViewHolder createViewHolder(View view, int viewType) {
        return new AddressManagerItemViewHolder(view);
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder, Addresses item, int position) {
        if (holder instanceof AddressManagerItemViewHolder) {
            ((AddressManagerItemViewHolder) holder).bind(item);
        }

    }

}
