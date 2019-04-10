package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {

        public GridView division_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        division_grid = findViewById(R.id.division_view);
        final String [] divisions_list = getResources().getStringArray(R.array.division_name);
        ArrayAdapter <String> gridAdapter = new ArrayAdapter<String>(this,R.layout.grid_viewing,
                R.id.division_text,divisions_list);
        division_grid.setAdapter(gridAdapter);
        division_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(MainActivity.this,Dhaka_place.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Dhaka city",Toast.LENGTH_LONG).show();
                }else if (position==1){
                    Intent intent = new Intent(MainActivity.this,Rajshahi_place.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Rajshahi city",Toast.LENGTH_LONG).show();
                }
                else if(position==2){
                    Intent intent=new Intent(MainActivity.this,Rangpur_city.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Rangpur city",Toast.LENGTH_LONG).show();
                }
                else if(position==3){
                    Intent intent=new Intent(MainActivity.this,khulna_city.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Khulna city",Toast.LENGTH_LONG).show();
                }
                else if(position==4){
                    Intent intent=new Intent(MainActivity.this,chattagram_city.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Chattagram city",Toast.LENGTH_LONG).show();
                }
                else if(position==5){
                    Intent intent=new Intent(MainActivity.this,Barisal_city.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Barisal city",Toast.LENGTH_LONG).show();
                }
                else if(position==6){
                    Intent intent=new Intent(MainActivity.this,sylhet_city.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Sylhet city",Toast.LENGTH_LONG).show();
                }
                else if(position==7){
                    Intent intent=new Intent(MainActivity.this,mymensingh_city.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"about Mymensingh city",Toast.LENGTH_LONG).show();
                }
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.mShare:

                Intent i = new Intent(android.content.Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(android.content.Intent.EXTRA_TEXT,
                        "My new app https://play.google.com/store/search?q=TECHHUBINDIAN");
                startActivity(Intent.createChooser(i,"Share Via"));
                break;
        }
        Toast.makeText(getApplicationContext(), "You click on menu share", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);

    }


    // Menu Iteam Section///********

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.weather) {
            // Handle the weather activity
            Intent intent = new Intent(MainActivity.this,weatherActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MainActivity.this,GalaryActivity.class);
            startActivity(intent);

        } else if (id == R.id.nearest) {
            Intent intent = new Intent(MainActivity.this,MapsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_videos) {
            Intent intent = new Intent(MainActivity.this,Videos.class);
            startActivity(intent);

        } /*else if (id == R.id.nav_share) {
        }*/
        else if (id == R.id.nav_about) {
            Intent intent = new Intent(MainActivity.this,about.class);
            startActivity(intent);
        }
        else if (id == R.id.feedback) {
            Intent intent = new Intent(MainActivity.this,feedback.class);
            startActivity(intent);
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
