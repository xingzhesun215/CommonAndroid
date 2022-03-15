package com.sun.module_main.arouter;

import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.base.BaseActivity;
import com.sun.module_main.MainApplication;
import com.sun.module_main.R;


@Route(path = "/app/RouterLoginActivity")
public class RouterLoginActivity extends BaseActivity {


    @Autowired(name = "message")
    public String message;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_arouterlogin;
    }

    @Override
    protected void initView() {
        TextView tv_message = this.findViewById(R.id.tv_message);
        tv_message.append(message);
    }


    @Override
    protected void initData() {

    }

    public void loginClick(View view) {
        MainApplication.loginToken = true;
    }
}
