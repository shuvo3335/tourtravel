package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Shatgumbuj extends AppCompatActivity {
    private ViewPager viewPagerSixty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shatgumbuj);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerSixty=findViewById(R.id.viewPagerShatgumbuj);
        viewPagerAdapter_sixty viewPagerAdapter_sixty = new viewPagerAdapter_sixty(this);
        viewPagerSixty.setAdapter(viewPagerAdapter_sixty);
    }
}
