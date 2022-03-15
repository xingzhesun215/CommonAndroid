package com.sun.module_a.arouter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.sun.common_library.base.BaseActivity;
import com.sun.common_library.util.TestBean;
import com.sun.module_a.R;

/**
 * 用来显示本模块互跳转的页面,同时在本页面跳转跳转到其他模块
 */

@Route(path = "/module_a/ARouterTwoActivity")
public class ARouterTwoActivity extends BaseActivity {


    @Autowired(name = "From")
    public String from;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_routertwo_a;
    }

    @Override
    protected void initView() {
        TextView tv_message = this.findViewById(R.id.tv_message);
        tv_message.setText(TextUtils.isEmpty(from) ? "没有数据" : from);
    }

    @Override
    protected void initData() {

    }

    public void routerClick(View view) {
        TestBean bean = new TestBean("sunguanyong", 30);

        ARouter.getInstance().build("/app/RouterTwoActivity")
                .withString("From", "hello,I'm from module module")
                .withObject("info", bean)
                .navigation(this, new NavCallback() {
                    @Override
                    public void onFound(Postcard postcard) {
                        // Do nothing
                    }

                    @Override
                    public void onLost(Postcard postcard) {
                        // Do nothing
                    }

                    @Override
                    public void onArrival(Postcard postcard) {

                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {
                        // Do nothing
                    }
                });
    }
}