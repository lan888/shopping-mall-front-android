package cn.guzzu.shoppingmall.bean;

import java.util.List;

public class BlockBanner {

    /**
     * items : [{"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":84480,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-medium.jpg"},"linkType":"product","product":"5a0a864757106269062871a4"},{"title":{"en":""}}]
     * type : banner
     * template : swiper
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
         * image : {"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":84480,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-medium.jpg"}
         * linkType : product
         * product : 5a0a864757106269062871a4
         * title : {"en":""}
         */

        private Image image;
        private String linkType;
        private String category;
        private String product;
        private String store;
        private String title;

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

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getStore() {
            return store;
        }

        public void setStore(String store) {
            this.store = store;
        }

        public static class Image {
            /**
             * original : {"orientation":"","colorspace":"RGB","format":"JPEG","size":84480,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee.jpg","height":800,"width":800}
             * thumb : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"}
             * medium : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"}
             * large : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"}
             * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-medium.jpg
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
                 * size : 84480
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee.jpg
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
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-thumb.jpg
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
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-medium.jpg
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
                 * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a1d55db2-a0ab-4fed-befd-d3ee962e2eee-large.jpg
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
