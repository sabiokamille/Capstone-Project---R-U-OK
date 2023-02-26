
	 
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

public class results_pending__activity extends Activity {

	
	private View _bg__results_pending__ek2;
	private ImageView path_ek261;
	private ImageView path_ek262;
	private ImageView path_ek263;
	private ImageView empty_bar_ek58;
	private ImageView path_ek264;
	private ImageView path_ek265;
	private ImageView path_ek266;
	private ImageView path_ek267;
	private ImageView path_ek268;
	private ImageView path_ek269;
	private ImageView rectangle_23_ek29;
	private ImageView _100_ek29;
	private ImageView rectangle_21__stroke__ek29;
	private View rectangle_20_ek29;
	private ImageView _9_41_ek59;
	private ImageView vector_ek154;
	private View white_base_ek27;
	private TextView thank_you_for_taking_the_screening__we_are_glad_you_took_this_step_in_managing_your_emotional_and_mental_well_being__please_read_below_for_specific_results_for_your_responses_and_recommendations_for_next_steps__please_remember_that_these_results_are_not_diagnoses__but_we_do_suggest_follow_up_with_a_professional_as_a_best_next_step_;
	private View _rectangle_64_ek13;
	private TextView i_understand__view_my_results_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.results_pending_);

		
		_bg__results_pending__ek2 = (View) findViewById(R.id._bg__results_pending__ek2);
		path_ek261 = (ImageView) findViewById(R.id.path_ek261);
		path_ek262 = (ImageView) findViewById(R.id.path_ek262);
		path_ek263 = (ImageView) findViewById(R.id.path_ek263);
		empty_bar_ek58 = (ImageView) findViewById(R.id.empty_bar_ek58);
		path_ek264 = (ImageView) findViewById(R.id.path_ek264);
		path_ek265 = (ImageView) findViewById(R.id.path_ek265);
		path_ek266 = (ImageView) findViewById(R.id.path_ek266);
		path_ek267 = (ImageView) findViewById(R.id.path_ek267);
		path_ek268 = (ImageView) findViewById(R.id.path_ek268);
		path_ek269 = (ImageView) findViewById(R.id.path_ek269);
		rectangle_23_ek29 = (ImageView) findViewById(R.id.rectangle_23_ek29);
		_100_ek29 = (ImageView) findViewById(R.id._100_ek29);
		rectangle_21__stroke__ek29 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek29);
		rectangle_20_ek29 = (View) findViewById(R.id.rectangle_20_ek29);
		_9_41_ek59 = (ImageView) findViewById(R.id._9_41_ek59);
		vector_ek154 = (ImageView) findViewById(R.id.vector_ek154);
		white_base_ek27 = (View) findViewById(R.id.white_base_ek27);
		thank_you_for_taking_the_screening__we_are_glad_you_took_this_step_in_managing_your_emotional_and_mental_well_being__please_read_below_for_specific_results_for_your_responses_and_recommendations_for_next_steps__please_remember_that_these_results_are_not_diagnoses__but_we_do_suggest_follow_up_with_a_professional_as_a_best_next_step_ = (TextView) findViewById(R.id.thank_you_for_taking_the_screening__we_are_glad_you_took_this_step_in_managing_your_emotional_and_mental_well_being__please_read_below_for_specific_results_for_your_responses_and_recommendations_for_next_steps__please_remember_that_these_results_are_not_diagnoses__but_we_do_suggest_follow_up_with_a_professional_as_a_best_next_step_);
		_rectangle_64_ek13 = (View) findViewById(R.id._rectangle_64_ek13);
		i_understand__view_my_results_ = (TextView) findViewById(R.id.i_understand__view_my_results_);
	
		
		_rectangle_64_ek13.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), results_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	