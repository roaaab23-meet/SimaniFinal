package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class heb_home_activity extends AppCompatActivity {
    ImageView korseem;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heb_home);
        korseem = findViewById(R.id.korseem);

    }

    public void korseem(View view){
        Intent i = new Intent(this, heb_courses_activity.class);
        startActivity(i);
    }
}