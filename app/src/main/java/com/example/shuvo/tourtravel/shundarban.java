package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class shundarban extends AppCompatActivity {
private ViewPager viewPagerSundarban;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shundarban);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerSundarban =  findViewById(R.id.viewPagerShundarban);
        viewPagerAdapter_sundarban viewPagerAdapter_sundarban = new viewPagerAdapter_sundarban(this);
        viewPagerSundarban.setAdapter(viewPagerAdapter_sundarban);
    }
}
