package com.sun.common_library.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.sun.common_library.BuildConfig;

public class BaseApplication extends Application {

    public static String name;

    public static boolean loginToken=false;

    @Override
    public void onCreate() {
        super.onCreate();
        initArouter();
    }


    /**
     * 初始化 Arouter
     */
    public void initArouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);
    }

}
