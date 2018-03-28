package guzzu.ian.guzzudemo.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.gc.materialdesign.views.ButtonRectangle;
import com.rengwuxian.materialedittext.MaterialEditText;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import guzzu.ian.guzzudemo.Api;
import guzzu.ian.guzzudemo.BaseActivity;
import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.adapter.SpinnerAdapter;
import guzzu.ian.guzzudemo.callback.GsonObjectCallback;
import guzzu.ian.guzzudemo.utils.ActivityUtil;
import guzzu.ian.guzzudemo.utils.OkHttp3Utils;
import guzzu.ian.guzzudemo.utils.Utils;
import okhttp3.Call;

/**
 * Created by Ian on 2018/3/14.
 */

public class UpdateShippingActivity extends BaseActivity {
    String user_id;
    String store_id;
    String shippingProviderId;
    String order_id;
    String shippingProvider;
    SpinnerAdapter spinnerAdapter;
    Map<String,String> post_sp = new HashMap<String, String>();
    Map<String,String> post_us = new HashMap<String, String>();
    Map<String,String> post_id = new HashMap<String, String>();
    private List<String> mList = new ArrayList<String>();
    Spinner spinner;
    ButtonRectangle btn_post;
    MaterialEditText et_trackingCode;
    Toolbar toolbar;

    @Override
    public int initLayout() {
        return R.layout.activity_shipping_update;
    }

    @Override
    public void initView() {
        spinner = findViewById(R.id.sp_shippingProvider);
        btn_post = findViewById(R.id.btn_post);
        et_trackingCode = findViewById(R.id.et_trackingCode);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //绑定点击←返回界面事件
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintKeyboard();
                Utils.finish(context);
            }
        });
    }

    @Override
    public void initData() {
        order_id = Utils.getValue(context,"orderId");
        user_id = Utils.getValue(context,"userId");
        store_id = Utils.getValue(context,"storeId");
        post_sp.put("storeId",store_id);
        OkHttp3Utils.doAuthPost(Api.CUZZU_API + Api.SHIPPING_PROVIDER, post_sp, user_id, new GsonObjectCallback<Object>() {
            @Override
            public void onUiThread(Object o, String json) {
                if (json.contains("ERR_INVALID_AUTH")){
                    Utils.showShortToast(context,getResources().getString(R.string.login_loss));
                    Utils.start_Activity(context,LoginActivity.class);

                }else {
                    JSONArray jsonArray = null;
                    try {
                        jsonArray = new JSONArray(json);
                        int j = jsonArray.length();
                        for (int i = 0;i<j;i++){
                            shippingProvider = jsonArray.getJSONObject(i).get("name").toString();
                            shippingProviderId = jsonArray.getJSONObject(i).get("_id").toString();
                            post_id.put(shippingProvider,shippingProviderId);
                            mList.add(shippingProvider);
                        }


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                    spinnerAdapter = new SpinnerAdapter(UpdateShippingActivity.this,mList);
                    spinner.setAdapter(spinnerAdapter);

                }

            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void initListener() {
        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String trackingCode = et_trackingCode.getText().toString();
                post_us.put("orderId",order_id);
                post_us.put("shippingProviderId",post_id.get(spinner.getSelectedItem().toString()));
                post_us.put("shippingStatus","shipped");
                post_us.put("storeId",store_id);
                post_us.put("trackingCode",trackingCode);

                OkHttp3Utils.doAuthPost(Api.CUZZU_API + Api.UPDATE_SHIPPING, post_us, user_id, new GsonObjectCallback<Objects>() {
                    @Override
                    public void onUiThread(Objects objects, String json) {
                        if (json.contains("ERR_INVALID_PARAM")){
                            Utils.showShortToast(context,getResources().getString(R.string.ship_ERROR));

                        }else {
                            hintKeyboard();
                            Utils.finish(context);
                            Utils.showShortToast(context,getResources().getString(R.string.ship_success));
                        }

                    }

                    @Override
                    public void onFailed(Call call, IOException exception) {


                    }
                });
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityUtil.addActivity(UpdateShippingActivity.this);

    }
    private void hintKeyboard() {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        if(imm.isActive()&&getCurrentFocus()!=null){
            if (getCurrentFocus().getWindowToken()!=null) {
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
    }


}
