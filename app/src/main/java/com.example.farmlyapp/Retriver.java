package com.example.farmlyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Retriver extends AppCompatActivity {
    Button mnext;
    Button mCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retriver);

        mnext = findViewById(R.id.button7);
        mCheckout = findViewById(R.id.button8);

        mnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Retreiver2.class));
                finish();
            }
        });
        mCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Checkout.class));
                finish();
            }
        });
    }
}