package guzzu.ian.baselibrary.util;



import guzzu.ian.baselibrary.base.BaseApp;

public class StringFetcher {

    public static String getString(int id) {
        return BaseApp.getAppContext().getString(id);
    }

    public static String getString(int id, Object... format) {
        return BaseApp.getAppContext().getString(id, format);
    }

}