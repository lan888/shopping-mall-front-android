package cn.guzzu.shoppingmall.bean;

public class WxPayEvent {
    private boolean isPaid;

    public WxPayEvent(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
