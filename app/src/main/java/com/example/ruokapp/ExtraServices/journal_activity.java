
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		Saturday 22nd of April 2023 02:40:19 AM
	 *	@title 		v2
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


package com.example.ruokapp.ExtraServices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ruokapp.R;

	public class journal_activity extends Activity {

	
	private View _bg__journal_ek2;
	private ImageView vector_ek123;
	private TextView home_ek4;
	private ImageView vector_ek124;
	private TextView the_journaling_feature_is_in_the_works___;
	private TextView coming_soon___;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.journal);

		
		_bg__journal_ek2 = (View) findViewById(R.id._bg__journal_ek2);
		vector_ek123 = (ImageView) findViewById(R.id.vector_ek123);
		home_ek4 = (TextView) findViewById(R.id.home_ek4);
		vector_ek124 = (ImageView) findViewById(R.id.vector_ek124);
		the_journaling_feature_is_in_the_works___ = (TextView) findViewById(R.id.the_journaling_feature_is_in_the_works___);
		coming_soon___ = (TextView) findViewById(R.id.coming_soon___);
	
		
		//custom code goes here
		vector_ek124.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);


			}
		});
	
	}
}
	
	