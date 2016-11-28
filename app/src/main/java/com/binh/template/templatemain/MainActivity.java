package com.binh.template.templatemain;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.binh.template.templatemain.temp.BinhActivity;

public class MainActivity extends BinhActivity {
    private static final String TAG = "MainActivity";

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
