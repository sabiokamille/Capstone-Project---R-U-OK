
	 
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

public class medical_screeing___q1_selected_response_activity extends Activity {

	
	private View _bg__medical_screeing___q1_selected_response_ek2;
	private View white_base_ek19;
	private ImageView path_ek189;
	private ImageView path_ek190;
	private ImageView path_ek191;
	private ImageView empty_bar_ek42;
	private ImageView path_ek192;
	private ImageView path_ek193;
	private ImageView path_ek194;
	private ImageView path_ek195;
	private ImageView path_ek196;
	private ImageView path_ek197;
	private ImageView rectangle_23_ek21;
	private ImageView _100_ek21;
	private ImageView rectangle_21__stroke__ek21;
	private View rectangle_20_ek21;
	private ImageView _9_41_ek43;
	private ImageView vector_ek146;
	private TextView what_is_your_age__ek1;
	private View rectangle_69_ek29;
	private TextView younger_than_18_ek1;
	private View rectangle_69_ek30;
	private TextView _18_24_ek1;
	private View rectangle_69_ek31;
	private TextView _25_34_ek1;
	private View rectangle_69_ek32;
	private TextView older_than_34_ek1;
	private View _rectangle_64_ek8;
	private TextView continue_ek2;
	private TextView _1_25_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.medical_screeing___q1_selected_response);

		
		_bg__medical_screeing___q1_selected_response_ek2 = (View) findViewById(R.id._bg__medical_screeing___q1_selected_response_ek2);
		white_base_ek19 = (View) findViewById(R.id.white_base_ek19);
		path_ek189 = (ImageView) findViewById(R.id.path_ek189);
		path_ek190 = (ImageView) findViewById(R.id.path_ek190);
		path_ek191 = (ImageView) findViewById(R.id.path_ek191);
		empty_bar_ek42 = (ImageView) findViewById(R.id.empty_bar_ek42);
		path_ek192 = (ImageView) findViewById(R.id.path_ek192);
		path_ek193 = (ImageView) findViewById(R.id.path_ek193);
		path_ek194 = (ImageView) findViewById(R.id.path_ek194);
		path_ek195 = (ImageView) findViewById(R.id.path_ek195);
		path_ek196 = (ImageView) findViewById(R.id.path_ek196);
		path_ek197 = (ImageView) findViewById(R.id.path_ek197);
		rectangle_23_ek21 = (ImageView) findViewById(R.id.rectangle_23_ek21);
		_100_ek21 = (ImageView) findViewById(R.id._100_ek21);
		rectangle_21__stroke__ek21 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek21);
		rectangle_20_ek21 = (View) findViewById(R.id.rectangle_20_ek21);
		_9_41_ek43 = (ImageView) findViewById(R.id._9_41_ek43);
		vector_ek146 = (ImageView) findViewById(R.id.vector_ek146);
		what_is_your_age__ek1 = (TextView) findViewById(R.id.what_is_your_age__ek1);
		rectangle_69_ek29 = (View) findViewById(R.id.rectangle_69_ek29);
		younger_than_18_ek1 = (TextView) findViewById(R.id.younger_than_18_ek1);
		rectangle_69_ek30 = (View) findViewById(R.id.rectangle_69_ek30);
		_18_24_ek1 = (TextView) findViewById(R.id._18_24_ek1);
		rectangle_69_ek31 = (View) findViewById(R.id.rectangle_69_ek31);
		_25_34_ek1 = (TextView) findViewById(R.id._25_34_ek1);
		rectangle_69_ek32 = (View) findViewById(R.id.rectangle_69_ek32);
		older_than_34_ek1 = (TextView) findViewById(R.id.older_than_34_ek1);
		_rectangle_64_ek8 = (View) findViewById(R.id._rectangle_64_ek8);
		continue_ek2 = (TextView) findViewById(R.id.continue_ek2);
		_1_25_ek1 = (TextView) findViewById(R.id._1_25_ek1);
	
		
		_rectangle_64_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), medical_screeing___q2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	