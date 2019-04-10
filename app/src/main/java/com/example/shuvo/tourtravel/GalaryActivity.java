package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class GalaryActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView museam,seabeach, heritage, forest,hills;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galary);
        museam=findViewById(R.id.museam);
        seabeach=findViewById(R.id.seabeach);
        heritage=findViewById(R.id.heritage);
        forest=findViewById(R.id.forest);
        hills = findViewById(R.id.hills);


        museam.setOnClickListener(this);
        seabeach.setOnClickListener(this);
        forest.setOnClickListener(this);
        heritage.setOnClickListener(this);
        hills.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.museam){
            Intent museams_intent = new Intent(GalaryActivity.this,museam_list.class);
            startActivity(museams_intent);
        }
        if (id == R.id.seabeach){
            Intent intent=new Intent(GalaryActivity.this,beach.class);
            startActivity(intent);
        }
        if (id == R.id.heritage){
            Intent intent = new Intent(GalaryActivity.this,Heritages.class);
            startActivity(intent);
        }
        if (id == R.id.forest){
            Intent intent = new Intent(GalaryActivity.this,waterfall.class);
            startActivity(intent);
        }
        if (id == R.id.hills){
            Intent intent = new Intent(GalaryActivity.this,Hills.class);
            startActivity(intent);
        }
    }
}
