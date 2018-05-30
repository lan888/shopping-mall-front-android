package guzzu.cnshoppingmall.aa.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;

import java.io.IOException;

import guzzu.cnshoppingmall.aa.Api;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Category;
import guzzu.cnshoppingmall.aa.bean.Products;
import guzzu.cnshoppingmall.aa.ui.ProductActivity;
import guzzu.cnshoppingmall.aa.widget.MyImageView;
import guzzu.cnshoppingmall.baselibrary.callback.GsonObjectCallback;
import guzzu.cnshoppingmall.baselibrary.util.DataBindingViewUtil;
import guzzu.cnshoppingmall.baselibrary.util.OkHttp3Utils;
import guzzu.cnshoppingmall.baselibrary.util.Utils;
import okhttp3.Call;

import static android.support.constraint.Constraints.TAG;

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
        price.setText("¥"+String.valueOf(products.getPrice()/100));
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
