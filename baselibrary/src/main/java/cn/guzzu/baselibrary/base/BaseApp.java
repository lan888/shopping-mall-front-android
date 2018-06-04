package cn.guzzu.baselibrary.base;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.util.Locale;

import cn.guzzu.baselibrary.util.Utils;

public class BaseApp extends Application {
    /** 数据常量     */
    public static final class Constant {
        /** 用户信息 */
        public static String userId = "";
        public static String token = "";
        /*获取当前系统的android版本号*/
        public static final String CLIENT_TYPE = "Android";
        public static String versionCode = "1.0";
        public static final String TAG = getAppContext().getClass().getSimpleName();
        public static String APP_ID_WX = "wxa9f71b5b7ace6214";

    }
    public static int width;
    public static int height;
    public static float density;
    public static int densityDpi;
    protected static Context applicationContext;
    protected static BaseApp instance;
    public static IWXAPI mWxApi;
    private boolean isLogin = false;
    private Locale curLocale ;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        instance = this;
        initDisplay(this);
        initUserId(this);
        registerToWX();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            curLocale = getResources().getConfiguration().getLocales().get(0);
        } else {
            curLocale = getResources().getConfiguration().locale;
        }
    }
    public static Context getAppContext(){
        return applicationContext;
    }

    public static BaseApp getInstance() {
        return instance;
    }

    public static void initDisplay(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        width = metrics.widthPixels;
        height = metrics.heightPixels;
        density = metrics.density;
        densityDpi = metrics.densityDpi;
    }

    private void initUserId(Context context){
        Constant.userId = Utils.getValue(context,"userId");
    }

    private void registerToWX() {
        //第二个参数是指你应用在微信开放平台上的AppID
        mWxApi = WXAPIFactory.createWXAPI(this, Constant.APP_ID_WX, false);
        // 将该app注册到微信
        mWxApi.registerApp(Constant.APP_ID_WX);
    }

    public boolean isLogin() {
        isLogin = Utils.getBoolean(this,"isLogin",false);
        return isLogin;
    }

    public Locale getCurLocale() {
        return curLocale;
    }

    public void setCurLocale(Locale curLocale) {
        this.curLocale = curLocale;
    }
}
