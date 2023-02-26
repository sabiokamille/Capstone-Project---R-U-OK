
	 
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

public class preference_q3___selected_activity extends Activity {

	
	private View _bg__preference_q3___selected_ek2;
	private View white_base_ek15;
	private ImageView path_ek153;
	private ImageView path_ek154;
	private ImageView path_ek155;
	private ImageView empty_bar_ek34;
	private ImageView path_ek156;
	private ImageView path_ek157;
	private ImageView path_ek158;
	private ImageView path_ek159;
	private ImageView path_ek160;
	private ImageView path_ek161;
	private ImageView rectangle_23_ek17;
	private ImageView _100_ek17;
	private ImageView rectangle_21__stroke__ek17;
	private View rectangle_20_ek17;
	private ImageView _9_41_ek35;
	private ImageView vector_ek142;
	private TextView time_preference_ek1;
	private View rectangle_69_ek13;
	private TextView morning_ek1;
	private View rectangle_69_ek14;
	private TextView afternoon_ek1;
	private View rectangle_69_ek15;
	private TextView evening_ek1;
	private View _rectangle_64_ek6;
	private TextView continue_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.preference_q3___selected);

		
		_bg__preference_q3___selected_ek2 = (View) findViewById(R.id._bg__preference_q3___selected_ek2);
		white_base_ek15 = (View) findViewById(R.id.white_base_ek15);
		path_ek153 = (ImageView) findViewById(R.id.path_ek153);
		path_ek154 = (ImageView) findViewById(R.id.path_ek154);
		path_ek155 = (ImageView) findViewById(R.id.path_ek155);
		empty_bar_ek34 = (ImageView) findViewById(R.id.empty_bar_ek34);
		path_ek156 = (ImageView) findViewById(R.id.path_ek156);
		path_ek157 = (ImageView) findViewById(R.id.path_ek157);
		path_ek158 = (ImageView) findViewById(R.id.path_ek158);
		path_ek159 = (ImageView) findViewById(R.id.path_ek159);
		path_ek160 = (ImageView) findViewById(R.id.path_ek160);
		path_ek161 = (ImageView) findViewById(R.id.path_ek161);
		rectangle_23_ek17 = (ImageView) findViewById(R.id.rectangle_23_ek17);
		_100_ek17 = (ImageView) findViewById(R.id._100_ek17);
		rectangle_21__stroke__ek17 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek17);
		rectangle_20_ek17 = (View) findViewById(R.id.rectangle_20_ek17);
		_9_41_ek35 = (ImageView) findViewById(R.id._9_41_ek35);
		vector_ek142 = (ImageView) findViewById(R.id.vector_ek142);
		time_preference_ek1 = (TextView) findViewById(R.id.time_preference_ek1);
		rectangle_69_ek13 = (View) findViewById(R.id.rectangle_69_ek13);
		morning_ek1 = (TextView) findViewById(R.id.morning_ek1);
		rectangle_69_ek14 = (View) findViewById(R.id.rectangle_69_ek14);
		afternoon_ek1 = (TextView) findViewById(R.id.afternoon_ek1);
		rectangle_69_ek15 = (View) findViewById(R.id.rectangle_69_ek15);
		evening_ek1 = (TextView) findViewById(R.id.evening_ek1);
		_rectangle_64_ek6 = (View) findViewById(R.id._rectangle_64_ek6);
		continue_ek1 = (TextView) findViewById(R.id.continue_ek1);
	
		
		_rectangle_64_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), preference_q4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	