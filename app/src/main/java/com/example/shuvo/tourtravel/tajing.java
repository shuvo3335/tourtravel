package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class tajing extends AppCompatActivity {
private ViewPager viewPagerTajing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPagerTajing = findViewById(R.id.viewPagerTajing);
        viewPagerAdapter_tajing viewPagerAdapter_tajing = new viewPagerAdapter_tajing(this);
        viewPagerTajing.setAdapter(viewPagerAdapter_tajing);
    }
}
