package com.example.farmlyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Farmer extends AppCompatActivity {
    Button mPesticides;
    Button mselect4;
    Button mselect1;
    Button mselect2;
    Button mselect3;
    Button mback;
    Button mhelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_farmer);
        mPesticides = findViewById(R.id.button);
        mselect1 = findViewById(R.id.button1);
        mselect2 = findViewById(R.id.button4);
        mselect3 = findViewById(R.id.button5);
        mselect4 = findViewById(R.id.button6);
        mback = findViewById(R.id.button2);
        mhelp = findViewById(R.id.button3);

        mPesticides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Pesticides.class));


            }
        });
        mselect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Goodsdetails.class));



            }
        });
        mselect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Goodsdetails.class));



            }
        });
        mselect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Goodsdetails.class));



            }
        });
        mselect4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Goodsdetails.class));



            }
        });
        mback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FarmerOrUser.class));
                finish();


            }
        });
        mhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Help.class));



            }
        });
    }
}