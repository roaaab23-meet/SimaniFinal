package com.example.simanimvpshaitry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

public class ConnectTheWordsCourse extends AppCompatActivity implements View.OnClickListener {
    private ImageView video1;
    private ImageView video2;
    private ImageView video3;
    private ImageView video4;
    private TextView word1;
    private TextView word2;
    private TextView word3;
    private TextView word4;
    private boolean video1Clicked = false;
    private boolean video2Clicked = false;
    private boolean video3Clicked = false;
    private boolean video4Clicked = false;
    private boolean word1Clicked = false;
    private boolean word2Clicked = false;
    private boolean word3Clicked = false;
    private boolean word4Clicked = false;
    private int wordImageDuoCount=0;
    private int goToNewPage=0;//goes to a new page when goToNewPage=4
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_the_words_course);
        video1=findViewById(R.id.video1);
        video2=findViewById(R.id.video2);
        video3=findViewById(R.id.video3);
        video4=findViewById(R.id.video4);
        word1=findViewById(R.id.word1);
        word2=findViewById(R.id.word2);
        word3=findViewById(R.id.word3);
        word4=findViewById(R.id.word4);
        gifMake(video1);
        gifMake(video2);
        gifMake(video3);
        gifMake(video4);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == video1) {
                    video1Clicked = true;
                    wordImageDuoCount++;
                } else if (v == video2) {
                    video2Clicked = true;
                    wordImageDuoCount++;
                }else if (v == video3) {
                    video3Clicked = true;
                    wordImageDuoCount++;
                }else if (v == video4) {
                    video4Clicked = true;
                    wordImageDuoCount++;
                }else if (v == word1) {
                    word1Clicked = true;
                    wordImageDuoCount++;
                }
                else if (v == word2) {
                    word2Clicked = true;
                    wordImageDuoCount++;
                }
                else if (v == word3) {
                    word3Clicked = true;
                    wordImageDuoCount++;
                }else if (v == word4) {
                    word4Clicked = true;
                    wordImageDuoCount++;
                }
                checkClickOrder();
            }
        };
        video1.setOnClickListener(clickListener);
        word1.setOnClickListener(clickListener);
        video2.setOnClickListener(clickListener);
        word2.setOnClickListener(clickListener);
        video3.setOnClickListener(clickListener);
        word3.setOnClickListener(clickListener);
        video4.setOnClickListener(clickListener);
        word4.setOnClickListener(clickListener);
    }

    private void checkClickOrder() {
        if(wordImageDuoCount==2) {
            if (video1Clicked && word1Clicked) {
                goToNewPage++;
                wordImageDuoCount = 0;
                video1Clicked = false;
                word1Clicked = false;
                video1.setBackgroundResource(R.drawable.frameafterfinished);
                word1.setBackgroundResource(R.drawable.frameafterfinished);
                checkIfGoNewPage();

            } else if (video2Clicked && word3Clicked ) {
                goToNewPage++;
                wordImageDuoCount = 0;
                video2Clicked = false;
                word3Clicked = false;
                video2.setBackgroundResource(R.drawable.frameafterfinished);
                word3.setBackgroundResource(R.drawable.frameafterfinished);
                checkIfGoNewPage();
            } else if (video3Clicked && word2Clicked ) {
                goToNewPage++;
                wordImageDuoCount = 0;
                video3Clicked = false;
                word2Clicked = false;
                video3.setBackgroundResource(R.drawable.frameafterfinished);
                word2.setBackgroundResource(R.drawable.frameafterfinished);
                checkIfGoNewPage();
            } else if (video4Clicked && word4Clicked ) {
                goToNewPage++;
                wordImageDuoCount = 0;
                video4Clicked = false;
                word4Clicked = false;
                video4.setBackgroundResource(R.drawable.frameafterfinished);
                word4.setBackgroundResource(R.drawable.frameafterfinished);
                checkIfGoNewPage();
            }
            else{
                wordImageDuoCount = 0;
                video1Clicked = false;
                video2Clicked = false;
                video3Clicked = false;
                video4Clicked = false;
                word1Clicked = false;
                word2Clicked = false;
                word3Clicked = false;
                word4Clicked = false;
            }
        }
    }

    public void gifMake(ImageView gif){
        //making the gif move.
        GifDrawable gifDrawable;
        try {
            gifDrawable = new GifDrawable(getResources(), R.raw.school);
            gif.setImageDrawable(gifDrawable);
            gifDrawable.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void checkIfGoNewPage()
    {
        if(goToNewPage==4) {
            goToNewPage=0;
            startActivity(new Intent(ConnectTheWordsCourse.this, ArabicLevels.class));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    emptyFrame();
                    // Code to be executed after the delay
                    // Insert the desired actions or code here
                }
            }, 1000); // 1000 milliseconds = 1 second

        }
    }
    public void emptyFrame()
    {
        video1.setBackgroundColor(Color.WHITE);
        word1.setBackgroundColor(Color.WHITE);
        video2.setBackgroundColor(Color.WHITE);
        word2.setBackgroundColor(Color.WHITE);
        video3.setBackgroundColor(Color.WHITE);
        word3.setBackgroundColor(Color.WHITE);
        video4.setBackgroundColor(Color.WHITE);
        word4.setBackgroundColor(Color.WHITE);
    }
    @Override
    public void onClick(View view) {

    }
}

