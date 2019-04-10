package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class sonargaon extends AppCompatActivity {
        private ViewPager viewPagerSonargao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonargaon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerSonargao = findViewById(R.id.viewPagerSonargaon);
        viewPagerAdapter_sonargao viewPagerAdapter_sonargao = new viewPagerAdapter_sonargao(this);
        viewPagerSonargao.setAdapter(viewPagerAdapter_sonargao);
    }
}
