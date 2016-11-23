package com.binh.template.templatemain;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by binh on 2016/11/23.
 *
 *  收集并管理 所有存活的Activity实例
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
