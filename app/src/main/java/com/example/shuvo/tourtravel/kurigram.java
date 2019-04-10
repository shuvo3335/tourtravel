package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class kurigram extends AppCompatActivity {
    private ImageView imageViewNaldanga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurigram);
        imageViewNaldanga=findViewById(R.id.imageViewNoldanga);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/7fc8ba20fb538a6f96064a0a902d8e3d.jpg").into(imageViewNaldanga);

    }
}
