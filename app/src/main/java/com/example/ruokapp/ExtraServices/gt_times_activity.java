
	 
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


package com.example.ruokapp.ExtraServices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ruokapp.R;

	public class gt_times_activity extends Activity {

	
	private View _bg__gt_times_ek2;
	private View white_base;
	private ImageView vector_ek130;
	private TextView group_therapy_ek1;
	private View rectangle_62;
	private ImageView screenshot_2023_02_13_at_10_03_2;
	private ImageView vector_ek131;
	private TextView mondays_from_5_30__6_30_virtual;
	private TextView women_of_color_group;
	private TextView dr__wendy_cook;
	private View rectangle_62_ek1;
	private ImageView screenshot_2023_02_13_at_10_03_1;
	private TextView mondays_3_4_30_pm_in_person_at_caps;
	private TextView cultivating_calm;
	private TextView dr__mike_hullman;
	private View rectangle_62_ek2;
	private TextView tuesdays_from_5_30__6_30_virtual;
	private TextView grief___loss;
	private TextView dr__sara_johnson;
	private ImageView screenshot_2023_02_13_at_10_40_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.gt_times);

		
		_bg__gt_times_ek2 = (View) findViewById(R.id._bg__gt_times_ek2);
		white_base = (View) findViewById(R.id.white_base);
		vector_ek130 = (ImageView) findViewById(R.id.vector_ek130);
		group_therapy_ek1 = (TextView) findViewById(R.id.group_therapy_ek1);
		rectangle_62 = (View) findViewById(R.id.rectangle_62);
		screenshot_2023_02_13_at_10_03_2 = (ImageView) findViewById(R.id.screenshot_2023_02_13_at_10_03_2);
		vector_ek131 = (ImageView) findViewById(R.id.vector_ek131);
		mondays_from_5_30__6_30_virtual = (TextView) findViewById(R.id.mondays_from_5_30__6_30_virtual);
		women_of_color_group = (TextView) findViewById(R.id.women_of_color_group);
		dr__wendy_cook = (TextView) findViewById(R.id.dr__wendy_cook);
		rectangle_62_ek1 = (View) findViewById(R.id.rectangle_62_ek1);
		screenshot_2023_02_13_at_10_03_1 = (ImageView) findViewById(R.id.screenshot_2023_02_13_at_10_03_1);
		mondays_3_4_30_pm_in_person_at_caps = (TextView) findViewById(R.id.mondays_3_4_30_pm_in_person_at_caps);
		cultivating_calm = (TextView) findViewById(R.id.cultivating_calm);
		dr__mike_hullman = (TextView) findViewById(R.id.dr__mike_hullman);
		rectangle_62_ek2 = (View) findViewById(R.id.rectangle_62_ek2);
		tuesdays_from_5_30__6_30_virtual = (TextView) findViewById(R.id.tuesdays_from_5_30__6_30_virtual);
		grief___loss = (TextView) findViewById(R.id.grief___loss);
		dr__sara_johnson = (TextView) findViewById(R.id.dr__sara_johnson);
		screenshot_2023_02_13_at_10_40_1 = (ImageView) findViewById(R.id.screenshot_2023_02_13_at_10_40_1);
	
		
		//custom code goes here
		vector_ek130.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), group_therapy_activity.class);
				startActivity(nextScreen);


			}
		});
	
	}
}
	
	