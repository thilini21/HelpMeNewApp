package com.helpme.helpmenew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SplashActivity extends AppCompatActivity {

    ImageView bgapp, clover, logo;
    Animation frombottom;
    LinearLayout menus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        logo = (ImageView) findViewById(R.id.logo);
        menus = (LinearLayout) findViewById(R.id.menus);


        bgapp.animate().translationY(-600).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(8000).setStartDelay(4000);
        logo.animate().translationY(140).alpha(0).setDuration(8000).setStartDelay(2000);


        







    }
}
