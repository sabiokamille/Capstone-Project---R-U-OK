
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		profile
	 *	@date 		Wednesday 22nd of March 2023 12:53:37 AM
	 *	@title 		Wireframes
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.testlinks;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class home___down_activity extends Activity {

	
	private View __bg__home___down_ek2;
	private ImageView pexels_shvets_production_7176302_ek1;
	private View rectangle_56_ek4;
	private TextView group_therapy_ek3;
	private TextView learn_more_ek4;
	private ImageView vector_ek8;
	private ImageView pexels_ekaterina_bolovtsova_4049992_ek1;
	private View rectangle_56_ek5;
	private TextView let_s_talk_ek1;
	private TextView learn_more_ek5;
	private ImageView vector_ek9;
	private ImageView pexels_pixabay_45842_ek2;
	private View rectangle_56_ek6;
	private TextView outreach_ek4;
	private TextView learn_more_ek6;
	private ImageView vector_ek10;
	private ImageView pexels_pixabay_45842_ek3;
	private View rectangle_56_ek7;
	private TextView outreach_ek5;
	private TextView learn_more_ek7;
	private ImageView vector_ek11;
	private View rectangle_63_ek1;
	private View line_1_ek1;
	private View rectangle_61_ek1;
	private ImageView profilevector_ek4;
	private ImageView homevector_ek4;
	private ImageView magvector_ek4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home___down);

		
		__bg__home___down_ek2 = (View) findViewById(R.id.__bg__home___down_ek2);
		pexels_shvets_production_7176302_ek1 = (ImageView) findViewById(R.id.pexels_shvets_production_7176302_ek1);
		rectangle_56_ek4 = (View) findViewById(R.id.rectangle_56_ek4);
		group_therapy_ek3 = (TextView) findViewById(R.id.group_therapy_ek3);
		learn_more_ek4 = (TextView) findViewById(R.id.learn_more_ek4);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		pexels_ekaterina_bolovtsova_4049992_ek1 = (ImageView) findViewById(R.id.pexels_ekaterina_bolovtsova_4049992_ek1);
		rectangle_56_ek5 = (View) findViewById(R.id.rectangle_56_ek5);
		let_s_talk_ek1 = (TextView) findViewById(R.id.let_s_talk_ek1);
		learn_more_ek5 = (TextView) findViewById(R.id.learn_more_ek5);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		pexels_pixabay_45842_ek2 = (ImageView) findViewById(R.id.pexels_pixabay_45842_ek2);
		rectangle_56_ek6 = (View) findViewById(R.id.rectangle_56_ek6);
		outreach_ek4 = (TextView) findViewById(R.id.outreach_ek4);
		learn_more_ek6 = (TextView) findViewById(R.id.learn_more_ek6);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		pexels_pixabay_45842_ek3 = (ImageView) findViewById(R.id.pexels_pixabay_45842_ek3);
		rectangle_56_ek7 = (View) findViewById(R.id.rectangle_56_ek7);
		outreach_ek5 = (TextView) findViewById(R.id.outreach_ek5);
		learn_more_ek7 = (TextView) findViewById(R.id.learn_more_ek7);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		rectangle_63_ek1 = (View) findViewById(R.id.rectangle_63_ek1);
		line_1_ek1 = (View) findViewById(R.id.line_1_ek1);
		rectangle_61_ek1 = (View) findViewById(R.id.rectangle_61_ek1);
		profilevector_ek4 = (ImageView) findViewById(R.id.profilevector_ek4);
		homevector_ek4 = (ImageView) findViewById(R.id.homevector_ek4);
		magvector_ek4 = (ImageView) findViewById(R.id.magvector_ek4);
	
		
		__bg__home___down_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home___up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		magvector_ek4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), resources___main_page___top_page_activity.class);
				startActivity(nextScreen);
			}
		});

		profilevector_ek4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), profile_activity.class);
				startActivity(nextScreen);
			}
		});

		pexels_shvets_production_7176302_ek1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), group_therapy_activity.class);
				startActivity(nextScreen);
			}
		});

		pexels_ekaterina_bolovtsova_4049992_ek1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), let_s_talk_activity.class);
				startActivity(nextScreen);
			}
		});

		pexels_pixabay_45842_ek2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), outreach_activity.class);
				startActivity(nextScreen);
			}
		});

		pexels_pixabay_45842_ek3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), workshops_activity.class);
				startActivity(nextScreen);
			}
		});
		
		//custom code goes here
	
	}
}
	
	