package com.sun.module_a.arouter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;


import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.sun.common_library.base.BaseActivity;
import com.sun.module_a.R;

/**
 * 用来显示其他模块跳转到本模块的页面,同时在本页面进行跳转
 */
@Route(path = "/module_a/ARouterOneActivity")
public class ARouterOneActivity extends BaseActivity {



    @Autowired(name = "From")
    public String from;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_routerone_a;
    }

    @Override
    protected void initView() {
        TextView tv_message = this.findViewById(R.id.tv_message);
        tv_message.setText(TextUtils.isEmpty(from) ? "没有数据" : from);
    }

    @Override
    protected void initData() {

    }

    public void moduleClick(View view) {
        ARouter.getInstance().build("/module_a/ARouterTwoActivity")
                .withString("From", "hello,I'm from module module")
                .navigation();
    }
}