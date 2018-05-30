package guzzu.cnshoppingmall.aa.bean;

public class FragmentChangeEvent {
    //判断商品顶部页
    private boolean isShow = false;
    private boolean isDetailShow = false;
    //用来给viewpager判断scroll
    private int dy;



    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public boolean isDetailShow() {
        return isDetailShow;
    }

    public void setDetailShow(boolean detailShow) {
        isDetailShow = detailShow;
    }
}
