package guzzu.ian.guzzushoppingmall.fragment;

import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import guzzu.ian.baselibrary.base.BaseFragment;
import guzzu.ian.baselibrary.util.ContentView;
import guzzu.ian.guzzushoppingmall.ui.MainActivity;
import guzzu.ian.guzzushoppingmall.R;

@ContentView(R.layout.fragment_category)
public class CategoryFragment extends BaseFragment<MainActivity>{
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void initialToolbar() {
        if (mToolbar != null) {
            mToolbar.setTitle("分类");
            setSupportActionBar(mToolbar);
        }
    }
}
