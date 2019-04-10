package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class museam_list extends AppCompatActivity {
    private ListView museam_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museam_list);
        museam_list = findViewById(R.id.museams_list);

        final String [] museams_list = getResources().getStringArray(R.array.museams_list);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(museam_list.this,R.layout.list_viewing,
                R.id.museam_text,museams_list);
        museam_list.setAdapter(adapter);
        museam_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent = new Intent(com.example.shuvo.tourtravel.museam_list.this,ArmyMuseum.class);
                    startActivity(intent);
                    Toast.makeText(com.example.shuvo.tourtravel.museam_list.this,"details of Army Museum",Toast.LENGTH_SHORT).show();
                }
                else if (position==1)
                {
                    Intent intent = new Intent(com.example.shuvo.tourtravel.museam_list.this,National_museum.class);
                    startActivity(intent);
                    Toast.makeText(com.example.shuvo.tourtravel.museam_list.this,"details of National Museum",Toast.LENGTH_SHORT).show();
                }
                else if (position==2)
                {
                    Intent intent = new Intent(com.example.shuvo.tourtravel.museam_list.this,AirForceMuseum.class);
                    startActivity(intent);
                    Toast.makeText(com.example.shuvo.tourtravel.museam_list.this,"details of Air Force Museum",Toast.LENGTH_LONG).show();
                }
                else if (position==3)
                {
                    Intent intent =new Intent(com.example.shuvo.tourtravel.museam_list.this,Money_Museum.class);
                    startActivity(intent);
                    Toast.makeText(com.example.shuvo.tourtravel.museam_list.this,"details of Bangladesh Taka Museum",Toast.LENGTH_LONG).show();
                }
                else if (position==4)
                {
                    Intent intent = new Intent(com.example.shuvo.tourtravel.museam_list.this,Libaration_museum.class);
                    startActivity(intent);
                    Toast.makeText(com.example.shuvo.tourtravel.museam_list.this,"images and details of Libaration War Museam Bangladesh of Police",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
