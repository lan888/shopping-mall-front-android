package guzzu.ian.guzzudemo.bean;

/**
 * Created by Ian on 2018/3/14.
 */

public class ShippingProvider {

    /**
     * _id : 5963214df5aab25af24cbc65
     * index : 100
     * name : SF Express 顺丰速运
     * website : http://www.sf-express.com/
     * phone : 95338
     * trackingUrl : http://www.sf-express.com/cn/sc/dynamic_function/waybill/#search/bill-number/
     * code : shunfeng
     * __v : 0
     */

    private String _id;
    private int index;
    private String name;
    private String website;
    private String phone;
    private String trackingUrl;
    private String code;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
