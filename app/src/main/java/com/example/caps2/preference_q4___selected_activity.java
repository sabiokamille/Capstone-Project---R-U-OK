
	 
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

public class preference_q4___selected_activity extends Activity {

	
	private View _bg__preference_q4___selected_ek2;
	private View white_base_ek16;
	private ImageView path_ek162;
	private ImageView path_ek163;
	private ImageView path_ek164;
	private ImageView empty_bar_ek36;
	private ImageView path_ek165;
	private ImageView path_ek166;
	private ImageView path_ek167;
	private ImageView path_ek168;
	private ImageView path_ek169;
	private ImageView path_ek170;
	private ImageView rectangle_23_ek18;
	private ImageView _100_ek18;
	private ImageView rectangle_21__stroke__ek18;
	private View rectangle_20_ek18;
	private ImageView _9_41_ek37;
	private ImageView vector_ek143;
	private TextView setting_preference;
	private View rectangle_69_ek16;
	private TextView _1_1_meeting;
	private View rectangle_69_ek17;
	private TextView group_setting;
	private View rectangle_69_ek18;
	private TextView both_ek2;
	private View _rectangle_64_ek7;
	private TextView finish;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.preference_q4___selected);

		
		_bg__preference_q4___selected_ek2 = (View) findViewById(R.id._bg__preference_q4___selected_ek2);
		white_base_ek16 = (View) findViewById(R.id.white_base_ek16);
		path_ek162 = (ImageView) findViewById(R.id.path_ek162);
		path_ek163 = (ImageView) findViewById(R.id.path_ek163);
		path_ek164 = (ImageView) findViewById(R.id.path_ek164);
		empty_bar_ek36 = (ImageView) findViewById(R.id.empty_bar_ek36);
		path_ek165 = (ImageView) findViewById(R.id.path_ek165);
		path_ek166 = (ImageView) findViewById(R.id.path_ek166);
		path_ek167 = (ImageView) findViewById(R.id.path_ek167);
		path_ek168 = (ImageView) findViewById(R.id.path_ek168);
		path_ek169 = (ImageView) findViewById(R.id.path_ek169);
		path_ek170 = (ImageView) findViewById(R.id.path_ek170);
		rectangle_23_ek18 = (ImageView) findViewById(R.id.rectangle_23_ek18);
		_100_ek18 = (ImageView) findViewById(R.id._100_ek18);
		rectangle_21__stroke__ek18 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek18);
		rectangle_20_ek18 = (View) findViewById(R.id.rectangle_20_ek18);
		_9_41_ek37 = (ImageView) findViewById(R.id._9_41_ek37);
		vector_ek143 = (ImageView) findViewById(R.id.vector_ek143);
		setting_preference = (TextView) findViewById(R.id.setting_preference);
		rectangle_69_ek16 = (View) findViewById(R.id.rectangle_69_ek16);
		_1_1_meeting = (TextView) findViewById(R.id._1_1_meeting);
		rectangle_69_ek17 = (View) findViewById(R.id.rectangle_69_ek17);
		group_setting = (TextView) findViewById(R.id.group_setting);
		rectangle_69_ek18 = (View) findViewById(R.id.rectangle_69_ek18);
		both_ek2 = (TextView) findViewById(R.id.both_ek2);
		_rectangle_64_ek7 = (View) findViewById(R.id._rectangle_64_ek7);
		finish = (TextView) findViewById(R.id.finish);
	
		
		_rectangle_64_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), end_appointment_booking_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	