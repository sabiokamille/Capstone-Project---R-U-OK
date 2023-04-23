
	 
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

	public class lt_times_activity extends Activity {

	
	private View _bg__lt_times_ek2;
	private ImageView vector_ek132;
	private TextView let_s_talk_ek2;
	private View white_base_ek1;
	private TextView april_20__2023___12_30pm;
	private TextView let_s_get_talking_on_college_ave_campus;
	private TextView by_caps;
	private TextView april_20__2023___5pm;
	private TextView group_session_on_busch_campus;
	private TextView by_caps_ek1;
	private TextView group_ek3;
	private TextView mental_health;
	private TextView april_24__2023___5pm;
	private TextView individual_session_on_busch_campus;
	private TextView by_caps_ek2;
	private TextView group_ek4;
	private TextView mental_health_ek1;
	private TextView april_27__2023___5pm;
	private TextView individual_session_remote;
	private TextView by_caps_ek3;
	private TextView mental_health_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.lt_times);

		
		_bg__lt_times_ek2 = (View) findViewById(R.id._bg__lt_times_ek2);
		vector_ek132 = (ImageView) findViewById(R.id.vector_ek132);
		let_s_talk_ek2 = (TextView) findViewById(R.id.let_s_talk_ek2);
		white_base_ek1 = (View) findViewById(R.id.white_base_ek1);
		april_20__2023___12_30pm = (TextView) findViewById(R.id.april_20__2023___12_30pm);
		let_s_get_talking_on_college_ave_campus = (TextView) findViewById(R.id.let_s_get_talking_on_college_ave_campus);
		by_caps = (TextView) findViewById(R.id.by_caps);
		april_20__2023___5pm = (TextView) findViewById(R.id.april_20__2023___5pm);
		group_session_on_busch_campus = (TextView) findViewById(R.id.group_session_on_busch_campus);
		by_caps_ek1 = (TextView) findViewById(R.id.by_caps_ek1);
		group_ek3 = (TextView) findViewById(R.id.group_ek3);
		mental_health = (TextView) findViewById(R.id.mental_health);
		april_24__2023___5pm = (TextView) findViewById(R.id.april_24__2023___5pm);
		individual_session_on_busch_campus = (TextView) findViewById(R.id.individual_session_on_busch_campus);
		by_caps_ek2 = (TextView) findViewById(R.id.by_caps_ek2);
		group_ek4 = (TextView) findViewById(R.id.group_ek4);
		mental_health_ek1 = (TextView) findViewById(R.id.mental_health_ek1);
		april_27__2023___5pm = (TextView) findViewById(R.id.april_27__2023___5pm);
		individual_session_remote = (TextView) findViewById(R.id.individual_session_remote);
		by_caps_ek3 = (TextView) findViewById(R.id.by_caps_ek3);
		mental_health_ek2 = (TextView) findViewById(R.id.mental_health_ek2);
	
		
		//custom code goes here
		vector_ek132.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), let_s_talk_activity.class);
				startActivity(nextScreen);


			}
		});
	
	}
}
	
	