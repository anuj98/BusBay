package com.example.kaushal97.busbay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class appInfo extends AppCompatActivity{

    TextView versionNo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        versionNo = findViewById(R.id.ver);
        String versionName;
        try {
            versionName = getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 0).versionName;
            versionNo.setText(versionName);
        }catch(Exception e){
            Log.d("Hello","Hello");
        }
    }
}
