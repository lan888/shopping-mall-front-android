package guzzu.cnshoppingmall.aa.fragment;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.squareup.otto.Subscribe;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnLoadImageListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import guzzu.cnshoppingmall.aa.Api;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.FragmentChangeEvent;
import guzzu.cnshoppingmall.aa.bean.Product;
import guzzu.cnshoppingmall.aa.bean.Store;
import guzzu.cnshoppingmall.aa.ui.ProductActivity;
import guzzu.cnshoppingmall.aa.ui.StoreActivity;
import guzzu.cnshoppingmall.aa.widget.MyScrollView;
import guzzu.cnshoppingmall.aa.widget.SlideDetailsLayout;
import guzzu.cnshoppingmall.baselibrary.base.BaseApp;
import guzzu.cnshoppingmall.baselibrary.callback.GsonObjectCallback;
import guzzu.cnshoppingmall.baselibrary.callback.JsonCallback;
import guzzu.cnshoppingmall.baselibrary.util.EventUtil;
import guzzu.cnshoppingmall.baselibrary.util.OkHttp3Utils;
import guzzu.cnshoppingmall.baselibrary.util.Utils;
import okhttp3.Call;

import static android.support.constraint.Constraints.TAG;

/**
 * item页ViewPager里的商品Fragment
 */
public class GoodsInfoFragment extends Fragment implements View.OnClickListener, SlideDetailsLayout.OnSlideDetailsListener {
    private SlideDetailsLayout sv_switch;
    private MyScrollView sv_goods_info;
    public Banner banner;
    private LinearLayout ll_goods_detail, ll_goods_config,ll_store;
    private TextView tv_goods_detail, tv_goods_config;
    private View v_tab_cursor;
    public FrameLayout fl_content;
    public LinearLayout ll_current_goods, ll_activity, ll_pull_up;
    public TextView tv_goods_title, tv_new_price, tv_old_price, tv_current_goods, mStoreName;
    private ImageView mStoreSrc;

    /** 当前商品详情数据页的索引分别是图文详情、规格参数 */
    private int nowIndex;
    private float fromX;
    public GoodsInfoWebFragment goodsInfoWebFragment;
    private Fragment nowFragment;
    private List<TextView> tabTextList;
    private List<Fragment> fragmentList = new ArrayList<>();
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;
    public ProductActivity activity;
    private LayoutInflater inflater;
    private Product product;
    private Dialog bottomDialog;

    public static GoodsInfoFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("productId", content);
        GoodsInfoFragment  fragment = new GoodsInfoFragment ();
        fragment.setArguments(args);
        return fragment;
    }

    public GoodsInfoFragment() {
    }

    public Dialog getBottomDialog() {
        return bottomDialog;
    }

    public void setBottomDialog(Dialog bottomDialog) {
        this.bottomDialog = bottomDialog;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (ProductActivity) context;
    }

    // 开始自动翻页
    @Override
    public void onResume() {
        super.onResume();
        //开始自动翻页
        banner.isAutoPlay(true);
    }

    // 停止自动翻页
    @Override
    public void onPause() {
        super.onPause();
        //停止翻页
        banner.isAutoPlay(false);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.inflater = inflater;
        View rootView = inflater.inflate(R.layout.fragment_goods_info, null);
        initView(rootView);
        initListener();
        initData();
        return rootView;
    }

    private void initListener() {

        ll_current_goods.setOnClickListener(this);
        ll_activity.setOnClickListener(this);
        ll_pull_up.setOnClickListener(this);
        ll_goods_detail.setOnClickListener(this);
//        ll_goods_config.setOnClickListener(this);
        sv_switch.setOnSlideDetailsListener(this);
    }

    private void initView(View rootView) {

        sv_switch = (SlideDetailsLayout) rootView.findViewById(R.id.sv_switch);
        sv_goods_info =  rootView.findViewById(R.id.sv_goods_info);
//        v_tab_cursor = rootView.findViewById(R.id.v_tab_cursor);
        fl_content = (FrameLayout) rootView.findViewById(R.id.fl_content);
        ll_current_goods = (LinearLayout) rootView.findViewById(R.id.ll_current_goods);
        ll_activity = (LinearLayout) rootView.findViewById(R.id.ll_activity);
        ll_pull_up = (LinearLayout) rootView.findViewById(R.id.ll_pull_up);
        ll_goods_detail = (LinearLayout) rootView.findViewById(R.id.ll_goods_detail);
//        ll_goods_config = (LinearLayout) rootView.findViewById(R.id.ll_goods_config);
        tv_goods_detail = (TextView) rootView.findViewById(R.id.tv_goods_detail);
//        tv_goods_config = (TextView) rootView.findViewById(R.id.tv_goods_config);
        tv_goods_title = (TextView) rootView.findViewById(R.id.tv_goods_title);
        tv_new_price = (TextView) rootView.findViewById(R.id.tv_new_price);
        tv_old_price = (TextView) rootView.findViewById(R.id.tv_old_price);
        tv_current_goods = (TextView) rootView.findViewById(R.id.tv_current_goods);
        banner = rootView.findViewById(R.id.banner);
        mStoreName = rootView.findViewById(R.id.store_name);
        mStoreSrc = rootView.findViewById(R.id.store_src);
        ll_store = rootView.findViewById(R.id.ll_store);
        setDetailData();

        //设置文字中间一条横线
        tv_old_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);


    }

    private void initData() {
        fragmentList = new ArrayList<>();
        tabTextList = new ArrayList<>();
        tabTextList.add(tv_goods_detail);
        tabTextList.add(tv_goods_config);

    }

    /**
     * 加载完商品详情执行
     */
    public void setDetailData() {
        String mProductId = getArguments().getString("productId");
        OkHttp3Utils.doGet(Api.PRODUCT + mProductId, new JsonCallback() {
            @Override
            public void onUiThread(int code,String json) {
                Gson gson = new Gson();
                product = gson.fromJson(json, Product.class);
                initBanner();
                initInfoView();
                OkHttp3Utils.doGet(Api.STORE + product.getStore(), new GsonObjectCallback<Store>() {
                    @Override
                    public void onUiThread(final Store store, String json) {
                        mStoreName.setText(store.getName());
                        try {
                            Glide.with(getContext()).load(store.getLogo().getUrl()).into(mStoreSrc);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        ll_store.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Utils.start_Activity(getContext(), StoreActivity.class,"storeId",store.get_id());
                            }
                        });
                        sv_goods_info.setOnScrollListener(new MyScrollView.OnScrollListener() {
                            @Override
                            public void onScroll(int scrollY, int oldScrollY) {
                                FragmentChangeEvent event = new FragmentChangeEvent();
                                event.setDy(scrollY);
                                EventUtil.sendEvent(event);
                            }
                        });
                        goodsInfoWebFragment = GoodsInfoWebFragment.newInstance(product.getDescription());
                        fragmentList.add(goodsInfoWebFragment);

                        nowFragment = goodsInfoWebFragment;
                        fragmentManager = getChildFragmentManager();
                        //默认显示商品详情tab
                        fragmentManager.beginTransaction().replace(R.id.fl_content, nowFragment).commitAllowingStateLoss();

                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {

                    }
                });
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });


    }
    private void initInfoView() {
        tv_goods_title.setText(product.getName());
        tv_new_price.setText(String.valueOf(product.getPrice() / 100));
        activity.setListener(new ProductActivity.OnOptionClickListener() {
            @Override
            public void process(String str, int count) {
                Log.d(TAG, "onChanged: "+str+","+count);
                if (str!=null&&count!=0){
                    tv_current_goods.setText(str+","+count);
                }
            }
        });
        ll_current_goods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bottomDialog!=null){
                    bottomDialog.dismiss();
                    bottomDialog.show();
                }

            }
        });
    }
    private void initBanner() {
        List<String> product_img = new ArrayList<>();
        if (product.getImage() != null) {
            product_img.add(product.getImage().getUrl());

            if (product.getGallery() != null) {
                if (product.getGallery().size() > 0) {
                    for (int i = 0; i < product.getGallery().size(); i++) {
                        product_img.add(product.getGallery().get(i).getUrl());
                        Log.d("top", "setData: " + product.getGallery().get(i).getUrl());
                    }
                }
            }

            ViewGroup.LayoutParams lp = banner.getLayoutParams();
            if (product.getImage().getOriginal() != null) {
                lp.height = BaseApp.width * product.getImage().getOriginal().getHeight() / product.getImage().getOriginal().getWidth();
            }
            banner.setLayoutParams(lp);
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            banner.isAutoPlay(true);
            banner.setBannerAnimation(Transformer.Default);
            banner.setDelayTime(2500);

            //设置图片集合并加载图片
            banner.setImages(product_img, new OnLoadImageListener() {
                @Override
                public void OnLoadImage(ImageView view, Object url) {
                    Glide.with(getContext()).load(url).into(view);

                }
            });
            ViewTreeObserver vto = banner.getViewTreeObserver();
            vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    banner.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    Utils.putIntValue(getContext(), "imgHeight", banner.getMeasuredHeight());
                }
            });


        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_pull_up:
                //上拉查看图文详情
                sv_switch.smoothOpen(true);
                break;

            case R.id.fab_up_slide:
                //点击滑动到顶部
                sv_goods_info.smoothScrollTo(0, 0);
                sv_switch.smoothClose(true);
                break;

            case R.id.ll_goods_detail:
                //商品详情tab
                nowIndex = 0;
//                scrollCursor();
                switchFragment(nowFragment, goodsInfoWebFragment);
                nowFragment = goodsInfoWebFragment;
                break;

//            case R.id.ll_goods_config:
//                //规格参数tab
//                nowIndex = 1;
//                scrollCursor();
//
//                break;

            default:
                break;
        }
    }



    @Override
    public void onStatusChanged(SlideDetailsLayout.Status status) {
        FragmentChangeEvent event = new FragmentChangeEvent();
        if (status == SlideDetailsLayout.Status.OPEN) {
            //当前为图文详情页
            event.setDetailShow(true);

        } else {
            //当前为商品详情页
            event.setShow(true);
            event.setDetailShow(false);
        }
        EventUtil.sendEvent(event);
    }

    /**
     * 滑动游标
     */
    private void scrollCursor() {
        TranslateAnimation anim = new TranslateAnimation(fromX, nowIndex * v_tab_cursor.getWidth(), 0, 0);
        anim.setFillAfter(true);//设置动画结束时停在动画结束的位置
        anim.setDuration(50);
        //保存动画结束时游标的位置,作为下次滑动的起点
        fromX = nowIndex * v_tab_cursor.getWidth();
        v_tab_cursor.startAnimation(anim);

        //设置Tab切换颜色
        for (int i = 0; i < tabTextList.size(); i++) {
            tabTextList.get(i).setTextColor(i == nowIndex ? getResources().getColor(R.color.red) : getResources().getColor(R.color.md_black_1000));
        }
    }

    /**
     * 切换Fragment
     * <p>(hide、show、add)
     * @param fromFragment
     * @param toFragment
     */
    private void switchFragment(Fragment fromFragment, Fragment toFragment) {
        if (nowFragment != toFragment) {
            fragmentTransaction = fragmentManager.beginTransaction();
            if (!toFragment.isAdded()) {    // 先判断是否被add过
                fragmentTransaction.hide(fromFragment).add(R.id.fl_content, toFragment).commitAllowingStateLoss(); // 隐藏当前的fragment，add下一个到activity中
            } else {
                fragmentTransaction.hide(fromFragment).show(toFragment).commitAllowingStateLoss(); // 隐藏当前的fragment，显示下一个
            }
        }
    }


}
