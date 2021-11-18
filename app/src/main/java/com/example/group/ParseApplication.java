package com.example.group;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

       // ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6XyIgm8o7e1yw59BvL1juQEu1qYwYXmGWKDIRGd3")
                .clientKey("5xbercZDVfDXGsn09YlDpSsB8kuUHXdsexav1fem")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}