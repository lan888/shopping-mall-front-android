package cn.guzzu.shoppingmall.bean;

public class ProductItem {
    private String name;
    private String productId;
    private int quantity;
    private int price;
    private product product;
    private productOption productOption;
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
