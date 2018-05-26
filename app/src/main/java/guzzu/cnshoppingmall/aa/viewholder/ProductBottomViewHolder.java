package guzzu.cnshoppingmall.aa.viewholder;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Product;
import guzzu.cnshoppingmall.baselibrary.util.Utils;

public class ProductBottomViewHolder extends RecyclerView.ViewHolder {


    private LinearLayout mLinear;
    private WebView mWebView;

    public ProductBottomViewHolder(View itemView) {
        super(itemView);
        mLinear =itemView.findViewById(R.id.mLinear);

    }
    public void setData(Product product, Context context){
        mWebView = new WebView(context.getApplicationContext());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.topMargin = Utils.dp2px(context,12);
        mWebView.setLayoutParams(lp);
        mWebView.setBackgroundColor(context.getResources().getColor(R.color.gray_bg));
        mWebView.getSettings().setDefaultTextEncodingName("UTF-8");
        String data=product.getDescription();
        data="<link rel=\"stylesheet\" href=\"img.css\" type=\"text/css\" />"+data;
        mWebView.loadDataWithBaseURL("file:///android_asset/",data, "text/html; charset=UTF-8", null,null);
        mLinear.addView(mWebView);
        Log.e("log", "setData: "+data);


    }
}
