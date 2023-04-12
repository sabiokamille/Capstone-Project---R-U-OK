
	 
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

public class events_activity extends Activity {

	
	private View _bg__events_ek4;
	private ImageView pexels_ekaterina_bolovtsova_4049992;
	private View talk_rect;
	private TextView let_s_talk_ek1;
	private TextView join_now;
	private TextView learn_more_ek1;
	private ImageView vector_ek126;
	private ImageView pexels_pixabay_45842;
	private View outreach_rect;
	private TextView outreach_ek1;
	private TextView join_us;
	private TextView learn_more_ek2;
	private ImageView vector_ek127;
	private ImageView screenshot_2023_02_12_at_12_43_1;
	private View group_rect;
	private TextView group_therapy;
	private TextView keep_calm;
	private TextView learn_more_ek3;
	private ImageView vector_ek128;
	private ImageView screenshot_2023_02_12_at_12_42_1;
	private View workshop_rect;
	private TextView workshops_ek1;
	private TextView learn__adapt___reset;
	private TextView learn_more_ek4;
	private ImageView vector_ek129;
	private TextView home_ek5;
	private ImageView vector_ek130;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.events);

		
		_bg__events_ek4 = (View) findViewById(R.id._bg__events_ek4);
		pexels_ekaterina_bolovtsova_4049992 = (ImageView) findViewById(R.id.pexels_ekaterina_bolovtsova_4049992);
		talk_rect = (View) findViewById(R.id.talk_rect);
		let_s_talk_ek1 = (TextView) findViewById(R.id.let_s_talk_ek1);
		join_now = (TextView) findViewById(R.id.join_now);
		learn_more_ek1 = (TextView) findViewById(R.id.learn_more_ek1);
		vector_ek126 = (ImageView) findViewById(R.id.vector_ek126);
		pexels_pixabay_45842 = (ImageView) findViewById(R.id.pexels_pixabay_45842);
		outreach_rect = (View) findViewById(R.id.outreach_rect);
		outreach_ek1 = (TextView) findViewById(R.id.outreach_ek1);
		join_us = (TextView) findViewById(R.id.join_us);
		learn_more_ek2 = (TextView) findViewById(R.id.learn_more_ek2);
		vector_ek127 = (ImageView) findViewById(R.id.vector_ek127);
		screenshot_2023_02_12_at_12_43_1 = (ImageView) findViewById(R.id.screenshot_2023_02_12_at_12_43_1);
		group_rect = (View) findViewById(R.id.group_rect);
		group_therapy = (TextView) findViewById(R.id.group_therapy);
		keep_calm = (TextView) findViewById(R.id.keep_calm);
		learn_more_ek3 = (TextView) findViewById(R.id.learn_more_ek3);
		vector_ek128 = (ImageView) findViewById(R.id.vector_ek128);
		screenshot_2023_02_12_at_12_42_1 = (ImageView) findViewById(R.id.screenshot_2023_02_12_at_12_42_1);
		workshop_rect = (View) findViewById(R.id.workshop_rect);
		workshops_ek1 = (TextView) findViewById(R.id.workshops_ek1);
		learn__adapt___reset = (TextView) findViewById(R.id.learn__adapt___reset);
		learn_more_ek4 = (TextView) findViewById(R.id.learn_more_ek4);
		vector_ek129 = (ImageView) findViewById(R.id.vector_ek129);
		home_ek5 = (TextView) findViewById(R.id.home_ek5);
		vector_ek130 = (ImageView) findViewById(R.id.vector_ek130);
	
		
		//custom code goes here

		vector_ek130.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			}
		});

		talk_rect.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), let_s_talk_activity.class);
				startActivity(nextScreen);
			}
		});

		outreach_rect.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), outreach_activity.class);
				startActivity(nextScreen);
			}
		});


		group_rect.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), group_therapy_activity.class);
				startActivity(nextScreen);
			}
		});

		workshop_rect.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), workshops_activity.class);
				startActivity(nextScreen);
			}
		});
	
	}
}
	
	