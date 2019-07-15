package com.example.kincirmuter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
RelativeLayout relative1;
Animation rotate_forever;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		relative1=(RelativeLayout)findViewById(R.id.relative1);
		rotate_forever = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate_forever);
		relative1.startAnimation(rotate_forever);
	}


}
