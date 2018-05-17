package guzzu.cnshoppingmall.aa.bean;

import java.io.Serializable;

public class Pages implements Serializable {

    /**
     * pageTitle : store 1
     * tabIndex : 2
     * status : inactive
     * blocks : []
     * _id : 5ae2d4321d91672544510662
     * ShoppingMallPage : 5adedc43de3c90022eb25d3b
     * updatedAt : 2018-04-27T08:41:41.688Z
     * createdAt : 2018-04-27T07:41:38.109Z
     * __v : 2
     * _modelName : ShoppingMallPage
     * tabLabel : sss
     */

    private String pageTitle;
    private int tabIndex;
    private String status;
    private String _id;
    private String shoppingMall;
    private String updatedAt;
    private String createdAt;
    private int __v;
    private String _modelName;
    private String tabLabel;


    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public int getTabIndex() {
        return tabIndex;
    }

    public void setTabIndex(int tabIndex) {
        this.tabIndex = tabIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getShoppingMall() {
        return shoppingMall;
    }

    public void setShoppingMall(String shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public String get_modelName() {
        return _modelName;
    }

    public void set_modelName(String _modelName) {
        this._modelName = _modelName;
    }

    public String getTabLabel() {
        return tabLabel;
    }

    public void setTabLabel(String tabLabel) {
        this.tabLabel = tabLabel;
    }

}
