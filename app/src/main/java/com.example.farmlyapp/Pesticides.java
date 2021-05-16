package com.example.farmlyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pesticides extends AppCompatActivity {
    Button mFarmHome;
    Button mContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pesticides);

        mFarmHome = findViewById(R.id.button1);
        mContact = findViewById(R.id.button2);

        mFarmHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Farmer.class));
                finish();

            }
        });
        mContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Help.class));
                finish();

            }
        });
    }
}