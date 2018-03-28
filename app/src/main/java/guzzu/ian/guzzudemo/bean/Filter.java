package guzzu.ian.guzzudemo.bean;

/**
 * Created by Ian on 2018/3/12.
 */

public class Filter {
    private int page;
    private int pageSize;
    private String sort;
    private String storeId;
    private Filters filters;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public static class Filters{
        private String type;
        private String status;
        private String shippingStatus;
        private isArchived isArchived;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public isArchived getIsArchived() {
            return isArchived;
        }

        public void setIsArchived(isArchived isArchived) {
            this.isArchived = isArchived;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getShippingStatus() {
            return shippingStatus;
        }

        public void setShippingStatus(String shippingStatus) {
            this.shippingStatus = shippingStatus;
        }

        public static class isArchived{
            private boolean $ne;

            public boolean is$ne() {
                return $ne;
            }

            public void set$ne(boolean $ne) {
                this.$ne = $ne;
            }
        }
    }

}
