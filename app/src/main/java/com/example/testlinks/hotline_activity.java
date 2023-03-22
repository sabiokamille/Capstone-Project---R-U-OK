
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		profile
	 *	@date 		Wednesday 22nd of March 2023 12:53:37 AM
	 *	@title 		Wireframes
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.testlinks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class hotline_activity extends Activity {

	
	private View _bg__hotline_ek2;
	private ImageView vector_ek26;
	private View white_base_ek10;
	private TextView national_crisis_text_line__text_hello_to_741741_nj_hope_line__suicide_prevention___855_654_6735_988_suicide_and_crisis_lifeline__call_or_text_to_988_acute_psychiatric_service__aps___855_515_5700;
	private TextView hotline_numbers;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotline);

		
		_bg__hotline_ek2 = (View) findViewById(R.id._bg__hotline_ek2);
		vector_ek26 = (ImageView) findViewById(R.id.vector_ek26);
		white_base_ek10 = (View) findViewById(R.id.white_base_ek10);
		national_crisis_text_line__text_hello_to_741741_nj_hope_line__suicide_prevention___855_654_6735_988_suicide_and_crisis_lifeline__call_or_text_to_988_acute_psychiatric_service__aps___855_515_5700 = (TextView) findViewById(R.id.national_crisis_text_line__text_hello_to_741741_nj_hope_line__suicide_prevention___855_654_6735_988_suicide_and_crisis_lifeline__call_or_text_to_988_acute_psychiatric_service__aps___855_515_5700);
		hotline_numbers = (TextView) findViewById(R.id.hotline_numbers);

		vector_ek26.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), resources___main_page___top_page_activity.class);
				startActivity(nextScreen);
			}
		});
		//custom code goes here
	
	}
}
	
	