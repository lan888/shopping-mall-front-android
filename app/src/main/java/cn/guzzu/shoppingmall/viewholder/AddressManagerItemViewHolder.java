package cn.guzzu.shoppingmall.viewholder;

import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.base.BaseViewHolder;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Addresses;
import cn.guzzu.shoppingmall.bean.GoHomeEvent;
import cn.guzzu.shoppingmall.bean.ProductItem;
import cn.guzzu.shoppingmall.ui.AddressAddActivity;
import okhttp3.Call;


public class AddressManagerItemViewHolder extends BaseViewHolder<Addresses> {
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_mobilephone)
    TextView tvMobilephone;
    @BindView(R.id.tv_address)
    TextView tvAddress;
    @BindView(R.id.btn_edit)
    TextView btnEdit;
    @BindView(R.id.btn_delete)
    TextView btnDelete;

    private Map<String,String> map = new HashMap<>();

    public AddressManagerItemViewHolder(View view) {
        super(view);
    }

    public void bind(final Addresses addresses){
       tvName.setText(addresses.getName());
       tvMobilephone.setText(addresses.getMobilePhone());
       tvAddress.setText(addresses.getProvince()+addresses.getCity()+addresses.getDistrict()+addresses.getStreet());
       btnEdit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Utils.start_Activity(itemView.getContext(), AddressAddActivity.class,"userAddressId",addresses.get_id());
           }
       });
       btnDelete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               map.clear();
               map.put("userAddressId",addresses.get_id());
               OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ADDRESS_REMOVE, map, BaseApp.Constant.userId, new JsonCallback() {
                   @Override
                   public void onUiThread(int code, String json) {
                       if (code==200){
                           EventBus.getDefault().post(new GoHomeEvent());
                       }
                   }

                   @Override
                   public void onFailed(Call call, IOException exception) {

                   }
               });
           }
       });
       itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               map.clear();
               map.put("userAddressId",addresses.get_id());
               map.put("lastUsedAt",new Date(System.currentTimeMillis()).toString());
               OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ADDRESS_UPDATE, map, BaseApp.Constant.userId, new JsonCallback() {
                   @Override
                   public void onUiThread(int code, String json) {
                       if (code==200){
                           Utils.showShortToast(itemView.getContext(),"已设置为默认收货地址");
                       }
                   }

                   @Override
                   public void onFailed(Call call, IOException exception) {

                   }
               });
           }
       });
    }

}
