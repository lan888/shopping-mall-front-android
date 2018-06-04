package cn.guzzu.baselibrary.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

import java.util.Locale;

import cn.guzzu.baselibrary.base.BaseApp;


public class LanguageUtil {
    /**
     * @param context
     */
    public static void set(Context context) {
        Resources resources = context.getResources();
        Configuration configuration =resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        String lang = BaseApp.getInstance().getCurLocale().getLanguage();
        if (!Utils.getValue(context,"lang").isEmpty()){
            lang = Utils.getValue(context,"lang");
        }
        Log.d("lang", "set: "+lang);
            if (lang.contains("en")) {
                //设置英文
                configuration.locale = Locale.ENGLISH;
            } else {
                //设置中文
                configuration.locale = Locale.SIMPLIFIED_CHINESE;
            }

        //更新配置
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
