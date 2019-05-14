package com.helpme.helpmenew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceProvActivity extends AppCompatActivity {

    private Button mMech, mVehRepC, mResVehc, mTexis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_prov);

        mMech = (Button) findViewById(R.id.mechBtn);
        mVehRepC = (Button) findViewById(R.id.vehrepcBtn);
        mResVehc = (Button) findViewById(R.id.resvehsBtn);
        mTexis = (Button) findViewById(R.id.taxisBtn);

        startService(new Intent(ServiceProvActivity.this, onAppKilled.class));
        mMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceProvActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mVehRepC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceProvActivity.this, VehRepCentrLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mResVehc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceProvActivity.this, ResVehLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mTexis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceProvActivity.this, TaxiLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}




