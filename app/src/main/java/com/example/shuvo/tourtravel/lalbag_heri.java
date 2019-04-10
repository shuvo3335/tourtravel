package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class lalbag_heri extends AppCompatActivity {
        private ViewPager viewPagerLalbag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lalbag_heri);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerLalbag = findViewById(R.id.viewPagerLalbag);
        viewPagerAdapter_lalbag viewPagerAdapter_lalbag = new viewPagerAdapter_lalbag(this);
        viewPagerLalbag.setAdapter(viewPagerAdapter_lalbag);
    }
}
