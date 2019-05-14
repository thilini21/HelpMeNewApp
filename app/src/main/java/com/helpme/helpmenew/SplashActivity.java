package com.helpme.helpmenew;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private static int Splash_time = 8000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, UserServActivity.class);
                startActivity(intent);

            }
        }, Splash_time);

    ImageView bgapp, clover, logo;


        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        logo = (ImageView) findViewById(R.id.logo);

        bgapp.animate().translationY(-400).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(8000).setStartDelay(4000);
        logo.animate().translationY(140).alpha(0).setDuration(8000).setStartDelay(2000);

    }
}

