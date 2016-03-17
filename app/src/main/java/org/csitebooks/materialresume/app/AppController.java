package org.csitebooks.materialresume.app;

import android.app.Application;
import android.os.Build;
import android.support.v7.appcompat.BuildConfig;

import com.firebase.client.Firebase;
import com.firebase.client.Logger;

/**
 * Created by Nikhil Vashistha on 14-03-2016 for Material Resume.
 */
public class AppController extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

        if(BuildConfig.DEBUG)
        Firebase.getDefaultConfig().setLogLevel(Logger.Level.DEBUG);
    }
}
