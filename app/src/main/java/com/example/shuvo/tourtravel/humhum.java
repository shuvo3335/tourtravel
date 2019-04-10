package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class humhum extends AppCompatActivity {
        private ViewPager viewPagerHumhum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humhum);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerHumhum = findViewById(R.id.viewPagerHumhum);
        viewPagerAdapter_humhum viewPagerAdapter_humhum = new viewPagerAdapter_humhum(this);
        viewPagerHumhum.setAdapter(viewPagerAdapter_humhum);
    }
}
