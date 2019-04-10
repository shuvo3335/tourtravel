package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class khoicharaFall extends AppCompatActivity {
        ViewPager viewPagerKhoiachara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khoichara_fall);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerKhoiachara = findViewById(R.id.viewPagerKhoiachara);
        viewPagerAdapter_khoiachara viewPagerAdapter_khoiachara = new viewPagerAdapter_khoiachara(this);
        viewPagerKhoiachara.setAdapter(viewPagerAdapter_khoiachara);
    }
}
