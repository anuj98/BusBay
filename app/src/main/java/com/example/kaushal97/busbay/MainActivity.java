package com.example.kaushal97.busbay;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

   Spinner s1,s2,s3;
    DrawerLayout mDrawerLayout;
    String city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            s1=findViewById(R.id.loc0);

            s2=findViewById(R.id.loc1);

        s3=findViewById(R.id.loc2);

        ArrayAdapter<CharSequence> adapter0 =  ArrayAdapter.createFromResource(this,
                R.array.main_array, android.R.layout.simple_spinner_item);

        adapter0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter0.isEnabled(0);
        s1.setAdapter(adapter0);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                city=s1.getSelectedItem().toString();
                if(city.equals("Chandigarh")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.from_array, android.R.layout.simple_spinner_item);
                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.from_array, android.R.layout.simple_spinner_item);

                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s2.setAdapter(adapter1);
                    s3.setAdapter(adapter2);
                }
                else{
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.from_array1, android.R.layout.simple_spinner_item);
                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.from_array1, android.R.layout.simple_spinner_item);

                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s2.setAdapter(adapter1);
                    s3.setAdapter(adapter2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        mDrawerLayout = findViewById(R.id.drawer_layout);

        final NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        switch(menuItem.getItemId()){
                            case R.id.route:
                                Intent intent2 = new Intent(MainActivity.this,GlobalPosition.class);
                                startActivity(intent2);
                                break;
                            case R.id.gallery:
                                Intent intent3 = new Intent();
                                break;
                            case R.id.helpline:
                                Intent intent4 = new Intent();
                                break;
                            case R.id.about:
                                Intent about = new Intent(MainActivity.this,appInfo.class);
                                startActivity(about);
                        }
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_dehaze_black_24dp);

    }
    public void findresult(View view){
        String initial=s2.getSelectedItem().toString();
        String finalx=s3.getSelectedItem().toString();
        Intent intent=new Intent(this,databaseClass.class);
        intent.putExtra("city",city);
        intent.putExtra("initial",initial);
        intent.putExtra("finalx",finalx);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
