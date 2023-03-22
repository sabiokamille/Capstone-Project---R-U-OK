
	 
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
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class profile_activity extends Activity {

	
	private View _bg__profile_ek2;
	private View rectangle_60;
	private ImageView magvector;
	private ImageView homevector;
	private ImageView profilevector;
	private View rectangle_64;
	private TextView mental_health_survey;
	private View rectangle_64_ek1;
	private TextView alcohol_substance_screening;
	private View rectangle_64_ek2;
	private TextView book_appointment_ek1;
	private TextView welcome;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);

		
		_bg__profile_ek2 = (View) findViewById(R.id._bg__profile_ek2);
		rectangle_60 = (View) findViewById(R.id.rectangle_60);
		magvector = (ImageView) findViewById(R.id.magvector);
		homevector = (ImageView) findViewById(R.id.homevector);
		profilevector = (ImageView) findViewById(R.id.profilevector);
		rectangle_64 = (View) findViewById(R.id.rectangle_64);
		mental_health_survey = (TextView) findViewById(R.id.mental_health_survey);
		rectangle_64_ek1 = (View) findViewById(R.id.rectangle_64_ek1);
		alcohol_substance_screening = (TextView) findViewById(R.id.alcohol_substance_screening);
		rectangle_64_ek2 = (View) findViewById(R.id.rectangle_64_ek2);
		book_appointment_ek1 = (TextView) findViewById(R.id.book_appointment_ek1);
		welcome = (TextView) findViewById(R.id.welcome);

		magvector.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), resources___main_page___top_page_activity.class);
				startActivity(nextScreen);
			}
		});

		homevector.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), home___up_activity.class);
				startActivity(nextScreen);
			}
		});


		mental_health_survey.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://screening.mhanational.org/screening-tools/"));
				startActivity(browserIntent);
			}
		});


		alcohol_substance_screening.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/online-health-screenings/"));
				startActivity(browserIntent);
			}
		});


		//custom code goes here
	
	}
}
	
	