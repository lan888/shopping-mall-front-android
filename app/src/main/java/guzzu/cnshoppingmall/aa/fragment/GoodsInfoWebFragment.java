package guzzu.cnshoppingmall.aa.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.Product;


/**
 * 图文详情webview的Fragment
 */
public class GoodsInfoWebFragment extends Fragment {
    public WebView wv_detail;
    private WebSettings webSettings;
    private LayoutInflater inflater;

    public static GoodsInfoWebFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("webdata", content);
        GoodsInfoWebFragment  fragment = new GoodsInfoWebFragment ();
        fragment.setArguments(args);
        return fragment;
    }

    public GoodsInfoWebFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.inflater = inflater;
        View rootView = inflater.inflate(R.layout.fragment_item_info_web, null);
        initWebView(rootView);
        return rootView;
    }

    public void initWebView(View rootView) {
        wv_detail = (WebView) rootView.findViewById(R.id.wv_detail);
        wv_detail.setFocusable(false);
        wv_detail.getSettings().setDefaultTextEncodingName("UTF-8");
        String data = getArguments().getString("webdata");
        data = "<link rel=\"stylesheet\" href=\"img.css\" type=\"text/css\" />" + data;
        wv_detail.loadDataWithBaseURL("file:///android_asset/", data, "text/html; charset=UTF-8", null, null);
        webSettings = wv_detail.getSettings();
//        webSettings.setLoadWithOverviewMode(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webSettings.setBlockNetworkImage(true);
//        webSettings.setUseWideViewPort(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        wv_detail.setWebViewClient(new GoodsDetailWebViewClient());
    }

    private class GoodsDetailWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            webSettings.setBlockNetworkImage(false);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return true;
        }
    }
}
