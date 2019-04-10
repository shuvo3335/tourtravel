package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dhaka_place extends AppCompatActivity implements View.OnClickListener {
 private Button dhaka,faridpur,gazipur,narayanganj,narsindi,rajbari,shariatpur,kishorgonj,tangail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_place);
        dhaka = findViewById(R.id.btndhaka);
        dhaka.setOnClickListener(this);
        faridpur = findViewById(R.id.btnfaridpur);
        faridpur.setOnClickListener(this);
        gazipur = findViewById(R.id.btngazipur);
        gazipur.setOnClickListener(this);
        narayanganj = findViewById(R.id.btnnarayanganj);
        narayanganj.setOnClickListener(this);
        narsindi = findViewById(R.id.btnnarshindi);
        narsindi.setOnClickListener(this);
        rajbari=findViewById(R.id.btnrajbari);
        rajbari.setOnClickListener(this);
        shariatpur=findViewById(R.id.btnshariatpur);
        shariatpur.setOnClickListener(this);
        kishorgonj=findViewById(R.id.btnkishorgonj);
        kishorgonj.setOnClickListener(this);
        tangail=findViewById(R.id.btntangail);
        tangail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btndhaka){
             intent = new Intent(Dhaka_place.this,Dhaka.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.btngazipur){
            intent = new Intent(Dhaka_place.this,Gazipur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnfaridpur){
            intent = new Intent(Dhaka_place.this,faridpur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnnarayanganj){
            intent = new Intent(Dhaka_place.this,narayanganj.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnnarshindi){
            intent = new Intent(Dhaka_place.this,narsindi.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnrajbari){
            intent = new Intent(Dhaka_place.this,rajbari.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnshariatpur){
            intent = new Intent(Dhaka_place.this,shariatpur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnkishorgonj){
            intent = new Intent(Dhaka_place.this,kishorgonj.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btntangail){
            intent = new Intent(Dhaka_place.this,tangail.class);
            startActivity(intent);
        }
    }
}
