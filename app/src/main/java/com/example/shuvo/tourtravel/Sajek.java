package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Sajek extends AppCompatActivity {

    private ViewPager viewPagerSajek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sajek);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerSajek = findViewById(R.id.viewPagerSajek);
        viewPagerAdapter_Sajek viewPagerAdapter_sajek = new viewPagerAdapter_Sajek(this);
        viewPagerSajek.setAdapter(viewPagerAdapter_sajek);
    }
}
