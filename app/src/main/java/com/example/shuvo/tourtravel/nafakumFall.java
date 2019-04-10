package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class nafakumFall extends AppCompatActivity {
        ViewPager viewPagerNafakum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nafakum_fall);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPagerNafakum = findViewById(R.id.viewPagerNafakum);
        viewPagerAdapter_nafakum viewPagerAdapter_nafakum = new viewPagerAdapter_nafakum(this);
        viewPagerNafakum.setAdapter(viewPagerAdapter_nafakum);
    }
}
