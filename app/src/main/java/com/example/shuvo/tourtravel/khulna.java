package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class khulna extends AppCompatActivity {
private ImageView imageViewHadis,imageViewHiron;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);
        imageViewHadis=findViewById(R.id.imageViewHadis);
        imageViewHiron=findViewById(R.id.imageViewHiron);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/e9cad725a5790482e3da78bf76e73c66.jpg").into(imageViewHiron);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/c3779abc74850430356d173750e2591b.jpg").into(imageViewHadis);

    }
}
