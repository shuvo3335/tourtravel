package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Libaration_museum extends AppCompatActivity {
    ViewPager viewPagerLibaration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libaration_museum);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerLibaration = findViewById(R.id.viewPagerLibaration);
        viewPagerAdapterLibaration viewPagerAdapterLibaration = new viewPagerAdapterLibaration(Libaration_museum.this);
        viewPagerLibaration.setAdapter(viewPagerAdapterLibaration);


    }
}
