package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class alphbetISL extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphbet_isl);
        imageView8=findViewById(R.id.imageView8);
        imageView8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==imageView8){
            Intent i = new Intent(this, heb_home_activity.class);
            startActivity(i);
        }
    }
}