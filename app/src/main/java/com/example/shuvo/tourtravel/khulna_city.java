package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class khulna_city extends AppCompatActivity implements View.OnClickListener {
    private Button khulna,bagerhat,jessore,meherpur,narail,kustia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna_city);
        khulna=findViewById(R.id.btnKhulna);
        khulna.setOnClickListener(this);
        bagerhat= findViewById(R.id.btnBagerhat);
        bagerhat.setOnClickListener(this);
        jessore=findViewById(R.id.btnJessore);
        jessore.setOnClickListener(this);
        meherpur=findViewById(R.id.btnMeherpur);
        meherpur.setOnClickListener(this);
        narail=findViewById(R.id.btnNarail);
        narail.setOnClickListener(this);
        kustia=findViewById(R.id.btnKushtia);
        kustia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btnKhulna)
        {
            intent = new Intent(khulna_city.this,khulna.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnBagerhat)
        {
            intent = new Intent(khulna_city.this,bagerhat.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnJessore)
        {
            intent = new Intent(khulna_city.this,jessore.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnMeherpur)
        {
            intent = new Intent(khulna_city.this,meherpur.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnNarail)
        {
            intent = new Intent(khulna_city.this,narail.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnKushtia)
        {
            intent = new Intent(khulna_city.this,kustia.class);
            startActivity(intent);
        }
    }
}
