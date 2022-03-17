package com.example.produits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {

ImageButton button ;
    ImageButton button2 ;
    ImageButton button3 ;
    ImageButton button4 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.next1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),produit1.class);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.next2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),produit2.class);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.next3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),produit3.class);
                startActivity(intent);
            }
        });
        button4 = findViewById(R.id.next4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),produit4.class);
                startActivity(intent);
            }
        });
    }}