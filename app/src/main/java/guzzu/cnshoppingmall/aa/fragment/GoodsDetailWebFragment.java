package guzzu.cnshoppingmall.aa.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.widget.ItemWebView;


/**
 * 图文详情webview的Fragment
 */
public class GoodsDetailWebFragment extends Fragment implements View.OnClickListener {
    public ItemWebView wv_detail;
    private FloatingActionButton fab_up_slide;
    private WebSettings webSettings;
    private LayoutInflater inflater;

    public static GoodsDetailWebFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("webdata", content);
        GoodsDetailWebFragment  fragment = new GoodsDetailWebFragment ();
        fragment.setArguments(args);
        return fragment;
    }

    public GoodsDetailWebFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.inflater = inflater;
        View rootView = inflater.inflate(R.layout.fragment_item_detail_web, null);
        initWebView(rootView);
        fab_up_slide.setOnClickListener(this);
        return rootView;
    }

    public void initWebView(View rootView) {
        fab_up_slide = (FloatingActionButton) rootView.findViewById(R.id.fab_up_slide);
        wv_detail = rootView.findViewById(R.id.wv_detail);
        fab_up_slide.hide();
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
        wv_detail.setOnScrollListener(new ItemWebView.OnScrollListener() {
            @Override
            public void onScroll(int scrollY, int oldScrollY) {
                if (scrollY>0){
                    fab_up_slide.show();
                }else {
                    fab_up_slide.hide();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab_up_slide:
                //点击滑动到顶部
                wv_detail.scrollTo(0, 0);

                break;
        }

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
