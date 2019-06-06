package com.example.myfirstapp.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsServiceTest {

	@Test
	public void capicuaTest() {
		assertTrue(UtilsService.esCapicua(18781));
		assertTrue(UtilsService.esCapicua(242));
		assertFalse(UtilsService.esCapicua(241));
		assertFalse(UtilsService.esCapicua(4342));
	}

	@Test
	public void vocalesConsonantes() {
		assertEquals(9, UtilsService.contarVocales("Java & Kotlin son INCREIBLES"));
		assertEquals(7, UtilsService.contarVocales("JAVASCRIPT esta FEO"));

		assertEquals(14, UtilsService.contarConsonantes("Java & Kotlin son INCREIBLES"));
		assertEquals(10, UtilsService.contarConsonantes("JAVASCRIPT esta FEO"));
	}

	@Test
	public void palabras() {
		assertEquals(4, UtilsService.contarPalabras("Hola mundo! Que tal?"));
		assertEquals(6, UtilsService.contarPalabras("Adios mundo! Me haran mucha falta"));
	}

	@Test
	public void palindromos() {
		assertTrue(UtilsService.esPalindromo("aaabbccbbaaa"));
		assertTrue(UtilsService.esPalindromo("aaabbcbbaaa"));
		assertFalse(UtilsService.esPalindromo("aaabbcbbaae"));
		assertFalse(UtilsService.esPalindromo("aabcbbaaa"));
	}
}
