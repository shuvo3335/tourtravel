package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mymensingh_city extends AppCompatActivity implements View.OnClickListener {
    private Button maymensing,netrokona,jamalpur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensingh_city);
        maymensing=findViewById(R.id.btnMymensingh);
        maymensing.setOnClickListener(this);
        netrokona=findViewById(R.id.btnnetrokona);
        netrokona.setOnClickListener(this);
        jamalpur=findViewById(R.id.btnjamalpur);
        jamalpur.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId()==R.id.btnMymensingh){
            intent = new Intent(mymensingh_city.this,maymensingh.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnnetrokona){
            intent = new Intent(mymensingh_city.this,netrokona.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.btnjamalpur){
            intent = new Intent(mymensingh_city.this,jamalpur.class);
            startActivity(intent);
        }
    }
}
