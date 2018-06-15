package cn.guzzu.shoppingmall.wxapi;








import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import org.greenrobot.eventbus.EventBus;

import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.bean.WxPayEvent;

public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
	
	private static final String TAG = "WXPayEntryActivity";
	
    private IWXAPI api;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        api = BaseApp.mWxApi;
		try {
			boolean result =  api.handleIntent(getIntent(), this);
			if(!result){
				Log.d("weixin","参数不合法，未被SDK处理，退出");
				finish();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		setIntent(intent);
        api.handleIntent(intent, this);
	}

	@Override
	public void onReq(BaseReq req) {
	}

	@Override
	public void onResp(BaseResp resp) {
		Log.d(TAG, "onPayFinish, errCode = " + resp.errCode);
		if (resp.getType() == ConstantsAPI.COMMAND_PAY_BY_WX) {
			// 根据返回码
			int code = resp.errCode;
			switch (code) {
				case 0:
					// 去本地确认支付结果
					EventBus.getDefault().post(new WxPayEvent(true));
					finish();
					break;
				case -2:
					Utils.showShortToast(getApplicationContext(),"支付已取消");
					finish();
					break;
				default:
					Utils.showShortToast(getApplicationContext(),"支付失败");
					finish();
					break;
			}
		}
	}
}