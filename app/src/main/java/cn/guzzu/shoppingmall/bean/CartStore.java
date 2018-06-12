package cn.guzzu.shoppingmall.bean;

import java.util.List;
import java.util.Map;

public class CartStore {
    private String storeName;
    private int goodCount;
    private List<CartAll.Items> itemsList;
    private Map<String,Object> storeId;

    public Map<String, Object> getStoreId() {
        return storeId;
    }

    public void setStoreId(Map<String, Object> storeId) {
        this.storeId = storeId;
    }

    public List<CartAll.Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<CartAll.Items> itemsList) {
        this.itemsList = itemsList;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(int goodCount) {
        this.goodCount = goodCount;
    }
}
