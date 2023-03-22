
	 
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

public class let_s_talk_activity extends Activity {

	
	private View _bg__let_s_talk_ek4;
	private View white_base_ek7;
	private ImageView vector_ek15;
	private TextView let_s_talk_is_a_confidential_consult_space_for_students_to_discuss_anything_they_are_struggling_with_in_a_given_moment_without_the_documentation_of_a_therapy_session__it_also_creates_an_opportunity_for_students_to_identify_if_they_would_be_interested_in_therapy__as_many_people_are_skeptical_due_to_the_stigma_surrounding_mental_health__let_s_talk_sessions_are_available_in_person_or_by_phone__walk_ins_are_welcome__however__appointments_are_highly_recommended__please_note_that_appointments_will_be_prioritized_before_walk_ins_;
	private TextView let_s_talk_ek5;
	private View rectangle_64_ek6;
	private TextView view_walk_in_schedule;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.let_s_talk);

		
		_bg__let_s_talk_ek4 = (View) findViewById(R.id._bg__let_s_talk_ek4);
		white_base_ek7 = (View) findViewById(R.id.white_base_ek7);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		let_s_talk_is_a_confidential_consult_space_for_students_to_discuss_anything_they_are_struggling_with_in_a_given_moment_without_the_documentation_of_a_therapy_session__it_also_creates_an_opportunity_for_students_to_identify_if_they_would_be_interested_in_therapy__as_many_people_are_skeptical_due_to_the_stigma_surrounding_mental_health__let_s_talk_sessions_are_available_in_person_or_by_phone__walk_ins_are_welcome__however__appointments_are_highly_recommended__please_note_that_appointments_will_be_prioritized_before_walk_ins_ = (TextView) findViewById(R.id.let_s_talk_is_a_confidential_consult_space_for_students_to_discuss_anything_they_are_struggling_with_in_a_given_moment_without_the_documentation_of_a_therapy_session__it_also_creates_an_opportunity_for_students_to_identify_if_they_would_be_interested_in_therapy__as_many_people_are_skeptical_due_to_the_stigma_surrounding_mental_health__let_s_talk_sessions_are_available_in_person_or_by_phone__walk_ins_are_welcome__however__appointments_are_highly_recommended__please_note_that_appointments_will_be_prioritized_before_walk_ins_);
		let_s_talk_ek5 = (TextView) findViewById(R.id.let_s_talk_ek5);
		rectangle_64_ek6 = (View) findViewById(R.id.rectangle_64_ek6);
		view_walk_in_schedule = (TextView) findViewById(R.id.view_walk_in_schedule);

		vector_ek15.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), home___up_activity.class);
				startActivity(nextScreen);
			}
		});

		view_walk_in_schedule.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), lt_times_activity.class);
				startActivity(nextScreen);
			}
		});
		//custom code goes here
	
	}
}
	
	