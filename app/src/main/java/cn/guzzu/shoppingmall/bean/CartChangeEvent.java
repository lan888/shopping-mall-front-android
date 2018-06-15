package cn.guzzu.shoppingmall.bean;

public class CartChangeEvent {
    private int count;

    public CartChangeEvent(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
