package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class meherpur extends AppCompatActivity {
    private ImageView imageViewMujibnagar,imageViewAmjhupi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meherpur);
        imageViewMujibnagar=findViewById(R.id.imageViewMujibnagar);
        imageViewAmjhupi=findViewById(R.id.imageViewAmjhupi);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/21fd4bf0b504a82f9652e781380ef8b8.jpg").into(imageViewAmjhupi);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/b157e2d6dd8e630f6fd1411ec227b3aa.jpg").into(imageViewMujibnagar);
        
    }
}
