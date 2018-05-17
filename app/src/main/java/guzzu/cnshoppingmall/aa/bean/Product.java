package guzzu.cnshoppingmall.aa.bean;

import java.util.List;

public class Product {
    /**
     * name : Pendant
     * _id : 5a0a864757106269062871a4
     * createdAt : 2017-11-14T05:59:35.048Z
     * updatedAt : 2017-12-11T03:38:54.294Z
     * image : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-thumb.jpg"},"original":{"width":500,"height":500,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc.jpg","size":13824,"format":"JPEG","colorspace":"RGB","orientation":""}}
     * price : 199900
     * status : published
     * isArchived : false
     * inventoryPolicy : limited
     * maxQuantity : 1
     * metaDescription : {"en":"","zh":""}
     * weixinShareTitle : {"en":"","zh":""}
     * shippingType : default
     * publishedAt : 2017-11-14T05:59:47.284Z
     * type : default
     * store : 5a0a6536571062690628715a
     * ratingTotal : {"negative":0,"moderate":0,"positive":0}
     * reviewCount : 0
     * shippingCosts : [{"_id":"5a13cad260abf4068040205a","price":0,"country":"CHN"}]
     * productOptions : [{"_id":"5a13cad260abf40680402059","price":19900,"name":{"zh":"绾㈣壊","en":"绾㈣壊"},"inventoryPolicy":"unlimited"},{"_id":"5a13cad260abf40680402058","price":0,"name":{"zh":"榛勮壊","en":"榛勮壊"},"inventoryPolicy":"unlimited"},{"_id":"5a13cad260abf40680402057","price":0,"name":{"zh":"缁胯壊","en":"缁胯壊"},"inventoryPolicy":"unlimited"},{"_id":"5a13cad260abf40680402056","price":0,"name":{"zh":"钃濊壊","en":"钃濊壊"},"inventoryPolicy":"unlimited"},{"_id":"5a13cad260abf40680402055","price":0,"name":{"zh":"鐧借壊","en":"鐧借壊"},"inventoryPolicy":"unlimited"},{"_id":"5a13cad260abf40680402054","price":0,"name":{"zh":"閲戣壊","en":"閲戣壊"},"inventoryPolicy":"unlimited"}]
     * gallery : [{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-thumb.jpg"},"original":{"width":500,"height":500,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc.jpg","size":13824,"format":"JPEG","colorspace":"RGB","orientation":""}}]
     * slug : rJJIUZu1z
     * __v : 0
     * description : {"en":"<p>绾墜宸ユ墦纾�<\/p>\n<p>璁捐鑷繁鐙竴鏃犱簩鐨勯楗�<\/p>\n<p>&nbsp;<\/p>\n<p>&nbsp;<\/p>","zh":"<p>绾墜宸ユ墦纾�<\/p>\n<p>璁捐鑷繁鐙竴鏃犱簩鐨勯楗�<\/p>\n<p>&nbsp;<\/p>\n<p>&nbsp;<\/p>"}
     * weixinShareDescription : {"en":"","zh":""}
     * _modelName : Product
     * useProductOptions : false
     * tagline :
     */

    private String name;
    private String _id;
    private String createdAt;
    private String updatedAt;
    private Image image;
    private int price;
    private String status;
    private boolean isArchived;
    private String inventoryPolicy;
    private int maxQuantity;
    private String metaDescription;
    private String weixinShareTitle;
    private String shippingType;
    private String publishedAt;
    private String type;
    private String store;
    private RatingTotal ratingTotal;
    private int reviewCount;
    private String slug;
    private int __v;
    private String description;
    private String weixinShareDescription;
    private String _modelName;
    private boolean useProductOptions;
    private String tagline;
    private List<ShippingCosts> shippingCosts;
    private List<ProductOptions> productOptions;
    private List<Gallery> gallery;

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

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
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

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
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

    public RatingTotal getRatingTotal() {
        return ratingTotal;
    }

    public void setRatingTotal(RatingTotal ratingTotal) {
        this.ratingTotal = ratingTotal;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeixinShareDescription() {
        return weixinShareDescription;
    }

    public void setWeixinShareDescription(String weixinShareDescription) {
        this.weixinShareDescription = weixinShareDescription;
    }

    public String get_modelName() {
        return _modelName;
    }

    public void set_modelName(String _modelName) {
        this._modelName = _modelName;
    }

    public boolean isUseProductOptions() {
        return useProductOptions;
    }

    public void setUseProductOptions(boolean useProductOptions) {
        this.useProductOptions = useProductOptions;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public List<ShippingCosts> getShippingCosts() {
        return shippingCosts;
    }

    public void setShippingCosts(List<ShippingCosts> shippingCosts) {
        this.shippingCosts = shippingCosts;
    }

    public List<ProductOptions> getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(List<ProductOptions> productOptions) {
        this.productOptions = productOptions;
    }

    public List<Gallery> getGallery() {
        return gallery;
    }

    public void setGallery(List<Gallery> gallery) {
        this.gallery = gallery;
    }

    public static class Image {
        /**
         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg
         * large : {"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-large.jpg"}
         * medium : {"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg"}
         * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-thumb.jpg"}
         * original : {"width":500,"height":500,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc.jpg","size":13824,"format":"JPEG","colorspace":"RGB","orientation":""}
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
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-large.jpg
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
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg
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
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-thumb.jpg
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
             * width : 500
             * height : 500
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc.jpg
             * size : 13824
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



    public static class RatingTotal {
        /**
         * negative : 0
         * moderate : 0
         * positive : 0
         */

        private int negative;
        private int moderate;
        private int positive;

        public int getNegative() {
            return negative;
        }

        public void setNegative(int negative) {
            this.negative = negative;
        }

        public int getModerate() {
            return moderate;
        }

        public void setModerate(int moderate) {
            this.moderate = moderate;
        }

        public int getPositive() {
            return positive;
        }

        public void setPositive(int positive) {
            this.positive = positive;
        }
    }



    public static class ShippingCosts {
        /**
         * _id : 5a13cad260abf4068040205a
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
         * _id : 5a13cad260abf40680402059
         * price : 19900
         * name : {"zh":"绾㈣壊","en":"绾㈣壊"}
         * inventoryPolicy : unlimited
         */

        private String _id;
        private int price;
        private String name;
        private String inventoryPolicy;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInventoryPolicy() {
            return inventoryPolicy;
        }

        public void setInventoryPolicy(String inventoryPolicy) {
            this.inventoryPolicy = inventoryPolicy;
        }

    }

    public static class Gallery {
        /**
         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg
         * large : {"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-large.jpg"}
         * medium : {"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg"}
         * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-thumb.jpg"}
         * original : {"width":500,"height":500,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc.jpg","size":13824,"format":"JPEG","colorspace":"RGB","orientation":""}
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
             * height : 1040
             * maxWidth : 1040
             * maxHeight : 1040
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-large.jpg
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
             * height : 780
             * maxWidth : 780
             * maxHeight : 780
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-medium.jpg
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
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc-thumb.jpg
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
             * width : 500
             * height : 500
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/f9658e39-73c3-4fb2-b30e-833d6783bdfc.jpg
             * size : 13824
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
