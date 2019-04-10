package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sylhet_city extends AppCompatActivity implements View.OnClickListener {
    Button sylhet,hobiganj,madhabkundo,sunamganj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_city);
        sylhet=findViewById(R.id.btnSylhet);
        sylhet.setOnClickListener(this);
        hobiganj=findViewById(R.id.btnHabiganj);
        hobiganj.setOnClickListener(this);
        madhabkundo=findViewById(R.id.btnMoulvibazar);
        madhabkundo.setOnClickListener(this);
        sunamganj=findViewById(R.id.btnSunamganj);
        sunamganj.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btnSylhet){
            intent = new Intent(sylhet_city.this,sylhet.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnHabiganj){
            intent = new Intent(sylhet_city.this,hobiganj.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnMoulvibazar){
            intent = new Intent(sylhet_city.this,madhabkundu.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnSunamganj){
            intent = new Intent(sylhet_city.this,sunamganj.class);
            startActivity(intent);
        }
    }
}
