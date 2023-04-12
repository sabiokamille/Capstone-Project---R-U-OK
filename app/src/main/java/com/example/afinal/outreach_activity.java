
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		Wednesday 12th of April 2023 03:38:01 AM
	 *	@title 		v2
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class outreach_activity extends Activity {

	
	private View _bg__outreach_ek4;
	private View white_base_ek4;
	private ImageView vector_ek137;
	private TextView outreaches_are_efforts_to_engage_the_rutgers_community_about_mental_health_and_the_services_that_are_provided_by_caps__these_are_usually_done_in_collaboration_with_different_departments_during_different_events_or_programs_that_may_be_taking_place__or_by_request_;
	private TextView outreach_ek5;
	private View rectangle_64_ek1;
	private TextView no_upcoming_events_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.outreach);

		
		_bg__outreach_ek4 = (View) findViewById(R.id._bg__outreach_ek4);
		white_base_ek4 = (View) findViewById(R.id.white_base_ek4);
		vector_ek137 = (ImageView) findViewById(R.id.vector_ek137);
		outreaches_are_efforts_to_engage_the_rutgers_community_about_mental_health_and_the_services_that_are_provided_by_caps__these_are_usually_done_in_collaboration_with_different_departments_during_different_events_or_programs_that_may_be_taking_place__or_by_request_ = (TextView) findViewById(R.id.outreaches_are_efforts_to_engage_the_rutgers_community_about_mental_health_and_the_services_that_are_provided_by_caps__these_are_usually_done_in_collaboration_with_different_departments_during_different_events_or_programs_that_may_be_taking_place__or_by_request_);
		outreach_ek5 = (TextView) findViewById(R.id.outreach_ek5);
		rectangle_64_ek1 = (View) findViewById(R.id.rectangle_64_ek1);
		no_upcoming_events_ek1 = (TextView) findViewById(R.id.no_upcoming_events_ek1);
	
		
		//custom code goes here

		vector_ek137.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), events_activity.class);
				startActivity(nextScreen);
			}
		});
	
	}
}
	
	