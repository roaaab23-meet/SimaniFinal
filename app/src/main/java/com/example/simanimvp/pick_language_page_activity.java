

	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		pick_language_page
	 *	@date 		Sunday 16th of July 2023 04:18:55 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.simanimvp;

	import android.annotation.SuppressLint;
	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
	import android.widget.ImageView;
	import android.widget.TextView;

	public class pick_language_page_activity extends Activity {


	private View _bg__pick_language_page_ek2;
	private ImageView ellipse_1;
	private View rectangle_87;
	private TextView save_ek1;
	private ImageView logo;
	private Button rectangle_94;
	private TextView arabic_ek1;
	private Button rectangle_94_ek1;
	private TextView hebrew_ek1;
	private TextView pick_a_language;

	@SuppressLint("WrongViewCast")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pick_language_page);

		
		_bg__pick_language_page_ek2 = (View) findViewById(R.id._bg__pick_language_page_ek2);
		ellipse_1 = (ImageView) findViewById(R.id.ellipse_1);
		rectangle_87 = (View) findViewById(R.id.rectangle_87);
		save_ek1 = (TextView) findViewById(R.id.save_ek1);
		logo = (ImageView) findViewById(R.id.logo);
		rectangle_94 = findViewById(R.id.rectangle_94);
		arabic_ek1 = (TextView) findViewById(R.id.arabic_ek1);
		rectangle_94_ek1 =findViewById(R.id.rectangle_94_ek1);
		hebrew_ek1 = (TextView) findViewById(R.id.hebrew_ek1);
		pick_a_language = (TextView) findViewById(R.id.pick_a_language);
	
		
		//custom code goes here
		rectangle_94.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i=new Intent(getApplicationContext(), HebHomePage.class );
				startActivity(i);
			}
		});

		rectangle_94_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i=new Intent(getApplicationContext(), arbhomepage_activity.class );
				startActivity(i);
			}
		});
	
	}
}
	
	