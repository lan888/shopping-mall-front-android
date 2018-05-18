package guzzu.cnshoppingmall.baselibrary.callback;


import android.os.Handler;
import android.util.Log;

import java.io.IOException;

import guzzu.cnshoppingmall.baselibrary.util.OkHttp3Utils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Ian on 2018/3/19.
 */

public abstract class JsonCallback implements Callback {
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

            handler.post(new Runnable() {
                @Override
                public void run() {
                    onUiThread(json);
                }
            });
        }catch (Exception e){
            Log.e("json",e.toString());
        }

    }


    public abstract void onUiThread(String json );   //主线程处理


    public abstract void onFailed(Call call, IOException exception);    //主线程处理
}
