package com.apputu.gsp;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    @Override
	public boolean onTouchEvent(MotionEvent event) {
		// MotionEvent object holds X-Y values
		if(event.getAction() == MotionEvent.ACTION_DOWN) {
			String text = "X: " + event.getX() + " Y: " + event.getY();
			Toast.makeText(this, text, Toast.LENGTH_LONG).show();
			int x = (int)event.getX();
			int y = (int)event.getY();
			RelativeLayout rlMain = (RelativeLayout) findViewById(R.id.main);
			rlMain.removeAllViews();
			ImageView iv = new ImageView(this);
			iv.setImageResource(R.drawable.circle);
			RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(40, 40);
			params.topMargin=y-40;
			params.leftMargin=x;
			rlMain.addView(iv, params);
		}

		return super.onTouchEvent(event);
	}
    
}
