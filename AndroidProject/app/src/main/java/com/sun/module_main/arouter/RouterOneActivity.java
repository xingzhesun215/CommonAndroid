package com.sun.module_main.arouter;


import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.base.BaseActivity;
import com.sun.module_main.R;

/**
 * 用来测试本模块自跳转,同时跳转到其他模块的页面
 */
@Route(path = "/app/RouterOneActivity")
public class RouterOneActivity extends BaseActivity {


    public static final String BOOLEAN_KEY = "BOOLEAN_KEY";
    public static final String INT_KEY = "BOOLEAN_INT";
    public static final String STRING_KEY = "BOOLEAN_STRING";


    @Autowired(name = BOOLEAN_KEY)
    public boolean isOk;

    @Autowired(name = INT_KEY)
    public int age;

    @Autowired(name = STRING_KEY)
    public String name;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_routerone;
    }

    @Override
    protected void initView() {
        TextView tv_message = this.findViewById(R.id.tv_message);
        tv_message.append("\n     isOk=" + isOk);
        tv_message.append("\n     age=" + age);
        tv_message.append("\n     name=" + name);
    }

    @Override
    protected void initData() {
    }
}