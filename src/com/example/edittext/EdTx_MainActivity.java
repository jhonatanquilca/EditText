package com.example.edittext;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class EdTx_MainActivity extends Activity {
	EditText et1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ed_tx__main);
		et1=(EditText)findViewById(R.id.EditText1);
		String testowiw=et1.getText().toString();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ed_tx__main, menu);
		return true;
	}

}
