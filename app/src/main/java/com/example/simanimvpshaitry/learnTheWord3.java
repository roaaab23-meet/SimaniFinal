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

public class learnTheWord3 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton backbutton;
    private TextView textView;
    private ImageView niceGif;
    private Button nextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_the_word3);
        backbutton=findViewById(R.id.backbutton);
        textView=findViewById(R.id.textView);
        niceGif=findViewById(R.id.niceGif);
        nextPage=findViewById(R.id.nextPage);
        backbutton.setOnClickListener(this);
        nextPage.setOnClickListener(this);
        //making the gif move.
        GifDrawable gifDrawable;
        try {
            gifDrawable = new GifDrawable(getResources(), R.raw.nice);
            niceGif.setImageDrawable(gifDrawable);
            gifDrawable.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        if(view==backbutton){
            Intent i = new Intent(this, learnTheWord2.class);
            startActivity(i);
        }
        if(view==nextPage){
            Intent i = new Intent(this, learnTheWord4.class);
            startActivity(i);
        }
    }
}