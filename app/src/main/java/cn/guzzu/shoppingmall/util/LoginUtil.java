package cn.guzzu.shoppingmall.util;

import android.app.Activity;
import android.content.Context;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.bean.UnLoginEvent;
import cn.guzzu.shoppingmall.ui.LoginActivity;

public class LoginUtil {
    public static boolean isLogin(Activity context,String json){
        String err="";
        try {
            JSONObject obj = new JSONObject(json);
            err = obj.optString("error");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (err.equals("ERR_INVALID_AUTH")){
            Utils.putBoolean(context,"isLogin",false);
            context.finish();
            Utils.showShortToast(context,"您的登录状态已失效");
            Utils.start_Activity(context,LoginActivity.class);
            return false;
        }
        return true;
    }
}
