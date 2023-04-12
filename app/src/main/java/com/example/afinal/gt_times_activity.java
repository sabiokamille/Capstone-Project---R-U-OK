
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		Wednesday 12th of April 2023 03:38:01 AM
	 *	@title 		v2
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class gt_times_activity extends Activity {

	
	private View _bg__gt_times_ek2;
	private View white_base;
	private ImageView vector_ek131;
	private TextView group_therapy_ek1;
	private View rectangle_62;
	private ImageView screenshot_2023_02_13_at_10_03_2;
	private ImageView vector_ek132;
	private TextView clinical_psychologist;
	private TextView rutgers_university;
	private TextView dr__wendy_cook;
	private View rectangle_62_ek1;
	private ImageView screenshot_2023_02_13_at_10_03_1;
	private TextView clinical_psychologist_ek1;
	private TextView rutgers_university_ek1;
	private TextView dr__mike_hullman;
	private View rectangle_62_ek2;
	private TextView clinical_psychologist_ek2;
	private TextView rutgers_university_ek2;
	private TextView dr__sara_johnson;
	private ImageView screenshot_2023_02_13_at_10_40_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.gt_times);

		
		_bg__gt_times_ek2 = (View) findViewById(R.id._bg__gt_times_ek2);
		white_base = (View) findViewById(R.id.white_base);
		vector_ek131 = (ImageView) findViewById(R.id.vector_ek131);
		group_therapy_ek1 = (TextView) findViewById(R.id.group_therapy_ek1);
		rectangle_62 = (View) findViewById(R.id.rectangle_62);
		screenshot_2023_02_13_at_10_03_2 = (ImageView) findViewById(R.id.screenshot_2023_02_13_at_10_03_2);
		vector_ek132 = (ImageView) findViewById(R.id.vector_ek132);
		clinical_psychologist = (TextView) findViewById(R.id.clinical_psychologist);
		rutgers_university = (TextView) findViewById(R.id.rutgers_university);
		dr__wendy_cook = (TextView) findViewById(R.id.dr__wendy_cook);
		rectangle_62_ek1 = (View) findViewById(R.id.rectangle_62_ek1);
		screenshot_2023_02_13_at_10_03_1 = (ImageView) findViewById(R.id.screenshot_2023_02_13_at_10_03_1);
		clinical_psychologist_ek1 = (TextView) findViewById(R.id.clinical_psychologist_ek1);
		rutgers_university_ek1 = (TextView) findViewById(R.id.rutgers_university_ek1);
		dr__mike_hullman = (TextView) findViewById(R.id.dr__mike_hullman);
		rectangle_62_ek2 = (View) findViewById(R.id.rectangle_62_ek2);
		clinical_psychologist_ek2 = (TextView) findViewById(R.id.clinical_psychologist_ek2);
		rutgers_university_ek2 = (TextView) findViewById(R.id.rutgers_university_ek2);
		dr__sara_johnson = (TextView) findViewById(R.id.dr__sara_johnson);
		screenshot_2023_02_13_at_10_40_1 = (ImageView) findViewById(R.id.screenshot_2023_02_13_at_10_40_1);
	
		
		//custom code goes here

		vector_ek131.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), group_therapy_activity.class);
				startActivity(nextScreen);
			}
		});
	
	}
}
	
	