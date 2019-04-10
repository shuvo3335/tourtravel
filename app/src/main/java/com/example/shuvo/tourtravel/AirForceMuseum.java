package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AirForceMuseum extends AppCompatActivity {

    ViewPager viewPagerAF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_force_museum);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerAF = findViewById(R.id.viewPagerAF);
        viewPagerAdapterAFM viewPagerAdapterAFM =new viewPagerAdapterAFM(AirForceMuseum.this);
        viewPagerAF.setAdapter(viewPagerAdapterAFM);


    }
}
