package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class sritysoudho extends AppCompatActivity {
    ViewPager viewPagerSrity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sritysoudho);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerSrity = findViewById(R.id.viewPagerSrity);
        viewPagerAdapter_Srity viewPagerAdapter_srity = new viewPagerAdapter_Srity(this);
        viewPagerSrity.setAdapter(viewPagerAdapter_srity);
    }
}
