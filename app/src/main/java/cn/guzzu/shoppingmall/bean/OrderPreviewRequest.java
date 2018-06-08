package cn.guzzu.shoppingmall.bean;

import java.io.Serializable;
import java.util.List;

public class OrderPreviewRequest {
    /**
     * shippingAddress : {"_id":"5b15f8609055af4e53ba2bf4","createdAt":"2018-06-05T02:41:36.222Z","updatedAt":"2018-06-05T02:41:36.222Z","name":"g","country":"CHN","province":"山西省","provinceId":"140000","city":"长治市","cityId":"140400","district":"屯留县","districtId":"140424","street":"麟绛镇","streetId":"140424100","address":"123","mobilePhone":"1234567890","mobilePhoneCountry":"CHN","user":"5b0fa0bb20f931129a8ec01d","lastUsedAt":"2018-06-05T02:41:36.221Z","__v":0}
     * storeId : 5ac1867b69061664d70064f4
     * items : [{"productId":"5b0e54d4b84455862cc69931","quantity":1}]
     * shippingType : regular
     * nonce : 1528181650128
     * type : default
     * shoppingMall : 5adedc43de3c90022eb25d3b
     */

    private ShippingAddress shippingAddress;
    private String storeId;
    private String shippingType;
    private String nonce;
    private String type;
    private String shoppingMall;
    private List<Items> items;

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShoppingMall() {
        return shoppingMall;
    }

    public void setShoppingMall(String shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public static class ShippingAddress {
        /**
         * _id : 5b15f8609055af4e53ba2bf4
         * createdAt : 2018-06-05T02:41:36.222Z
         * updatedAt : 2018-06-05T02:41:36.222Z
         * name : g
         * country : CHN
         * province : 山西省
         * provinceId : 140000
         * city : 长治市
         * cityId : 140400
         * district : 屯留县
         * districtId : 140424
         * street : 麟绛镇
         * streetId : 140424100
         * address : 123
         * mobilePhone : 1234567890
         * mobilePhoneCountry : CHN
         * user : 5b0fa0bb20f931129a8ec01d
         * lastUsedAt : 2018-06-05T02:41:36.221Z
         * __v : 0
         */

        private String _id;
        private String createdAt;
        private String updatedAt;
        private String name;
        private String country;
        private String province;
        private String provinceId;
        private String city;
        private String cityId;
        private String district;
        private String districtId;
        private String street;
        private String streetId;
        private String address;
        private String mobilePhone;
        private String mobilePhoneCountry;
        private String user;
        private String lastUsedAt;
        private int __v;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getProvinceId() {
            return provinceId;
        }

        public void setProvinceId(String provinceId) {
            this.provinceId = provinceId;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getDistrictId() {
            return districtId;
        }

        public void setDistrictId(String districtId) {
            this.districtId = districtId;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getStreetId() {
            return streetId;
        }

        public void setStreetId(String streetId) {
            this.streetId = streetId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getMobilePhoneCountry() {
            return mobilePhoneCountry;
        }

        public void setMobilePhoneCountry(String mobilePhoneCountry) {
            this.mobilePhoneCountry = mobilePhoneCountry;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getLastUsedAt() {
            return lastUsedAt;
        }

        public void setLastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }
    }

    public static class Items implements Serializable{
        /**
         * productId : 5b0e54d4b84455862cc69931
         * quantity : 1
         */

        private String productId;
        private String quantity;

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }


        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
    }
}
