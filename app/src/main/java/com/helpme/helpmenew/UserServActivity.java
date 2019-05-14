package com.helpme.helpmenew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class UserServActivity extends AppCompatActivity {
        private ImageView bellcon, bitcon;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_user_serv);

            bellcon = (ImageView) findViewById(R.id.bellcon);
            bitcon = (ImageView) findViewById(R.id.biton);


            startService(new Intent(UserServActivity.this, onAppKilled.class));
            bellcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UserServActivity.this, CustomerLoginActivity.class);
                    startActivity(intent);
                    finish();
                    return;
                }
            });

            bitcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UserServActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    return;
                }
            });
        }
}

