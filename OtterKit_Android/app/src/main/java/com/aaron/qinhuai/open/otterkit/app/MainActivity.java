package com.aaron.qinhuai.open.otterkit.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aaron.qinhuai.open.otterkit.app.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.container, MainFragment.newInstance())
					.commitNow();
		}
	}
}
