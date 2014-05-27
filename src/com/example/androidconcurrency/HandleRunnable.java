package com.example.androidconcurrency;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class HandleRunnable extends Activity {
	final private Handler handle=new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_handle_runnable);
		
		final TextView textView=(TextView) findViewById(R.id.textView1);
		
		new Thread(new Runnable() {
			public void run() {
				handle.postDelayed(new Runnable() {
					public void run() {
						textView.setText("Back Baby!");
					}
				}, 5000);
			}
		}).start();
	}
}
