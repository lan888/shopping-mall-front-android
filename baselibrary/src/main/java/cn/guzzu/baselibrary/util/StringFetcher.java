package cn.guzzu.baselibrary.util;



import cn.guzzu.baselibrary.base.BaseApp;

public class StringFetcher {

    public static String getString(int id) {
        return BaseApp.getAppContext().getString(id);
    }

    public static String getString(int id, Object... format) {
        return BaseApp.getAppContext().getString(id, format);
    }

}