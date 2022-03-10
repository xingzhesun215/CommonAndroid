package com.sun.module_a;

import android.util.Log;

import com.sun.common_library.base.BaseApplication;

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("ME","当前为module A的application");
    }
}
