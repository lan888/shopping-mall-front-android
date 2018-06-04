package cn.guzzu.shoppingmall.bean;

import java.util.List;

public class Categories {
    /**
     * name : cat 2 (ZH)
     * description : test category1111
     * metaDescription : meta Descss
     * weixinShareTitle : wx Shareddd
     * weixinShareDescription : wx Descddd
     * products : ["59b61445c9c4207fefe04250","5ad0734930d1bc72cce21d1d","59ad3483424cd95c1062d43e","59ad2f28424cd95c1062d439"]
     * tabIndex : 0
     * slug : rkuFiwT3G
     * _id : 5adfeb7faebff0204ed7b910
     * shoppingMall : 5adedc43de3c90022eb25d3b
     * image : {"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":29082,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d.jpg","height":377,"width":600},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-thumb.jpg","maxHeight":320,"height":320,"width":321,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-medium.jpg","maxHeight":780,"maxWidth":780,"height":490,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-large.jpg","maxHeight":1040,"maxWidth":1040,"height":653,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-medium.jpg"}
     * updatedAt : 2018-04-28T01:50:41.950Z
     * createdAt : 2018-04-25T02:44:15.748Z
     * __v : 109
     * _modelName : ShoppingMallCategory
     */

    private String name;
    private String description;
    private String metaDescription;
    private String weixinShareTitle;
    private String weixinShareDescription;
    private int tabIndex;
    private String slug;
    private String _id;
    private String shoppingMall;
    private Image image;
    private String updatedAt;
    private String createdAt;
    private int __v;
    private String _modelName;
    private List<String> products;

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

    public int getTabIndex() {
        return tabIndex;
    }

    public void setTabIndex(int tabIndex) {
        this.tabIndex = tabIndex;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getShoppingMall() {
        return shoppingMall;
    }

    public void setShoppingMall(String shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
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

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public String get_modelName() {
        return _modelName;
    }

    public void set_modelName(String _modelName) {
        this._modelName = _modelName;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public static class Image {
        /**
         * original : {"orientation":"","colorspace":"RGB","format":"JPEG","size":29082,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d.jpg","height":377,"width":600}
         * thumb : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-thumb.jpg","maxHeight":320,"height":320,"width":321,"format":"jpg","aspect":"1:1"}
         * medium : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-medium.jpg","maxHeight":780,"maxWidth":780,"height":490,"width":780,"format":"jpg"}
         * large : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-large.jpg","maxHeight":1040,"maxWidth":1040,"height":653,"width":1040,"format":"jpg"}
         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-medium.jpg
         */

        private Original original;
        private Thumb thumb;
        private Medium medium;
        private Large large;
        private String url;

        public Original getOriginal() {
            return original;
        }

        public void setOriginal(Original original) {
            this.original = original;
        }

        public Thumb getThumb() {
            return thumb;
        }

        public void setThumb(Thumb thumb) {
            this.thumb = thumb;
        }

        public Medium getMedium() {
            return medium;
        }

        public void setMedium(Medium medium) {
            this.medium = medium;
        }

        public Large getLarge() {
            return large;
        }

        public void setLarge(Large large) {
            this.large = large;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public static class Original {
            /**
             * orientation :
             * colorspace : RGB
             * format : JPEG
             * size : 29082
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d.jpg
             * height : 377
             * width : 600
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

        public static class Thumb {
            /**
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-thumb.jpg
             * maxHeight : 320
             * height : 320
             * width : 321
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

        public static class Medium {
            /**
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-medium.jpg
             * maxHeight : 780
             * maxWidth : 780
             * height : 490
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

        public static class Large {
            /**
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/68ef79a8-bb26-4a94-a810-4b58efab596d-large.jpg
             * maxHeight : 1040
             * maxWidth : 1040
             * height : 653
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
