
	 
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

public class group_therapy_activity extends Activity {

	
	private View _bg__group_therapy_ek6;
	private View white_base_ek4;
	private ImageView vector_ek12;
	private TextView group_therapy_is_often_the_best_way_to_work_on_problems__especially_when_the_problems_deal_with_issues_about_your_relationships__being_a_member_of_a_group_allows_you_to_interact_with_peers_who_are_not_part_of_your_everyday_life__these_interactions__along_with_those_of_the_therapist__can_give_you_useful_feedback_that_you_may_not_get_from_friends_or_family__group_is_also_a_safe_environment_where_you_can_safely_try_out_different_ways_of_interacting_with_others__such_as_initiating_conversations_or_improving_your_listening_skills__the_specific_groups_available_each_semester_vary_in_theme_and_time_commitment__but_in_recent_semesters_we_have_offered_groups_for_students_struggling_with_anxiety__including_social_anxiety___depression__emotional_regulation__eating_issues__grief_and_loss__sexual_identity__and_general_interpersonal_issues_for_both_undergraduate_and_graduate_students_;
	private TextView group_therapy_ek7;
	private View rectangle_64_ek3;
	private TextView view_schedule;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.group_therapy);

		
		_bg__group_therapy_ek6 = (View) findViewById(R.id._bg__group_therapy_ek6);
		white_base_ek4 = (View) findViewById(R.id.white_base_ek4);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		group_therapy_is_often_the_best_way_to_work_on_problems__especially_when_the_problems_deal_with_issues_about_your_relationships__being_a_member_of_a_group_allows_you_to_interact_with_peers_who_are_not_part_of_your_everyday_life__these_interactions__along_with_those_of_the_therapist__can_give_you_useful_feedback_that_you_may_not_get_from_friends_or_family__group_is_also_a_safe_environment_where_you_can_safely_try_out_different_ways_of_interacting_with_others__such_as_initiating_conversations_or_improving_your_listening_skills__the_specific_groups_available_each_semester_vary_in_theme_and_time_commitment__but_in_recent_semesters_we_have_offered_groups_for_students_struggling_with_anxiety__including_social_anxiety___depression__emotional_regulation__eating_issues__grief_and_loss__sexual_identity__and_general_interpersonal_issues_for_both_undergraduate_and_graduate_students_ = (TextView) findViewById(R.id.group_therapy_is_often_the_best_way_to_work_on_problems__especially_when_the_problems_deal_with_issues_about_your_relationships__being_a_member_of_a_group_allows_you_to_interact_with_peers_who_are_not_part_of_your_everyday_life__these_interactions__along_with_those_of_the_therapist__can_give_you_useful_feedback_that_you_may_not_get_from_friends_or_family__group_is_also_a_safe_environment_where_you_can_safely_try_out_different_ways_of_interacting_with_others__such_as_initiating_conversations_or_improving_your_listening_skills__the_specific_groups_available_each_semester_vary_in_theme_and_time_commitment__but_in_recent_semesters_we_have_offered_groups_for_students_struggling_with_anxiety__including_social_anxiety___depression__emotional_regulation__eating_issues__grief_and_loss__sexual_identity__and_general_interpersonal_issues_for_both_undergraduate_and_graduate_students_);
		group_therapy_ek7 = (TextView) findViewById(R.id.group_therapy_ek7);
		rectangle_64_ek3 = (View) findViewById(R.id.rectangle_64_ek3);
		view_schedule = (TextView) findViewById(R.id.view_schedule);

		vector_ek12.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), home___up_activity.class);
				startActivity(nextScreen);
			}
		});

		view_schedule.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), group_therapy_activity.class);
				startActivity(nextScreen);
			}
		});
		//custom code goes here
	
	}
}
	
	