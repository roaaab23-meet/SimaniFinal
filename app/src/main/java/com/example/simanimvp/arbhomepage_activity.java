
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		arbhomepage
	 *	@date 		Sunday 16th of July 2023 09:47:45 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.simanimvp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class arbhomepage_activity extends Activity {

	
	private View _bg__arbhomepage_ek2;
	private ImageView vector_2;
	private TextView __________;
	private View ellipse_for_icon;
	private ImageView icon_character;
	private View ellipse_1;
	private ImageView home_page_icon;
	private View ellipse_17;
	private View ellipse_20;
	private View ellipse_21;
	private View ellipse_17_ek1;
	private TextView _______4;
	private View ellipse_17_ek2;
	private View ellipse_18;
	private View ellipse_19;
	private View ellipse_17_ek3;
	private View ellipse_22;
	private TextView _______1;
	private TextView _______2;
	private TextView _______5;
	private TextView _______6;
	private TextView _______7;
	private TextView _______8;
	private TextView _______9;
	private TextView _______3;
	private View ellipse_2;
	private ImageView vector;
	private View ellipse_4;
	private ImageView vector_ek1;
	private View ellipse_4_ek1;
	private ImageView vector_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.arbhomepage);

		
		_bg__arbhomepage_ek2 = (View) findViewById(R.id._bg__arbhomepage_ek2);
		vector_2 = (ImageView) findViewById(R.id.vector_2);
		__________ = (TextView) findViewById(R.id.__________);
		ellipse_for_icon = (View) findViewById(R.id.ellipse_for_icon);
		icon_character = (ImageView) findViewById(R.id.icon_character);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		home_page_icon = (ImageView) findViewById(R.id.home_page_icon);
		ellipse_17 = (View) findViewById(R.id.ellipse_17);
		ellipse_20 = (View) findViewById(R.id.ellipse_20);
		ellipse_21 = (View) findViewById(R.id.ellipse_21);
		ellipse_17_ek1 = (View) findViewById(R.id.ellipse_17_ek1);
		_______4 = (TextView) findViewById(R.id._______4);
		ellipse_17_ek2 = (View) findViewById(R.id.ellipse_17_ek2);
		ellipse_18 = (View) findViewById(R.id.ellipse_18);
		ellipse_19 = (View) findViewById(R.id.ellipse_19);
		ellipse_17_ek3 = (View) findViewById(R.id.ellipse_17_ek3);
		ellipse_22 = (View) findViewById(R.id.ellipse_22);
		_______1 = (TextView) findViewById(R.id._______1);
		_______2 = (TextView) findViewById(R.id._______2);
		_______5 = (TextView) findViewById(R.id._______5);
		_______6 = (TextView) findViewById(R.id._______6);
		_______7 = (TextView) findViewById(R.id._______7);
		_______8 = (TextView) findViewById(R.id._______8);
		_______9 = (TextView) findViewById(R.id._______9);
		_______3 = (TextView) findViewById(R.id._______3);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		vector = (ImageView) findViewById(R.id.vector);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		ellipse_4_ek1 = (View) findViewById(R.id.ellipse_4_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
	
		
		//custom code goes here
		ellipse_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i=new Intent(getApplicationContext(), iphone_14___course_search_page_activity.class );
				startActivity(i);
			}
		});

		ellipse_4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i=new Intent(getApplicationContext(), iphone_14___course_search_page_activity.class );
//				turn the page into the dictionary one +check the missing words+ test using cable and phone?
				startActivity(i);
			}
		});


	
	}
}
	
	