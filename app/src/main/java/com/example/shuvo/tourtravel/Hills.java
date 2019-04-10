package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hills extends AppCompatActivity {
private ListView hills_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hills);
        hills_list = findViewById(R.id.hills_list);
        final String[] hill_list = getResources().getStringArray(R.array.hills_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Hills.this,R.layout.beach_listviewing,
                R.id.beach_text,hill_list);
        hills_list.setAdapter(adapter);
        hills_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                if (position==0)
                {
                    intent = new Intent(Hills.this,keukradong.class);
                    startActivity(intent);
                }
                if (position==1){
                    intent = new Intent(Hills.this,Sajek.class);
                    startActivity(intent);
                }
                if (position==2){
                    intent = new Intent(Hills.this,tajing.class);
                    startActivity(intent);
                }
                if (position==3){
                    intent = new Intent(Hills.this,foysLake.class);
                    startActivity(intent);
                }
                if (position==4){
                    intent = new Intent(Hills.this,chimbukHill.class);
                    startActivity(intent);
                }
            }
        });
    }
}
