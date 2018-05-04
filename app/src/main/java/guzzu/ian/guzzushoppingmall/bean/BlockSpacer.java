package guzzu.ian.guzzushoppingmall.bean;

import java.util.List;

public class BlockSpacer {

    /**
     * items : []
     * type : spacer
     * height : 10
     */

    private String type;
    private int height;
    private List<Items> items;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
    public static class Items {

    }
}
