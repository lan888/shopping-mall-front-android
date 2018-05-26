package guzzu.cnshoppingmall.aa.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.ui.MainActivity;
import guzzu.cnshoppingmall.baselibrary.base.BaseFragment;
import guzzu.cnshoppingmall.baselibrary.util.ContentView;
import guzzu.cnshoppingmall.baselibrary.widget.MultiStateView;

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
