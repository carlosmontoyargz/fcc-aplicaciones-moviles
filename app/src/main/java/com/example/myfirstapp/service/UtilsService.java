package com.example.myfirstapp.service;

public class UtilsService
{
	public static boolean esCapicua(int number)
	{
		return esPalindromo(String.valueOf(number));
	}

	public static boolean esPalindromo(String original)
	{
		StringBuilder reverse = new StringBuilder();
		for (int i = original.length() - 1; i >= 0; i--)
			reverse.append(original.charAt(i));
		return original.equals(reverse.toString());
	}

	public static int contarVocales(String cadena)
	{
		int contador = 0;
		String vocales="aeiouAEIOU";
		for (int i=0;i<cadena.length();i++)
			for (int j=0;j<vocales.length();j++)
				if (cadena.charAt(i)==vocales.charAt(j))
					contador++;
		return contador;
	}

	public static int contarConsonantes(String cadena)
	{
		int contador = 0;
		String consonantes="bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
		for (int i=0;i<cadena.length();i++)
			for (int j=0;j<consonantes.length();j++)
				if (cadena.charAt(i)==consonantes.charAt(j))
					contador++;
		return contador;
	}

	public static int contarPalabras(String msg)
	{
		if (msg == null || msg.isEmpty()) return 0;
		return msg.split("\\s+").length;
	}
}
