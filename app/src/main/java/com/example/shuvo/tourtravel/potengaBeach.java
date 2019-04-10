package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class potengaBeach extends AppCompatActivity {
    ViewPager viewPagerPatenga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potenga_beach);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerPatenga = findViewById(R.id.viewPagerPatenga);
        viewPagerAdapter_patenga viewPagerAdapter_patenga = new viewPagerAdapter_patenga(this);
        viewPagerPatenga.setAdapter(viewPagerAdapter_patenga);
    }
}
