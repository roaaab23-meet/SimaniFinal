package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class heb_courses_activity extends AppCompatActivity {
    ImageView square1;
    ImageView square2;
    ImageView square3;
    ImageView square4;
    ImageView square5;
    ImageView square6;
    ImageView progress;
    ImageView home;
    ImageView communication;
    ImageView menu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heb_courses);
//        square1 = findViewById(R.id.square1);
//
//        square2 = findViewById(R.id.square2);
//
//        square3 = findViewById(R.id.square3);
//
//        square4 = findViewById(R.id.square4);
//
//        square5 = findViewById(R.id.square5);
//
//        square6 = findViewById(R.id.square6);
//
//        progress = findViewById(R.id.proggress);
//
//        home= findViewById(R.id.home);
//
//        communication = findViewById(R.id.communication);
//
//        menu= findViewById(R.id.menu);
    }
        public void on_square1(View view){
            Intent i = new Intent(getApplicationContext(), hebrew_homepage.class);
//        i.putExtra("Value1", "Android By Javatpoint");
//        i.putExtra("Value2", "Simple Tutorial");
//        // Set the request code to any code you like, you can identify the
//        // callback via this code
            startActivity(i);
        }
    }

