package com.example.ppxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.libnet.ApiResponse;
import com.example.libnet.GetRequest;
import com.example.libnet.JsonCallback;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetRequest getRequest = new GetRequest("http://123.56.232.18:8080/serverdemo/feeds/queryHotFeedsList?pageCount=10");

        getRequest.execute(new JsonCallback<Object>() {
            @Override
            public void onSuccess(ApiResponse response) {
                super.onSuccess(response);

                Log.d(TAG, "onSuccess: "+response.body);
            }

            @Override
            public void onError(ApiResponse response) {
                super.onError(response);
                Log.d(TAG, "onError: "+response.message);
            }
        });
    }
}
