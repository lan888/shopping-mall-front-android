package cn.guzzu.shoppingmall.bean;

import java.util.List;

public class Order {
    /**
     * _id : 5b1a2d08d193660c7dfb88bf
     * shippingAddress : {"address":"还贵呢","city":"天津市","cityId":"120100","country":"CHN","district":"河东区","districtId":"120102","mobilePhone":"13537286688","mobilePhoneCountry":"CHN","name":"陈老师","province":"天津","provinceId":"120000","street":"大王庄街道","streetId":"120102001"}
     * discountItem : {"itemIndexes":[]}
     * pickUpPlace : {"images":[],"serviceHours":[]}
     * status : open
     * shippingCost : 0
     * taxCost : 0
     * taxRate : 0
     * credit : 0
     * discount : 0
     * subtotal : 25200
     * serviceCost : 0
     * affiliateCost : 0
     * totalCost : 25200
     * totalPaid : 0
     * totalRefunded : 0
     * customOrderFields : []
     * customer : 5b0fb92620f931129a8ec022
     * store : {"_id":"5ac1867b69061664d70064f4","name":"Store 7","logo":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-thumb.jpg"},"original":{"width":108,"height":108,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263.","size":2386,"format":"PNG","colorspace":"RGB","orientation":""}},"slug":"store7"}
     * shoppingMall : 5adedc43de3c90022eb25d3b
     * clientType : cn.guzzu.shoppingmall
     * nonce : 20180608151358
     * type : default
     * shippingType : regular
     * paymentStatus : pending
     * shippingStatus : unshipped
     * log : [{"timestamp":"2018-06-08T07:15:20.292Z","_id":"5b1a2d08d193660c7dfb88c0","type":"open"}]
     * items : [{"name":"Evolution 【Games Warehouse】","_id":"5b1a2d08d193660c7dfb88c1","productId":"5b0e54d4b84455862cc69925","product":{"name":"Evolution 【Games Warehouse】","description":"Components: 1 watering hole board, 180 food tokens, 24 species boards, 48 wooden cubes (not pictured), 129 trait cards, 6 bags, 1 rulebook, 6 player aids, and 1 giant start player dino-meeple.","metaDescription":"Evolution 【Games Warehouse】","weixinShareTitle":"Evolution 【Games Warehouse】","weixinShareDescription":"Evolution 【Games Warehouse】","ratingTotal":{"positive":0,"moderate":0,"negative":0},"purchased":0,"maxQuantity":0,"gallery":[],"reviewCount":0,"inOrders":[],"shippingCosts":[],"customOrderFields":[],"_id":"5b0e54d4b84455862cc69925","sourceId":340302,"updatedAt":"2018-05-30T09:19:43.981Z","slug":"340302-evolution-games-warehouse","__v":1,"createdAt":"2018-05-30T07:37:53.431Z","inventoryPolicy":"unlimited","price":25200,"store":"5ac1867b69061664d70064f4","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg","large":{"format":"jpg","width":1040,"height":780,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-large.jpg"},"medium":{"format":"jpg","width":780,"height":585,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-thumb.jpg"},"original":{"width":600,"height":450,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e.","size":100045,"format":"JPEG","colorspace":"RGB","orientation":""}},"productOptions":[],"productOptionsEnabled":false,"type":"default","publishedAt":"2018-05-30T09:19:43.980Z","isArchived":false,"originalPrice":0,"isDiscounted":false,"status":"published"},"quantity":1,"price":25200}]
     * attendeeInfo : []
     * refId : 20872
     * updatedAt : 2018-06-08T07:15:20.369Z
     * createdAt : 2018-06-08T07:15:20.369Z
     * __v : 0
     */

    private String _id;
    private ShippingAddress shippingAddress;
    private DiscountItem discountItem;
    private PickUpPlace pickUpPlace;
    private String status;
    private int shippingCost;
    private int taxCost;
    private int taxRate;
    private int credit;
    private int discount;
    private int subtotal;
    private int serviceCost;
    private int affiliateCost;
    private int totalCost;
    private int totalPaid;
    private int totalRefunded;
    private String customer;
    private Store store;
    private String shoppingMall;
    private String clientType;
    private String nonce;
    private String type;
    private String shippingType;
    private String paymentStatus;
    private String shippingStatus;
    private String refId;
    private String updatedAt;
    private String createdAt;
    private int __v;
    private List<?> customOrderFields;
    private List<Log> log;
    private List<Items> items;
    private List<?> attendeeInfo;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public DiscountItem getDiscountItem() {
        return discountItem;
    }

    public void setDiscountItem(DiscountItem discountItem) {
        this.discountItem = discountItem;
    }

    public PickUpPlace getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(PickUpPlace pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getTaxCost() {
        return taxCost;
    }

    public void setTaxCost(int taxCost) {
        this.taxCost = taxCost;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getAffiliateCost() {
        return affiliateCost;
    }

    public void setAffiliateCost(int affiliateCost) {
        this.affiliateCost = affiliateCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(int totalPaid) {
        this.totalPaid = totalPaid;
    }

    public int getTotalRefunded() {
        return totalRefunded;
    }

    public void setTotalRefunded(int totalRefunded) {
        this.totalRefunded = totalRefunded;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getShoppingMall() {
        return shoppingMall;
    }

    public void setShoppingMall(String shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
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

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public List<?> getCustomOrderFields() {
        return customOrderFields;
    }

    public void setCustomOrderFields(List<?> customOrderFields) {
        this.customOrderFields = customOrderFields;
    }

    public List<Log> getLog() {
        return log;
    }

    public void setLog(List<Log> log) {
        this.log = log;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public List<?> getAttendeeInfo() {
        return attendeeInfo;
    }

    public void setAttendeeInfo(List<?> attendeeInfo) {
        this.attendeeInfo = attendeeInfo;
    }

    public static class ShippingAddress {
        /**
         * address : 还贵呢
         * city : 天津市
         * cityId : 120100
         * country : CHN
         * district : 河东区
         * districtId : 120102
         * mobilePhone : 13537286688
         * mobilePhoneCountry : CHN
         * name : 陈老师
         * province : 天津
         * provinceId : 120000
         * street : 大王庄街道
         * streetId : 120102001
         */

        private String address;
        private String city;
        private String cityId;
        private String country;
        private String district;
        private String districtId;
        private String mobilePhone;
        private String mobilePhoneCountry;
        private String name;
        private String province;
        private String provinceId;
        private String street;
        private String streetId;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
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

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
    }

    public static class DiscountItem {
        private List<?> itemIndexes;

        public List<?> getItemIndexes() {
            return itemIndexes;
        }

        public void setItemIndexes(List<?> itemIndexes) {
            this.itemIndexes = itemIndexes;
        }
    }

    public static class PickUpPlace {
        private List<?> images;
        private List<?> serviceHours;

        public List<?> getImages() {
            return images;
        }

        public void setImages(List<?> images) {
            this.images = images;
        }

        public List<?> getServiceHours() {
            return serviceHours;
        }

        public void setServiceHours(List<?> serviceHours) {
            this.serviceHours = serviceHours;
        }
    }

    public static class Store {
        /**
         * _id : 5ac1867b69061664d70064f4
         * name : Store 7
         * logo : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-thumb.jpg"},"original":{"width":108,"height":108,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263.","size":2386,"format":"PNG","colorspace":"RGB","orientation":""}}
         * slug : store7
         */

        private String _id;
        private String name;
        private Logo logo;
        private String slug;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Logo getLogo() {
            return logo;
        }

        public void setLogo(Logo logo) {
            this.logo = logo;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public static class Logo {
            /**
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-medium.jpg
             * large : {"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-large.jpg"}
             * medium : {"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-medium.jpg"}
             * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-thumb.jpg"}
             * original : {"width":108,"height":108,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263.","size":2386,"format":"PNG","colorspace":"RGB","orientation":""}
             */

            private String url;
            private Large large;
            private Medium medium;
            private Thumb thumb;
            private Original original;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public Large getLarge() {
                return large;
            }

            public void setLarge(Large large) {
                this.large = large;
            }

            public Medium getMedium() {
                return medium;
            }

            public void setMedium(Medium medium) {
                this.medium = medium;
            }

            public Thumb getThumb() {
                return thumb;
            }

            public void setThumb(Thumb thumb) {
                this.thumb = thumb;
            }

            public Original getOriginal() {
                return original;
            }

            public void setOriginal(Original original) {
                this.original = original;
            }

            public static class Large {
                /**
                 * format : jpg
                 * width : 1040
                 * height : 1040
                 * maxWidth : 1040
                 * maxHeight : 1040
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-large.jpg
                 */

                private String format;
                private int width;
                private int height;
                private int maxWidth;
                private int maxHeight;
                private String url;

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getMaxWidth() {
                    return maxWidth;
                }

                public void setMaxWidth(int maxWidth) {
                    this.maxWidth = maxWidth;
                }

                public int getMaxHeight() {
                    return maxHeight;
                }

                public void setMaxHeight(int maxHeight) {
                    this.maxHeight = maxHeight;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class Medium {
                /**
                 * format : jpg
                 * width : 780
                 * height : 780
                 * maxWidth : 780
                 * maxHeight : 780
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-medium.jpg
                 */

                private String format;
                private int width;
                private int height;
                private int maxWidth;
                private int maxHeight;
                private String url;

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getMaxWidth() {
                    return maxWidth;
                }

                public void setMaxWidth(int maxWidth) {
                    this.maxWidth = maxWidth;
                }

                public int getMaxHeight() {
                    return maxHeight;
                }

                public void setMaxHeight(int maxHeight) {
                    this.maxHeight = maxHeight;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class Thumb {
                /**
                 * aspect : 1:1
                 * format : jpg
                 * width : 320
                 * height : 320
                 * maxHeight : 320
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263-thumb.jpg
                 */

                private String aspect;
                private String format;
                private int width;
                private int height;
                private int maxHeight;
                private String url;

                public String getAspect() {
                    return aspect;
                }

                public void setAspect(String aspect) {
                    this.aspect = aspect;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getMaxHeight() {
                    return maxHeight;
                }

                public void setMaxHeight(int maxHeight) {
                    this.maxHeight = maxHeight;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class Original {
                /**
                 * width : 108
                 * height : 108
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6c648cd4-202a-45ff-93fc-52a661fd2263.
                 * size : 2386
                 * format : PNG
                 * colorspace : RGB
                 * orientation :
                 */

                private int width;
                private int height;
                private String url;
                private int size;
                private String format;
                private String colorspace;
                private String orientation;

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public String getColorspace() {
                    return colorspace;
                }

                public void setColorspace(String colorspace) {
                    this.colorspace = colorspace;
                }

                public String getOrientation() {
                    return orientation;
                }

                public void setOrientation(String orientation) {
                    this.orientation = orientation;
                }
            }
        }
    }

    public static class Log {
        /**
         * timestamp : 2018-06-08T07:15:20.292Z
         * _id : 5b1a2d08d193660c7dfb88c0
         * type : open
         */

        private String timestamp;
        private String _id;
        private String type;

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Items {
        /**
         * name : Evolution 【Games Warehouse】
         * _id : 5b1a2d08d193660c7dfb88c1
         * productId : 5b0e54d4b84455862cc69925
         * product : {"name":"Evolution 【Games Warehouse】","description":"Components: 1 watering hole board, 180 food tokens, 24 species boards, 48 wooden cubes (not pictured), 129 trait cards, 6 bags, 1 rulebook, 6 player aids, and 1 giant start player dino-meeple.","metaDescription":"Evolution 【Games Warehouse】","weixinShareTitle":"Evolution 【Games Warehouse】","weixinShareDescription":"Evolution 【Games Warehouse】","ratingTotal":{"positive":0,"moderate":0,"negative":0},"purchased":0,"maxQuantity":0,"gallery":[],"reviewCount":0,"inOrders":[],"shippingCosts":[],"customOrderFields":[],"_id":"5b0e54d4b84455862cc69925","sourceId":340302,"updatedAt":"2018-05-30T09:19:43.981Z","slug":"340302-evolution-games-warehouse","__v":1,"createdAt":"2018-05-30T07:37:53.431Z","inventoryPolicy":"unlimited","price":25200,"store":"5ac1867b69061664d70064f4","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg","large":{"format":"jpg","width":1040,"height":780,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-large.jpg"},"medium":{"format":"jpg","width":780,"height":585,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-thumb.jpg"},"original":{"width":600,"height":450,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e.","size":100045,"format":"JPEG","colorspace":"RGB","orientation":""}},"productOptions":[],"productOptionsEnabled":false,"type":"default","publishedAt":"2018-05-30T09:19:43.980Z","isArchived":false,"originalPrice":0,"isDiscounted":false,"status":"published"}
         * quantity : 1
         * price : 25200
         */

        private String name;
        private String _id;
        private String productId;
        private Product product;
        private Image image;
        private String optionName;
        private int quantity;
        private int price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public String getOptionName() {
            return optionName;
        }

        public void setOptionName(String optionName) {
            this.optionName = optionName;
        }

        public static class Image {
            /**
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9-medium.jpg
             * large : {"format":"jpg","width":1040,"height":780,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9-large.jpg"}
             * medium : {"format":"jpg","width":780,"height":585,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9-medium.jpg"}
             * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9-thumb.jpg"}
             * original : {"width":600,"height":450,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9.","size":73216,"format":"JPEG","colorspace":"RGB","orientation":""}
             */

            private String url;
            private LargeX large;
            private MediumX medium;
            private ThumbX thumb;
            private OriginalX original;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public LargeX getLarge() {
                return large;
            }

            public void setLarge(LargeX large) {
                this.large = large;
            }

            public MediumX getMedium() {
                return medium;
            }

            public void setMedium(MediumX medium) {
                this.medium = medium;
            }

            public ThumbX getThumb() {
                return thumb;
            }

            public void setThumb(ThumbX thumb) {
                this.thumb = thumb;
            }

            public OriginalX getOriginal() {
                return original;
            }

            public void setOriginal(OriginalX original) {
                this.original = original;
            }

            public static class LargeX {
                /**
                 * format : jpg
                 * width : 1040
                 * height : 780
                 * maxWidth : 1040
                 * maxHeight : 1040
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9-large.jpg
                 */

                private String format;
                private int width;
                private int height;
                private int maxWidth;
                private int maxHeight;
                private String url;

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getMaxWidth() {
                    return maxWidth;
                }

                public void setMaxWidth(int maxWidth) {
                    this.maxWidth = maxWidth;
                }

                public int getMaxHeight() {
                    return maxHeight;
                }

                public void setMaxHeight(int maxHeight) {
                    this.maxHeight = maxHeight;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class MediumX {
                /**
                 * format : jpg
                 * width : 780
                 * height : 585
                 * maxWidth : 780
                 * maxHeight : 780
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9-medium.jpg
                 */

                private String format;
                private int width;
                private int height;
                private int maxWidth;
                private int maxHeight;
                private String url;

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getMaxWidth() {
                    return maxWidth;
                }

                public void setMaxWidth(int maxWidth) {
                    this.maxWidth = maxWidth;
                }

                public int getMaxHeight() {
                    return maxHeight;
                }

                public void setMaxHeight(int maxHeight) {
                    this.maxHeight = maxHeight;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class ThumbX {
                /**
                 * aspect : 1:1
                 * format : jpg
                 * width : 320
                 * height : 320
                 * maxHeight : 320
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9-thumb.jpg
                 */

                private String aspect;
                private String format;
                private int width;
                private int height;
                private int maxHeight;
                private String url;

                public String getAspect() {
                    return aspect;
                }

                public void setAspect(String aspect) {
                    this.aspect = aspect;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getMaxHeight() {
                    return maxHeight;
                }

                public void setMaxHeight(int maxHeight) {
                    this.maxHeight = maxHeight;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class OriginalX {
                /**
                 * width : 600
                 * height : 450
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a43f976c-e90d-4279-bdf1-b0e9c0faa5d9.
                 * size : 73216
                 * format : JPEG
                 * colorspace : RGB
                 * orientation :
                 */

                private int width;
                private int height;
                private String url;
                private int size;
                private String format;
                private String colorspace;
                private String orientation;

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public String getColorspace() {
                    return colorspace;
                }

                public void setColorspace(String colorspace) {
                    this.colorspace = colorspace;
                }

                public String getOrientation() {
                    return orientation;
                }

                public void setOrientation(String orientation) {
                    this.orientation = orientation;
                }
            }
        }
        public static class Product {
            /**
             * name : Evolution 【Games Warehouse】
             * description : Components: 1 watering hole board, 180 food tokens, 24 species boards, 48 wooden cubes (not pictured), 129 trait cards, 6 bags, 1 rulebook, 6 player aids, and 1 giant start player dino-meeple.
             * metaDescription : Evolution 【Games Warehouse】
             * weixinShareTitle : Evolution 【Games Warehouse】
             * weixinShareDescription : Evolution 【Games Warehouse】
             * ratingTotal : {"positive":0,"moderate":0,"negative":0}
             * purchased : 0
             * maxQuantity : 0
             * gallery : []
             * reviewCount : 0
             * inOrders : []
             * shippingCosts : []
             * customOrderFields : []
             * _id : 5b0e54d4b84455862cc69925
             * sourceId : 340302
             * updatedAt : 2018-05-30T09:19:43.981Z
             * slug : 340302-evolution-games-warehouse
             * __v : 1
             * createdAt : 2018-05-30T07:37:53.431Z
             * inventoryPolicy : unlimited
             * price : 25200
             * store : 5ac1867b69061664d70064f4
             * image : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg","large":{"format":"jpg","width":1040,"height":780,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-large.jpg"},"medium":{"format":"jpg","width":780,"height":585,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-thumb.jpg"},"original":{"width":600,"height":450,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e.","size":100045,"format":"JPEG","colorspace":"RGB","orientation":""}}
             * productOptions : []
             * productOptionsEnabled : false
             * type : default
             * publishedAt : 2018-05-30T09:19:43.980Z
             * isArchived : false
             * originalPrice : 0
             * isDiscounted : false
             * status : published
             */

            private String name;
            private String description;
            private String metaDescription;
            private String weixinShareTitle;
            private String weixinShareDescription;
            private RatingTotal ratingTotal;
            private int purchased;
            private int maxQuantity;
            private int reviewCount;
            private String _id;
            private int sourceId;
            private String updatedAt;
            private String slug;
            private int __v;
            private String createdAt;
            private String inventoryPolicy;
            private int price;
            private String store;
            private Image image;
            private boolean productOptionsEnabled;
            private String type;
            private String publishedAt;
            private boolean isArchived;
            private int originalPrice;
            private boolean isDiscounted;
            private String status;
            private List<?> gallery;
            private List<?> inOrders;
            private List<?> shippingCosts;
            private List<?> customOrderFields;
            private List<?> productOptions;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getMetaDescription() {
                return metaDescription;
            }

            public void setMetaDescription(String metaDescription) {
                this.metaDescription = metaDescription;
            }

            public String getWeixinShareTitle() {
                return weixinShareTitle;
            }

            public void setWeixinShareTitle(String weixinShareTitle) {
                this.weixinShareTitle = weixinShareTitle;
            }

            public String getWeixinShareDescription() {
                return weixinShareDescription;
            }

            public void setWeixinShareDescription(String weixinShareDescription) {
                this.weixinShareDescription = weixinShareDescription;
            }

            public RatingTotal getRatingTotal() {
                return ratingTotal;
            }

            public void setRatingTotal(RatingTotal ratingTotal) {
                this.ratingTotal = ratingTotal;
            }

            public int getPurchased() {
                return purchased;
            }

            public void setPurchased(int purchased) {
                this.purchased = purchased;
            }

            public int getMaxQuantity() {
                return maxQuantity;
            }

            public void setMaxQuantity(int maxQuantity) {
                this.maxQuantity = maxQuantity;
            }

            public int getReviewCount() {
                return reviewCount;
            }

            public void setReviewCount(int reviewCount) {
                this.reviewCount = reviewCount;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public int getSourceId() {
                return sourceId;
            }

            public void setSourceId(int sourceId) {
                this.sourceId = sourceId;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public int get__v() {
                return __v;
            }

            public void set__v(int __v) {
                this.__v = __v;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getInventoryPolicy() {
                return inventoryPolicy;
            }

            public void setInventoryPolicy(String inventoryPolicy) {
                this.inventoryPolicy = inventoryPolicy;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getStore() {
                return store;
            }

            public void setStore(String store) {
                this.store = store;
            }

            public Image getImage() {
                return image;
            }

            public void setImage(Image image) {
                this.image = image;
            }

            public boolean isProductOptionsEnabled() {
                return productOptionsEnabled;
            }

            public void setProductOptionsEnabled(boolean productOptionsEnabled) {
                this.productOptionsEnabled = productOptionsEnabled;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public boolean isIsArchived() {
                return isArchived;
            }

            public void setIsArchived(boolean isArchived) {
                this.isArchived = isArchived;
            }

            public int getOriginalPrice() {
                return originalPrice;
            }

            public void setOriginalPrice(int originalPrice) {
                this.originalPrice = originalPrice;
            }

            public boolean isIsDiscounted() {
                return isDiscounted;
            }

            public void setIsDiscounted(boolean isDiscounted) {
                this.isDiscounted = isDiscounted;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<?> getGallery() {
                return gallery;
            }

            public void setGallery(List<?> gallery) {
                this.gallery = gallery;
            }

            public List<?> getInOrders() {
                return inOrders;
            }

            public void setInOrders(List<?> inOrders) {
                this.inOrders = inOrders;
            }

            public List<?> getShippingCosts() {
                return shippingCosts;
            }

            public void setShippingCosts(List<?> shippingCosts) {
                this.shippingCosts = shippingCosts;
            }

            public List<?> getCustomOrderFields() {
                return customOrderFields;
            }

            public void setCustomOrderFields(List<?> customOrderFields) {
                this.customOrderFields = customOrderFields;
            }

            public List<?> getProductOptions() {
                return productOptions;
            }

            public void setProductOptions(List<?> productOptions) {
                this.productOptions = productOptions;
            }

            public static class RatingTotal {
                /**
                 * positive : 0
                 * moderate : 0
                 * negative : 0
                 */

                private int positive;
                private int moderate;
                private int negative;

                public int getPositive() {
                    return positive;
                }

                public void setPositive(int positive) {
                    this.positive = positive;
                }

                public int getModerate() {
                    return moderate;
                }

                public void setModerate(int moderate) {
                    this.moderate = moderate;
                }

                public int getNegative() {
                    return negative;
                }

                public void setNegative(int negative) {
                    this.negative = negative;
                }
            }

            public static class Image {
                /**
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg
                 * large : {"format":"jpg","width":1040,"height":780,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-large.jpg"}
                 * medium : {"format":"jpg","width":780,"height":585,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg"}
                 * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-thumb.jpg"}
                 * original : {"width":600,"height":450,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e.","size":100045,"format":"JPEG","colorspace":"RGB","orientation":""}
                 */

                private String url;
                private LargeX large;
                private MediumX medium;
                private ThumbX thumb;
                private OriginalX original;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public LargeX getLarge() {
                    return large;
                }

                public void setLarge(LargeX large) {
                    this.large = large;
                }

                public MediumX getMedium() {
                    return medium;
                }

                public void setMedium(MediumX medium) {
                    this.medium = medium;
                }

                public ThumbX getThumb() {
                    return thumb;
                }

                public void setThumb(ThumbX thumb) {
                    this.thumb = thumb;
                }

                public OriginalX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalX original) {
                    this.original = original;
                }

                public static class LargeX {
                    /**
                     * format : jpg
                     * width : 1040
                     * height : 780
                     * maxWidth : 1040
                     * maxHeight : 1040
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-large.jpg
                     */

                    private String format;
                    private int width;
                    private int height;
                    private int maxWidth;
                    private int maxHeight;
                    private String url;

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getMaxWidth() {
                        return maxWidth;
                    }

                    public void setMaxWidth(int maxWidth) {
                        this.maxWidth = maxWidth;
                    }

                    public int getMaxHeight() {
                        return maxHeight;
                    }

                    public void setMaxHeight(int maxHeight) {
                        this.maxHeight = maxHeight;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class MediumX {
                    /**
                     * format : jpg
                     * width : 780
                     * height : 585
                     * maxWidth : 780
                     * maxHeight : 780
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-medium.jpg
                     */

                    private String format;
                    private int width;
                    private int height;
                    private int maxWidth;
                    private int maxHeight;
                    private String url;

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getMaxWidth() {
                        return maxWidth;
                    }

                    public void setMaxWidth(int maxWidth) {
                        this.maxWidth = maxWidth;
                    }

                    public int getMaxHeight() {
                        return maxHeight;
                    }

                    public void setMaxHeight(int maxHeight) {
                        this.maxHeight = maxHeight;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class ThumbX {
                    /**
                     * aspect : 1:1
                     * format : jpg
                     * width : 320
                     * height : 320
                     * maxHeight : 320
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e-thumb.jpg
                     */

                    private String aspect;
                    private String format;
                    private int width;
                    private int height;
                    private int maxHeight;
                    private String url;

                    public String getAspect() {
                        return aspect;
                    }

                    public void setAspect(String aspect) {
                        this.aspect = aspect;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getMaxHeight() {
                        return maxHeight;
                    }

                    public void setMaxHeight(int maxHeight) {
                        this.maxHeight = maxHeight;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class OriginalX {
                    /**
                     * width : 600
                     * height : 450
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f4927bf6-1fa3-410e-9b90-e9067478893e.
                     * size : 100045
                     * format : JPEG
                     * colorspace : RGB
                     * orientation :
                     */

                    private int width;
                    private int height;
                    private String url;
                    private int size;
                    private String format;
                    private String colorspace;
                    private String orientation;

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getSize() {
                        return size;
                    }

                    public void setSize(int size) {
                        this.size = size;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }

                    public String getColorspace() {
                        return colorspace;
                    }

                    public void setColorspace(String colorspace) {
                        this.colorspace = colorspace;
                    }

                    public String getOrientation() {
                        return orientation;
                    }

                    public void setOrientation(String orientation) {
                        this.orientation = orientation;
                    }
                }
            }
        }
    }
}
