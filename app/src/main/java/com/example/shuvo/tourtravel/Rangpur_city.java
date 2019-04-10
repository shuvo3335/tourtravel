package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rangpur_city extends AppCompatActivity implements View.OnClickListener {
    private Button rangpur,dinajpur,nilphamary,kurigram,panchagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur_city);
        rangpur=findViewById(R.id.btnRangpur);
        rangpur.setOnClickListener(this);
        dinajpur=findViewById(R.id.btnDinajpur);
        dinajpur.setOnClickListener(this);
        nilphamary=findViewById(R.id.btnnilphamari);
        nilphamary.setOnClickListener(this);
        kurigram=findViewById(R.id.btnkurigram);
        kurigram.setOnClickListener(this);
        panchagar=findViewById(R.id.btnpanchagar);
        panchagar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btnRangpur){
            intent = new Intent(Rangpur_city.this,rangpur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnDinajpur){
            intent = new Intent(Rangpur_city.this,dinajpur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnnilphamari){
            intent = new Intent(Rangpur_city.this,nilphamary.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnkurigram){
            intent = new Intent(Rangpur_city.this,kurigram.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnpanchagar){
            intent = new Intent(Rangpur_city.this,panchagar.class);
            startActivity(intent);
        }
    }
}
