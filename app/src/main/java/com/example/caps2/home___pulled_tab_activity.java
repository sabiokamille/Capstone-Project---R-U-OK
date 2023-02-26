
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home___pulled_tab
	 *	@date 		Saturday 25th of February 2023 02:27:41 AM
	 *	@title 		Wireframes
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.caps2;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class home___pulled_tab_activity extends Activity {

	
	private View _bg__home___pulled_tab_ek2;
	private ImageView path;
	private ImageView path_ek1;
	private ImageView path_ek2;
	private ImageView empty_bar;
	private ImageView path_ek3;
	private ImageView path_ek4;
	private ImageView path_ek5;
	private ImageView path_ek6;
	private ImageView path_ek7;
	private ImageView path_ek8;
	private ImageView rectangle_23;
	private ImageView _100;
	private ImageView rectangle_21__stroke_;
	private View rectangle_20;
	private ImageView _9_41_ek1;
	private View ellipse_1;
	private ImageView vector;
	private View rectangle_60;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private TextView profile_emergency_contact_settings_notification_help_log_out;
	private View _rectangle_64;
	private TextView begin_mental_health_survey;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home___pulled_tab);

		
		_bg__home___pulled_tab_ek2 = (View) findViewById(R.id._bg__home___pulled_tab_ek2);
		path = (ImageView) findViewById(R.id.path);
		path_ek1 = (ImageView) findViewById(R.id.path_ek1);
		path_ek2 = (ImageView) findViewById(R.id.path_ek2);
		empty_bar = (ImageView) findViewById(R.id.empty_bar);
		path_ek3 = (ImageView) findViewById(R.id.path_ek3);
		path_ek4 = (ImageView) findViewById(R.id.path_ek4);
		path_ek5 = (ImageView) findViewById(R.id.path_ek5);
		path_ek6 = (ImageView) findViewById(R.id.path_ek6);
		path_ek7 = (ImageView) findViewById(R.id.path_ek7);
		path_ek8 = (ImageView) findViewById(R.id.path_ek8);
		rectangle_23 = (ImageView) findViewById(R.id.rectangle_23);
		_100 = (ImageView) findViewById(R.id._100);
		rectangle_21__stroke_ = (ImageView) findViewById(R.id.rectangle_21__stroke_);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		_9_41_ek1 = (ImageView) findViewById(R.id._9_41_ek1);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		vector = (ImageView) findViewById(R.id.vector);
		rectangle_60 = (View) findViewById(R.id.rectangle_60);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		profile_emergency_contact_settings_notification_help_log_out = (TextView) findViewById(R.id.profile_emergency_contact_settings_notification_help_log_out);
		_rectangle_64 = (View) findViewById(R.id._rectangle_64);
		begin_mental_health_survey = (TextView) findViewById(R.id.begin_mental_health_survey);
	
		
		_rectangle_64.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), medical_screening__activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	