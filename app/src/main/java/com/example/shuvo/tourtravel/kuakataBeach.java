package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class kuakataBeach extends AppCompatActivity {
    ViewPager viewPagerKuakata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuakata_beach);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerKuakata = findViewById(R.id.viewPager_kuakata);
        viewPagerAdapter_kuakata viewPagerAdapter_kuakata = new viewPagerAdapter_kuakata(this);
        viewPagerKuakata.setAdapter(viewPagerAdapter_kuakata);
    }
}
