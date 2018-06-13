package cn.guzzu.shoppingmall.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yiguo.adressselectorlib.AddressSelector;
import com.yiguo.adressselectorlib.CityInterface;
import com.yiguo.adressselectorlib.OnItemClickListener;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.bean.Address;
import cn.guzzu.shoppingmall.bean.Addresses;
import cn.guzzu.shoppingmall.bean.City;
import cn.guzzu.shoppingmall.bean.District;
import cn.guzzu.shoppingmall.bean.GoHomeEvent;
import cn.guzzu.shoppingmall.bean.Province;
import cn.guzzu.shoppingmall.bean.Street;
import okhttp3.Call;

public class AddressAddActivity extends BaseActivity implements TextWatcher {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.et_name)
    AppCompatEditText mEtName;
    @BindView(R.id.et_mobilePhone)
    AppCompatEditText mEtMobilePhone;
    @BindView(R.id.tv_zone)
    TextView mTvZone;
    @BindView(R.id.et_street)
    AppCompatEditText mEtStreet;
    @BindView(R.id.btn_save)
    ButtonRectangle mBtnSave;

    private Dialog bottomDialog;
    private Gson gson;
    private AddressSelector addressSelector;
    private String provinceId;
    private String cityId;
    private String districtId;
    private String streetId;
    private Map<String, String> address;
    private ArrayList<City> cityList;
    private ArrayList<District> districtList;
    private ArrayList<Street> streetList;
    private Map<String, String> mIdMap;
    private Map<String,String> map;
    private Address addressInfo;
    private String addressId;

    @Override
    public int initLayout() {
        return R.layout.activity_address_add;
    }

    @Override
    public void initView() {
        if (mToolbar != null) {
            mToolbar.setTitle("新增收货地址");
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        bottomDialog = new Dialog(this, R.style.BottomDialog);
        initBottom();
        mBtnSave.setEnabled(false);
    }

    @Override
    public void initData() {
        Log.d(TAG, "initData: "+addressId);
        addressId = getIntent().getStringExtra("userAddressId");
        if (addressId!=null){
            Log.d(TAG, "initData1: "+addressId);
            map = new ArrayMap<>();
            map.put("userAddressId",addressId);
            OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ADDRESS_GET, map, BaseApp.Constant.userId, "zh", new JsonCallback() {
                @Override
                public void onUiThread(int code, String json) {
                    if (code==200){
                        Addresses addresses = gson.fromJson(json, Addresses.class);
                        mEtName.setText(addresses.getName());
                        mEtName.setSelection(addresses.getName().length());
                        mEtMobilePhone.setText(addresses.getMobilePhone());
                        mEtStreet.setText(addresses.getAddress());
                        mTvZone.setText(addresses.getProvince()+","+addresses.getCity()+","+addresses.getDistrict()+","+addresses.getStreet());
                    }
                }

                @Override
                public void onFailed(Call call, IOException exception) {

                }
            });
        }
        gson = new Gson();
        address = new ArrayMap<>();
        addressInfo = new Address();
        OkHttp3Utils.doPost(Api.GUZZU + Api.PROVINCE_FIND, BaseApp.Constant.userId, "zh", new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code == 200) {
                    Type type = new TypeToken<Map<String, Province>>() {
                    }.getType();
                    Map<String, Province> map = gson.fromJson(json, type);
                    final ArrayList<Province> provinceList = new ArrayList<>(map.values());
                    Log.d(TAG, "onUiThread: " + provinceList.size() + provinceList.get(0).getCityName());
                    addressSelector.setTabAmount(4);
                    addressSelector.setCities(provinceList);
                    addressSelector.setOnItemClickListener(new OnItemClickListener() {
                        @Override
                        public void itemClick(final AddressSelector addressSelector, CityInterface cityInterface, int i) {
                            switch (i) {
                                case 0:
                                    for (int j = 0; j < provinceList.size(); j++) {
                                        if (provinceList.get(j).getName().equals(cityInterface.getCityName())) {
                                            provinceId = provinceList.get(j).getProvinceId();
                                        }
                                    }
                                    addressInfo.setProvince(cityInterface.getCityName());
                                    addressInfo.setProvinceId(provinceId);
                                    address.put("province", cityInterface.getCityName());
                                    mIdMap = new ArrayMap<>();
                                    mIdMap.put("provinceId", provinceId);
                                    showLoading(getString(R.string.dialog_wait));
                                    OkHttp3Utils.doJsonPost(Api.GUZZU + Api.CITY_FIND, mIdMap, BaseApp.Constant.userId, "zh", new JsonCallback() {
                                        @Override
                                        public void onUiThread(int code, String json) {
                                            Type type = new TypeToken<Map<String, City>>() {
                                            }.getType();
                                            Map<String, City> map = gson.fromJson(json, type);
                                            cityList = new ArrayList<>(map.values());
                                            addressSelector.setCities(cityList);
                                            cancelLoading();
                                        }

                                        @Override
                                        public void onFailed(Call call, IOException exception) {

                                        }
                                    });

                                    break;
                                case 1:
                                    for (int j = 0; j < cityList.size(); j++) {
                                        if (cityList.get(j).getName().equals(cityInterface.getCityName())) {
                                            cityId = cityList.get(j).getCityId();
                                        }
                                    }
                                    addressInfo.setCity(cityInterface.getCityName());
                                    addressInfo.setCityId(cityId);
                                    address.put("city", cityInterface.getCityName());
                                    mIdMap.clear();
                                    mIdMap.put("cityId", cityId);
                                    showLoading(getString(R.string.dialog_wait));
                                    OkHttp3Utils.doJsonPost(Api.GUZZU + Api.DISTRICT_FIND, mIdMap, BaseApp.Constant.userId, "zh", new JsonCallback() {
                                        @Override
                                        public void onUiThread(int code, String json) {
                                            Type type = new TypeToken<Map<String, District>>() {
                                            }.getType();
                                            Map<String, District> map = gson.fromJson(json, type);
                                            districtList = new ArrayList<>(map.values());
                                            addressSelector.setCities(districtList);
                                            cancelLoading();
                                        }

                                        @Override
                                        public void onFailed(Call call, IOException exception) {

                                        }
                                    });
                                    break;
                                case 2:
                                    for (int j = 0; j < districtList.size(); j++) {
                                        if (districtList.get(j).getName().equals(cityInterface.getCityName())) {
                                            districtId = districtList.get(j).getDistrictId();
                                        }
                                    }
                                    addressInfo.setDistrict(cityInterface.getCityName());
                                    addressInfo.setDistrictId(districtId);
                                    address.put("district", cityInterface.getCityName());
                                    mIdMap.clear();
                                    mIdMap.put("districtId", districtId);
                                    showLoading(getString(R.string.dialog_wait));
                                    OkHttp3Utils.doJsonPost(Api.GUZZU + Api.STREET_FIND, mIdMap, BaseApp.Constant.userId, "zh", new JsonCallback() {
                                        @Override
                                        public void onUiThread(int code, String json) {
                                            Type type = new TypeToken<Map<String, Street>>() {
                                            }.getType();
                                            Map<String, Street> map = gson.fromJson(json, type);
                                            streetList = new ArrayList<>(map.values());
                                            addressSelector.setCities(streetList);
                                            cancelLoading();
                                        }

                                        @Override
                                        public void onFailed(Call call, IOException exception) {

                                        }
                                    });
                                    break;
                                case 3:
                                    for (int j = 0; j < streetList.size(); j++) {
                                        if (streetList.get(j).getName().equals(cityInterface.getCityName())) {
                                            streetId = streetList.get(j).getStreetId();
                                        }
                                    }
                                    addressInfo.setStreet(cityInterface.getCityName());
                                    addressInfo.setStreetId(streetId);
                                    address.put("street", cityInterface.getCityName());
                                    String tvAddress = address.get("province") + "," + address.get("city") + "," + address.get("district") + "," + address.get("street");
                                    mTvZone.setText(tvAddress);
                                    bottomDialog.dismiss();
                                    break;
                            }
                        }
                    });
                    addressSelector.setOnTabSelectedListener(new AddressSelector.OnTabSelectedListener() {
                        @Override
                        public void onTabSelected(AddressSelector addressSelector, AddressSelector.Tab tab) {
                            switch (tab.getIndex()) {
                                case 0:
                                    addressSelector.setCities(provinceList);
                                    break;
                                case 1:
                                    addressSelector.setCities(cityList);
                                    break;
                                case 2:
                                    addressSelector.setCities(districtList);
                                    break;
                                case 3:
                                    addressSelector.setCities(streetList);
                                    break;
                            }
                        }

                        @Override
                        public void onTabReselected(AddressSelector addressSelector, AddressSelector.Tab tab) {

                        }
                    });
                }


            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void initListener() {
        mEtName.addTextChangedListener(this);
        mEtMobilePhone.addTextChangedListener(this);
        mEtStreet.addTextChangedListener(this);
        mTvZone.addTextChangedListener(this);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.finish(context);
            }
        });
    }


    private void initBottom() {
        View contentView = LayoutInflater.from(this).inflate(R.layout.layout_address_item, null);
        ImageView mClose = contentView.findViewById(R.id.btn_close);
        addressSelector = contentView.findViewById(R.id.address);
        bottomDialog.setContentView(contentView);
        mClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomDialog.dismiss();
            }
        });
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = getResources().getDisplayMetrics().widthPixels;
        layoutParams.height = getResources().getDisplayMetrics().heightPixels / 3 * 2;
        contentView.setLayoutParams(layoutParams);
        bottomDialog.getWindow().setGravity(Gravity.BOTTOM);
        bottomDialog.getWindow().setWindowAnimations(R.style.BottomDialog_Animation);


    }


    @OnClick({R.id.tv_zone, R.id.btn_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_zone:
                bottomDialog.show();
                break;
            case R.id.btn_save:
                addressInfo.setName(mEtName.getText().toString());
                addressInfo.setCountry("CHN");
                addressInfo.setAddress(mEtStreet.getText().toString());
                addressInfo.setMobilePhone(mEtMobilePhone.getText().toString());
                addressInfo.setMobilePhoneCountry("CHN");
                String json = gson.toJson(addressInfo);
                if (addressId!=null){
                    addressInfo.setUserAddressId(addressId);
                    String uJson = gson.toJson(addressInfo);
                    OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ADDRESS_UPDATE,uJson, BaseApp.Constant.userId, new JsonCallback() {
                        @Override
                        public void onUiThread(int code, String json) {
                            if (code == 200) {
                                EventBus.getDefault().post(new GoHomeEvent());
                                finish();
                            }
                        }

                        @Override
                        public void onFailed(Call call, IOException exception) {

                        }
                    });
                }else {
                    OkHttp3Utils.doJsonPost(Api.GUZZU + Api.ADDRESS_CREATE, json, BaseApp.Constant.userId, new JsonCallback() {
                        @Override
                        public void onUiThread(int code, String json) {
                            if (code == 200) {
                                finish();
                            }
                        }

                        @Override
                        public void onFailed(Call call, IOException exception) {

                        }
                    });
                }

                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (!mEtName.getText().toString().isEmpty() && !mEtStreet.getText().toString().isEmpty()
                && Utils.isMobileNO(mEtMobilePhone.getText().toString())&& !mTvZone.getText().toString().isEmpty()) {
            mBtnSave.setEnabled(true);
        }else {
            mBtnSave.setEnabled(false);
        }


    }

}
