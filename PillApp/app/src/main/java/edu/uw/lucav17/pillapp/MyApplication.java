package edu.uw.lucav17.pillapp;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by lucav_000 on 8/5/2016.
 */
public class MyApplication extends Application {
    public static SharedPreferences preferences;

    @Override
    public void onCreate() {
        super.onCreate();

        preferences = getSharedPreferences(getPackageName() + "_preferences", MODE_PRIVATE);
    }
}
