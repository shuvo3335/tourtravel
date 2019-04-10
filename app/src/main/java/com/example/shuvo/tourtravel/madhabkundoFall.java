package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class madhabkundoFall extends AppCompatActivity {
    private ViewPager viewPagerMadhabkundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhabkundo_fall);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerMadhabkundo = findViewById(R.id.viewPagerMadhabkundo);
        viewPagerAdapter_madhabkundo viewPagerAdapter_madhabkundo = new viewPagerAdapter_madhabkundo(this);
        viewPagerMadhabkundo.setAdapter(viewPagerAdapter_madhabkundo);
    }
}
