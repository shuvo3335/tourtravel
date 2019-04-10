package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rajshahi_place extends AppCompatActivity implements View.OnClickListener {
    private Button rajshahi,natore,bogra,pabna,sirajganj,naoga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi_place);
        rajshahi=findViewById(R.id.btnRajshahi);
        rajshahi.setOnClickListener(this);
        natore = findViewById(R.id.btnNatore);
        natore.setOnClickListener(this);
        bogra=findViewById(R.id.btnbogra);
        bogra.setOnClickListener(this);
        pabna=findViewById(R.id.btnpabna);
        pabna.setOnClickListener(this);
        sirajganj=findViewById(R.id.btnsirajganj);
        sirajganj.setOnClickListener(this);
        naoga=findViewById(R.id.btnnaogaon);
        naoga.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btnRajshahi){
            intent=new Intent(Rajshahi_place.this, rajshahi.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnNatore){
            intent=new Intent(Rajshahi_place.this, natore.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnbogra){
            intent=new Intent(Rajshahi_place.this, bogra.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnpabna){
            intent=new Intent(Rajshahi_place.this, pabna.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnsirajganj){
            intent=new Intent(Rajshahi_place.this, sirajganj.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnnaogaon){
            intent=new Intent(Rajshahi_place.this, naoga.class);
            startActivity(intent);
        }
    }
}
