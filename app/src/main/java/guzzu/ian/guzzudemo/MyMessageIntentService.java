package guzzu.ian.guzzudemo;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import com.alibaba.sdk.android.push.AliyunMessageIntentService;
import com.alibaba.sdk.android.push.notification.CPushMessage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import guzzu.ian.guzzudemo.bean.OrderGet;
import guzzu.ian.guzzudemo.callback.GsonObjectCallback;
import guzzu.ian.guzzudemo.ui.LoginActivity;
import guzzu.ian.guzzudemo.ui.OrderDetailActivity;
import guzzu.ian.guzzudemo.utils.AidlUtil;
import guzzu.ian.guzzudemo.utils.OkHttp3Utils;
import guzzu.ian.guzzudemo.utils.Utils;
import okhttp3.Call;


/**
 * Created by Ian on 2018/3/15.
 */

public class MyMessageIntentService extends AliyunMessageIntentService {
    private static final String TAG = "MyMessageIntentService";
    private static final boolean isBold = false, isUnderLine = false;

    /**
     * 推送通知的回调方法
     * @param context
     * @param title
     * @param summary
     * @param extraMap
     */
    @Override
    protected void onNotification(Context context, String title, String summary, Map<String, String> extraMap) {
        Log.i(TAG,"收到一条推送通知 ： " + title + ", summary:" + summary);
        getOrder(context,summary);
    }

    /**
     * 推送消息的回调方法
     * @param context
     * @param cPushMessage
     */
    @Override
    protected void onMessage(Context context, CPushMessage cPushMessage) {
        Log.i(TAG,"收到一条推送消息 ： " + cPushMessage.getTitle() + ", content:" + cPushMessage.getContent());

    }

    /**
     * 从通知栏打开通知的扩展处理
     * @param context
     * @param title
     * @param summary
     * @param extraMap
     */
    @Override
    protected void onNotificationOpened(final Context context, String title, final String summary, String extraMap) {
        Log.i(TAG,"onNotificationOpened ： " + " : " + title + " : " + summary + " : " + extraMap);
        String store_id = Utils.getValue(context,"storeId");
        String user_id = Utils.getValue(context,"userId");
        Map<String,String> map = new HashMap<String, String>();
        map.put("storeId",store_id);
        map.put("orderId",summary);
        OkHttp3Utils.doAuthPost(Api.CUZZU_API + Api.Order_GET, map,user_id, new GsonObjectCallback<OrderGet>() {
            @Override
            public void onUiThread(OrderGet orderGet, String json) {
                if (json.contains("ERR_INVALID_AUTH")){
                    LoginActivity.actionStart(context);
                }else {
                    Intent intent = new Intent(context, OrderDetailActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("ordId",summary);
                    startActivity(intent);
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    /**
     * 无动作通知点击回调。当在后台或阿里云控制台指定的通知动作为无逻辑跳转时,通知点击回调为onNotificationClickedWithNoAction而不是onNotificationOpened
     * @param context
     * @param title
     * @param summary
     * @param extraMap
     */
    @Override
    protected void onNotificationClickedWithNoAction(Context context, String title, String summary, String extraMap) {
        Log.i(TAG,"onNotificationClickedWithNoAction ： " + " : " + title + " : " + summary + " : " + extraMap);

    }

    /**
     * 通知删除回调
     * @param context
     * @param messageId
     */
    @Override
    protected void onNotificationRemoved(Context context, String messageId) {
        Log.i(TAG, "onNotificationRemoved ： " + messageId);

    }

    /**
     * 应用处于前台时通知到达回调。注意:该方法仅对自定义样式通知有效,相关详情请参考https://help.aliyun.com/document_detail/30066.html#h3-3-4-basiccustompushnotification-api
     * @param context
     * @param title
     * @param summary
     * @param extraMap
     * @param openType
     * @param openActivity
     * @param openUrl
     */
    @Override
    protected void onNotificationReceivedInApp(Context context, String title, String summary, Map<String, String> extraMap, int openType, String openActivity, String openUrl) {
        Log.i(TAG,"onNotificationReceivedInApp ： " + " : " + title + " : " + summary + "  " + extraMap + " : " + openType + " : " + openActivity + " : " + openUrl);

    }

    public void getOrder(final Context context, String orderId){
        final StringBuffer pd = new StringBuffer();
        String store_id = Utils.getValue(context,"storeId");
        String user_id = Utils.getValue(context,"userId");
        Map<String,String> map = new HashMap<String, String>();
        map.put("storeId",store_id);
        map.put("orderId",orderId);
        OkHttp3Utils.doAuthPost(Api.CUZZU_API + Api.Order_GET, map,user_id, new GsonObjectCallback<OrderGet>() {
            @Override
            public void onUiThread(OrderGet orderGet, String json) {
                if (json.contains("ERR_INVALID_AUTH")){
                    Intent intent = new Intent(context,LoginActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    Utils.showShortToast(context,getResources().getString(R.string.login_loss));
                }else {
                    int j = orderGet.getItems().size();
                    for (int i = 0; i < j; i++) {
                        String product = orderGet.getItems().get(i).getName().getZh() + " " + orderGet.getItems().get(i).getName().getEn() + ":\n"
                                + "  ￥" + orderGet.getItems().get(i).getPrice() + " x " + orderGet.getItems().get(i).getQuantity();

                        pd.append(i+1+". ");
                        pd.append(product);
                        pd.append("\n");
                    }
//                    String pdArr = productArray.toString();
//                    String pdArr1 =pdArr.replace("[","");
//                    String pdArr2 =pdArr1.replace(",","");
//                    String newPdArr = pdArr2.replace("]","");

                    String content = "###订单详细 Order Summary###\n" +
                            "\n" +
                            "Order: " + orderGet.getRefId() + "\n" +
                            "\n" +
                            pd + "--------------------------------\n" +
                            "折扣 Discount: " + "￥" + Double.toString(orderGet.getDiscount()) + "\n" +
                            "运费 Shipping: " + "￥" + Double.toString(orderGet.getTaxCost()) + "\n" +
                            "订单合计 Order Total: " + "￥" + Double.toString(orderGet.getTotalCost() / 100) + "\n" +
                            "--------------------------------\n" +
                            "实付款 Customer Paid: " + "￥" + Double.toString(orderGet.getTotalPaid() / 100) + "\n" +
                            "--------------------------------\n" +
                            "订单奖赏 Order reward: Free candied ginger!\n" +
                            "\n" +
                            "###收货人详细 Recipient Info###\n" +
                            "\n" +
                            "收货人姓名 Recipient Name:" + "\n" + orderGet.getShippingAddress().getName() + "\n" +
                            "手机号码 Recipient Phone: " + "\n" + orderGet.getShippingAddress().getMobilePhone() + "\n" +
                            "详细地址 Address: " + "\n" + orderGet.getShippingAddress().getProvince() + orderGet.getShippingAddress().getCity() + orderGet.getShippingAddress().getDistrict() + orderGet.getShippingAddress().getAddress();
                    

                    if (MyApp.getInstance().isAidl()) {
                        AidlUtil.getInstance().initPrinter();
                        AidlUtil.getInstance().printText(content, 24, isBold, isUnderLine);
                        AidlUtil.getInstance().print1Line();
                    }
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }
}
