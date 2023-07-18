package com.example.simanimvpshaitry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
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

        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video1Clicked = true;
                checkClickOrder();
            }
        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video2Clicked = true;
                checkClickOrder();
            }
        });
        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video3Clicked = true;
                checkClickOrder();
            }
        });
        video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video4Clicked = true;
                checkClickOrder();
            }
        });
        word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word1Clicked = true;
                checkClickOrder();
            }
        });
        word2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word2Clicked = true;
                checkClickOrder();
            }
        });
        word3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word3Clicked = true;
                checkClickOrder();
            }
        });
        word4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word4Clicked = true;
                checkClickOrder();
            }
        });
    }
    
    private void checkClickOrder() {
        if (video1Clicked && word1Clicked) {
            // Both video1 and word2 were clicked in the desired order
            // Start a new activity or perform any desired action here
            startActivity(new Intent(this, ArabicLevels.class));
            // Reset the click order tracking for future use if needed
            video1Clicked = false;
            word1Clicked = false;
        }
        if (video2Clicked && word3Clicked) {
            // Both video1 and word2 were clicked in the desired order
            // Start a new activity or perform any desired action here
            startActivity(new Intent(this, ArabicLevels.class));
            // Reset the click order tracking for future use if needed
            video2Clicked = false;
            word3Clicked = false;
        }
        if (video3Clicked && word2Clicked) {
            // Both video1 and word2 were clicked in the desired order
            // Start a new activity or perform any desired action here
            startActivity(new Intent(this, ArabicLevels.class));
            // Reset the click order tracking for future use if needed
            video3Clicked = false;
            word2Clicked = false;
        }
        if (video4Clicked && word4Clicked) {
            // Both video1 and word2 were clicked in the desired order
            // Start a new activity or perform any desired action here
            startActivity(new Intent(this, ArabicLevels.class));
            // Reset the click order tracking for future use if needed
            video4Clicked = false;
            word4Clicked = false;
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

    @Override
    public void onClick(View view) {

    }
}

