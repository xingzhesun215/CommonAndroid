package com.sun.module_main.arouter;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

public class LoginNavigationCallbackImpl implements NavigationCallback {
    @Override //找到了
    public void onFound(Postcard postcard) {
        Log.e("ME_Login", "found=" + postcard.getPath());
    }

    @Override //找不到了
    public void onLost(Postcard postcard) {
        Log.e("ME_Login", "onLost=" + postcard.getPath());
    }

    @Override    //跳转成功了
    public void onArrival(Postcard postcard) {
        Log.e("ME_Login", "onArrival=" + postcard.getPath());
    }

    @Override
    public void onInterrupt(Postcard postcard) {
        String path = postcard.getPath();
        Log.e("ME", "path=" + path);
        Bundle bundle = postcard.getExtras();
        // 被登录拦截了下来了
        // 需要调转到登录页面，把参数跟被登录拦截下来的路径传递给登录页面，登录成功后再进行跳转被拦截的页面
        ARouter.getInstance().build("/app/RouterLoginActivity")
                .with(bundle)
                .withString("message", "我来登录了,我之前的路径是" + path)
                .navigation();
    }
}