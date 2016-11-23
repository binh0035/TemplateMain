package com.binh.template.templatemain;

import android.os.Handler;
import android.widget.Toast;

/**
 * Created by binh on 2016/11/23.
 *
 *  单例Toast
 *
 *  功能:
 *      1、按 Toast.Duration 显示
 *      2、按 时间 显示Toast,时间最长为Toast.LENGTH_LONG
 */

public class SingleToast {
    private static Toast mToast;
    private static Handler mHandler = new Handler();
    private static Runnable r = new Runnable() {
        public void run() {
            mToast.cancel();
        }
    };

    /**
     * 1、按 Toast.Duration 显示
     *
     * @param text 显示文本
     * @param isLong 是否是Toast.LENGTH_LONG,否则Toast.LENGTH_SHORT
     */
    public static void showToast(String text, boolean isLong) {
        int duration;
        if (isLong)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        if (mToast != null) {
            mToast.setText(text);
            if (isLong)
                mToast.setDuration(duration);
            else
                mToast.setDuration(duration);
        } else {
            mToast = Toast.makeText(ThisApp.getContext(), text, duration);
        }

        mToast.show();
    }

    public static void showToast(int textId, boolean isLong) {
        showToast(ThisApp.getContext().getResources().getString((textId)), isLong);
    }

    /**
     * 2、按 时间 显示Toast,时间最长为Toast.LENGTH_LONG
     * @param text 显示文本
     * @param duration 显示的时长,单位ms,最长为Toast.LENGTH_LONG
     */
    public static void showToast(String text, int duration) {

        mHandler.removeCallbacks(r);
        if (mToast != null)
            mToast.setText(text);
        else
            mToast = Toast.makeText(ThisApp.getContext(), text, Toast.LENGTH_LONG);
        mHandler.postDelayed(r, duration);

        mToast.show();
    }

    public static void showToast(int resId, int duration) {
        showToast(ThisApp.getContext().getResources().getString(resId), duration);
    }

}
