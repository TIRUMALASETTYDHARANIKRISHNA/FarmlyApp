package com.example.farmlyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Checkout extends AppCompatActivity {

    TextInputLayout mdoorno,marea,mcity,mpincode,mstate,mname;
    private Button eupdate;
    private Button eback;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        getSupportActionBar().hide();

        eback = findViewById(R.id.back);
        eupdate = findViewById(R.id.update);
        mdoorno = findViewById(R.id.doorno);
        marea= findViewById(R.id.Area);
        mcity= findViewById(R.id.city);
        mpincode = findViewById(R.id.Pincode);
        mstate= findViewById(R.id.State);
        mname= findViewById(R.id.name);



        eupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("address");
                Toast.makeText(Checkout.this, "Delivery Will Be Done Within 2days. Details Will Be sent Registered Mail Id", Toast.LENGTH_SHORT).show();

                String Doorno = mdoorno.getEditText().getText().toString();
                String Area = marea.getEditText().getText().toString();
                String city = mcity.getEditText().getText().toString();
                String Pincode = mpincode.getEditText().getText().toString();
                String State = mstate.getEditText().getText().toString();
                String Name = mname.getEditText().getText().toString();
                UserHelperClass1 helperClass = new UserHelperClass1(Name,Doorno,Area,city,Pincode,State);

                reference.child(city).setValue(helperClass);
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        eback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Farmer.class));
                finish();

            }
        });

    }
}