package cn.guzzu.shoppingmall.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

import com.alipay.sdk.app.AuthTask;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.Map;

import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.bean.WXPay;
import okhttp3.Call;

public class PayUtil {
    public static void goPay(int payType, Map<String,String> map, final Activity activity,final Gson gson, final Handler mHandler) {
        switch (payType) {
            case 1:
                OkHttp3Utils.doJsonPost(Api.GUZZU + Api.WX_PAY, map, BaseApp.Constant.userId, new JsonCallback() {
                    @Override
                    public void onUiThread(int code, String json) {
                        if (code == 200) {
                            WXPay wxPay = gson.fromJson(json, WXPay.class);
                            if (BaseApp.mWxApi != null && BaseApp.mWxApi.isWXAppInstalled()) {
                                WXPayUtil.WXPayBuilder builder = new WXPayUtil.WXPayBuilder();
                                builder.setAppId(BaseApp.Constant.APP_ID_WX);
                                builder.setPartnerId(wxPay.getPartnerId());
                                builder.setPrepayId(wxPay.getPrepayId());
                                builder.setNonceStr(wxPay.getNonceStr());
                                builder.setTimeStamp(wxPay.getTimeStamp());
                                builder.setPackageValue(wxPay.getPackageX());
                                builder.setSign(wxPay.getSign()).build().toWXPayNotSign();
                            } else {
                                Utils.showShortToast(activity, "用户未安装微信");
                            }

                        }

                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {

                    }
                });
                break;
            case 2:
                OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ALI_PAY, map, BaseApp.Constant.userId, new JsonCallback() {
                    @Override
                    public void onUiThread(int code, String json) {
                        if (code == 200) {
                            JsonParser parser = new JsonParser();
                            JsonElement element = parser.parse(json);
                            JsonObject jsonObj = element.getAsJsonObject();//转换成Json对象
                            final String data = jsonObj.get("data").getAsString();
                            Runnable authRunnable = new Runnable() {

                                @Override
                                public void run() {
                                    // 构造AuthTask 对象
                                    AuthTask authTask = new AuthTask(activity);
                                    // 调用授权接口，获取授权结果
                                    Map<String, String> result = authTask.authV2(data, true);

                                    Message msg = new Message();
                                    msg.what = 1;
                                    msg.obj = result;
                                    mHandler.sendMessage(msg);
                                }
                            };
                            // 必须异步调用
                            Thread authThread = new Thread(authRunnable);
                            authThread.start();
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
