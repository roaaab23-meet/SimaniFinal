package com.example.simanimvpshaitry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HebrewLevels extends AppCompatActivity implements View.OnClickListener {
    private TextView hello;
    private Button circleButton1;
    private Button circleButton2;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //hello=findViewById(R.id.hello);
        circleButton1=findViewById(R.id.circleButton1);
        circleButton2=findViewById(R.id.circleButton2);
        circleButton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==circleButton1){
            Intent i=new Intent(this,learnTheWord.class);
            startActivity(i);
        }
    }
}