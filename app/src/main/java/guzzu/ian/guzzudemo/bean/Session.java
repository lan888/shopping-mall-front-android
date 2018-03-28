package guzzu.ian.guzzudemo.bean;

import java.util.List;

/**
 * Created by Ian on 2018/3/12.
 */

public class Session {

    /**
     * _id : 5aa62e6a82859d27cc6a40be
     * user : {"_id":"5aa0fc20104b1e386775e3a1","name":"Ian Chan","email":"ian@guzzu.com","password":"$2a$10$SxmLpuN5BcLvnoL.DYOJ9.NlyCi/Yvxu6CgTmOArMKolNXT37Vi.C","isMpAdmin":true,"isMasterAdmin":true,"image":{"url":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJ8RXRYEvkls4AI3ViaZUCLpF9uwzpGbfm2U8AOV3d6WELZxD9HOwv5Av9ibN22Sib83bmQCo9udCukw/0"},"updatedAt":"2018-03-08T09:05:19.281Z","createdAt":"2017-10-11T01:39:08.662Z","mobilePhone":""}
     * clientType : pos
     * expireAt : 2018-03-12T08:38:18.278Z
     * ip : 119.128.145.161
     * host : mp-dev.guzzu.cn
     * createdAt : 2018-03-12T07:38:18.074Z
     * __v : 0
     * __guzzuSession : true
     * accessRights : [{"_id":"5aa0fc8182859d27cc6a4013","createdAt":"2018-03-08T09:04:01.714Z","updatedAt":"2018-03-08T09:04:01.714Z","store":{"_id":"57c4ed03cc4f36bc2c12ab29","name":{"zh":"测试店铺","en":"Guzzu Test Store (dev)"},"slug":"store1","logo":{"original":{"orientation":"","colorspace":"RGB","format":"PNG","size":17408,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413.png","height":512,"width":512},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg"},"primaryLanguage":"en"},"role":"StoreAdmin","__v":0,"permissions":["Product.view","Product.update","Product.create","Product.remove","Order.view","Order.update","Transaction.view","Store.view","Store.update","StoreOperator.view","StoreOperator.create","StoreOperator.update","StoreOperator.remove","Group.view","Group.create","Group.update","Group.remove","Discount.view","Discount.create","Discount.update","Discount.remove","Affiliate.view","Affiliate.create","Affiliate.update","Affiliate.remove","ShippingRateTable.view","ShippingRateTable.create","ShippingRateTable.update","ShippingRateTable.remove","ShippingDescription.view","ShippingDescription.create","ShippingDescription.update","ShippingDescription.remove","ProductSpec.view","ProductSpec.create","ProductSpec.update","ProductSpec.remove","Customer.view","FundTransferRequest.view","FundTransferRequest.create","PageLayout.view","PageLayout.create","PageLayout.update","PageLayout.remove","OrderReport.view","PickUpPlace.view","PickUpPlace.create","PickUpPlace.update","PickUpPlace.remove","AreaShipping.view","AreaShipping.create","AreaShipping.update","AreaShipping.remove"]}]
     */

    private String _id;
    private UserBean user;
    private String clientType;
    private String expireAt;
    private String ip;
    private String host;
    private String createdAt;
    private int __v;
    private boolean __guzzuSession;
    private List<AccessRightsBean> accessRights;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

    public boolean is__guzzuSession() {
        return __guzzuSession;
    }

    public void set__guzzuSession(boolean __guzzuSession) {
        this.__guzzuSession = __guzzuSession;
    }

    public List<AccessRightsBean> getAccessRights() {
        return accessRights;
    }

    public void setAccessRights(List<AccessRightsBean> accessRights) {
        this.accessRights = accessRights;
    }

    public static class UserBean {
        /**
         * _id : 5aa0fc20104b1e386775e3a1
         * name : Ian Chan
         * email : ian@guzzu.com
         * password : $2a$10$SxmLpuN5BcLvnoL.DYOJ9.NlyCi/Yvxu6CgTmOArMKolNXT37Vi.C
         * isMpAdmin : true
         * isMasterAdmin : true
         * image : {"url":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJ8RXRYEvkls4AI3ViaZUCLpF9uwzpGbfm2U8AOV3d6WELZxD9HOwv5Av9ibN22Sib83bmQCo9udCukw/0"}
         * updatedAt : 2018-03-08T09:05:19.281Z
         * createdAt : 2017-10-11T01:39:08.662Z
         * mobilePhone :
         */

        private String _id;
        private String name;
        private String email;
        private String password;
        private boolean isMpAdmin;
        private boolean isMasterAdmin;
        private ImageBean image;
        private String updatedAt;
        private String createdAt;
        private String mobilePhone;

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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean isIsMpAdmin() {
            return isMpAdmin;
        }

        public void setIsMpAdmin(boolean isMpAdmin) {
            this.isMpAdmin = isMpAdmin;
        }

        public boolean isIsMasterAdmin() {
            return isMasterAdmin;
        }

        public void setIsMasterAdmin(boolean isMasterAdmin) {
            this.isMasterAdmin = isMasterAdmin;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
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

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public static class ImageBean {
            /**
             * url : http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJ8RXRYEvkls4AI3ViaZUCLpF9uwzpGbfm2U8AOV3d6WELZxD9HOwv5Av9ibN22Sib83bmQCo9udCukw/0
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class AccessRightsBean {
        /**
         * _id : 5aa0fc8182859d27cc6a4013
         * createdAt : 2018-03-08T09:04:01.714Z
         * updatedAt : 2018-03-08T09:04:01.714Z
         * store : {"_id":"57c4ed03cc4f36bc2c12ab29","name":{"zh":"测试店铺","en":"Guzzu Test Store (dev)"},"slug":"store1","logo":{"original":{"orientation":"","colorspace":"RGB","format":"PNG","size":17408,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413.png","height":512,"width":512},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg"},"primaryLanguage":"en"}
         * role : StoreAdmin
         * __v : 0
         * permissions : ["Product.view","Product.update","Product.create","Product.remove","Order.view","Order.update","Transaction.view","Store.view","Store.update","StoreOperator.view","StoreOperator.create","StoreOperator.update","StoreOperator.remove","Group.view","Group.create","Group.update","Group.remove","Discount.view","Discount.create","Discount.update","Discount.remove","Affiliate.view","Affiliate.create","Affiliate.update","Affiliate.remove","ShippingRateTable.view","ShippingRateTable.create","ShippingRateTable.update","ShippingRateTable.remove","ShippingDescription.view","ShippingDescription.create","ShippingDescription.update","ShippingDescription.remove","ProductSpec.view","ProductSpec.create","ProductSpec.update","ProductSpec.remove","Customer.view","FundTransferRequest.view","FundTransferRequest.create","PageLayout.view","PageLayout.create","PageLayout.update","PageLayout.remove","OrderReport.view","PickUpPlace.view","PickUpPlace.create","PickUpPlace.update","PickUpPlace.remove","AreaShipping.view","AreaShipping.create","AreaShipping.update","AreaShipping.remove"]
         */

        private String _id;
        private String createdAt;
        private String updatedAt;
        private StoreBean store;
        private String role;
        private int __v;
        private List<String> permissions;

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

        public StoreBean getStore() {
            return store;
        }

        public void setStore(StoreBean store) {
            this.store = store;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public List<String> getPermissions() {
            return permissions;
        }

        public void setPermissions(List<String> permissions) {
            this.permissions = permissions;
        }

        public static class StoreBean {
            /**
             * _id : 57c4ed03cc4f36bc2c12ab29
             * name : {"zh":"测试店铺","en":"Guzzu Test Store (dev)"}
             * slug : store1
             * logo : {"original":{"orientation":"","colorspace":"RGB","format":"PNG","size":17408,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413.png","height":512,"width":512},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg"}
             * primaryLanguage : en
             */

            private String _id;
            private NameBean name;
            private String slug;
            private LogoBean logo;
            private String primaryLanguage;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public NameBean getName() {
                return name;
            }

            public void setName(NameBean name) {
                this.name = name;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public LogoBean getLogo() {
                return logo;
            }

            public void setLogo(LogoBean logo) {
                this.logo = logo;
            }

            public String getPrimaryLanguage() {
                return primaryLanguage;
            }

            public void setPrimaryLanguage(String primaryLanguage) {
                this.primaryLanguage = primaryLanguage;
            }

            public static class NameBean {
                /**
                 * zh : 测试店铺
                 * en : Guzzu Test Store (dev)
                 */

                private String zh;
                private String en;

                public String getZh() {
                    return zh;
                }

                public void setZh(String zh) {
                    this.zh = zh;
                }

                public String getEn() {
                    return en;
                }

                public void setEn(String en) {
                    this.en = en;
                }
            }

            public static class LogoBean {
                /**
                 * original : {"orientation":"","colorspace":"RGB","format":"PNG","size":17408,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413.png","height":512,"width":512}
                 * thumb : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"}
                 * medium : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"}
                 * large : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"}
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg
                 */

                private OriginalBean original;
                private ThumbBean thumb;
                private MediumBean medium;
                private LargeBean large;
                private String url;

                public OriginalBean getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalBean original) {
                    this.original = original;
                }

                public ThumbBean getThumb() {
                    return thumb;
                }

                public void setThumb(ThumbBean thumb) {
                    this.thumb = thumb;
                }

                public MediumBean getMedium() {
                    return medium;
                }

                public void setMedium(MediumBean medium) {
                    this.medium = medium;
                }

                public LargeBean getLarge() {
                    return large;
                }

                public void setLarge(LargeBean large) {
                    this.large = large;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class OriginalBean {
                    /**
                     * orientation :
                     * colorspace : RGB
                     * format : PNG
                     * size : 17408
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413.png
                     * height : 512
                     * width : 512
                     */

                    private String orientation;
                    private String colorspace;
                    private String format;
                    private int size;
                    private String url;
                    private int height;
                    private int width;

                    public String getOrientation() {
                        return orientation;
                    }

                    public void setOrientation(String orientation) {
                        this.orientation = orientation;
                    }

                    public String getColorspace() {
                        return colorspace;
                    }

                    public void setColorspace(String colorspace) {
                        this.colorspace = colorspace;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }

                    public int getSize() {
                        return size;
                    }

                    public void setSize(int size) {
                        this.size = size;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }
                }

                public static class ThumbBean {
                    /**
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-thumb.jpg
                     * maxHeight : 320
                     * height : 320
                     * width : 320
                     * format : jpg
                     * aspect : 1:1
                     */

                    private String url;
                    private int maxHeight;
                    private int height;
                    private int width;
                    private String format;
                    private String aspect;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getMaxHeight() {
                        return maxHeight;
                    }

                    public void setMaxHeight(int maxHeight) {
                        this.maxHeight = maxHeight;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }

                    public String getAspect() {
                        return aspect;
                    }

                    public void setAspect(String aspect) {
                        this.aspect = aspect;
                    }
                }

                public static class MediumBean {
                    /**
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg
                     * maxHeight : 780
                     * maxWidth : 780
                     * height : 780
                     * width : 780
                     * format : jpg
                     */

                    private String url;
                    private int maxHeight;
                    private int maxWidth;
                    private int height;
                    private int width;
                    private String format;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getMaxHeight() {
                        return maxHeight;
                    }

                    public void setMaxHeight(int maxHeight) {
                        this.maxHeight = maxHeight;
                    }

                    public int getMaxWidth() {
                        return maxWidth;
                    }

                    public void setMaxWidth(int maxWidth) {
                        this.maxWidth = maxWidth;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }
                }

                public static class LargeBean {
                    /**
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-large.jpg
                     * maxHeight : 1040
                     * maxWidth : 1040
                     * height : 1040
                     * width : 1040
                     * format : jpg
                     */

                    private String url;
                    private int maxHeight;
                    private int maxWidth;
                    private int height;
                    private int width;
                    private String format;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getMaxHeight() {
                        return maxHeight;
                    }

                    public void setMaxHeight(int maxHeight) {
                        this.maxHeight = maxHeight;
                    }

                    public int getMaxWidth() {
                        return maxWidth;
                    }

                    public void setMaxWidth(int maxWidth) {
                        this.maxWidth = maxWidth;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }
                }
            }
        }
    }
}
