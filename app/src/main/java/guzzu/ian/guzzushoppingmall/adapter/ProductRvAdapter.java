package guzzu.ian.guzzushoppingmall.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.bean.Product;
import guzzu.ian.guzzushoppingmall.viewholder.ProductMiddleViewHolder;
import guzzu.ian.guzzushoppingmall.viewholder.ProductTopViewHolder;

public class ProductRvAdapter extends RecyclerView.Adapter {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private Product product;
    private int currentType = TOP;
    /**
     * 横幅广告
     */
    public static final int TOP = 0;
    /**
     * 标题
     */
    public static final int MIDDLE = 1;

    public ProductRvAdapter(Context mContext, Product product) {
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.product = product;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TOP) {
            return new ProductTopViewHolder(mLayoutInflater.inflate(R.layout.layout_product_top, null));
        } else if (viewType == MIDDLE) {
            return new ProductMiddleViewHolder(mLayoutInflater.inflate(R.layout.layout_product_content, null));
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
            productMiddleViewHolder.setData(product,mContext);

        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
