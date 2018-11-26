package com.example.ricardovalleramire.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.StandardSocketOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//grafics
        Button firstButton = (Button) findViewById(R.id.btn1);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graphics.class);
                startActivity(intent);
            }
        });
//stadistics
        Button firstButton2 = (Button) findViewById(R.id.btn2);
        firstButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Stadistics.class);
                startActivity(intent);
            }
        });

//maps
        Button firstButton3 = (Button) findViewById(R.id.btn3);
        firstButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(
                        "http://maps.google.com/maps?q=loc:51.5, 0.125"));
                startActivity(intent);
            }
        });

//comunicacion
        Button firstButton4 = (Button) findViewById(R.id.btn4);
        firstButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Comunication.class);
                startActivity(intent);
            }
        });


    }
}
