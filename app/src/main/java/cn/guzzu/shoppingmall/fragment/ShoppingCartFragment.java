package cn.guzzu.shoppingmall.fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import cn.guzzu.shoppingmall.R;
import cn.guzzu.shoppingmall.ui.MainActivity;
import cn.guzzu.baselibrary.base.BaseFragment;
import cn.guzzu.baselibrary.util.ContentView;
import cn.guzzu.baselibrary.widget.MultiStateView;

@ContentView(R.layout.fragment_shoppingcart)
public class ShoppingCartFragment extends BaseFragment<MainActivity> {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.mRv)
    RecyclerView mRv;
    @BindView(R.id.multi_state_view)
    MultiStateView mMultiStateView;

    public ShoppingCartFragment() {
    }

    @Override
    protected void initialToolbar() {
        if (mToolbar != null) {
            mToolbar.setTitle("购物车");
            setSupportActionBar(mToolbar);
        }
    }

    @Override
    protected void initData() {
        mMultiStateView.setState(MultiStateView.STATE_EMPTY)
                .setTitle("购物车还是空空如也");

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

}
