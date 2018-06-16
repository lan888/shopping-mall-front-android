package cn.guzzu.shoppingmall.util;

import android.app.Activity;
import android.content.Context;

import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.bean.GuzzuError;
import cn.guzzu.shoppingmall.bean.UnLoginEvent;
import cn.guzzu.shoppingmall.ui.LoginActivity;

public class ErrorUtil {
    public static String loginError(Activity context, Gson gson, String json){
        GuzzuError guzzuError = gson.fromJson(json,GuzzuError.class);
        Utils.showShortToast(context,guzzuError.getDetail().getMessage());
        if (guzzuError.getError().equals("ERR_INVALID_AUTH")){
            context.finish();
            Utils.start_Activity(context,LoginActivity.class);
        }
        if (guzzuError.getDetail().getMessage()==null){
            return guzzuError.getError();
        }
        return guzzuError.getDetail().getMessage();
    }
}

