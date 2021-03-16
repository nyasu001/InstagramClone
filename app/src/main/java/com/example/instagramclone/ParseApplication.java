package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MqncJeGFZzxRjigkAtND9xYplBXFD9u535mP9MUH")
                .clientKey("LhvffqrRBcdE9M0co42pdz9awLwfTvyrvFhAxXP1")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
