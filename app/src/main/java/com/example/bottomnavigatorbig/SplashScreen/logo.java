package com.example.bottomnavigatorbig.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.bottomnavigatorbig.MainActivity;
import com.example.bottomnavigatorbig.R;

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
