package com.binh.template.templatemain;

import android.os.Bundle;
import android.os.Handler;

/**
 * Created by binh on 2016/11/23.
 *
 * 功能:
 *      1s后自动跳转至首页
 *
 */

public class SplashActivity extends BinhActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //1秒后自动跳转
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MainActivity.start(SplashActivity.this);
                finish();
            }
        },1000);
    }
}
