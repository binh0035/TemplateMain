package com.binh.template.templatemain;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BinhActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleToast.showToast("11", false);
            }
        });
    }
}
