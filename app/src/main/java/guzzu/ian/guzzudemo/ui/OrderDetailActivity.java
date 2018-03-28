package guzzu.ian.guzzudemo.ui;

import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.gc.materialdesign.views.ButtonRectangle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import guzzu.ian.guzzudemo.Api;
import guzzu.ian.guzzudemo.BaseActivity;
import guzzu.ian.guzzudemo.MyApp;
import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.bean.OrderGet;
import guzzu.ian.guzzudemo.callback.GsonObjectCallback;
import guzzu.ian.guzzudemo.utils.ActivityUtil;
import guzzu.ian.guzzudemo.utils.AidlUtil;
import guzzu.ian.guzzudemo.utils.OkHttp3Utils;
import guzzu.ian.guzzudemo.utils.Utils;
import okhttp3.Call;

/**
 * Created by Ian on 2018/3/13.
 */

public class OrderDetailActivity extends BaseActivity {
    String store_id;
    String user_id;
    String order_id;
    String item_name;
    String item_quantity;
    String item_pic;
    String content;
    String product;
    StringBuffer pd = new StringBuffer();
    List<String> productArray = new ArrayList<String>();
    Map<String, String> map = new HashMap<String, String>();
    TextView tv_item_name;
    TextView tv_item_quantity;
    TextView tv_item_prize;
    TextView tv_totalCost;
    TextView tv_discount;
    TextView tv_credit;
    TextView tv_taxRate;
    TextView tv_taxCost;
    TextView tv_totalPaid;
    TextView tv_refId;
    TextView tv_paymentStatus;
    TextView tv_shippingStatus;
    TextView tv_shippingType;
    TextView tv_customer_name;
    TextView tv_customer_mobilePhone;
    TextView tv_shippingAddress;
    TextView tv_note;
    AppCompatImageView imageView;
    Toolbar toolbar;
    ButtonRectangle btn_printer;
    ButtonRectangle btn_updateShipping;
    @BindView(R.id.order_printer)
    TextView orderPrinter;
    private boolean isBold, isUnderLine;

    @Override
    public int initLayout() {
        return R.layout.activity_order_printer;
    }

    /**
     * 初始化界面，绑定控件
     */
    @Override
    public void initView() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //绑定点击←返回界面事件
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.finish(context);
            }
        });
        btn_printer = findViewById(R.id.btn_printer);
        btn_updateShipping = findViewById(R.id.btn_shipping);
//        imageView = findViewById(R.id.item_pic);
//        tv_item_name = findViewById(R.id.tv_item_name);
//        tv_item_quantity = findViewById(R.id.tv_item_quantity);
//        tv_item_prize = findViewById(R.id.tv_item_prize);
//        tv_totalCost = findViewById(R.id.tv_totalCost);
//        tv_discount = findViewById(R.id.tv_discount);
//        tv_credit = findViewById(R.id.tv_credit);
//        tv_taxRate = findViewById(R.id.tv_taxRate);
//        tv_taxCost = findViewById(R.id.tv_taxCost);
//        tv_totalPaid = findViewById(R.id.tv_totalPaid);
//        tv_refId = findViewById(R.id.tv_refId);
//        tv_paymentStatus = findViewById(R.id.tv_paymentStatus);
//        tv_shippingStatus = findViewById(R.id.tv_shippingStatus);
//        tv_shippingType = findViewById(R.id.tv_shippingType);
//        tv_customer_name = findViewById(R.id.tv_customer_name);
//        tv_customer_mobilePhone = findViewById(R.id.tv_customer_mobilePhone);
//        tv_shippingAddress = findViewById(R.id.tv_shippingAddress);
//        tv_note = findViewById(R.id.tv_note);
        //初始化打印机
        AidlUtil.getInstance().initPrinter();
    }

    /**
     * 获取数据
     */
    @Override
    public void initData() {
        isBold = false;
        isUnderLine = false;
        store_id = Utils.getValue(OrderDetailActivity.this, "storeId");
        user_id = Utils.getValue(OrderDetailActivity.this, "userId");
        if (getIntent().getStringExtra("orderId") == null) {
            order_id = Utils.getValue(context, "orderId");
        } else {
            order_id = getIntent().getStringExtra("orderId");
        }

        map.put("storeId", store_id);
        map.put("orderId", order_id);
        OkHttp3Utils.doAuthPost(Api.CUZZU_API + Api.Order_GET, map, user_id, new GsonObjectCallback<OrderGet>() {
            @Override
            public void onUiThread(OrderGet objects, String json) {
                if (json.contains("ERR_INVALID_AUTH")) {
                    Utils.showShortToast(context, getResources().getString(R.string.login_loss));
                    Utils.start_Activity(context, LoginActivity.class);

                } else {
                    try {
                        item_pic = objects.getItems().get(0).getProduct().getGallery().get(0).getThumb().getUrl();
                        Glide.with(OrderDetailActivity.this).load(item_pic).into(imageView);
                    } catch (Exception e) {
                        Log.e("error", "error:" + e);
                    }
                    item_name = objects.getItems().get(0).getProduct().getName().getZh();
                    item_quantity = Integer.toString(objects.getItems().get(0).getQuantity());
                    String item_prize = "￥" + Double.toString(objects.getItems().get(0).getPrice() / 100);
                    String totalCost = "￥" + Double.toString(objects.getTotalCost() / 100);
                    String discount = "￥" + Double.toString(objects.getDiscount());
                    String credit = "￥" + Double.toString(objects.getCredit());
                    String taxRate = "￥" + Double.toString(objects.getTaxRate());
                    String taxCost = "￥" + Double.toString(objects.getTaxCost());
                    String totalPaid = "￥" + Double.toString(objects.getTotalPaid() / 100);
                    String refId = objects.getRefId();
                    String paymentStatus = objects.getPaymentStatus();
                    String shippingStatus = objects.getShippingStatus();
                    String shippingType = objects.getShippingType();
                    String customer_name = objects.getShippingAddress().getName();
                    String customer_mobilePhone = objects.getShippingAddress().getMobilePhone();
                    String shippingAddress = objects.getShippingAddress().getProvince() + objects.getShippingAddress().getCity() + objects.getShippingAddress().getDistrict() + objects.getShippingAddress().getAddress();
                    String note = objects.getNote();
                    Utils.putValue(context, "item_name", item_name);
                    Utils.putValue(context, "item_quantity", item_quantity);
                    Utils.putValue(context, "item_pic", item_pic);
//                    setDataTv(item_name, item_quantity, item_prize, totalCost, discount, credit, taxRate, taxCost,
//                            totalPaid, refId, paymentStatus, shippingStatus, shippingType, customer_name,
//                            customer_mobilePhone, shippingAddress, note);
                    int j = objects.getItems().size();
                    for (int i = 0; i < j; i++) {
                        product = objects.getItems().get(i).getName().getZh() + " " + objects.getItems().get(i).getName().getEn() + ":\n"
                                + "  ￥" + objects.getItems().get(i).getPrice() + " x " + objects.getItems().get(i).getQuantity();
                        pd.append(i+1+". ");
                        pd.append(product);
                        pd.append("\n");
                    }
//                    String pdArr = productArray.toString();
//                    String pdArr1 =pdArr.replace("[","");
//                    String pdArr2 =pdArr1.replace(",","");
//                    String newPdArr = pdArr2.replace("]","");

                    content = "###订单详细 Order Summary###\n" +
                            "\n" +
                            "Order: " + objects.getRefId() + "\n" +
                            "\n" +
                            pd + "--------------------------------\n" +
                            "折扣 Discount: " + "￥" + Double.toString(objects.getDiscount()) + "\n" +
                            "运费 Shipping: " + "￥" + Double.toString(objects.getTaxCost()) + "\n" +
                            "订单合计 Order Total: " + "￥" + Double.toString(objects.getTotalCost() / 100) + "\n" +
                            "--------------------------------\n" +
                            "实付款 Customer Paid: " + "￥" + Double.toString(objects.getTotalPaid() / 100) + "\n" +
                            "--------------------------------\n" +
                            "订单奖赏 Order reward: Free candied ginger!\n" +
                            "\n" +
                            "###收货人详细 Recipient Info###\n" +
                            "\n" +
                            "收货人姓名 Recipient Name:" + "\n" + objects.getShippingAddress().getName() + "\n" +
                            "手机号码 Recipient Phone: " + "\n" + objects.getShippingAddress().getMobilePhone() + "\n" +
                            "详细地址 Address: " + "\n" + objects.getShippingAddress().getProvince() + objects.getShippingAddress().getCity() + objects.getShippingAddress().getDistrict() + objects.getShippingAddress().getAddress();
                    orderPrinter.setText(content);
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void initListener() {
        btn_printer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (MyApp.getInstance().isAidl()) {
                    AidlUtil.getInstance().printText(content, 24, isBold, isUnderLine);
                    AidlUtil.getInstance().print1Line();
                }
            }
        });
        btn_updateShipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.start_Activity(context, UpdateShippingActivity.class);
            }
        });

    }

    /**
     * 设置数据到textView
     */
    public void setDataTv(String item_name, String item_quantity, String item_prize, String totalCost,
                          String discount, String credit, String taxRate, String taxCost, String totalPaid,
                          String refId, String paymentStatus, String shippingStatus, String shippingType,
                          String customer_name, String customer_mobilePhone, String shippingAddress, String note) {
        tv_item_name.setText(item_name);
        tv_item_quantity.setText(item_quantity);
        tv_item_prize.setText(item_prize);
        tv_totalCost.setText(totalCost);
        tv_discount.setText(discount);
        tv_credit.setText(credit);
        tv_taxRate.setText(taxRate);
        tv_taxCost.setText(taxCost);
        tv_totalPaid.setText(totalPaid);
        tv_refId.setText(refId);
        tv_paymentStatus.setText(paymentStatus);
        tv_shippingStatus.setText(shippingStatus);
        tv_shippingType.setText(shippingType);
        tv_customer_name.setText(customer_name);
        tv_customer_mobilePhone.setText(customer_mobilePhone);
        tv_shippingAddress.setText(shippingAddress);
        tv_note.setText(note);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityUtil.addActivity(OrderDetailActivity.this);
    }


}
