package com.example.simanimvpshaitry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

public class WriteTheSentenceInHebrew extends AppCompatActivity implements View.OnClickListener {
    ImageView video;
    private Button submitAnswerButton;
    private EditText answer;
    private ImageButton buttonBack;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_the_sentence_in_hebrew);
        video = findViewById(R.id.whatsyournameGif);
        submitAnswerButton=findViewById(R.id.submitAnswerButton);
        answer=findViewById(R.id.answerUser);
        buttonBack=findViewById(R.id.backbutton);
        submitAnswerButton.setOnClickListener(this);
        buttonBack.setOnClickListener(this);
        //making the gif move.
        GifDrawable gifDrawable;
        try {
            gifDrawable = new GifDrawable(getResources(), R.raw.where);
            video.setImageDrawable(gifDrawable);
            gifDrawable.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        if(view==submitAnswerButton){
            String enteredAnswer = answer.getText().toString();
            if(!enteredAnswer.equals("איפה כואב לך?")&&!enteredAnswer.equals("איפה כואב לך?")&&!enteredAnswer.equals("שלום ")){
                answer.setText("");
            }
            else {
                Intent i = new Intent(this, ChooseTheRightWord.class);
                startActivity(i);
            }
        }
        if(view==buttonBack){
            Intent i = new Intent(this, learnTheWord1.class);
            startActivity(i);
        }
    }
}