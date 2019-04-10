package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Heritages extends AppCompatActivity {
        private ListView heritage_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heritages);
        heritage_list=findViewById(R.id.heritage_list);
        final String[] heri_list = getResources().getStringArray(R.array.heritage_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Heritages.this,R.layout.beach_listviewing,
                R.id.beach_text,heri_list);
        heritage_list.setAdapter(adapter);
        heritage_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(Heritages.this,lalbag_heri.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(Heritages.this,sritysoudho.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(Heritages.this,sonargaon.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(Heritages.this,AhsanManzil.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(Heritages.this,Shatgumbuj.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent = new Intent(Heritages.this,shundarban.class);
                    startActivity(intent);
                }
                if (position==6){
                    Intent intent = new Intent(Heritages.this,paharpur.class);
                    startActivity(intent);
                }
                if (position==7){
                    Intent intent = new Intent(Heritages.this,mohastangarh.class);
                    startActivity(intent);
                }
                if (position==8){
                    Intent intent = new Intent(Heritages.this,NatorRajbari.class);
                    startActivity(intent);
                }
            }
        });
    }
}
