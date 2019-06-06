package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myfirstapp.service.UtilsService;

public class DisplayMessageActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);

		// Get the intent that started this activity and extract the string
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.VALOR_1);
		String message2 = intent.getStringExtra(MainActivity.VALOR_2);

		try
		{
			int n1 = Integer.parseInt(message);
			int n2 = Integer.parseInt(message2);
			int suma = n1 + n2;
			String esCapMsg = UtilsService.esCapicua(suma)? "es" : "NO es";
			String msg = "La suma es " + suma + " y el numero " + esCapMsg + " capicua";

			TextView textView = findViewById(R.id.textView);
			textView.setText(msg);
		}
		catch (NumberFormatException e)
		{
			String msg = message + message2;

			int vocales = UtilsService.contarVocales(msg);
			int consonantes = UtilsService.contarConsonantes(msg);
			int palabras = UtilsService.contarPalabras(msg);
			String esPalindromoStr = UtilsService.esPalindromo(msg)? "es palindromo" : "no es palindromo";

			msg = "La concatenacion es " + msg +
					", tiene " + palabras + " palabras, " +
					vocales + " vocales, " +
					consonantes + " consonantes y " +
					esPalindromoStr;

			TextView textView = findViewById(R.id.textView);
			textView.setText(msg);
		}
	}
}
