package com.example.simanimvpshaitry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
 private ImageButton hebrewbtn;
 private ImageButton arabicbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hebrewbtn = findViewById(R.id.hebrewbtn);
        arabicbtn = findViewById(R.id.arabicbtn);
        hebrewbtn.setOnClickListener(this);
        arabicbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == hebrewbtn){
            Intent intent = new Intent(this,heb_home_activity.class);
            startActivity(intent);

    }

    if (view == arabicbtn){

    Intent intent = new Intent(this,heb_home_activity.class);
    startActivity(intent);
    }}
//    public void callSecondActivity(View view){
//        Intent i = new Intent(getApplicationContext(), heb_home_activity.class);
//        i.putExtra("Value1", "Android By Javatpoint");
//        i.putExtra("Value2", "Simple Tutorial");
//        // Set the request code to any code you like, you can identify the
//        // callback via this code
//        startActivity(i);
//    }
//
//    public void startnow(View view){
//        Intent i=new Intent(this, heb_home_activity.class);
//        startActivity(i);
//    }


}
