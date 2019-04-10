package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class nilphamary extends AppCompatActivity {
private ImageView imageViewChini,imageViewTista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilphamary);
        imageViewChini=findViewById(R.id.imageViewChini);
        imageViewTista=findViewById(R.id.imageViewTista);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/da9fda33d2662b89b447e020e78ee348.jpg").into(imageViewChini);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/369c3530b546587b5198ab341d06ac46.jpg").into(imageViewTista);

    }
}
