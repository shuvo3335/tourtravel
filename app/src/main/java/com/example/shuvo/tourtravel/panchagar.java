package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class panchagar extends AppCompatActivity {
    private ImageView imageViewBhitargarh,imageViewBangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panchagar);
        imageViewBhitargarh=findViewById(R.id.imageViewBhitargar);
        imageViewBangla=findViewById(R.id.imageViewBanglaband);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/c108b4530f9124637ae8ee15270cd857.jpg").into(imageViewBangla);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/b8b459b449595ed9f9215f20951b3aea.jpg").into(imageViewBhitargarh);

    }
}
