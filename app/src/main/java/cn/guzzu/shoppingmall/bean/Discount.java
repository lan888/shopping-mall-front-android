package cn.guzzu.shoppingmall.bean;

import java.util.List;

public class Discount {
    /**
     * name : cp1
     * discountId : 5b053d44152a4b371f5656a6
     * thresholdType : min-purchase
     * condition : {"doFreeShipping":false,"doMoneyOff":false,"doPercentageOff":false,"minPurchase":400,"price":0,"percentage":0,"hasCustomizedItem":false,"_id":"5b053d44152a4b371f5656a7"}
     * description : <p>cp1</p>
     * itemIndexes : [0,1]
     */

    private String name;
    private String discountId;
    private String thresholdType;
    private Condition condition;
    private String description;
    private List<Integer> itemIndexes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getThresholdType() {
        return thresholdType;
    }

    public void setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getItemIndexes() {
        return itemIndexes;
    }

    public void setItemIndexes(List<Integer> itemIndexes) {
        this.itemIndexes = itemIndexes;
    }

    public static class Condition {
        /**
         * doFreeShipping : false
         * doMoneyOff : false
         * doPercentageOff : false
         * minPurchase : 400
         * price : 0
         * percentage : 0
         * hasCustomizedItem : false
         * _id : 5b053d44152a4b371f5656a7
         */

        private boolean doFreeShipping;
        private boolean doMoneyOff;
        private boolean doPercentageOff;
        private int minPurchase;
        private int price;
        private int percentage;
        private boolean hasCustomizedItem;
        private String _id;

        public boolean isDoFreeShipping() {
            return doFreeShipping;
        }

        public void setDoFreeShipping(boolean doFreeShipping) {
            this.doFreeShipping = doFreeShipping;
        }

        public boolean isDoMoneyOff() {
            return doMoneyOff;
        }

        public void setDoMoneyOff(boolean doMoneyOff) {
            this.doMoneyOff = doMoneyOff;
        }

        public boolean isDoPercentageOff() {
            return doPercentageOff;
        }

        public void setDoPercentageOff(boolean doPercentageOff) {
            this.doPercentageOff = doPercentageOff;
        }

        public int getMinPurchase() {
            return minPurchase;
        }

        public void setMinPurchase(int minPurchase) {
            this.minPurchase = minPurchase;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPercentage() {
            return percentage;
        }

        public void setPercentage(int percentage) {
            this.percentage = percentage;
        }

        public boolean isHasCustomizedItem() {
            return hasCustomizedItem;
        }

        public void setHasCustomizedItem(boolean hasCustomizedItem) {
            this.hasCustomizedItem = hasCustomizedItem;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }
    }
}
