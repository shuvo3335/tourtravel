package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class foysLake extends AppCompatActivity {
private ViewPager viewPagerFoys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foys_lake);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPagerFoys = findViewById(R.id.viewPagerFoys);
        viewPagerAdapter_foys viewPagerAdapter_foys = new viewPagerAdapter_foys(this);
        viewPagerFoys.setAdapter(viewPagerAdapter_foys);
    }
}
