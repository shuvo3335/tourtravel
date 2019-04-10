package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class dinajpur extends AppCompatActivity {
    private ImageView imageViewKantoje,imageViewShopno,imageViewRamsagar,imageViewNayabad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinajpur);
        imageViewKantoje=findViewById(R.id.imageViewKantaje);
        imageViewShopno=findViewById(R.id.imageViewShopno);
        imageViewRamsagar=findViewById(R.id.imageViewRamsagar);
        imageViewNayabad=findViewById(R.id.imageViewNayabad);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/2fa7e05c79f7f0b37c186e822da09360.jpg").into(imageViewNayabad);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/9f963ff401d8beeeaf897279dc983980.jpg").into(imageViewKantoje);
        Glide.with(getApplicationContext()).load("https://silkcitynews.com/wp-content/uploads/2017/01/shopnopuri_28407.jpg").into(imageViewShopno);
        Glide.with(getApplicationContext()).load("https://bangladesh-traveling.000webhostapp.com/uploads/17db56a862a874171bb28fe371cc626c.jpg").into(imageViewRamsagar);
    }
}
