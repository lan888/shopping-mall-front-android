package cn.guzzu.shoppingmall.bean;

import com.yiguo.adressselectorlib.CityInterface;

public class Street implements CityInterface {
    /**
     * provinceId : 110000
     * cityId : 110100
     * districtId : 110105
     * streetId : 110105021
     * name : Nan Mo Fang Di Qu/南磨房地区
     */

    private String provinceId;
    private String cityId;
    private String districtId;
    private String streetId;
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

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getStreetId() {
        return streetId;
    }

    public void setStreetId(String streetId) {
        this.streetId = streetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
