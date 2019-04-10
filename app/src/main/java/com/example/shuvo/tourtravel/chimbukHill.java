package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class chimbukHill extends AppCompatActivity {
private ViewPager viewPagerChimbuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chimbuk_hill);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerChimbuk = findViewById(R.id.viewPagerChimbuk);
        viewPagerAdapter_Chimbuk viewPagerAdapter_chimbuk = new viewPagerAdapter_Chimbuk(this);
        viewPagerChimbuk.setAdapter(viewPagerAdapter_chimbuk);
    }
}
