package com.example.farmlyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FarmerOrUser extends AppCompatActivity {
    Button mhelp;
    Button mProfile;
    Button mFarmer;
    Button mRetreiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_farmer_or_user);

        mhelp = findViewById(R.id.button3);
        mProfile = findViewById(R.id.button4);
        mFarmer = findViewById(R.id.button6);
        mRetreiver = findViewById(R.id.button5);

        mhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Help.class));

            }
        });
        mProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });
        mFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Farmer.class));

            }
        });
        mRetreiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Retriver.class));

            }
        });
    }
}