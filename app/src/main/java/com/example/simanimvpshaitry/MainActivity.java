package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectLanguage(View view) {
        int id = view.getId();
        Intent intent;

        if (id == R.id.btnHebrew) {
            intent = new Intent(this, HebrewLevels.class);
        } else if (id == R.id.btnArabic) {
            intent = new Intent(this, ArabicLevels.class);
        } else {
            return; // Return if an unknown button is clicked
        }

        startActivity(intent);
    }
}