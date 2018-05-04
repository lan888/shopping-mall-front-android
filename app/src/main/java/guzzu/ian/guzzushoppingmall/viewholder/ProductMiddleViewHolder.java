package guzzu.ian.guzzushoppingmall.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.bean.Product;

public class ProductMiddleViewHolder extends RecyclerView.ViewHolder {

    private TextView mProductName;
    private TextView mProductPrize;
    private LinearLayout mLinear;
    private WebView mWebView;

    public ProductMiddleViewHolder(View itemView) {
        super(itemView);
        mProductName = itemView.findViewById(R.id.product_name);
        mProductPrize = itemView.findViewById(R.id.product_prize);
        mLinear =itemView.findViewById(R.id.mLinear);
    }
    public void setData(Product product, Context context){
        mWebView = new WebView(context.getApplicationContext());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mWebView.setLayoutParams(lp);
        mWebView.setBackgroundColor(context.getResources().getColor(R.color.gray_bg));
        mWebView.getSettings().setDefaultTextEncodingName("UTF-8");
        String data;
        if (product.getDescription().getZh()!=null){
            data=product.getDescription().getEn();
        }else {
            data=product.getDescription().getZh();
        }
        data="<link rel=\"stylesheet\" href=\"img.css\" type=\"text/css\" />"+data;
        mWebView.loadDataWithBaseURL("file:///android_asset/",data, "text/html; charset=UTF-8", null,null);
        mLinear.addView(mWebView);
        Log.e("log", "setData: "+data);
        mProductName.setText(product.getName());
        mProductPrize.setText("￥" + String.valueOf(product.getPrice() / 100));


    }
}