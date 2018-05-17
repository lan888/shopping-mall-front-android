package guzzu.cnshoppingmall.aa.fragment;

import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import guzzu.cnshoppingmall.baselibrary.base.BaseFragment;
import guzzu.cnshoppingmall.baselibrary.util.ContentView;
import guzzu.cnshoppingmall.aa.ui.MainActivity;
import guzzu.cnshoppingmall.aa.R;

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
