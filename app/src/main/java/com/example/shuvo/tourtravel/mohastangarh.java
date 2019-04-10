package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class mohastangarh extends AppCompatActivity {
    private ViewPager viewPagerMahastan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohastangarh);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerMahastan = findViewById(R.id.viewPagerMahastan);
        viewPagerAdapter_mahastan viewPagerAdapter_mahastan = new viewPagerAdapter_mahastan(this);
        viewPagerMahastan.setAdapter(viewPagerAdapter_mahastan);
    }
}
