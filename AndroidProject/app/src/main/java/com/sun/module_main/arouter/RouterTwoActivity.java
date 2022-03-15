package com.sun.module_main.arouter;


import android.text.TextUtils;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.sun.common_library.base.BaseActivity;
import com.sun.common_library.util.TestBean;
import com.sun.module_main.R;

/**
 * 用来显示其他模块到本模块
 */
@Route(path ="/app/RouterTwoActivity")
public class RouterTwoActivity extends BaseActivity {

    @Autowired(name = "From")
    public String from;

    @Autowired(name = "info")
    public TestBean testBean;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_routertwo;
    }

    @Override
    protected void initView() {
        TextView tv_message = this.findViewById(com.sun.module_a.R.id.tv_message);
        tv_message.setText(TextUtils.isEmpty(from) ? "没有数据" : from);

        tv_message.append(testBean == null ? "info=null" : testBean.toString());
    }

    @Override
    protected void initData() {
    }
}