package com.example.shuvo.tourtravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AhsanManzil extends AppCompatActivity {
        private ViewPager viewPagerAhsan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahsan_manzil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPagerAhsan = findViewById(R.id.viewPagerAhsan);
        viewPagerAdapter_ahsan viewPagerAdapter_ahsan = new viewPagerAdapter_ahsan(this);
        viewPagerAhsan.setAdapter(viewPagerAdapter_ahsan);
    }
}
