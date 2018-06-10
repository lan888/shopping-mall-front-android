package cn.guzzu.shoppingmall.ui;

import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.callback.GsonObjectCallback;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.baselibrary.widget.LoadingDialog;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.ProductOrderListAdapter;
import cn.guzzu.shoppingmall.bean.Discount;
import cn.guzzu.shoppingmall.bean.OrderPreviewRequest;
import cn.guzzu.shoppingmall.bean.OrderPreviewResponse;
import cn.guzzu.shoppingmall.bean.Product;
import cn.guzzu.shoppingmall.bean.ProductItem;
import okhttp3.Call;

public class SettledActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_name)
    TextView mTvName;
    @BindView(R.id.mobilePhone)
    TextView mMobilePhone;
    @BindView(R.id.address)
    TextView mAddress;
    @BindView(R.id.btn_select)
    ButtonRectangle mBtnSelect;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.tv_subtotal)
    TextView mTvSubtotal;
    @BindView(R.id.tv_shipping_cost)
    TextView mTvShippingCost;
    @BindView(R.id.tv_total_cost)
    TextView mTvTotalCost;
    @BindView(R.id.sp_discount)
    AppCompatSpinner mSpDiscount;
    @BindView(R.id.tv_total_paid)
    TextView mTvTotalPaid;
    @BindView(R.id.tv_buy)
    TextView mTvBuy;
    @BindView(R.id.ll_discount)
    LinearLayout mllDiscount;
    @BindView(R.id.tv_discount)
    TextView mTvDiscount;

    private Gson gson;
    private String mProduct;
    private String mPreviewJson;
    private ProductItem productItem;
    private OrderPreviewRequest.ShippingAddress addressLastUsed;
    private ProductOrderListAdapter mProductOrderListAdapter;
    private boolean isAddressNull;
    @Override
    public int initLayout() {
        return R.layout.activity_settled;
    }

    @Override
    public void initView() {
        if (mToolbar != null) {
            mToolbar.setTitle(getString(R.string.title_order_detail));
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mProductOrderListAdapter = new ProductOrderListAdapter();
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mProductOrderListAdapter);
    }

    @Override
    public void initData() {
        mProduct = getIntent().getStringExtra("product");
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.DISCOUNT_FIND, mProduct, BaseApp.Constant.userId, new GsonArrayCallback<Discount>() {
            @Override
            public void onUiThread(int code, List<Discount> list) {
                if (code == 200) {
                    if (list.size() == 0) {
                        mllDiscount.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }

    @Override
    public void initListener() {
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.finish(context);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        gson = new Gson();
        OkHttp3Utils.doPost(Api.GUZZU + Api.ADDRESS_LASTUSED, BaseApp.Constant.userId, "zh", new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code == 200) {
                    final OrderPreviewRequest orderPreviewRequest = new OrderPreviewRequest();
                    Date date = new Date(System.currentTimeMillis());
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                    if (json.equals("null")) {
                        mBtnSelect.setText("新增收货地址");
                        mTvName.setVisibility(View.GONE);
                        mAddress.setVisibility(View.GONE);
                        mMobilePhone.setVisibility(View.GONE);
                        isAddressNull = true;
                        JSONObject obj = new JSONObject();
                        try {
                            obj.put("shoppingMall","5adedc43de3c90022eb25d3b");
                            obj.put("shippingAddress",new JSONObject());
                            obj.put("shippingType","regular");
                            obj.put("nonce",simpleDateFormat.format(date));
                            obj.put("type","default");
                            JSONObject object = new JSONObject(mProduct);
                            obj.put("items",object.optJSONArray("items"));
                            obj.put("storeId",object.optString("storeId"));
                            mPreviewJson = obj.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }else {
                        isAddressNull = false;
                        mBtnSelect.setText("选择收货地址");
                        addressLastUsed = gson.fromJson(json, OrderPreviewRequest.ShippingAddress.class);
                        mTvName.setVisibility(View.VISIBLE);
                        mAddress.setVisibility(View.VISIBLE);
                        mMobilePhone.setVisibility(View.VISIBLE);
                        mTvName.setText(addressLastUsed.getName());
                        mAddress.setText(addressLastUsed.getProvince() + addressLastUsed.getCity() + addressLastUsed.getDistrict() + addressLastUsed.getStreet() + addressLastUsed.getAddress());
                        mMobilePhone.setText(addressLastUsed.getMobilePhone());
                        orderPreviewRequest.setShoppingMall("5adedc43de3c90022eb25d3b");
                        orderPreviewRequest.setShippingAddress(addressLastUsed);
                        orderPreviewRequest.setShippingType("regular");
                        orderPreviewRequest.setNonce(simpleDateFormat.format(date));
                        orderPreviewRequest.setType("default");
                        List<OrderPreviewRequest.Items> itemsList = new ArrayList<>();
                        try {
                            JSONObject object = new JSONObject(mProduct);
                            JsonArray array = new JsonParser().parse(object.optString("items")).getAsJsonArray();
                            for(final JsonElement elem : array){
                                //循环遍历把对象添加到集合
                                itemsList.add(gson.fromJson(elem, OrderPreviewRequest.Items.class));
                            }
                            orderPreviewRequest.setStoreId(object.optString("storeId"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Log.d(TAG, "onUiThread: "+mProduct);
                        orderPreviewRequest.setItems(itemsList);
                       mPreviewJson = gson.toJson(orderPreviewRequest);
                    }
                        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_PREVIEW, mPreviewJson, BaseApp.Constant.userId, new JsonCallback() {
                            @Override
                            public void onUiThread(int code, String json) {
                                if (code==200){
                                    OrderPreviewResponse orderPreviewResponse = gson.fromJson(json,OrderPreviewResponse.class);
                                    for (int i = 0 ; i<orderPreviewResponse.getOrder().getItems().size();i++){
                                        productItem = new ProductItem();
                                        productItem.setName(orderPreviewResponse.getOrder().getItems().get(i).getName());
                                        productItem.setPrice(orderPreviewResponse.getOrder().getItems().get(i).getPrice());
                                        ProductItem.product product1 = new ProductItem.product();
                                        ProductItem.product.image image = new ProductItem.product.image();
                                        image.setUrl(orderPreviewResponse.getOrder().getItems().get(i).getProduct().getImage().getThumb().getUrl());
                                        product1.setImage(image);
                                        productItem.setProduct(product1);
                                        productItem.setQuantity(orderPreviewResponse.getOrder().getItems().get(i).getQuantity());

                                    }
                                    List<ProductItem> productItemList = new ArrayList<>();
                                    productItemList.add(productItem);
                                    mProductOrderListAdapter.setItems(productItemList);
                                    Log.d(TAG, "onUiThread: "+orderPreviewResponse.getOrder().getTotalCost());
                                    mTvDiscount.setText(getString(R.string.label_discount_price,(double)orderPreviewResponse.getOrder().getDiscount()/100));
                                    mTvShippingCost.setText(getString(R.string.label_price,(double)orderPreviewResponse.getOrder().getShippingCost()/100));
                                    mTvSubtotal.setText(getString(R.string.label_price,(double)orderPreviewResponse.getOrder().getSubtotal()/100));
                                    mTvTotalCost.setText(getString(R.string.label_price,(double)orderPreviewResponse.getOrder().getTotalCost()/100));
                                    mTvTotalPaid.setText("合计：¥"+(double)orderPreviewResponse.getOrder().getSubtotal()/100);
                                }

                            }

                            @Override
                            public void onFailed(Call call, IOException exception) {

                            }
                        });

                }else {
                    showLoading("The product is not available\n找不到该订单");
                    new Thread() {
                        @Override
                        public void run() {
                            super.run();
                            try {
                                Thread.sleep(1000);//休眠2秒
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            cancelLoading();
                            finish();
                            /**
                             * 要执行的操作
                             */
                        }
                    }.start();
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    @OnClick({R.id.btn_select, R.id.tv_buy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_select:
                if (isAddressNull){
                    Utils.start_Activity(this,AddressAddActivity.class);
                }else {
                    Utils.start_Activity(this,AddressManagerActivity.class);
                }

                break;
            case R.id.tv_buy:
                try {
                    JSONObject object = new JSONObject(mPreviewJson);
                    object.put("clientType","cn.guzzu.shoppingmall");
                    mPreviewJson = object.toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ORDER_CREATE, mPreviewJson, BaseApp.Constant.userId, new JsonCallback() {
                    @Override
                    public void onUiThread(int code, String json) {
                        if (code==200){
                            Utils.showShortToast(context,"生成订单成功");
                        }
                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {

                    }
                });
                break;
        }
    }

}