package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class jessore extends AppCompatActivity {
    private ImageView imageViewModhu,imageViewJess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jessore);
        imageViewModhu=findViewById(R.id.imageViewModhu);
        imageViewJess=findViewById(R.id.imageViewJess);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/d50b697d323ec381b65baf4e63dd6d81.jpg").into(imageViewJess);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/8f7e82d1953e52b1481effac3c0783ae.jpg").into(imageViewModhu);

    }
}
