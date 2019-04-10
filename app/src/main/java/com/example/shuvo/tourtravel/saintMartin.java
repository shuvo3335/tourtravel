package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class saintMartin extends AppCompatActivity {
    ViewPager viewPagerSaint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saint_martin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerSaint = findViewById(R.id.viewPager_saint);
        viewPagerAdapter_Saint viewPagerAdapterSaint = new viewPagerAdapter_Saint(saintMartin.this);
        viewPagerSaint.setAdapter(viewPagerAdapterSaint);
    }
}
