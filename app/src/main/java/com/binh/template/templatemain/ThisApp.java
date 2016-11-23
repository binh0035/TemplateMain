package com.binh.template.templatemain;

import android.app.Application;
import android.content.Context;

/**
 * Created by binh on 2016/11/23.
 *
 *  该App的App类
 */

public class ThisApp extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
