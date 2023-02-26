
	 
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

import com.example.caps2.R;

	public class begin_appointment_booking_activity extends Activity {

	
	private View _bg__begin_appointment_booking_ek2;
	private ImageView path_ek297;
	private ImageView path_ek298;
	private ImageView path_ek299;
	private ImageView empty_bar_ek66;
	private ImageView path_ek300;
	private ImageView path_ek301;
	private ImageView path_ek302;
	private ImageView path_ek303;
	private ImageView path_ek304;
	private ImageView path_ek305;
	private ImageView rectangle_23_ek33;
	private ImageView _100_ek33;
	private ImageView rectangle_21__stroke__ek33;
	private View rectangle_20_ek33;
	private ImageView _9_41_ek67;
	private View _rectangle_64_ek16;
	private TextView begin;
	private View white_base_ek37;
	private TextView are_you_ready_;
	private TextView we_are_happy_to_assist_you_in_your_healing_process__let_s_begin_by_inputting_your_availability_and_preferences__we_understand_that_schedules_sometimes_change__you_are_able_to_adjust_your_preferences_at_any_time_after_this_initial_survey_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.begin_appointment_booking);

		
		_bg__begin_appointment_booking_ek2 = (View) findViewById(R.id._bg__begin_appointment_booking_ek2);
		path_ek297 = (ImageView) findViewById(R.id.path_ek297);
		path_ek298 = (ImageView) findViewById(R.id.path_ek298);
		path_ek299 = (ImageView) findViewById(R.id.path_ek299);
		empty_bar_ek66 = (ImageView) findViewById(R.id.empty_bar_ek66);
		path_ek300 = (ImageView) findViewById(R.id.path_ek300);
		path_ek301 = (ImageView) findViewById(R.id.path_ek301);
		path_ek302 = (ImageView) findViewById(R.id.path_ek302);
		path_ek303 = (ImageView) findViewById(R.id.path_ek303);
		path_ek304 = (ImageView) findViewById(R.id.path_ek304);
		path_ek305 = (ImageView) findViewById(R.id.path_ek305);
		rectangle_23_ek33 = (ImageView) findViewById(R.id.rectangle_23_ek33);
		_100_ek33 = (ImageView) findViewById(R.id._100_ek33);
		rectangle_21__stroke__ek33 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek33);
		rectangle_20_ek33 = (View) findViewById(R.id.rectangle_20_ek33);
		_9_41_ek67 = (ImageView) findViewById(R.id._9_41_ek67);
		_rectangle_64_ek16 = (View) findViewById(R.id._rectangle_64_ek16);
		begin = (TextView) findViewById(R.id.begin);
		white_base_ek37 = (View) findViewById(R.id.white_base_ek37);
		are_you_ready_ = (TextView) findViewById(R.id.are_you_ready_);
		we_are_happy_to_assist_you_in_your_healing_process__let_s_begin_by_inputting_your_availability_and_preferences__we_understand_that_schedules_sometimes_change__you_are_able_to_adjust_your_preferences_at_any_time_after_this_initial_survey_ = (TextView) findViewById(R.id.we_are_happy_to_assist_you_in_your_healing_process__let_s_begin_by_inputting_your_availability_and_preferences__we_understand_that_schedules_sometimes_change__you_are_able_to_adjust_your_preferences_at_any_time_after_this_initial_survey_);
	
		
		_rectangle_64_ek16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), preference_q1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	