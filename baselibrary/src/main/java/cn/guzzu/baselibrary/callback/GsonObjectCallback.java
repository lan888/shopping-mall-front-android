package cn.guzzu.baselibrary.callback;

import android.os.Handler;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import cn.guzzu.baselibrary.util.OkHttp3Utils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * @author: Ian
 * @date: 2018-4-01
 * @time: 14:11
 * @说明: 1. 类的用途 如果要将得到的json直接转化为集合 建议使用该类
 *          该类的onUi() onFailed()方法运行在主线程
 */
public abstract class GsonObjectCallback <T> implements Callback{

    private Handler handler = OkHttp3Utils.getInstance().getHandler();


    @Override
    public void onFailure(Call call, IOException e) {   //失败的时候
        onFailed(call,e);
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        //请求json 并直接返回泛型的对象 主线程处理
        try {
            final String json = response.body().string();
            Class<T> cls = null;
            Class clz = this.getClass();
            ParameterizedType type = (ParameterizedType) clz.getGenericSuperclass();
            Type[] types = type.getActualTypeArguments();
            cls = (Class<T>) types[0];
            Gson gson = new Gson();
            final T t = gson.fromJson(json, cls);

            handler.post(new Runnable() {
                @Override
                public void run() {
                    onUiThread(t,json);
                }
            });
        }catch (Exception e){
            Log.e("json",e+"json返回空");
        }

    }


    public abstract void onUiThread(T t,String json );   //主线程处理


    public abstract void onFailed(Call call, IOException exception);    //主线程处理
}
