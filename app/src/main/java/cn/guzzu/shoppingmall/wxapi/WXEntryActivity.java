package cn.guzzu.shoppingmall.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.ArrayMap;
import android.util.Log;

import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import okhttp3.Call;

import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;


public class WXEntryActivity extends Activity implements IWXAPIEventHandler {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //注意：
        //第三方开发者如果使用透明界面来实现WXEntryActivity，需要判断handleIntent的返回值，如果返回值为false，则说明入参不合法未被SDK处理，应finish当前透明界面，避免外部通过传递非法参数的Intent导致停留在透明界面，引起用户的疑惑
        try {
            boolean result =  BaseApp.mWxApi.handleIntent(getIntent(), this);
            if(!result){
                Log.d("weixin","参数不合法，未被SDK处理，退出");
                finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        BaseApp.mWxApi.handleIntent(data,this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        BaseApp.mWxApi.handleIntent(intent, this);
        finish();
    }



    @Override
    public void onReq(BaseReq baseReq) {
        Log.d("baseReq:",baseReq.toString());
    }

    @Override
    public void onResp(BaseResp baseResp) {
        String result = "";
        switch(baseResp.errCode) {
            case BaseResp.ErrCode.ERR_OK:
                result = "发送成功";
                Log.d("weixin", result);
                String code = ((SendAuth.Resp) baseResp).code;
                getAccessSession(code);
                break;
            case BaseResp.ErrCode.ERR_USER_CANCEL:
                result = "发送取消";
                Log.d("weixin", result);
                finish();
                break;
            case BaseResp.ErrCode.ERR_AUTH_DENIED:
                result = "发送被拒绝";
                Log.d("weixin", result);
                finish();
                break;
            default:
                Log.d("weixin", baseResp.errCode+baseResp.errStr);
                finish();
                break;
        }
    }

    private void getAccessSession(String code){
        Map<String,String>params = new ArrayMap<>();
        params.put("code",code);
        OkHttp3Utils.doJsonPost(Api.GUZZU+Api.WX_LOGIN, params, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code==200){
                    try {
                        JSONObject obj = new JSONObject(json);
                        BaseApp.Constant.userId =obj.optString("sessionId");
                        finish();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }
}
