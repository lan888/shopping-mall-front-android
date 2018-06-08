package cn.guzzu.shoppingmall.bean;

import com.yiguo.adressselectorlib.CityInterface;

public class Province implements CityInterface {

    /**
     * provinceId : 110000
     * name : Bei Jing/北京
     */

    private String provinceId;
    private String name;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCityName() {
        return name;
    }
}
