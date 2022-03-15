package com.sun.module_main.arouter;


import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.sun.common_library.base.BaseActivity;
import com.sun.common_library.util.TestBean;
import com.sun.module_main.R;

/**
 * 进行Arouter跳转的主页面
 */

@Route(path = "/app/RouterMainActivity")//添加路由注解 并且这里的路径需要注意的是至少需要有两级,放到
public class RouterMainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_routermain;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {
    }

    public void moduleParamsClick(View view) {
        ARouter.getInstance().build("/app/RouterOneActivity")
                .withBoolean(RouterOneActivity.BOOLEAN_KEY, true)
                .withInt(RouterOneActivity.INT_KEY, 100)
                .withString(RouterOneActivity.STRING_KEY, "sunguanyong")
                .navigation();
    }

    public void otherModuleParamsClick(View view) {
        ARouter.getInstance().build("/module_a/ARouterOneActivity")
                .withString("From", "hello,I'm from app module")
                .navigation();
    }

    public void LoginClick(View view){

        TestBean bean=new TestBean("sunguanyong",30);
        //启动Activity
        ARouter.getInstance().build("/app/RouterTwoActivity")
                .withString("From", "我已经登录了")
                .withObject("info",bean)
                .navigation(this,new LoginNavigationCallbackImpl());//第二个参数是路由跳转的回调
//                .navigation(this);//第二个参数是路由跳转的回调
    }
}