package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
	public static final String VALOR_1 = "com.example.myfirstapp.VALOR_1";
	public static final String VALOR_2 = "com.example.myfirstapp.VALOR_2";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * Called when the user taps the send button
	 *
	 */
	public void sendMessage(View view)
	{
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = findViewById(R.id.editText);
		EditText editText2 = findViewById(R.id.editText2);
		intent.putExtra(VALOR_1, editText.getText().toString());
		intent.putExtra(VALOR_2, editText2.getText().toString());
		startActivity(intent);
	}
}
