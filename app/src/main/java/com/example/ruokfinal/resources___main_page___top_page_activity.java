
	 
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
	

package com.example.ruokfinal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class resources___main_page___top_page_activity extends Activity {

	
	private View _bg__resources___main_page___top_page_ek2;
	private TextView resources_for_you_;
	private View screening_box;
	private TextView alcohol__substance_screening;
	private View apps_box;
	private TextView self_help_apps;
	private View meditation_box;
	private TextView meditation_ek2;
	private View vid_res_box;
	private TextView vid_resources;
	private TextView home_ek6;
	private ImageView vector_ek133;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.resources___main_page___top_page);

		
		_bg__resources___main_page___top_page_ek2 = (View) findViewById(R.id._bg__resources___main_page___top_page_ek2);
		resources_for_you_ = (TextView) findViewById(R.id.resources_for_you_);
		screening_box = (View) findViewById(R.id.screening_box);
		alcohol__substance_screening = (TextView) findViewById(R.id.alcohol__substance_screening);
		apps_box = (View) findViewById(R.id.apps_box);
		self_help_apps = (TextView) findViewById(R.id.self_help_apps);
		meditation_box = (View) findViewById(R.id.meditation_box);
		meditation_ek2 = (TextView) findViewById(R.id.meditation_ek2);
		vid_res_box = (View) findViewById(R.id.vid_res_box);
		vid_resources = (TextView) findViewById(R.id.vid_resources);
		home_ek6 = (TextView) findViewById(R.id.home_ek6);
		vector_ek133 = (ImageView) findViewById(R.id.vector_ek133);
	
		
		//custom code goes here
		screening_box.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/online-health-screenings/"));
				startActivity(browserIntent);
			}
		});

		meditation_box.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/guided-exercises-meditation/"));
				startActivity(browserIntent);
			}
		});

		vid_res_box.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/workshops-resources/video-resources/"));
				startActivity(browserIntent);
			}
		});

		apps_box.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://health.rutgers.edu/education/self-help/self-help-apps/"));
				startActivity(browserIntent);
			}
		});

		vector_ek133.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);


			}
		});
	
	}
}
	
	