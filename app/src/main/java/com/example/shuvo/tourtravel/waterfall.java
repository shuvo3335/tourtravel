package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class waterfall extends AppCompatActivity {
    private ListView waterfall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);
        waterfall = findViewById(R.id.waterfall_list);
        final String [] waterfall_list = getResources().getStringArray(R.array.waterfall_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(waterfall.this,R.layout.beach_listviewing,
                R.id.beach_text,waterfall_list);
        waterfall.setAdapter(adapter);
        waterfall.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(waterfall.this,humhum.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(waterfall.this,jadipaiFall.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent =new Intent(waterfall.this,khoicharaFall.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent =new Intent(waterfall.this,madhabkundoFall.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent =new Intent(waterfall.this,nafakumFall.class);
                    startActivity(intent);
                }

            }
        });
    }
}
