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
import okhttp3.Response;

/**
 * @author: Ian
 * @date: 2018-4-01
 * @time: 14:11
 * @说明:
 */
public abstract class GsonArrayCallback <T>implements Callback {

    private Handler handler = OkHttp3Utils.getInstance().getHandler();

    //主线程处理
    public abstract void onUiThread(int code,String json,List<T> list);

    //主线程处理
    public abstract void onFailed(Call call, IOException e);

    //请求失败
    @Override
    public void onFailure(final Call call, final IOException e) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                onFailed(call, e);
            }
        });
    }

    //请求json 并直接返回集合 主线程处理
    @Override
    public void onResponse(Call call, Response response) throws IOException {
        final List<T> mList = new ArrayList<T>();

        final String json = response.body().string();
        final int code = response.code();

        if (code==200){
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
        }

        handler.post(new Runnable() {
            @Override
            public void run() {
                onUiThread(code,json,mList);
            }
        });


    }
}
