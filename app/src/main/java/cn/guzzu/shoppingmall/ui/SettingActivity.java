package cn.guzzu.shoppingmall.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.guzzu.baselibrary.base.BaseActivity;
import cn.guzzu.baselibrary.util.Utils;
import cn.guzzu.shoppingmall.R;

public class SettingActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.ll_us)
    LinearLayout mllUs;
    @BindView(R.id.ll_update)
    LinearLayout mllUpdate;

    @Override
    public int initLayout() {
        return R.layout.activity_setting;
    }

    @Override
    public void initView() {
        if (mToolbar != null) {
            mToolbar.setTitle("设置");
            setSupportActionBar(mToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.finish(context);
            }
        });
    }


    @OnClick({R.id.ll_us, R.id.ll_update})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_us:
                break;
            case R.id.ll_update:
                break;
        }
    }
}
