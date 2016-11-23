package com.binh.template.templatemain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by binh on 2016/11/23.
 */

public class BinhActivity extends AppCompatActivity {

    //将当前页面添加至页面组
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        ActivityCollector.addActivity(this);
    }

    //将当前页面从页面组中删除
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
