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

public class Goodsdetails extends AppCompatActivity {

    TextInputLayout mitem,mquantity,mharvesting,mlocation;
    private Button eupdate;
    private Button eback;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodsdetails);
        getSupportActionBar().hide();

        eback = findViewById(R.id.back);
        eupdate = findViewById(R.id.update);
        mitem = findViewById(R.id.item);
        mquantity= findViewById(R.id.Quantity);
        mharvesting= findViewById(R.id.harvesting);
        mlocation = findViewById(R.id.Location);



        eupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("item");
                Toast.makeText(Goodsdetails.this, "Goods Details Are Updated", Toast.LENGTH_SHORT).show();

                String Item = mitem.getEditText().getText().toString();
                String Quantity = mquantity.getEditText().getText().toString();
                String Harvesting = mharvesting.getEditText().getText().toString();
                String Location = mlocation.getEditText().getText().toString();
                UserHelperClass helperClass = new UserHelperClass(Item,Quantity,Harvesting,Location);

                reference.child(Item).setValue(helperClass);
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