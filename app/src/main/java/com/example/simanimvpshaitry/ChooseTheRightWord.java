package com.example.simanimvpshaitry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

public class ChooseTheRightWord extends AppCompatActivity implements View.OnClickListener {
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
    private ImageButton buttonBack;
    ImageView video;
    private String answer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_the_right_word);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        buttonBack=findViewById(R.id.backbutton);
        video=findViewById(R.id.schoolgif);
        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
        buttonBack.setOnClickListener(this);
        gifMake(video);
    }
    public void gifMake(ImageView gif){
        //making the gif move.
        GifDrawable gifDrawable;
        try {
            gifDrawable = new GifDrawable(getResources(), R.raw.headache);
            gif.setImageDrawable(gifDrawable);
            gifDrawable.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        if(view==option4){
            Intent i = new Intent(this, learnTheWord2.class);
            startActivity(i);
        }
        if(view==buttonBack){
            Intent i = new Intent(this, WriteTheSentenceInHebrew.class);
            startActivity(i);
        }

    }
}