package guzzu.cnshoppingmall.aa.viewholder;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;

import guzzu.cnshoppingmall.aa.Api;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Product;
import guzzu.cnshoppingmall.aa.bean.Store;
import guzzu.cnshoppingmall.baselibrary.callback.GsonObjectCallback;
import guzzu.cnshoppingmall.baselibrary.util.OkHttp3Utils;
import guzzu.cnshoppingmall.baselibrary.util.Utils;
import okhttp3.Call;

public class ProductMiddleViewHolder extends RecyclerView.ViewHolder {

    private TextView mProductName;
    private TextView mProductPrize;
    private TextView mStoreName;
    private ImageView mStoreIv;
    private RelativeLayout mRelative;


    public ProductMiddleViewHolder(View itemView) {
        super(itemView);
        mProductName = itemView.findViewById(R.id.product_name);
        mProductPrize = itemView.findViewById(R.id.product_prize);
        mRelative = itemView.findViewById(R.id.rl_option);
        mStoreName = itemView.findViewById(R.id.store_name);
        mStoreIv = itemView.findViewById(R.id.store_src);
    }
    public void setData(Product product, final Dialog dialog){
        OkHttp3Utils.doGet(Api.STORE + product.getStore(), new GsonObjectCallback<Store>() {
            @Override
            public void onUiThread(Store store, String json) {
                mStoreName.setText(store.getName());
                try {
                    Glide.with(itemView.getContext()).load(store.getLogo().getUrl()).into(mStoreIv);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
        mProductName.setText(product.getName());
        mProductPrize.setText("¥" + String.valueOf(product.getPrice() / 100));
        mRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                dialog.show();
            }
        });


    }
}
