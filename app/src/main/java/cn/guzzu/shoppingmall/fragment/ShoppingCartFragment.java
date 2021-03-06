package cn.guzzu.shoppingmall.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gc.materialdesign.views.LayoutRipple;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseApp;
import cn.guzzu.baselibrary.base.BaseFragment;
import cn.guzzu.baselibrary.callback.GsonArrayCallback;
import cn.guzzu.baselibrary.callback.JsonCallback;
import cn.guzzu.baselibrary.util.ContentView;
import cn.guzzu.baselibrary.util.DataBindingViewUtil;
import cn.guzzu.baselibrary.util.OkHttp3Utils;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.baselibrary.widget.MultiStateView;
import cn.guzzu.shoppingmall.Api;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.adapter.ShoppingCartAdapter;
import cn.guzzu.shoppingmall.bean.CartAll;
import cn.guzzu.shoppingmall.bean.CartChangeEvent;
import cn.guzzu.shoppingmall.bean.CartStore;
import cn.guzzu.shoppingmall.bean.GoHomeEvent;
import cn.guzzu.shoppingmall.bean.UnLoginEvent;
import cn.guzzu.shoppingmall.ui.LoginActivity;
import cn.guzzu.shoppingmall.ui.MainActivity;
import cn.guzzu.baselibrary.util.UtilsLog;
import cn.guzzu.shoppingmall.ui.SettledActivity;
import cn.guzzu.shoppingmall.util.ErrorUtil;
import okhttp3.Call;

@ContentView(R.layout.fragment_shoppingcart)
public class ShoppingCartFragment extends BaseFragment<MainActivity> implements ShoppingCartAdapter.CheckInterface, ShoppingCartAdapter.ModifyCountInterface, ShoppingCartAdapter.GroupEditorListener {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.multi_state_view)
    MultiStateView mMultiStateView;
    @BindView(R.id.listView)
    ExpandableListView listView;
    @BindView(R.id.all_checkBox)
    CheckBox allCheckBox;
    @BindView(R.id.total_price)
    TextView totalPrice;
    @BindView(R.id.tv_pay)
    TextView goPay;
    @BindView(R.id.order_info)
    LinearLayout orderInfo;
    @BindView(R.id.share_goods)
    TextView shareGoods;
    @BindView(R.id.collect_goods)
    TextView collectGoods;
    @BindView(R.id.del_goods)
    TextView delGoods;
    @BindView(R.id.share_info)
    LinearLayout shareInfo;
    @BindView(R.id.ll_cart)
    LinearLayout llCart;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;
    @BindView(R.id.toolbar_edit)
    TextView mToolbarEdit;

    private Context mContext;
    private double mTotalPrice = 0.00;
    private int mTotalCount = 0;
    private int count;
    private int lastPosition = -1;
    //false就是编辑，ture就是完成
    private boolean flag = false;
    private ShoppingCartAdapter adapter;
    private List<String> itemId;
    private List<CartAll.Store> groups; //组元素的列表
    private Map<String, List<CartAll.Items>> childs; //子元素的列表
    private Gson gson;
    private String settledRequest;
    private Dialog storeDialog;
    private String cartJson;

    public ShoppingCartFragment() {
    }

    @Override
    protected void initialToolbar() {
        if (mToolbar != null) {
            mToolbar.setTitle("购物车");
            setSupportActionBar(mToolbar);
        }
        storeDialog = new Dialog(activity,R.style.BottomDialog);
    }

    @Override
    protected void initData() {
        gson = new Gson();
        mContext = activity;
        itemId = new ArrayList<>();
        groups = new ArrayList<>();
        childs = new ArrayMap<>();
        refreshLayout.setRefreshHeader(new ClassicsHeader(activity).setSpinnerStyle(SpinnerStyle.Scale));
        refreshLayout.setEnableLoadMore(false);
        OkHttp3Utils.doPost(Api.GUZZU + Api.CART_ALL, BaseApp.Constant.userId,"en", new GsonArrayCallback<CartAll>() {
            @Override
            public void onUiThread(int code,String json, List<CartAll> list) {
                if (code==200){
                    cartJson = json;
                    if (list.size()==0){
                        mMultiStateView.setState(MultiStateView.STATE_EMPTY)
                                .setTitle("购物车还是空空如也").setButton("去逛逛", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                EventBus.getDefault().post(new GoHomeEvent());
                            }
                        });
                    }else {
                        groups.clear();
                        childs.clear();
                        for (int i = 0;i<list.size();i++){
                            groups.add(list.get(i).getStore());
                            childs.put(groups.get(i).get_id(),list.get(i).getItems());
                        }
                        initEvents();
                        //初始化
                        for (int i = 0; i < groups.size(); i++) {
                            CartAll.Store group = groups.get(i);
                            group.setActionBarEditor(false);
                        }
                        adapter.notifyDataSetChanged();
                        mMultiStateView.setState(MultiStateView.STATE_CONTENT);
                    }

                }else {
                    mMultiStateView.setState(MultiStateView.STATE_UNAUTH).setButton(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Utils.start_Activity(activity, LoginActivity.class);
                        }
                    });
                }
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }

    @Override
    protected void initListener() {
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull final RefreshLayout refreshLayout) {
                OkHttp3Utils.doPost(Api.GUZZU + Api.CART_ALL, BaseApp.Constant.userId,"en", new GsonArrayCallback<CartAll>() {
                    @Override
                    public void onUiThread(int code,String json, List<CartAll> list) {
                        if (code==200){
                            if (!TextUtils.equals(json,cartJson)){
                                cartJson = json;
                                if (list.size()==0){
                                    mMultiStateView.setState(MultiStateView.STATE_EMPTY)
                                            .setTitle("购物车还是空空如也").setButton("去逛逛", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            EventBus.getDefault().post(new GoHomeEvent());
                                        }
                                    });
                                }else {
                                    groups.clear();
                                    childs.clear();
                                    for (int i = 0;i<list.size();i++){
                                        groups.add(list.get(i).getStore());
                                        childs.put(groups.get(i).get_id(),list.get(i).getItems());
                                    }
                                    refreshStoreCart();
                                    adapter.setItems(groups, childs);
                                    mMultiStateView.setState(MultiStateView.STATE_CONTENT);
                                    refreshLayout.finishRefresh();
                                }
                            }else {
                                refreshLayout.finishRefresh();
                            }
                        }else {
                            Utils.putBoolean(activity,"isLogin",false);
                            EventBus.getDefault().post(new UnLoginEvent());
                            clearCart();
                            mMultiStateView.setState(MultiStateView.STATE_UNAUTH).setButton(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Utils.start_Activity(activity, LoginActivity.class);

                                }
                            });
                        }
                    }

                    @Override
                    public void onFailed(Call call, IOException e) {
                        mMultiStateView.setState(MultiStateView.STATE_ERROR);
                    }
                });
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        OkHttp3Utils.doPost(Api.GUZZU + Api.CART_ALL, BaseApp.Constant.userId,"en", new GsonArrayCallback<CartAll>() {
            @Override
            public void onUiThread(int code,String json, List<CartAll> list) {
                if (code==200){
                    if (!TextUtils.equals(json,cartJson)){
                        cartJson = json;
                        if (list.size()==0){
                            mMultiStateView.setState(MultiStateView.STATE_EMPTY)
                                    .setTitle("购物车还是空空如也").setButton("去逛逛", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    EventBus.getDefault().post(new GoHomeEvent());
                                }
                            });
                        }else {
                            groups.clear();
                            childs.clear();
                            for (int i = 0;i<list.size();i++){
                                groups.add(list.get(i).getStore());
                                childs.put(groups.get(i).get_id(),list.get(i).getItems());
                            }
                            refreshStoreCart();
                            initEvents();
                            mMultiStateView.setState(MultiStateView.STATE_CONTENT);
                        }
                    }else {
                        setCartNum();
                        mMultiStateView.setState(MultiStateView.STATE_CONTENT);
                    }
                }else {
                    Utils.putBoolean(activity,"isLogin",false);
                    EventBus.getDefault().post(new UnLoginEvent());
                    clearCart();
                    mMultiStateView.setState(MultiStateView.STATE_UNAUTH).setButton(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Utils.start_Activity(activity, LoginActivity.class);
                        }
                    });
                }
            }

            @Override
            public void onFailed(Call call, IOException e) {
                mMultiStateView.setState(MultiStateView.STATE_ERROR);

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    private void initEvents() {
        adapter = new ShoppingCartAdapter(groups, childs, mContext);
        adapter.setCheckInterface(this);//关键步骤1：设置复选框的接口
        adapter.setModifyCountInterface(this); //关键步骤2:设置增删减的接口
        adapter.setGroupEditorListener(this);//关键步骤3:监听组列表的编辑状态
        listView.setGroupIndicator(null); //设置属性 GroupIndicator 去掉向下箭头
        listView.setAdapter(adapter);
        for (int i = 0; i < adapter.getGroupCount(); i++) {
            listView.expandGroup(i); //关键步骤4:初始化，将ExpandableListView以展开的方式显示
        }
//        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(AbsListView view, int scrollState) {
//
//            }
//
//            @Override
//            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//                int firstVisiablePostion = view.getFirstVisiblePosition();
//                int top = -1;
//                View firstView = view.getChildAt(firstVisibleItem);
//                UtilsLog.i("childCount=" + view.getChildCount());//返回的是显示层面上的所包含的子view的个数
//                if (firstView != null) {
//                    top = firstView.getTop();
//                }
//                UtilsLog.i("firstVisiableItem=" + firstVisibleItem + ",fistVisiablePosition=" + firstVisiablePostion + ",firstView=" + firstView + ",top=" + top);
//                if (firstVisibleItem == 0 && top == 0) {
////                    mPtrFrame.setEnabled(true);
//                } else {
////                    mPtrFrame.setEnabled(false);
//                }
//            }
//        });
    }

    @OnClick({R.id.all_checkBox, R.id.go_pay, R.id.share_goods, R.id.collect_goods, R.id.del_goods,R.id.toolbar_edit})
    public void onClick(View view) {
        AlertDialog dialog;
        switch (view.getId()) {
            case R.id.all_checkBox:
                doCheckAll();
                break;
            case R.id.go_pay:
                if (mTotalCount == 0) {
                    Utils.showShortToast(mContext, "请选择要支付的商品");
                    return;
                }
                dialog = new AlertDialog.Builder(mContext).create();
                dialog.setMessage("总计:" + mTotalCount + "种商品，" + mTotalPrice/100 + "元");
                dialog.setButton(DialogInterface.BUTTON_POSITIVE, "支付", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        List<CartAll.Items> itemsList = new ArrayList<>();
                        List<CartStore> cartStoreList = new ArrayList<>();
                        int num = 0;
                        for (int i = 0 ; i<groups.size();i++){
                            if (groups.get(i).isChoosed()){
                                CartStore cartStore = new CartStore();
                                Map<String,Object> map = new ArrayMap<>();
                                map.put("storeId",groups.get(i).get_id());
                                cartStore.setStoreId(map);
                                cartStore.setStoreName(groups.get(i).getName());
                                itemsList=childs.get(groups.get(i).get_id());
                                num = 0;
                                for (int a = 0 ;a<itemsList.size();a++){
                                    if (itemsList.get(a).isChoosed()){
                                        num++;
                                    }
                                }
                                cartStore.setGoodCount(num);
                                cartStore.setItemsList(itemsList);
                                cartStoreList.add(cartStore);
                                UtilsLog.d(cartStoreList.toString()+1);
                            }else {
                                CartStore cartStore = new CartStore();
                                for (int j = 0 ;j<childs.get(groups.get(i).get_id()).size();j++){
                                    if (childs.get(groups.get(i).get_id()).get(j).isChoosed()){
                                        Map<String,Object> map = new ArrayMap<>();
                                        map.put("storeId",childs.get(groups.get(i).get_id()).get(j).getProduct().getStore());
                                        cartStore.setStoreId(map);
                                        itemsList = childs.get(groups.get(i).get_id());
                                        cartStore.setStoreName(groups.get(i).getName());
                                        num = 0;
                                        for (int a = 0 ;a<itemsList.size();a++){
                                            if (itemsList.get(a).isChoosed()){
                                                num++;
                                            }
                                        }
                                        cartStore.setGoodCount(num);
                                        cartStore.setItemsList(itemsList);

                                    }
                                }
                                if (cartStore.getGoodCount()!=0){
                                    cartStoreList.add(cartStore);
                                }

                                UtilsLog.d(cartStoreList.toString()+2);
                            }
                        }
                        if (cartStoreList.size()==1){
                            Map<String,Object> map = cartStoreList.get(0).getStoreId();
                            List<Map<String,String>> list = new ArrayList<>();
                            itemId.clear();
                            for (int j = 0 ;j<itemsList.size();j++){
                                if (itemsList.get(j).isChoosed()){
                                    UtilsLog.d("Ok,"+itemsList.get(j).getProductOptionId());
                                    if (itemsList.get(j).getProductOptionId()!=null){
                                        Map<String,String> productMap = new ArrayMap<>();
                                        productMap.put("productId",itemsList.get(j).getProductId());
                                        productMap.put("quantity",String.valueOf(itemsList.get(j).getQuantity()));
                                        productMap.put("productOptionId",itemsList.get(j).getProductOption().get_id());
                                        UtilsLog.d(productMap.toString());
                                        itemId.add(itemsList.get(j).get_id());
                                        list.add(productMap);
                                    }else {
                                        Map<String,String> productMap = new ArrayMap<>();
                                        productMap.put("productId",itemsList.get(j).getProductId());
                                        productMap.put("quantity",String.valueOf(itemsList.get(j).getQuantity()));
                                        UtilsLog.d(productMap.toString());
                                        itemId.add(itemsList.get(j).get_id());
                                        list.add(productMap);
                                    }

                                }
                            }
                            map.put("items",list);
                            UtilsLog.d(gson.toJson(map));
                            CartChangeEvent cartChangeEvent = new CartChangeEvent();
                            cartChangeEvent.setItemId(itemId);
                            EventBus.getDefault().postSticky(cartChangeEvent);
                            Utils.start_Activity(activity,SettledActivity.class,"product",gson.toJson(map));
                        }else {
                            initDialog(cartStoreList);
                            storeDialog.show();
                        }




                    }
                });
                dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                break;
            case R.id.share_goods:
                if (mTotalCount == 0) {
                    Utils.showShortToast(mContext, "请选择要分享的商品");
                    return;
                }
                Utils.showShortToast(mContext, "分享成功");
                break;
            case R.id.collect_goods:
                if (mTotalCount == 0) {
                    Utils.showShortToast(mContext, "请选择要收藏的商品");
                    return;
                }
                Utils.showShortToast(mContext, "收藏成功");
                break;
            case R.id.del_goods:
                if (mTotalCount == 0) {
                    Utils.showShortToast(mContext, "请选择要删除的商品");
                    return;
                }
                dialog = new AlertDialog.Builder(mContext).create();
                dialog.setMessage("确认要删除该商品吗?");
                dialog.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        doDelete();
                    }
                });
                dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.show();
                break;
            case R.id.toolbar_edit:
                flag = !flag;
                setActionBarEditor();
                setVisiable();
                break;
        }
    }

    /**
     * 设置购物车的数量
     */
    private void setCartNum() {
        int count = 0;
        for (int i = 0; i < groups.size(); i++) {
            CartAll.Store group = groups.get(i);
            group.setChoosed(allCheckBox.isChecked());
            List<CartAll.Items> Childs = childs.get(group.get_id());
            for (CartAll.Items childs : Childs) {
                count++;
            }
        }

        //购物车已经清空
        if (count == 0) {
            clearCart();
        } else {
//            mToolbarEdit.setVisibility(View.VISIBLE);
            llCart.setVisibility(View.VISIBLE);
            mToolbar.setTitle("购物车(" + count + ")");
        }
        CartChangeEvent cartChangeEvent = new CartChangeEvent();
        cartChangeEvent.setCount(count);
        EventBus.getDefault().postSticky(cartChangeEvent);

    }

    public void clearCart() {
        if (mToolbar!=null&&mToolbarEdit!=null){
            mToolbar.setTitle("购物车");
            mToolbarEdit.setVisibility(View.GONE);
            llCart.setVisibility(View.GONE);
        }

//        empty_shopcart.setVisibility(View.VISIBLE);//这里发生过错误
    }

    /**
     * 删除操作
     * 1.不要边遍历边删除,容易出现数组越界的情况
     * 2.把将要删除的对象放进相应的容器中，待遍历完，用removeAll的方式进行删除
     */
    private void doDelete() {
        List<CartAll.Store> toBeDeleteGroups = new ArrayList<CartAll.Store>(); //待删除的组元素
        for (int i = 0; i < groups.size(); i++) {
            CartAll.Store group = groups.get(i);
            if (group.isChoosed()) {
                toBeDeleteGroups.add(group);
            }
            List<CartAll.Items> toBeDeleteChilds = new ArrayList<CartAll.Items>();//待删除的子元素
            List<CartAll.Items> child = childs.get(group.get_id());
            for (int j = 0; j < child.size(); j++) {
                if (child.get(j).isChoosed()) {
                    toBeDeleteChilds.add(child.get(j));
                }
            }
            child.removeAll(toBeDeleteChilds);
        }
        groups.removeAll(toBeDeleteGroups);
        //重新设置购物车
        setCartNum();
        adapter.notifyDataSetChanged();

    }

    @Override
    public void checkGroup(int groupPosition, boolean isChecked) {
        CartAll.Store group = groups.get(groupPosition);
        List<CartAll.Items> child = childs.get(group.get_id());
        for (int i = 0; i < child.size(); i++) {
            child.get(i).setChoosed(isChecked);
        }
        if (isCheckAll()) {
            allCheckBox.setChecked(true);//全选
        } else {
            allCheckBox.setChecked(false);//反选
        }
        adapter.notifyDataSetChanged();
        calulate();
    }

    /**
     * @return 判断组元素是否全选
     */
    private boolean isCheckAll() {
        for (CartAll.Store group : groups) {
            if (!group.isChoosed()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void checkChild(int groupPosition, int childPosition, boolean isChecked) {
        boolean allChildSameState = true; //判断该组下面的所有子元素是否处于同一状态
        CartAll.Store group = groups.get(groupPosition);
        List<CartAll.Items> child = childs.get(group.get_id());
        for (int i = 0; i < child.size(); i++) {
            //不选全中
            if (child.get(i).isChoosed() != isChecked) {
                allChildSameState = false;
                break;
            }
        }

        if (allChildSameState) {
            group.setChoosed(isChecked);//如果子元素状态相同，那么对应的组元素也设置成这一种的同一状态
        } else {
            group.setChoosed(false);//否则一律视为未选中
        }

        if (isCheckAll()) {
            allCheckBox.setChecked(true);//全选
        } else {
            allCheckBox.setChecked(false);//反选
        }

        adapter.notifyDataSetChanged();
        calulate();
    }

    @Override
    public void doIncrease(int groupPosition, int childPosition, final View showCountView, boolean isChecked) {
        final CartAll.Items good = (CartAll.Items) adapter.getChild(groupPosition, childPosition);
        count = good.getQuantity();
        count++;
        CartAll.Store group = groups.get(groupPosition);
        final List<CartAll.Items> child = childs.get(group.get_id());
        Map<String,String> map = new ArrayMap<>();
        map.put("quantity",String.valueOf(count));
        map.put("itemId",child.get(childPosition).get_id());
        map.put("storeId",child.get(childPosition).getProduct().getStore());
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.CART_UPDATE, map, BaseApp.Constant.userId, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code==200){
                    good.setQuantity(count);
                    ((TextView) showCountView).setText(String.valueOf(count));
                    adapter.notifyDataSetChanged();
                    calulate();
                    return;
                }
                Utils.showShortToast(activity,ErrorUtil.loginError(activity,gson,json));

            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    @Override
    public void doDecrease(int groupPosition, int childPosition,final View showCountView, boolean isChecked) {
        final CartAll.Items good = (CartAll.Items) adapter.getChild(groupPosition, childPosition);
        count = good.getQuantity();
        if (count == 1) {
            return;
        }
        count--;
        CartAll.Store group = groups.get(groupPosition);
        final List<CartAll.Items> child = childs.get(group.get_id());
        Map<String,String> map = new ArrayMap<>();
        map.put("quantity",String.valueOf(count));
        map.put("itemId",child.get(childPosition).get_id());
        map.put("storeId",child.get(childPosition).getProduct().getStore());
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.CART_UPDATE, map, BaseApp.Constant.userId, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code==200){
                    good.setQuantity(count);
                    ((TextView) showCountView).setText(String.valueOf(count));
                    adapter.notifyDataSetChanged();
                    calulate();
                    return;
                }
                Utils.showShortToast(activity,ErrorUtil.loginError(activity,gson,json));
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });
    }

    @Override
    public void doUpdate(int groupPosition, int childPosition, View showCountView, boolean isChecked) {
        CartAll.Items good = (CartAll.Items) adapter.getChild(groupPosition, childPosition);
        int count = good.getQuantity();
        UtilsLog.i("进行更新数据，数量" + count + "");
        ((TextView) showCountView).setText(String.valueOf(count));
        adapter.notifyDataSetChanged();
        calulate();
    }

    @Override
    public void childDelete(final int groupPosition, final int childPosition) {
        CartAll.Store group = groups.get(groupPosition);
        final List<CartAll.Items> child = childs.get(group.get_id());
        Map<String,String> map = new ArrayMap<>();
        map.put("itemId",child.get(childPosition).get_id());
        map.put("storeId",child.get(childPosition).getProduct().getStore());
        OkHttp3Utils.doJsonPost(Api.GUZZU + Api.CART_REMOVE, map, BaseApp.Constant.userId, new JsonCallback() {
            @Override
            public void onUiThread(int code, String json) {
                if (code==200){
                    child.remove(childPosition);
                    if (child.size() == 0) {
                        groups.remove(groupPosition);
                    }
                    adapter.notifyDataSetChanged();
                    calulate();
                    return;
                }
                Utils.showShortToast(activity,ErrorUtil.loginError(activity,gson,json));
            }

            @Override
            public void onFailed(Call call, IOException exception) {

            }
        });

    }

    /**
     * ActionBar标题上点编辑的时候，只显示每一个店铺的商品修改界面
     * ActionBar标题上点完成的时候，只显示每一个店铺的商品信息界面
     */
    private void setActionBarEditor() {
        for (int i = 0; i < groups.size(); i++) {
            CartAll.Store group = groups.get(i);
            if (group.isActionBarEditor()) {
                group.setActionBarEditor(false);
            } else {
                group.setActionBarEditor(true);
            }
        }
        adapter.notifyDataSetChanged();
    }
    /**
     * 全选和反选
     * 错误标记：在这里出现过错误
     */
    private void doCheckAll() {
        for (int i = 0; i < groups.size(); i++) {
            CartAll.Store group = groups.get(i);
            group.setChoosed(allCheckBox.isChecked());
            List<CartAll.Items> child = childs.get(group.get_id());
            for (int j = 0; j < child.size(); j++) {
                child.get(j).setChoosed(allCheckBox.isChecked());//这里出现过错误
            }
        }
        adapter.notifyDataSetChanged();
        calulate();
    }

    /**
     * 计算商品总价格，操作步骤
     * 1.先清空全局计价,计数
     * 2.遍历所有的子元素，只要是被选中的，就进行相关的计算操作
     * 3.给textView填充数据
     */
    private void calulate() {
        mTotalPrice = 0.00;
        mTotalCount = 0;
        for (int i = 0; i < groups.size(); i++) {
            CartAll.Store group = groups.get(i);
            List<CartAll.Items> child = childs.get(group.get_id());
            for (int j = 0; j < child.size(); j++) {
                CartAll.Items good = child.get(j);
                if (good.isChoosed()) {
                    mTotalCount++;
                    mTotalPrice += good.getPrice() * good.getQuantity();
                }
            }
        }
        totalPrice.setText("¥" + mTotalPrice/100 + "");
        goPay.setText("去支付(" + mTotalCount + ")");
        if (mTotalCount == 0) {
            setCartNum();
        } else {
            mToolbar.setTitle("购物车(" + mTotalCount + ")");
        }


    }

    private void setVisiable() {
        if (flag) {
            orderInfo.setVisibility(View.GONE);
            shareInfo.setVisibility(View.VISIBLE);
            mToolbarEdit.setText("完成");
        } else {
            orderInfo.setVisibility(View.VISIBLE);
            shareInfo.setVisibility(View.GONE);
            mToolbarEdit.setText("编辑");
        }
    }

    private void refreshStoreCart(){
        flag = false;
        setVisiable();
        setCartNum();
        mTotalPrice = 0;
        mTotalCount = 0;
        allCheckBox.setChecked(false);
        calulate();
        for (int i = 0; i < groups.size(); i++) {
            CartAll.Store group = groups.get(i);
            group.setActionBarEditor(false);
        }
    }
    @Override
    public void groupEditor(int groupPosition) {

    }

    public void doUnLogin(){
        mMultiStateView.setState(MultiStateView.STATE_UNAUTH).setButton(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.start_Activity(activity, LoginActivity.class);
            }
        });
    }

    private void initDialog(final List<CartStore> cartStoreList){
        View contentView = LayoutInflater.from(activity).inflate(R.layout.dialog_store_option, null);
        final LinearLayout mllStore = contentView.findViewById(R.id.ll_store);
        LayoutRipple tvBack = contentView.findViewById(R.id.tv_back);
        LayoutRipple tvGo = contentView.findViewById(R.id.tv_go);
        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeDialog.dismiss();
            }
        });
        tvGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null==settledRequest||settledRequest.isEmpty()){
                    storeDialog.dismiss();
                }else {
                    CartChangeEvent cartChangeEvent = new CartChangeEvent();
                    cartChangeEvent.setItemId(itemId);
                    EventBus.getDefault().postSticky(cartChangeEvent);
                    Utils.start_Activity(activity,SettledActivity.class,"product",settledRequest);
                }

            }
        });
        DataBindingViewUtil.bindDataToLayout(cartStoreList, mllStore, R.layout.layout_store_option_item, new DataBindingViewUtil.OnBindingDataListener<CartStore>() {
            @Override
            public void onBindData(@NonNull View v, final CartStore data, final int position) {
                final CheckBox cb = v.findViewById(R.id.checkBox);
                TextView name = v.findViewById(R.id.tv_name);
                TextView num = v.findViewById(R.id.tv_num);
                name.setText(data.getStoreName());
                num.setText(data.getGoodCount()+"件");
                cb.setTag(position);
                cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        UtilsLog.d(isChecked+""+position+""+lastPosition);
                        if (isChecked){
                            if (lastPosition!= -1){
                                CheckBox lastCheckBox = mllStore.getChildAt(lastPosition).findViewById(R.id.checkBox);
                                if (lastCheckBox!=null){
                                    lastCheckBox.setChecked(false);
                                }
                            }
                            lastPosition = (int) buttonView.getTag();
                            initSettledRequest(cartStoreList,lastPosition);
                        }else {
                            settledRequest="";
                            lastPosition = -1;
                        }
                    }
                });
                if (position == lastPosition){
                    cb.setChecked(true);
                }else {
                    cb.setChecked(false);
                }
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cb.setChecked(true);
                        initSettledRequest(cartStoreList,position);
                    }
                });
            }
        });
        storeDialog.setContentView(contentView);
    }

    private void initSettledRequest(List<CartStore> cartStoreList,int position){
        Map<String,Object> map = cartStoreList.get(position).getStoreId();
        List<CartAll.Items> itemsList = cartStoreList.get(position).getItemsList();
        List<Map<String,String>> list = new ArrayList<>();
        itemId.clear();
        for (int j = 0 ;j<itemsList.size();j++){
            if (itemsList.get(j).isChoosed()){
                UtilsLog.d("Ok,"+itemsList.get(j).getProductOptionId());
                if (itemsList.get(j).getProductOptionId()!=null){
                    Map<String,String> productMap = new ArrayMap<>();
                    productMap.put("productId",itemsList.get(j).getProductId());
                    productMap.put("quantity",String.valueOf(itemsList.get(j).getQuantity()));
                    productMap.put("productOptionId",itemsList.get(j).getProductOption().get_id());
                    UtilsLog.d(productMap.toString());
                    itemId.add(itemsList.get(j).get_id());
                    list.add(productMap);
                }else {
                    Map<String,String> productMap = new ArrayMap<>();
                    productMap.put("productId",itemsList.get(j).getProductId());
                    productMap.put("quantity",String.valueOf(itemsList.get(j).getQuantity()));
                    UtilsLog.d(productMap.toString());
                    itemId.add(itemsList.get(j).get_id());
                    list.add(productMap);
                }

            }
        }
        map.put("items",list);
        settledRequest = gson.toJson(map);
    }
    
}
