package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class nijhumBeach extends AppCompatActivity {
ViewPager viewPagerNijhum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nijhum_beach);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerNijhum=findViewById(R.id.viewPagerNijhum);
        viewPagerAdapter_nijhum viewPagerAdapter_nijhum = new viewPagerAdapter_nijhum(this);
        viewPagerNijhum.setAdapter(viewPagerAdapter_nijhum);
    }
}
