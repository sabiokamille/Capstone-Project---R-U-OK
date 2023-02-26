
	 
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

public class preference_q1___selected_activity extends Activity {

	
	private View _bg__preference_q1___selected_ek2;
	private View white_base_ek13;
	private ImageView path_ek135;
	private ImageView path_ek136;
	private ImageView path_ek137;
	private ImageView empty_bar_ek30;
	private ImageView path_ek138;
	private ImageView path_ek139;
	private ImageView path_ek140;
	private ImageView path_ek141;
	private ImageView path_ek142;
	private ImageView path_ek143;
	private ImageView rectangle_23_ek15;
	private ImageView _100_ek15;
	private ImageView rectangle_21__stroke__ek15;
	private View rectangle_20_ek15;
	private ImageView _9_41_ek31;
	private ImageView vector_ek140;
	private TextView meeting_preference_ek1;
	private View rectangle_69_ek7;
	private TextView in_person_ek1;
	private View rectangle_69_ek8;
	private TextView zoom_ek1;
	private View rectangle_69_ek9;
	private TextView both_ek1;
	private View _rectangle_64_ek5;
	private TextView continue_ek6;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.preference_q1___selected);

		
		_bg__preference_q1___selected_ek2 = (View) findViewById(R.id._bg__preference_q1___selected_ek2);
		white_base_ek13 = (View) findViewById(R.id.white_base_ek13);
		path_ek135 = (ImageView) findViewById(R.id.path_ek135);
		path_ek136 = (ImageView) findViewById(R.id.path_ek136);
		path_ek137 = (ImageView) findViewById(R.id.path_ek137);
		empty_bar_ek30 = (ImageView) findViewById(R.id.empty_bar_ek30);
		path_ek138 = (ImageView) findViewById(R.id.path_ek138);
		path_ek139 = (ImageView) findViewById(R.id.path_ek139);
		path_ek140 = (ImageView) findViewById(R.id.path_ek140);
		path_ek141 = (ImageView) findViewById(R.id.path_ek141);
		path_ek142 = (ImageView) findViewById(R.id.path_ek142);
		path_ek143 = (ImageView) findViewById(R.id.path_ek143);
		rectangle_23_ek15 = (ImageView) findViewById(R.id.rectangle_23_ek15);
		_100_ek15 = (ImageView) findViewById(R.id._100_ek15);
		rectangle_21__stroke__ek15 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek15);
		rectangle_20_ek15 = (View) findViewById(R.id.rectangle_20_ek15);
		_9_41_ek31 = (ImageView) findViewById(R.id._9_41_ek31);
		vector_ek140 = (ImageView) findViewById(R.id.vector_ek140);
		meeting_preference_ek1 = (TextView) findViewById(R.id.meeting_preference_ek1);
		rectangle_69_ek7 = (View) findViewById(R.id.rectangle_69_ek7);
		in_person_ek1 = (TextView) findViewById(R.id.in_person_ek1);
		rectangle_69_ek8 = (View) findViewById(R.id.rectangle_69_ek8);
		zoom_ek1 = (TextView) findViewById(R.id.zoom_ek1);
		rectangle_69_ek9 = (View) findViewById(R.id.rectangle_69_ek9);
		both_ek1 = (TextView) findViewById(R.id.both_ek1);
		_rectangle_64_ek5 = (View) findViewById(R.id._rectangle_64_ek5);
		continue_ek6 = (TextView) findViewById(R.id.continue_ek6);
	
		
		_rectangle_64_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), preference_q2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	