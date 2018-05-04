package guzzu.ian.baselibrary.base;

import android.app.Application;
import android.content.Context;

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

    protected static Context applicationContext;
    protected static BaseApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        instance = this;
    }
    public static Context getAppContext(){
        return applicationContext;
    }

    public static BaseApp getInstance() {
        return instance;
    }
}
