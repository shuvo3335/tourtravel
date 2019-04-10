package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class rangpur extends AppCompatActivity {
    private ImageView imageViewTajhat,imageViewVinnojogot,imageViewZoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);
        imageViewTajhat=findViewById(R.id.imageViewTajhat);
        imageViewZoo=findViewById(R.id.imageViewRangZoo);
        imageViewVinnojogot=findViewById(R.id.imageViewVinnojogot);
        Glide.with(getApplicationContext()).load("https://trip.zone/wp-content/uploads/2018/04/maxresdefault-1-768x432.jpg").into(imageViewTajhat);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/b5684716dd854260715ff612b605e56d.jpg").into(imageViewVinnojogot);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/312a9e7a7aa318aec8363c43ef34f3af.jpg").into(imageViewZoo);
    }
}
