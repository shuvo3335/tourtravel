package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class beach extends AppCompatActivity {
    ListView beachList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach);
        beachList=findViewById(R.id.beach_list);
        final String [] beach_list = getResources().getStringArray(R.array.beach_list);
        ArrayAdapter <String> adapter = new ArrayAdapter<>(beach.this,R.layout.beach_listviewing,
                R.id.beach_text,beach_list);
        beachList.setAdapter(adapter);
        beachList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(beach.this,cox_beach.class);
                    startActivity(intent);
                    Toast.makeText(beach.this,"Cox's Bazar Sea Beach",Toast.LENGTH_LONG).show();
                }
                if (position==1){
                    Intent intent = new Intent(beach.this,saintMartin.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(beach.this,kuakataBeach.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(beach.this,potengaBeach.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(beach.this,nijhumBeach.class);
                    startActivity(intent);
                }
            }
        });
    }
}
