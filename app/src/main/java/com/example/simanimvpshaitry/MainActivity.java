package com.example.simanimvpshaitry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Intent i = new Intent(getApplicationContext(), arabic_homepage.class);
//        i.putExtra("Value1", "Android By Javatpoint");
//        i.putExtra("Value2", "Simple Tutorial");
//        // Set the request code to any code you like, you can identify the
//        // callback via this code
        startActivity(i);
    }

}