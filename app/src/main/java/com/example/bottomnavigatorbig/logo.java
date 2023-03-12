package com.example.bottomnavigatorbig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        getSupportActionBar().hide();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run () {
                // code
                Intent intent = new Intent(logo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }
}



//<activity
//            android:name=".logo"
//                    android:exported="true">
//<intent-filter>
//<action android:name="android.intent.action.MAIN" />
//
//<category android:name="android.intent.category.LAUNCHER" />
//</intent-filter>
//
//
//</activity>
