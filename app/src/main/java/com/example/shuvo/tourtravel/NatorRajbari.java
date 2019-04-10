package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NatorRajbari extends AppCompatActivity {
    private ViewPager viewPagerRajbari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nator_rajbari);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerRajbari=findViewById(R.id.viewPagerRajbari);
        viewPagerAdapter_rajbari viewPagerAdapter_rajbari = new viewPagerAdapter_rajbari(this);
        viewPagerRajbari.setAdapter(viewPagerAdapter_rajbari);
    }
}
