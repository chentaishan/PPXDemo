package com.example.ppxdemo;

import android.app.Application;

import com.example.libnet.ApiService;

public class PPApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ApiService.init("http://123.56.232.18:8080/serverdemo", null);

    }
}
