package cn.guzzu.shoppingmall;

public class Api {
    public static final String GUZZU_API = "https://mp-dev.guzzu.cn/v3/frontapi/shopping-malls/5adedc43de3c90022eb25d3b/pages";
    public static final String CATEGORIES = "https://mp-dev.guzzu.cn/v3/frontapi/shopping-malls/5adedc43de3c90022eb25d3b/categories";
    public static final String STORES = "https://mp-dev.guzzu.cn/v3/frontapi/shopping-malls/5adedc43de3c90022eb25d3b/stores";
    public static final String PRODUCT = "https://mp-dev.guzzu.cn/v3/frontapi/products/";
    public static final String STORE = "https://mp-dev.guzzu.cn/v3/frontapi/stores/";
    public static final String GUZZU = "https://mp-dev.guzzu.cn";
    public static final String SIGN_IN = "/api/2/Auth.signinWithPhone";
    public static final String REQ_SMS = "/api/2/Auth.requestSmsCode";
    public static final String CATEGORY = "/api/2/Category.find";
    public static final String CART_ADD= "/api/2/StoreCart.addItem";
    public static final String CART_REMOVE= "/api/2/StoreCart.removeItem";
    public static final String CART_UPDATE= "/api/2/StoreCart.updateItem";
    public static final String CART_GET= "/api/2/StoreCart.get";
    public static final String CART_ALL= "/api/2/StoreCart.getAll";
    public static final String CART_CLEAR= "/api/2/StoreCart.clear";
    public static final String CART_PREVIEW= "/api/2/StoreCart.preview";
    public static final String CHECK_PERMISSION= "/api/2/StoreApp.checkPermission";
    public static final String ORDER_PREVIEW= "/api/2/Order.preview";
    public static final String ORDER_CREATE= "/api/2/Order.create";
    public static final String ORDER_FIND= "/api/2/Order.findAllByStatus";
    public static final String PLACE_PICKUP= "/api/2/PickUpPlace.find";
    public static final String ADDRESS_LASTUSED = "/api/2/UserAddress.getLastUsed";
    public static final String ADDRESS_CREATE = "/api/2/UserAddress.create";
    public static final String ADDRESS_FIND = "/api/2/UserAddress.find";
    public static final String ADDRESS_REMOVE = "/api/2/UserAddress.remove";
    public static final String ADDRESS_GET = "/api/2/UserAddress.get";
    public static final String ADDRESS_UPDATE = "/api/2/UserAddress.update";
    public static final String PROVINCE_FIND = "/api/2/Zone.findProvince";
    public static final String CITY_FIND = "/api/2/Zone.findCity";
    public static final String DISTRICT_FIND = "/api/2/Zone.findDistrict";
    public static final String STREET_FIND = "/api/2/Zone.findStreet";
    public static final String DISCOUNT_FIND = "/api/2/Discount.findAvailable";
    public static final String SESSION ="/api/2/Auth.getCurrentSession";
    public static final String REMOVE_SESSION ="/api/2/Auth.removeSession";
}
