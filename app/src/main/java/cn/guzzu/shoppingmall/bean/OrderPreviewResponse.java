package cn.guzzu.shoppingmall.bean;

import java.util.List;

public class OrderPreviewResponse {

    /**
     * order : {"__remark":"mock order created by Order.preview","customer":"5b0fb92620f931129a8ec022","store":"57c4ed03cc4f36bc2c12ab29","shoppingMall":"5adedc43de3c90022eb25d3b","shippingAddress":{"__v":0,"_id":"5b175984f0ed7c2c42945328","address":"克拉克学校","city":"天津市","cityId":"120100","country":"CHN","createdAt":"2018-06-06T03:48:20.320Z","district":"河东区","districtId":"120102","lastUsedAt":"2018-06-06T03:48:20.316Z","mobilePhone":"13537284037","mobilePhoneCountry":"CHN","name":"爸爸","province":"天津","provinceId":"120000","street":"大王庄街道","streetId":"120102001","updatedAt":"2018-06-06T03:48:20.320Z","user":"5b0fb92620f931129a8ec022"},"shippingType":"regular","shippingCost":0,"discount":0,"subtotal":5,"totalCost":5,"items":[{"name":"White wine","productId":"5b0f63c7885d60492fba3e13","product":{"name":"White wine","description":"","metaDescription":"","weixinShareTitle":"","weixinShareDescription":"","ratingTotal":{"positive":0,"moderate":0,"negative":0},"purchased":0,"maxQuantity":1,"gallery":[],"reviewCount":0,"_id":"5b0f63c7885d60492fba3e13","createdAt":"2018-05-31T02:53:59.089Z","updatedAt":"2018-06-06T03:40:00.239Z","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-thumb.jpg"},"original":{"width":320,"height":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc.","size":5140,"format":"JPEG","colorspace":"RGB","orientation":""}},"price":0,"isDiscounted":false,"originalPrice":0,"status":"published","isArchived":false,"inventoryPolicy":"limited","shippingType":"default","type":"default","store":"57c4ed03cc4f36bc2c12ab29","customOrderFields":[],"shippingCosts":[{"_id":"5b0f63ce885d60492fba3e19","price":0,"country":"CHN"}],"inOrders":[],"productOptions":[{"name":"1 Bottle","_id":"5b0f63ce885d60492fba3e18","maxQuantity":1,"price":2,"inventoryPolicy":"unlimited"},{"name":"3 Bottles","_id":"5b0f63ce885d60492fba3e17","maxQuantity":1,"price":5,"inventoryPolicy":"unlimited"}],"slug":"S1kCmJ6km","__v":0,"publishedAt":"2018-05-31T02:52:52.211Z"},"quantity":1,"productOptionId":"5b0f63ce885d60492fba3e17","productOption":{"name":"3 Bottles","_id":"5b0f63ce885d60492fba3e17","maxQuantity":1,"price":5,"inventoryPolicy":"unlimited"},"price":5}],"credit":0}
     */

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static class Order {
        /**
         * __remark : mock order created by Order.preview
         * customer : 5b0fb92620f931129a8ec022
         * store : 57c4ed03cc4f36bc2c12ab29
         * shoppingMall : 5adedc43de3c90022eb25d3b
         * shippingAddress : {"__v":0,"_id":"5b175984f0ed7c2c42945328","address":"克拉克学校","city":"天津市","cityId":"120100","country":"CHN","createdAt":"2018-06-06T03:48:20.320Z","district":"河东区","districtId":"120102","lastUsedAt":"2018-06-06T03:48:20.316Z","mobilePhone":"13537284037","mobilePhoneCountry":"CHN","name":"爸爸","province":"天津","provinceId":"120000","street":"大王庄街道","streetId":"120102001","updatedAt":"2018-06-06T03:48:20.320Z","user":"5b0fb92620f931129a8ec022"}
         * shippingType : regular
         * shippingCost : 0
         * discount : 0
         * subtotal : 5
         * totalCost : 5
         * items : [{"name":"White wine","productId":"5b0f63c7885d60492fba3e13","product":{"name":"White wine","description":"","metaDescription":"","weixinShareTitle":"","weixinShareDescription":"","ratingTotal":{"positive":0,"moderate":0,"negative":0},"purchased":0,"maxQuantity":1,"gallery":[],"reviewCount":0,"_id":"5b0f63c7885d60492fba3e13","createdAt":"2018-05-31T02:53:59.089Z","updatedAt":"2018-06-06T03:40:00.239Z","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-thumb.jpg"},"original":{"width":320,"height":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc.","size":5140,"format":"JPEG","colorspace":"RGB","orientation":""}},"price":0,"isDiscounted":false,"originalPrice":0,"status":"published","isArchived":false,"inventoryPolicy":"limited","shippingType":"default","type":"default","store":"57c4ed03cc4f36bc2c12ab29","customOrderFields":[],"shippingCosts":[{"_id":"5b0f63ce885d60492fba3e19","price":0,"country":"CHN"}],"inOrders":[],"productOptions":[{"name":"1 Bottle","_id":"5b0f63ce885d60492fba3e18","maxQuantity":1,"price":2,"inventoryPolicy":"unlimited"},{"name":"3 Bottles","_id":"5b0f63ce885d60492fba3e17","maxQuantity":1,"price":5,"inventoryPolicy":"unlimited"}],"slug":"S1kCmJ6km","__v":0,"publishedAt":"2018-05-31T02:52:52.211Z"},"quantity":1,"productOptionId":"5b0f63ce885d60492fba3e17","productOption":{"name":"3 Bottles","_id":"5b0f63ce885d60492fba3e17","maxQuantity":1,"price":5,"inventoryPolicy":"unlimited"},"price":5}]
         * credit : 0
         */

        private String __remark;
        private String customer;
        private String store;
        private String shoppingMall;
        private ShippingAddress shippingAddress;
        private String shippingType;
        private int shippingCost;
        private int discount;
        private int subtotal;
        private int totalCost;
        private int credit;
        private List<Items> items;

        public String get__remark() {
            return __remark;
        }

        public void set__remark(String __remark) {
            this.__remark = __remark;
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

        public String getStore() {
            return store;
        }

        public void setStore(String store) {
            this.store = store;
        }

        public String getShoppingMall() {
            return shoppingMall;
        }

        public void setShoppingMall(String shoppingMall) {
            this.shoppingMall = shoppingMall;
        }

        public ShippingAddress getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public String getShippingType() {
            return shippingType;
        }

        public void setShippingType(String shippingType) {
            this.shippingType = shippingType;
        }

        public int getShippingCost() {
            return shippingCost;
        }

        public void setShippingCost(int shippingCost) {
            this.shippingCost = shippingCost;
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

        public int getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(int totalCost) {
            this.totalCost = totalCost;
        }

        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public List<Items> getItems() {
            return items;
        }

        public void setItems(List<Items> items) {
            this.items = items;
        }

        public static class ShippingAddress {
            /**
             * __v : 0
             * _id : 5b175984f0ed7c2c42945328
             * address : 克拉克学校
             * city : 天津市
             * cityId : 120100
             * country : CHN
             * createdAt : 2018-06-06T03:48:20.320Z
             * district : 河东区
             * districtId : 120102
             * lastUsedAt : 2018-06-06T03:48:20.316Z
             * mobilePhone : 13537284037
             * mobilePhoneCountry : CHN
             * name : 爸爸
             * province : 天津
             * provinceId : 120000
             * street : 大王庄街道
             * streetId : 120102001
             * updatedAt : 2018-06-06T03:48:20.320Z
             * user : 5b0fb92620f931129a8ec022
             */

            private int __v;
            private String _id;
            private String address;
            private String city;
            private String cityId;
            private String country;
            private String createdAt;
            private String district;
            private String districtId;
            private String lastUsedAt;
            private String mobilePhone;
            private String mobilePhoneCountry;
            private String name;
            private String province;
            private String provinceId;
            private String street;
            private String streetId;
            private String updatedAt;
            private String user;

            public int get__v() {
                return __v;
            }

            public void set__v(int __v) {
                this.__v = __v;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

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

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
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

            public String getLastUsedAt() {
                return lastUsedAt;
            }

            public void setLastUsedAt(String lastUsedAt) {
                this.lastUsedAt = lastUsedAt;
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

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getUser() {
                return user;
            }

            public void setUser(String user) {
                this.user = user;
            }
        }

        public static class Items {
            /**
             * name : White wine
             * productId : 5b0f63c7885d60492fba3e13
             * product : {"name":"White wine","description":"","metaDescription":"","weixinShareTitle":"","weixinShareDescription":"","ratingTotal":{"positive":0,"moderate":0,"negative":0},"purchased":0,"maxQuantity":1,"gallery":[],"reviewCount":0,"_id":"5b0f63c7885d60492fba3e13","createdAt":"2018-05-31T02:53:59.089Z","updatedAt":"2018-06-06T03:40:00.239Z","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-thumb.jpg"},"original":{"width":320,"height":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc.","size":5140,"format":"JPEG","colorspace":"RGB","orientation":""}},"price":0,"isDiscounted":false,"originalPrice":0,"status":"published","isArchived":false,"inventoryPolicy":"limited","shippingType":"default","type":"default","store":"57c4ed03cc4f36bc2c12ab29","customOrderFields":[],"shippingCosts":[{"_id":"5b0f63ce885d60492fba3e19","price":0,"country":"CHN"}],"inOrders":[],"productOptions":[{"name":"1 Bottle","_id":"5b0f63ce885d60492fba3e18","maxQuantity":1,"price":2,"inventoryPolicy":"unlimited"},{"name":"3 Bottles","_id":"5b0f63ce885d60492fba3e17","maxQuantity":1,"price":5,"inventoryPolicy":"unlimited"}],"slug":"S1kCmJ6km","__v":0,"publishedAt":"2018-05-31T02:52:52.211Z"}
             * quantity : 1
             * productOptionId : 5b0f63ce885d60492fba3e17
             * productOption : {"name":"3 Bottles","_id":"5b0f63ce885d60492fba3e17","maxQuantity":1,"price":5,"inventoryPolicy":"unlimited"}
             * price : 5
             */

            private String name;
            private String productId;
            private Product product;
            private int quantity;
            private String productOptionId;
            private ProductOption productOption;
            private int price;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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

            public String getProductOptionId() {
                return productOptionId;
            }

            public void setProductOptionId(String productOptionId) {
                this.productOptionId = productOptionId;
            }

            public ProductOption getProductOption() {
                return productOption;
            }

            public void setProductOption(ProductOption productOption) {
                this.productOption = productOption;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public static class Product {
                /**
                 * name : White wine
                 * description :
                 * metaDescription :
                 * weixinShareTitle :
                 * weixinShareDescription :
                 * ratingTotal : {"positive":0,"moderate":0,"negative":0}
                 * purchased : 0
                 * maxQuantity : 1
                 * gallery : []
                 * reviewCount : 0
                 * _id : 5b0f63c7885d60492fba3e13
                 * createdAt : 2018-05-31T02:53:59.089Z
                 * updatedAt : 2018-06-06T03:40:00.239Z
                 * image : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-thumb.jpg"},"original":{"width":320,"height":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc.","size":5140,"format":"JPEG","colorspace":"RGB","orientation":""}}
                 * price : 0
                 * isDiscounted : false
                 * originalPrice : 0
                 * status : published
                 * isArchived : false
                 * inventoryPolicy : limited
                 * shippingType : default
                 * type : default
                 * store : 57c4ed03cc4f36bc2c12ab29
                 * customOrderFields : []
                 * shippingCosts : [{"_id":"5b0f63ce885d60492fba3e19","price":0,"country":"CHN"}]
                 * inOrders : []
                 * productOptions : [{"name":"1 Bottle","_id":"5b0f63ce885d60492fba3e18","maxQuantity":1,"price":2,"inventoryPolicy":"unlimited"},{"name":"3 Bottles","_id":"5b0f63ce885d60492fba3e17","maxQuantity":1,"price":5,"inventoryPolicy":"unlimited"}]
                 * slug : S1kCmJ6km
                 * __v : 0
                 * publishedAt : 2018-05-31T02:52:52.211Z
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
                private String createdAt;
                private String updatedAt;
                private Image image;
                private int price;
                private boolean isDiscounted;
                private int originalPrice;
                private String status;
                private boolean isArchived;
                private String inventoryPolicy;
                private String shippingType;
                private String type;
                private String store;
                private String slug;
                private int __v;
                private String publishedAt;
                private List<?> gallery;
                private List<?> customOrderFields;
                private List<ShippingCosts> shippingCosts;
                private List<?> inOrders;
                private List<ProductOptions> productOptions;

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

                public Image getImage() {
                    return image;
                }

                public void setImage(Image image) {
                    this.image = image;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public boolean isIsDiscounted() {
                    return isDiscounted;
                }

                public void setIsDiscounted(boolean isDiscounted) {
                    this.isDiscounted = isDiscounted;
                }

                public int getOriginalPrice() {
                    return originalPrice;
                }

                public void setOriginalPrice(int originalPrice) {
                    this.originalPrice = originalPrice;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public boolean isIsArchived() {
                    return isArchived;
                }

                public void setIsArchived(boolean isArchived) {
                    this.isArchived = isArchived;
                }

                public String getInventoryPolicy() {
                    return inventoryPolicy;
                }

                public void setInventoryPolicy(String inventoryPolicy) {
                    this.inventoryPolicy = inventoryPolicy;
                }

                public String getShippingType() {
                    return shippingType;
                }

                public void setShippingType(String shippingType) {
                    this.shippingType = shippingType;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getStore() {
                    return store;
                }

                public void setStore(String store) {
                    this.store = store;
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

                public String getPublishedAt() {
                    return publishedAt;
                }

                public void setPublishedAt(String publishedAt) {
                    this.publishedAt = publishedAt;
                }

                public List<?> getGallery() {
                    return gallery;
                }

                public void setGallery(List<?> gallery) {
                    this.gallery = gallery;
                }

                public List<?> getCustomOrderFields() {
                    return customOrderFields;
                }

                public void setCustomOrderFields(List<?> customOrderFields) {
                    this.customOrderFields = customOrderFields;
                }

                public List<ShippingCosts> getShippingCosts() {
                    return shippingCosts;
                }

                public void setShippingCosts(List<ShippingCosts> shippingCosts) {
                    this.shippingCosts = shippingCosts;
                }

                public List<?> getInOrders() {
                    return inOrders;
                }

                public void setInOrders(List<?> inOrders) {
                    this.inOrders = inOrders;
                }

                public List<ProductOptions> getProductOptions() {
                    return productOptions;
                }

                public void setProductOptions(List<ProductOptions> productOptions) {
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
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg
                     * large : {"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-large.jpg"}
                     * medium : {"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg"}
                     * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-thumb.jpg"}
                     * original : {"width":320,"height":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc.","size":5140,"format":"JPEG","colorspace":"RGB","orientation":""}
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
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-large.jpg
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
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-medium.jpg
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
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc-thumb.jpg
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
                         * width : 320
                         * height : 320
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/6d6090d9-88f6-498f-9cc0-187b284c69fc.
                         * size : 5140
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

                public static class ShippingCosts {
                    /**
                     * _id : 5b0f63ce885d60492fba3e19
                     * price : 0
                     * country : CHN
                     */

                    private String _id;
                    private int price;
                    private String country;

                    public String get_id() {
                        return _id;
                    }

                    public void set_id(String _id) {
                        this._id = _id;
                    }

                    public int getPrice() {
                        return price;
                    }

                    public void setPrice(int price) {
                        this.price = price;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }
                }

                public static class ProductOptions {
                    /**
                     * name : 1 Bottle
                     * _id : 5b0f63ce885d60492fba3e18
                     * maxQuantity : 1
                     * price : 2
                     * inventoryPolicy : unlimited
                     */

                    private String name;
                    private String _id;
                    private int maxQuantity;
                    private int price;
                    private String inventoryPolicy;

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

                    public int getMaxQuantity() {
                        return maxQuantity;
                    }

                    public void setMaxQuantity(int maxQuantity) {
                        this.maxQuantity = maxQuantity;
                    }

                    public int getPrice() {
                        return price;
                    }

                    public void setPrice(int price) {
                        this.price = price;
                    }

                    public String getInventoryPolicy() {
                        return inventoryPolicy;
                    }

                    public void setInventoryPolicy(String inventoryPolicy) {
                        this.inventoryPolicy = inventoryPolicy;
                    }
                }
            }

            public static class ProductOption {
                /**
                 * name : 3 Bottles
                 * _id : 5b0f63ce885d60492fba3e17
                 * maxQuantity : 1
                 * price : 5
                 * inventoryPolicy : unlimited
                 */

                private String name;
                private String _id;
                private int maxQuantity;
                private int price;
                private String inventoryPolicy;

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

                public int getMaxQuantity() {
                    return maxQuantity;
                }

                public void setMaxQuantity(int maxQuantity) {
                    this.maxQuantity = maxQuantity;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public String getInventoryPolicy() {
                    return inventoryPolicy;
                }

                public void setInventoryPolicy(String inventoryPolicy) {
                    this.inventoryPolicy = inventoryPolicy;
                }
            }
        }
    }
}
