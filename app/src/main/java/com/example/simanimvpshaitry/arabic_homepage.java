package com.example.simanimvpshaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class arabic_homepage extends AppCompatActivity {
    View level1;
    View level2;
    View catagory;
    View community;
    View dictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_homepage);
//        Bundle extras = getIntent().getExtras();
//        String value1 = extras.getString("Value1");
//        String value2 = extras.getString("Value2");
//        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
//                "\n Second Value: "+value2, Toast.LENGTH_LONG).show();
    }
    public void startthis(View view){
        Intent i = new Intent(getApplicationContext(), ChooseTheRightWord.class);
        startActivity(i);
    }

}


//        catagory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(getApplicationContext(), catagorypage.class );
//                startActivity(i);
//            }
//        });

//        community.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(getApplicationContext(), communitypage.class );
//                startActivity(i);
//            }
//        });

//        dictionary.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(getApplicationContext(), dictionarypage.class );
//                startActivity(i);
//            }
//        });

//       level1.setOnClickListener(new View.OnClickListener() {
//           @Override
//            public void onClick(View view) {
//               Intent i=new Intent(getApplicationContext(), WriteTheSentenceInHebrew.class );
//                startActivity(i);
//            }
//       });

//        level2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(getApplicationContext(), dictionarypage???????.class );
//                startActivity(i);
//            }
//        });
