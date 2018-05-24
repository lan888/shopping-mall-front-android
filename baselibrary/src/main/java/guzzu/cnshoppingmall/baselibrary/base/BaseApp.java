package guzzu.cnshoppingmall.baselibrary.base;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;

public class BaseApp extends Application {
    /** 数据常量     */
    public static final class Constant {
        /** 用户信息 */
        public static String userId = "";
        public static String token = "";
        /*获取当前系统的android版本号*/
        public static final String CLIENT_TYPE = "phone";
        public static String versionCode = "1.0";
        public static final String TAG = getAppContext().getClass().getSimpleName();
    }
    public static int width;
    public static int height;
    public static float density;
    public static int densityDpi;
    protected static Context applicationContext;
    protected static BaseApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        instance = this;
        initDisplay(this);
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
}
