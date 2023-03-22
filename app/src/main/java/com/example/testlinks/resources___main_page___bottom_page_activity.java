
	 
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
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.ImageView;

public class resources___main_page___bottom_page_activity extends Activity {

	
	private View __bg__resources___main_page___bottom_page_ek2;
	private View rectangle_57_ek8;
	private TextView mental_health_survey_ek2;
	private View rectangle_63;
	private View rectangle_57_ek9;
	private TextView alcohol_substance_screening_ek2;
	private TextView h_ek6;
	private View rectangle_57_ek10;
	private TextView hotlines_ek3;
	private View rectangle_57_ek11;
	private TextView walk__jog__run_ek2;
	private View rectangle_57_ek12;
	private TextView video_resources_ek3;
	private View rectangle_57_ek13;
	private TextView walk__jog__run_ek3;
	private View rectangle_57_ek14;
	private TextView meditation_ek3;
	private View rectangle_57_ek15;
	private TextView self_help_apps_ek2;
	private View rectangle_62_ek1;
	private ImageView profilevector_ek2;
	private ImageView homevector_ek2;
	private ImageView magvector_ek2;
	private View line_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.resources___main_page___bottom_page);

		
		__bg__resources___main_page___bottom_page_ek2 = (View) findViewById(R.id.__bg__resources___main_page___bottom_page_ek2);
		rectangle_57_ek8 = (View) findViewById(R.id.rectangle_57_ek8);
		mental_health_survey_ek2 = (TextView) findViewById(R.id.mental_health_survey_ek2);
		rectangle_63 = (View) findViewById(R.id.rectangle_63);
		rectangle_57_ek9 = (View) findViewById(R.id.rectangle_57_ek9);
		alcohol_substance_screening_ek2 = (TextView) findViewById(R.id.alcohol_substance_screening_ek2);
		rectangle_57_ek10 = (View) findViewById(R.id.rectangle_57_ek10);
		hotlines_ek3 = (TextView) findViewById(R.id.hotlines_ek3);
		rectangle_57_ek11 = (View) findViewById(R.id.rectangle_57_ek11);
		walk__jog__run_ek2 = (TextView) findViewById(R.id.walk__jog__run_ek2);
		rectangle_57_ek12 = (View) findViewById(R.id.rectangle_57_ek12);
		video_resources_ek3 = (TextView) findViewById(R.id.video_resources_ek3);
		rectangle_57_ek13 = (View) findViewById(R.id.rectangle_57_ek13);
		walk__jog__run_ek3 = (TextView) findViewById(R.id.walk__jog__run_ek3);
		rectangle_57_ek14 = (View) findViewById(R.id.rectangle_57_ek14);
		meditation_ek3 = (TextView) findViewById(R.id.meditation_ek3);
		rectangle_57_ek15 = (View) findViewById(R.id.rectangle_57_ek15);
		self_help_apps_ek2 = (TextView) findViewById(R.id.self_help_apps_ek2);
		rectangle_62_ek1 = (View) findViewById(R.id.rectangle_62_ek1);
		profilevector_ek2 = (ImageView) findViewById(R.id.profilevector_ek2);
		homevector_ek2 = (ImageView) findViewById(R.id.homevector_ek2);
		magvector_ek2 = (ImageView) findViewById(R.id.magvector_ek2);
		line_1 = (View) findViewById(R.id.line_1);
	
		
		__bg__resources___main_page___bottom_page_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), resources___main_page___top_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		homevector_ek2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), home___up_activity.class);
				startActivity(nextScreen);
			}
		});

		profilevector_ek2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), profile_activity.class);
				startActivity(nextScreen);
			}
		});


		mental_health_survey_ek2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://screening.mhanational.org/screening-tools/"));
				startActivity(browserIntent);
			}
		});

		alcohol_substance_screening_ek2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/online-health-screenings/"));
				startActivity(browserIntent);
			}
		});

		video_resources_ek3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/workshops-resources/video-resources/"));
				startActivity(browserIntent);
			}
		});

		hotlines_ek3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), hotline_activity.class);
				startActivity(nextScreen);
			}
		});

		meditation_ek3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/guided-exercises-meditation/"));
				startActivity(browserIntent);
			}
		});

		self_help_apps_ek2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/self-help-apps/"));
				startActivity(browserIntent);
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	