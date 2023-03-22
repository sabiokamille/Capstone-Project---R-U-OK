
	 
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
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class outreach_activity extends Activity {

	
	private View _bg__outreach_ek8;
	private View white_base_ek6;
	private ImageView vector_ek14;
	private TextView outreaches_are_efforts_to_engage_the_rutgers_community_about_mental_health_and_the_services_that_are_provided_by_caps__these_are_usually_done_in_collaboration_with_different_departments_during_different_events_or_programs_that_may_be_taking_place__or_by_request_;
	private TextView outreach_ek9;
	private View rectangle_64_ek5;
	private TextView no_upcoming_events_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.outreach);

		
		_bg__outreach_ek8 = (View) findViewById(R.id._bg__outreach_ek8);
		white_base_ek6 = (View) findViewById(R.id.white_base_ek6);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		outreaches_are_efforts_to_engage_the_rutgers_community_about_mental_health_and_the_services_that_are_provided_by_caps__these_are_usually_done_in_collaboration_with_different_departments_during_different_events_or_programs_that_may_be_taking_place__or_by_request_ = (TextView) findViewById(R.id.outreaches_are_efforts_to_engage_the_rutgers_community_about_mental_health_and_the_services_that_are_provided_by_caps__these_are_usually_done_in_collaboration_with_different_departments_during_different_events_or_programs_that_may_be_taking_place__or_by_request_);
		outreach_ek9 = (TextView) findViewById(R.id.outreach_ek9);
		rectangle_64_ek5 = (View) findViewById(R.id.rectangle_64_ek5);
		no_upcoming_events_ek1 = (TextView) findViewById(R.id.no_upcoming_events_ek1);

		vector_ek14.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), home___up_activity.class);
				startActivity(nextScreen);
			}
		});
		//custom code goes here
	
	}
}
	
	