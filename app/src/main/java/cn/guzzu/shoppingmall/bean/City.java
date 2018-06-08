package cn.guzzu.shoppingmall.bean;

import com.yiguo.adressselectorlib.CityInterface;

public class City implements CityInterface {
    /**
     * provinceId : 220000
     * cityId : 220700
     * name : Song Yuan City/松原市
     */

    private String provinceId;
    private String cityId;
    private String name;

    @Override
    public String getCityName() {
        return name;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
