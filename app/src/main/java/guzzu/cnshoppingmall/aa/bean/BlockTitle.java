package guzzu.cnshoppingmall.aa.bean;

import java.util.List;

public class BlockTitle {

    /**
     * items : [{"title":"a product list","subtitle":"English Subtitle"}]
     * type : title
     * template : left
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
         * title : a product list
         * subtitle : English Subtitle
         */

        private String title;
        private String subtitle;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }
    }
}
