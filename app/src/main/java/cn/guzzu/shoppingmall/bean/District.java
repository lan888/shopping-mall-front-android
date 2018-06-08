package cn.guzzu.shoppingmall.bean;

import com.yiguo.adressselectorlib.CityInterface;

public class District implements CityInterface {
    /**
     * provinceId : 130000
     * cityId : 130200
     * districtId : 130283
     * name : Qian An City/迁安市
     */

    private String provinceId;
    private String cityId;
    private String districtId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
