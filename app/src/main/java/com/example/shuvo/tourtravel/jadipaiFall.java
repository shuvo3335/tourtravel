package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class jadipaiFall extends AppCompatActivity {
    private ViewPager viewPagerJadipai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadipai_fall);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerJadipai=findViewById(R.id.viewPagerJadipai);
        viewPagerAdapter_jadipai viewPagerAdapter_jadipai=new viewPagerAdapter_jadipai(this);
        viewPagerJadipai.setAdapter(viewPagerAdapter_jadipai);
    }
}
