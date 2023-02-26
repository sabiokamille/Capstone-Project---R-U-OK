
	 
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

public class medical_screeing___q1_activity extends Activity {

	
	private View _bg__medical_screeing___q1_ek2;
	private View white_base_ek11;
	private ImageView path_ek117;
	private ImageView path_ek118;
	private ImageView path_ek119;
	private ImageView empty_bar_ek26;
	private ImageView path_ek120;
	private ImageView path_ek121;
	private ImageView path_ek122;
	private ImageView path_ek123;
	private ImageView path_ek124;
	private ImageView path_ek125;
	private ImageView rectangle_23_ek13;
	private ImageView _100_ek13;
	private ImageView rectangle_21__stroke__ek13;
	private View rectangle_20_ek13;
	private ImageView _9_41_ek27;
	private ImageView vector_ek138;
	private TextView what_is_your_age_;
	private View rectangle_69;
	private TextView younger_than_18;
	private View _rectangle_69_ek1;
	private TextView _18_24;
	private View rectangle_69_ek2;
	private TextView _25_34;
	private View rectangle_69_ek3;
	private TextView older_than_34;
	private TextView _1_25;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.medical_screeing___q1);

		
		_bg__medical_screeing___q1_ek2 = (View) findViewById(R.id._bg__medical_screeing___q1_ek2);
		white_base_ek11 = (View) findViewById(R.id.white_base_ek11);
		path_ek117 = (ImageView) findViewById(R.id.path_ek117);
		path_ek118 = (ImageView) findViewById(R.id.path_ek118);
		path_ek119 = (ImageView) findViewById(R.id.path_ek119);
		empty_bar_ek26 = (ImageView) findViewById(R.id.empty_bar_ek26);
		path_ek120 = (ImageView) findViewById(R.id.path_ek120);
		path_ek121 = (ImageView) findViewById(R.id.path_ek121);
		path_ek122 = (ImageView) findViewById(R.id.path_ek122);
		path_ek123 = (ImageView) findViewById(R.id.path_ek123);
		path_ek124 = (ImageView) findViewById(R.id.path_ek124);
		path_ek125 = (ImageView) findViewById(R.id.path_ek125);
		rectangle_23_ek13 = (ImageView) findViewById(R.id.rectangle_23_ek13);
		_100_ek13 = (ImageView) findViewById(R.id._100_ek13);
		rectangle_21__stroke__ek13 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek13);
		rectangle_20_ek13 = (View) findViewById(R.id.rectangle_20_ek13);
		_9_41_ek27 = (ImageView) findViewById(R.id._9_41_ek27);
		vector_ek138 = (ImageView) findViewById(R.id.vector_ek138);
		what_is_your_age_ = (TextView) findViewById(R.id.what_is_your_age_);
		rectangle_69 = (View) findViewById(R.id.rectangle_69);
		younger_than_18 = (TextView) findViewById(R.id.younger_than_18);
		_rectangle_69_ek1 = (View) findViewById(R.id._rectangle_69_ek1);
		_18_24 = (TextView) findViewById(R.id._18_24);
		rectangle_69_ek2 = (View) findViewById(R.id.rectangle_69_ek2);
		_25_34 = (TextView) findViewById(R.id._25_34);
		rectangle_69_ek3 = (View) findViewById(R.id.rectangle_69_ek3);
		older_than_34 = (TextView) findViewById(R.id.older_than_34);
		_1_25 = (TextView) findViewById(R.id._1_25);
	
		
		_rectangle_69_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), medical_screeing___q1_selected_response_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	