package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class paharpur extends AppCompatActivity {
    private ViewPager viewPagerPaharpur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paharpur);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerPaharpur = findViewById(R.id.viewPagerPaharpur);
        viewPagerAdapter_Paharpur viewPagerAdapter_paharpur = new viewPagerAdapter_Paharpur(this);
        viewPagerPaharpur.setAdapter(viewPagerAdapter_paharpur);
    }
}
