package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final Toolbar about =findViewById(R.id.about);
        setSupportActionBar(about);
        getSupportActionBar().setTitle("About Us");
    }
}
