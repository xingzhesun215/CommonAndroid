package com.sun.module_main;


import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.sun.common_library.base.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
    }

    public void ArouterClick(View view){
        ARouter.getInstance().build("/app/RouterMainActivity")
                .navigation();
    }
}