
	 
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

public class end_appointment_booking_activity extends Activity {

	
	private View _bg__end_appointment_booking_ek2;
	private ImageView path_ek306;
	private ImageView path_ek307;
	private ImageView path_ek308;
	private ImageView empty_bar_ek68;
	private ImageView path_ek309;
	private ImageView path_ek310;
	private ImageView path_ek311;
	private ImageView path_ek312;
	private ImageView path_ek313;
	private ImageView path_ek314;
	private ImageView rectangle_23_ek34;
	private ImageView _100_ek34;
	private ImageView rectangle_21__stroke__ek34;
	private View rectangle_20_ek34;
	private ImageView _9_41_ek69;
	private View _rectangle_64_ek17;
	private TextView view_resources_ek1;
	private View white_base_ek38;
	private TextView we_found_the_perfect_resources_for_you_;
	private TextView thanks_for_filling_out_the_appointment_preferences__we_were_able_to_find_the_perfect_resources_for_you_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.end_appointment_booking);

		
		_bg__end_appointment_booking_ek2 = (View) findViewById(R.id._bg__end_appointment_booking_ek2);
		path_ek306 = (ImageView) findViewById(R.id.path_ek306);
		path_ek307 = (ImageView) findViewById(R.id.path_ek307);
		path_ek308 = (ImageView) findViewById(R.id.path_ek308);
		empty_bar_ek68 = (ImageView) findViewById(R.id.empty_bar_ek68);
		path_ek309 = (ImageView) findViewById(R.id.path_ek309);
		path_ek310 = (ImageView) findViewById(R.id.path_ek310);
		path_ek311 = (ImageView) findViewById(R.id.path_ek311);
		path_ek312 = (ImageView) findViewById(R.id.path_ek312);
		path_ek313 = (ImageView) findViewById(R.id.path_ek313);
		path_ek314 = (ImageView) findViewById(R.id.path_ek314);
		rectangle_23_ek34 = (ImageView) findViewById(R.id.rectangle_23_ek34);
		_100_ek34 = (ImageView) findViewById(R.id._100_ek34);
		rectangle_21__stroke__ek34 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek34);
		rectangle_20_ek34 = (View) findViewById(R.id.rectangle_20_ek34);
		_9_41_ek69 = (ImageView) findViewById(R.id._9_41_ek69);
		_rectangle_64_ek17 = (View) findViewById(R.id._rectangle_64_ek17);
		view_resources_ek1 = (TextView) findViewById(R.id.view_resources_ek1);
		white_base_ek38 = (View) findViewById(R.id.white_base_ek38);
		we_found_the_perfect_resources_for_you_ = (TextView) findViewById(R.id.we_found_the_perfect_resources_for_you_);
		thanks_for_filling_out_the_appointment_preferences__we_were_able_to_find_the_perfect_resources_for_you_ = (TextView) findViewById(R.id.thanks_for_filling_out_the_appointment_preferences__we_were_able_to_find_the_perfect_resources_for_you_);
	
		
		_rectangle_64_ek17.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), available_services_with_your_preference_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	