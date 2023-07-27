package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class arabic_homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_homepage);
    }

    public void startthistwo(View view){
        Intent i = new Intent(getApplicationContext(), learnTheWord.class);
        startActivity(i);
    }

}
