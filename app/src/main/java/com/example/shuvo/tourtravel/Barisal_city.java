package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barisal_city extends AppCompatActivity implements View.OnClickListener {
    private Button potuakhali,pirojpur,barisal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal_city);
        potuakhali=findViewById(R.id.btnPatuakhali);
        potuakhali.setOnClickListener(this);
        pirojpur=findViewById(R.id.btnPirojpur);
        pirojpur.setOnClickListener(this);
        barisal=findViewById(R.id.btnBarisal);
        barisal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btnPatuakhali){
            intent = new Intent(Barisal_city.this,patuakhali.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnPirojpur){
            intent = new Intent(Barisal_city.this,pirojpur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnBarisal){
            intent = new Intent(Barisal_city.this,barisal.class);
            startActivity(intent);
        }
    }
}
