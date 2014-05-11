package com.jjk.showtouch;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTouchListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View onTouchView = findViewById(R.id.textViewT);
	    onTouchView.setOnTouchListener(this);
	}
	
	public boolean onTouch(View view, MotionEvent event) {
	    if(event.getAction() == MotionEvent.ACTION_MOVE) {
	        float x = event.getRawX();
	        float y = event.getRawY();
	        
	        TextView X = (TextView) findViewById(R.id.textViewX);
	        TextView Y = (TextView) findViewById(R.id.textViewY);
	        X.setText("Xcord: " + x );
	        Y.setText("Ycord: " + y);
	    }
		return true;
	}
}
