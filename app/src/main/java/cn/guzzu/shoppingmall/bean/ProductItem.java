package cn.guzzu.shoppingmall.bean;

import java.io.Serializable;

public class ProductItem implements Serializable{
    private String name;
    private String productId;
    private int quantity;
    private int price;
    private int originalPrice;
    private Image image;
    private String optionName;
    private product product;
    private productOption productOption;
    private boolean productOptionsEnabled;
    private boolean isDiscounted;
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
    public static class product{
        private image image;

        public static class image{
            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public product.image getImage() {
            return image;
        }

        public void setImage(product.image image) {
            this.image = image;
        }
    }
    public static class productOption{
        String _id;
        String name;
        String price;

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

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public boolean isProductOptionsEnabled() {
        return productOptionsEnabled;
    }

    public void setProductOptionsEnabled(boolean productOptionsEnabled) {
        this.productOptionsEnabled = productOptionsEnabled;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public product getProduct() {
        return product;
    }

    public void setProduct(product product) {
        this.product = product;
    }

    public productOption getProductOption() {
        return productOption;
    }

    public void setProductOption(productOption productOption) {
        this.productOption = productOption;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
