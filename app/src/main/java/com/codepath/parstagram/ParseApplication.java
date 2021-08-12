package com.codepath.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cmz4B4xLvuMRv3ufw2yMD9HOPtjKxn8T9D16ofpa")
                .clientKey("fCFU91e77l3Ipk8nt5uEpQ79L0ZGoxSfYRN9gOkX")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
