package guzzu.ian.guzzudemo;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.alibaba.sdk.android.push.CloudPushService;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory;

import guzzu.ian.guzzudemo.utils.AidlUtil;

/**
 * Created by Ian on 2018/3/9.
 */

public class MyApp extends Application {
    /** 数据常量     */
    public static final class Constant {
        /** 用户信息 */
        public static String userId = "";
        public static String token = "";
        /*获取当前系统的android版本号*/
        public static final String CLIENT_TYPE = "pos";
        public static String versionCode = "1.0";
    }
    private static final String TAG = "Init";
    protected static Context applicationContext;
    protected static MyApp instance;
    private boolean isAidl;
    CloudPushService mPushService;


    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        instance = this;
        isAidl = true;
        mPushService = PushServiceFactory.getCloudPushService();
        AidlUtil.getInstance().connectPrinterService(this);
        initCloudChannel(this);
        mPushService.setPushIntentService(MyMessageIntentService.class);
        setDefNotifIcon();

    }
    /**
     * 初始化云推送通道
     * @param applicationContext
     */
    private void initCloudChannel(Context applicationContext) {
        PushServiceFactory.init(applicationContext);
        CloudPushService pushService = PushServiceFactory.getCloudPushService();
        pushService.register(applicationContext, new CommonCallback() {
            @Override
            public void onSuccess(String response) {
                Log.d(TAG, "init cloudchannel success");

            }
            @Override
            public void onFailed(String errorCode, String errorMessage) {
                Log.d(TAG, "init cloudchannel failed -- errorcode:" + errorCode + " -- errorMessage:" + errorMessage);
            }
        });
    }

    private void setDefNotifIcon(){
        int defaultLargeIconId = getResources().getIdentifier("icon","mipmap",getPackageName());
        if (defaultLargeIconId != 0) {
            Drawable drawable = getApplicationContext().getResources().getDrawable(defaultLargeIconId);
            if (drawable != null) {
                Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
                mPushService.setNotificationLargeIcon(bitmap);
                Log.i("SETTING_NOTICE", "Set notification largeIcon res id to R." );

            }
        } else {
            Log.e("SETTING_NOTICE", "Set largeIcon bitmap error, R."
                     + " not found.");

        }

    }


    public static Context getAppContext(){
        return applicationContext;
    }

    public static MyApp getInstance() {
        return instance;
    }

    public boolean isAidl() {
        return isAidl;
    }

    public void setAidl(boolean aidl) {
        isAidl = aidl;
    }

}
