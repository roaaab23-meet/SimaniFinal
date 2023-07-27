package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

public class learnTheWord1 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton backbutton;
    private TextView textView;
    private ImageView thankYouGif;
    private Button nextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_the_word1);
        backbutton=findViewById(R.id.backbutton);
        textView=findViewById(R.id.textView);
        thankYouGif=findViewById(R.id.thankYouGif);
        nextPage=findViewById(R.id.nextPage);
        backbutton.setOnClickListener(this);
        nextPage.setOnClickListener(this);
        //making the gif move.
        GifDrawable gifDrawable;
        try {
            gifDrawable = new GifDrawable(getResources(), R.raw.pain);
            thankYouGif.setImageDrawable(gifDrawable);
            gifDrawable.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        if(view==backbutton){
            Intent i = new Intent(this, learnTheWord.class);
            startActivity(i);
        }
        if(view==nextPage){
            Intent i = new Intent(this, WriteTheSentenceInHebrew.class);
            startActivity(i);
        }
    }
}