package com.covalense.javaapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrinOppTest {

	private StringOpp stropp = new StringOpp();

	@Test
	public void test() {
		int expected = 6;
		int actual = stropp.count("shailu");
		assertEquals(expected, actual);
	}

	public void testupperToLower() {
		assertEquals("SHAILU", "shailu");
	}

	@Test(expected = NullPointerException.class)
	public void testEx() {
		stropp.count(null);
	}

}
