package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class cox_beach extends AppCompatActivity {
    ViewPager viewPagerCox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cox_beach);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerCox = findViewById(R.id.viewPager_COX);
        viewPagerAdapter_COX viewPagerAdapterCox = new viewPagerAdapter_COX(cox_beach.this);
        viewPagerCox.setAdapter(viewPagerAdapterCox);

    }
}
