package cn.guzzu.shoppingmall.bean;

import java.util.List;

public class BlockNavGroup {

    /**
     * items : [{"title":"English Title 1","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":151552,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-medium.jpg"},"linkType":"shoppingMallCategory","shoppingMallCategory":"5adfeb7faebff0204ed7b910"},{"title":"English Title 2","image":{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":41779,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/406b7646-1970-42b0-9ec2-f9d24ff5808e.jpg","height":236,"width":237},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/406b7646-1970-42b0-9ec2-f9d24ff5808e-thumb.jpg","maxHeight":320,"height":320,"width":321,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/406b7646-1970-42b0-9ec2-f9d24ff5808e-medium.jpg","maxHeight":780,"maxWidth":780,"height":777,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/406b7646-1970-42b0-9ec2-f9d24ff5808e-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1036,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/406b7646-1970-42b0-9ec2-f9d24ff5808e-medium.jpg"},"linkType":"product","product":"59ad187f424cd95c1062d435"},{"title":"English Title 3","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":156672,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ec321c87-b7ca-46f5-9171-8b7dd19cde26.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ec321c87-b7ca-46f5-9171-8b7dd19cde26-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ec321c87-b7ca-46f5-9171-8b7dd19cde26-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ec321c87-b7ca-46f5-9171-8b7dd19cde26-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ec321c87-b7ca-46f5-9171-8b7dd19cde26-medium.jpg"},"linkType":"store","store":"5ae28860f742da7913107812"}]
     * type : navgroup
     * template : text-only
     */

    private String type;
    private String template;
    private List<Items> items;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public static class Items {
        /**
         * title : English Title 1
         * image : {"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":151552,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-medium.jpg"}
         * linkType : shoppingMallCategory
         * shoppingMallCategory : 5adfeb7faebff0204ed7b910
         * product : 59ad187f424cd95c1062d435
         * store : 5ae28860f742da7913107812
         */

        private String title;
        private Image image;
        private String linkType;
        private String category;
        private String product;
        private String store;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public String getLinkType() {
            return linkType;
        }

        public void setLinkType(String linkType) {
            this.linkType = linkType;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getStore() {
            return store;
        }

        public void setStore(String store) {
            this.store = store;
        }

        public static class Image {
            /**
             * original : {"orientation":"","colorspace":"RGB","format":"JPEG","size":151552,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52.jpg","height":800,"width":800}
             * thumb : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"}
             * medium : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"}
             * large : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"}
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-medium.jpg
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
                 * size : 151552
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52.jpg
                 * height : 800
                 * width : 800
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
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-thumb.jpg
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
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-medium.jpg
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
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/ee29c9e5-6c6b-4a20-a409-9f6f44427f52-large.jpg
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
