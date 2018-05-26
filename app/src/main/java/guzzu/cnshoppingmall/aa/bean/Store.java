package guzzu.cnshoppingmall.aa.bean;

public class Store {

    /**
     * _id : 57c4ed03cc4f36bc2c12ab29
     * _modelName : Store
     * name : 娴嬭瘯搴楅摵
     * slug : store1
     * logo : {"original":{"orientation":"","colorspace":"RGB","format":"PNG","size":17408,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413.png","height":512,"width":512},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg"}
     * status : published
     */

    private String _id;
    private String _modelName;
    private String name;
    private String slug;
    private Logo logo;
    private String status;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_modelName() {
        return _modelName;
    }

    public void set_modelName(String _modelName) {
        this._modelName = _modelName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Logo {
        /**
         * original : {"orientation":"","colorspace":"RGB","format":"PNG","size":17408,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413.png","height":512,"width":512}
         * thumb : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"}
         * medium : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"}
         * large : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"}
         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29f8068f-f9e5-4c7e-934c-7c076e34a413-medium.jpg
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

        public static class Thumb {
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

        public static class Medium {
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

        public static class Large {
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
