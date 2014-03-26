package com.mapbox.mapboxsdk.android.testapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;

import com.mapbox.sdk.MapView;

public class MainActivity extends ActionBarActivity {

    private MapView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mv = (MapView) findViewById(R.id.mapview);
    }
}