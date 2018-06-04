package cn.guzzu.baselibrary.callback;


import android.os.Handler;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import cn.guzzu.baselibrary.util.OkHttp3Utils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Response;

/**
 * Created by Ian on 2018/3/19.
 */

public abstract class GsonArrayGetHeaderCallback<T> implements Callback {
    private Handler handler = OkHttp3Utils.getInstance().getHandler();

    @Override
    public void onFailure(Call call, IOException e) {   //失败的时候
        onFailed(call,e);
    }
    @Override
    public void onResponse(Call call, Response response) throws IOException{
        final List<T> mList = new ArrayList<T>();
        String json = response.body().string();
        final int code = response.code();
        final Headers headers = response.headers();

        JsonArray array = new JsonParser().parse(json).getAsJsonArray();

        Gson gson = new Gson();

        Class<T> cls = null;
        Class clz = this.getClass();
        ParameterizedType type = (ParameterizedType) clz.getGenericSuperclass();
        Type[] types = type.getActualTypeArguments();
        cls = (Class<T>) types[0];

        for(final JsonElement elem : array){
            //循环遍历把对象添加到集合
            mList.add((T) gson.fromJson(elem, cls));
        }

        handler.post(new Runnable() {
            @Override
            public void run() {
                onUiThread(code,headers,mList);
            }
        });

    }


    public abstract void onUiThread(int code,Headers headers,List<T> list );   //主线程处理


    public abstract void onFailed(Call call, IOException exception);    //主线程处理
}
