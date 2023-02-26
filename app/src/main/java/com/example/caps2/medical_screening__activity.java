
	 
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
import android.content.Intent;
import android.widget.TextView;

public class medical_screening__activity extends Activity {

	
	private View _bg__medical_screening__ek2;
	private ImageView path_ek315;
	private ImageView path_ek316;
	private ImageView path_ek317;
	private ImageView empty_bar_ek70;
	private ImageView path_ek318;
	private ImageView path_ek319;
	private ImageView path_ek320;
	private ImageView path_ek321;
	private ImageView path_ek322;
	private ImageView path_ek323;
	private ImageView rectangle_23_ek35;
	private ImageView _100_ek35;
	private ImageView rectangle_21__stroke__ek35;
	private View rectangle_20_ek35;
	private ImageView _9_41_ek71;
	private View rectangle_68;
	private View _rectangle_64_ek18;
	private TextView start_survey;
	private TextView check_up;
	private TextView completing_this_screening_will_help_you_determine_if_your_recent_thoughts_or_behaviors_may_be_associated_with_a_common__treatable_mental_health_issue_;
	private TextView anonymous;
	private TextView we_cannot_link_these_screenings_to_any_one_individual__so_you_remain_anonymous__take_these_screenings_anywhere_you_feel_comfortable_;
	private TextView fast;
	private TextView it_takes_a_few_minutes_to_complete_the_screening__and_at_the_end_you_will_be_presented_with_information_and_next_steps_;
	private TextView how_are_you_feeling_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.medical_screening_);

		
		_bg__medical_screening__ek2 = (View) findViewById(R.id._bg__medical_screening__ek2);
		path_ek315 = (ImageView) findViewById(R.id.path_ek315);
		path_ek316 = (ImageView) findViewById(R.id.path_ek316);
		path_ek317 = (ImageView) findViewById(R.id.path_ek317);
		empty_bar_ek70 = (ImageView) findViewById(R.id.empty_bar_ek70);
		path_ek318 = (ImageView) findViewById(R.id.path_ek318);
		path_ek319 = (ImageView) findViewById(R.id.path_ek319);
		path_ek320 = (ImageView) findViewById(R.id.path_ek320);
		path_ek321 = (ImageView) findViewById(R.id.path_ek321);
		path_ek322 = (ImageView) findViewById(R.id.path_ek322);
		path_ek323 = (ImageView) findViewById(R.id.path_ek323);
		rectangle_23_ek35 = (ImageView) findViewById(R.id.rectangle_23_ek35);
		_100_ek35 = (ImageView) findViewById(R.id._100_ek35);
		rectangle_21__stroke__ek35 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek35);
		rectangle_20_ek35 = (View) findViewById(R.id.rectangle_20_ek35);
		_9_41_ek71 = (ImageView) findViewById(R.id._9_41_ek71);
		rectangle_68 = (View) findViewById(R.id.rectangle_68);
		_rectangle_64_ek18 = (View) findViewById(R.id._rectangle_64_ek18);
		start_survey = (TextView) findViewById(R.id.start_survey);
		check_up = (TextView) findViewById(R.id.check_up);
		completing_this_screening_will_help_you_determine_if_your_recent_thoughts_or_behaviors_may_be_associated_with_a_common__treatable_mental_health_issue_ = (TextView) findViewById(R.id.completing_this_screening_will_help_you_determine_if_your_recent_thoughts_or_behaviors_may_be_associated_with_a_common__treatable_mental_health_issue_);
		anonymous = (TextView) findViewById(R.id.anonymous);
		we_cannot_link_these_screenings_to_any_one_individual__so_you_remain_anonymous__take_these_screenings_anywhere_you_feel_comfortable_ = (TextView) findViewById(R.id.we_cannot_link_these_screenings_to_any_one_individual__so_you_remain_anonymous__take_these_screenings_anywhere_you_feel_comfortable_);
		fast = (TextView) findViewById(R.id.fast);
		it_takes_a_few_minutes_to_complete_the_screening__and_at_the_end_you_will_be_presented_with_information_and_next_steps_ = (TextView) findViewById(R.id.it_takes_a_few_minutes_to_complete_the_screening__and_at_the_end_you_will_be_presented_with_information_and_next_steps_);
		how_are_you_feeling_ = (TextView) findViewById(R.id.how_are_you_feeling_);
	
		
		_rectangle_64_ek18.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), medical_screeing___q1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	