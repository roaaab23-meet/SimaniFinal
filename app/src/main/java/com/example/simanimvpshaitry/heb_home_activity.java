package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class heb_home_activity extends AppCompatActivity implements View.OnClickListener {
    ImageView korseem;
    ImageView alpha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heb_home);
        korseem = findViewById(R.id.korseem);
        alpha=findViewById(R.id.alpha);
        korseem.setOnClickListener(this);
        alpha.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view==korseem){
            Intent i = new Intent(this, heb_courses_activity.class);
            startActivity(i);
        }
        if(view==alpha){
            Intent i = new Intent(this, alphbetISL.class);
            startActivity(i);
        }
    }
}