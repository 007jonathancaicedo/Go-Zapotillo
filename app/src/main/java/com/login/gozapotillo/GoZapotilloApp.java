package com.login.gozapotillo;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class GoZapotilloApp extends Application {
    /*
    * Enlace cpn facebook
    *
    *
    * */


    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }


// cierra coneccion


}
