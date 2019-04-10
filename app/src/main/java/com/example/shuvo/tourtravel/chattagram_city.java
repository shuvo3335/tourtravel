package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chattagram_city extends AppCompatActivity implements View.OnClickListener {
    private Button chittagang,cox,brahmanbari,comilla,bandarban,rangamati,khagrachari,chadpur,noakhali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattagram_city);
        chittagang = findViewById(R.id.btnChittagong);
        chittagang.setOnClickListener(this);
        cox=findViewById(R.id.btnCoxs_Bazar);
        cox.setOnClickListener(this);
        brahmanbari=findViewById(R.id.btnBrahmanbaria);
        brahmanbari.setOnClickListener(this);
        comilla=findViewById(R.id.btnComilla);
        comilla.setOnClickListener(this);
        bandarban=findViewById(R.id.btnBandarban);
        bandarban.setOnClickListener(this);
        rangamati=findViewById(R.id.btnRangamati);
        rangamati.setOnClickListener(this);
        khagrachari=findViewById(R.id.btnKhagrachhari);
        khagrachari.setOnClickListener(this);
        chadpur=findViewById(R.id.btnChandpur);
        chadpur.setOnClickListener(this);
        noakhali=findViewById(R.id.btnNoakhali);
        noakhali.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btnChittagong){
            intent = new Intent(chattagram_city.this,chittagong.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnCoxs_Bazar){
            intent = new Intent(chattagram_city.this,cox_bazar.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnBrahmanbaria){
            intent = new Intent(chattagram_city.this,brahmanbaria.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnComilla){
            intent = new Intent(chattagram_city.this,comilla.class);
            startActivity(intent);
        }

        if (v.getId()==R.id.btnBandarban){
            intent = new Intent(chattagram_city.this,bandarban.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnRangamati){
            intent = new Intent(chattagram_city.this,rangamati.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnKhagrachhari){
            intent = new Intent(chattagram_city.this,khagrachari.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnChandpur){
            intent = new Intent(chattagram_city.this,chandpur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnNoakhali){
            intent = new Intent(chattagram_city.this,noakhali.class);
            startActivity(intent);
        }
    }
}
