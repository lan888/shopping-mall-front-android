package guzzu.cnshoppingmall.aa.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Product;
import guzzu.cnshoppingmall.aa.viewholder.ProductBottomViewHolder;
import guzzu.cnshoppingmall.aa.viewholder.ProductMiddleViewHolder;
import guzzu.cnshoppingmall.aa.viewholder.ProductTopViewHolder;

public class ProductRvAdapter extends RecyclerView.Adapter {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private Dialog dialog;
    private Product product;
    private int currentType = TOP;
    /**
     * TOP
     */
    public static final int TOP = 0;
    /**
     * MIDDLE
     */
    public static final int MIDDLE = 1;

    public static final int BOTTOM = 2;

    public ProductRvAdapter(Context mContext, Product product) {
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.product = product;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TOP) {
            return new ProductTopViewHolder(mLayoutInflater.inflate(R.layout.layout_product_top, null));
        } else if (viewType == MIDDLE) {
            return new ProductMiddleViewHolder(mLayoutInflater.inflate(R.layout.layout_product_middle, null));
        }else if (viewType == BOTTOM){
            return new ProductBottomViewHolder(mLayoutInflater.inflate(R.layout.layout_product_bottom,null));
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case TOP:
                currentType = TOP;
                break;
            case MIDDLE:
                currentType = MIDDLE;
                break;
            case BOTTOM:
                currentType = BOTTOM;
                break;
        }
        return currentType;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == TOP) {
            if (holder instanceof ProductTopViewHolder) {
                ProductTopViewHolder productTopViewHolder = (ProductTopViewHolder) holder;
                productTopViewHolder.setData(product);
            }
        }else if (getItemViewType(position)==MIDDLE){
            ProductMiddleViewHolder productMiddleViewHolder = (ProductMiddleViewHolder) holder;
            productMiddleViewHolder.setData(product,dialog);

        }else if (getItemViewType(position)==BOTTOM){
            ProductBottomViewHolder productBottomViewHolder = (ProductBottomViewHolder) holder;
            productBottomViewHolder.setData(product,mContext);
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

}
