
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		Saturday 22nd of April 2023 02:40:19 AM
	 *	@title 		v2
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.ruokfinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class workshops_activity extends Activity {

	
	private View _bg__workshops_ek4;
	private View white_base_ek3;
	private ImageView vector_ek135;
	private TextView drop_in_workshops_training_are_another_way_for_community_based_counselors_to_connect_with_the_staff_faculty_and_students_to_help_them_cultivate_skills_for_managing_their_mental_health__this_may_include_meditation_mindfulness_strategies__organizational_skills__interpersonal_interactions__coping_with_academia__or_anything_that_may_be_suggested_by_staff_faculty_or_students_as_a_need_for_their_given_community__unless_otherwise_stated__students_can_drop_in_to_a_workshop__in_person_or_virtual___and_they_do_not_have_to_register_or_sign_up_in_advance_;
	private TextView workshops_training;
	private View rectangle_64;
	private TextView no_upcoming_events;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.workshops);

		
		_bg__workshops_ek4 = (View) findViewById(R.id._bg__workshops_ek4);
		white_base_ek3 = (View) findViewById(R.id.white_base_ek3);
		vector_ek135 = (ImageView) findViewById(R.id.vector_ek135);
		drop_in_workshops_training_are_another_way_for_community_based_counselors_to_connect_with_the_staff_faculty_and_students_to_help_them_cultivate_skills_for_managing_their_mental_health__this_may_include_meditation_mindfulness_strategies__organizational_skills__interpersonal_interactions__coping_with_academia__or_anything_that_may_be_suggested_by_staff_faculty_or_students_as_a_need_for_their_given_community__unless_otherwise_stated__students_can_drop_in_to_a_workshop__in_person_or_virtual___and_they_do_not_have_to_register_or_sign_up_in_advance_ = (TextView) findViewById(R.id.drop_in_workshops_training_are_another_way_for_community_based_counselors_to_connect_with_the_staff_faculty_and_students_to_help_them_cultivate_skills_for_managing_their_mental_health__this_may_include_meditation_mindfulness_strategies__organizational_skills__interpersonal_interactions__coping_with_academia__or_anything_that_may_be_suggested_by_staff_faculty_or_students_as_a_need_for_their_given_community__unless_otherwise_stated__students_can_drop_in_to_a_workshop__in_person_or_virtual___and_they_do_not_have_to_register_or_sign_up_in_advance_);
		workshops_training = (TextView) findViewById(R.id.workshops_training);
		rectangle_64 = (View) findViewById(R.id.rectangle_64);
		no_upcoming_events = (TextView) findViewById(R.id.no_upcoming_events);
	
		
		//custom code goes here
		vector_ek135.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), events_activity.class);
				startActivity(nextScreen);


			}
		});
	
	}
}
	
	