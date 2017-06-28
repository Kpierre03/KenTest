package com.example.ken.kendemo17;

import android.app.Application;

import com.example.ken.kendemo17.util.UtilLog;

/**
 * Created by Al on 6/19/2017.
 */

public class AlApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
