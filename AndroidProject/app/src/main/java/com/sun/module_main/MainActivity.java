package com.sun.module_main;

import android.content.Intent;

import com.sun.common_library.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        startActivity(new Intent(this, com.sun.module_a.MainActivity.class));
    }

    @Override
    protected void initData() {
    }
}