package com.example.simanimvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickLanguage extends AppCompatActivity {
    Button HebBtn;
    Button ArbBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_language);

        HebBtn=findViewById(R.HebBtn);
        ArbBtn=findViewById(R.ArbBtn);
        HebBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), HebHomePage.class );
                startActivity(i);
            }
        });

        ArbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), ArbHomePage.class );
                startActivity(i);
            }
        });
    }
}