package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class keukradong extends AppCompatActivity {
private ViewPager viewPagerKeukra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keukradong);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerKeukra = findViewById(R.id.viewPagerKeukradong);
        viewPagerAdapter_keukradong viewPagerAdapter_keukradong = new viewPagerAdapter_keukradong(this);
        viewPagerKeukra.setAdapter(viewPagerAdapter_keukradong);
    }
}
