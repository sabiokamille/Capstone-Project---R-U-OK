
	 
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
import android.widget.TextView;
import android.widget.ImageView;

public class home___up_activity extends Activity {

	
	private View __bg__home___up_ek2;
	private TextView get_involved;
	private ImageView pexels_shvets_production_7176302;
	private View rectangle_56;
	private TextView group_therapy_ek1;
	private TextView learn_more;
	private ImageView vector_ek4;
	private ImageView pexels_ekaterina_bolovtsova_4049992;
	private View rectangle_56_ek1;
	private TextView let_s_talk;
	private TextView learn_more_ek1;
	private ImageView vector_ek5;
	private ImageView pexels_pixabay_45842;
	private View rectangle_56_ek2;
	private TextView outreach_ek1;
	private TextView learn_more_ek2;
	private ImageView vector_ek6;
	private ImageView pexels_pixabay_45842_ek1;
	private View rectangle_56_ek3;
	private TextView outreach_ek2;
	private TextView learn_more_ek3;
	private ImageView vector_ek7;
	private View rectangle_61;
	private ImageView profilevector_ek3;
	private ImageView homevector_ek3;
	private ImageView magvector_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home___up);

		
		__bg__home___up_ek2 = (View) findViewById(R.id.__bg__home___up_ek2);
		get_involved = (TextView) findViewById(R.id.get_involved);
		pexels_shvets_production_7176302 = (ImageView) findViewById(R.id.pexels_shvets_production_7176302);
		rectangle_56 = (View) findViewById(R.id.rectangle_56);
		group_therapy_ek1 = (TextView) findViewById(R.id.group_therapy_ek1);
		learn_more = (TextView) findViewById(R.id.learn_more);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		pexels_ekaterina_bolovtsova_4049992 = (ImageView) findViewById(R.id.pexels_ekaterina_bolovtsova_4049992);
		rectangle_56_ek1 = (View) findViewById(R.id.rectangle_56_ek1);
		let_s_talk = (TextView) findViewById(R.id.let_s_talk);
		learn_more_ek1 = (TextView) findViewById(R.id.learn_more_ek1);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		pexels_pixabay_45842 = (ImageView) findViewById(R.id.pexels_pixabay_45842);
		rectangle_56_ek2 = (View) findViewById(R.id.rectangle_56_ek2);
		outreach_ek1 = (TextView) findViewById(R.id.outreach_ek1);
		learn_more_ek2 = (TextView) findViewById(R.id.learn_more_ek2);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		pexels_pixabay_45842_ek1 = (ImageView) findViewById(R.id.pexels_pixabay_45842_ek1);
		rectangle_56_ek3 = (View) findViewById(R.id.rectangle_56_ek3);
		outreach_ek2 = (TextView) findViewById(R.id.outreach_ek2);
		learn_more_ek3 = (TextView) findViewById(R.id.learn_more_ek3);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		rectangle_61 = (View) findViewById(R.id.rectangle_61);
		profilevector_ek3 = (ImageView) findViewById(R.id.profilevector_ek3);
		homevector_ek3 = (ImageView) findViewById(R.id.homevector_ek3);
		magvector_ek3 = (ImageView) findViewById(R.id.magvector_ek3);
	
		
		__bg__home___up_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home___down_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		magvector_ek3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), resources___main_page___top_page_activity.class);
				startActivity(nextScreen);
			}
		});

		profilevector_ek3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), profile_activity.class);
				startActivity(nextScreen);
			}
		});


		pexels_shvets_production_7176302.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), group_therapy_activity.class);
				startActivity(nextScreen);
			}
		});

		pexels_ekaterina_bolovtsova_4049992.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), let_s_talk_activity.class);
				startActivity(nextScreen);
			}
		});

		pexels_pixabay_45842.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), outreach_activity.class);
				startActivity(nextScreen);
			}
		});

		pexels_pixabay_45842_ek1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), workshops_activity.class);
				startActivity(nextScreen);
			}
		});
		
		//custom code goes here
	
	}
}
	
	