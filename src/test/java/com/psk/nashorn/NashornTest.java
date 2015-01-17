package com.psk.nashorn;

import org.junit.Assert;
import org.junit.Test;

public class NashornTest {

	@Test
	public void testPrintSample() {
		// Given
		// When
		Nashorn.printSample();

		// Then
		Assert.assertTrue(true);
	}

	@Test
	public void testCallFunction1() {
		// Given
		// When
		Nashorn.callFunction1();

		// Then
		Assert.assertTrue(true);
	}

	@Test
	public void testCallFunction2() {
		// Given
		// When
		Nashorn.callFunction2();

		// Then
		Assert.assertTrue(true);
	}

	@Test
	public void testCallJavaMethodtoJavaScript() {
		// Given
		// When
		Nashorn.calljavaMethodJavascript();

		// Then
		Assert.assertTrue(true);
	}

	@Test
	public void testCallMirrorBasic1() {
		// Given
		// When
		Nashorn.callMirror1();

		// Then
		Assert.assertTrue(true);
	}
	
	@Test
	public void testCallMirror2() {
		// Given
		// When
		Nashorn.callMirror2();

		// Then
		Assert.assertTrue(true);
	}
}
