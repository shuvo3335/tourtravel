package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class narail extends AppCompatActivity {
    private ImageView imageViewPalace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narail);
        imageViewPalace=findViewById(R.id.imageViewPalace);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/3b35a65dca74f49fa034a99aea207194.jpg").into(imageViewPalace);

    }
}
