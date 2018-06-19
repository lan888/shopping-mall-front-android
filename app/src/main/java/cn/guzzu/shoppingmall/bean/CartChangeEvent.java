package cn.guzzu.shoppingmall.bean;

import java.util.List;

public class CartChangeEvent {
    private int count;
    private List<String> itemId;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getItemId() {
        return itemId;
    }

    public void setItemId(List<String> itemId) {
        this.itemId = itemId;
    }
}
