package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class bagerhat extends AppCompatActivity {
    private ImageView imageViewKhan,imageViewMuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagerhat);
        imageViewKhan = findViewById(R.id.imageViewKhan);
        imageViewMuseum=findViewById(R.id.imageViewMuseum);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/2f2ed523dea652400c43b00bb760151d.jpg").into(imageViewKhan);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/91828b4d44ee28fc3f3439c022c95710.jpg").into(imageViewMuseum);

    }
}
