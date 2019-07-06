package com.covalense.filecreationutil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.filecreationutil.util.CreateFileUtil;

public class CreateFileUtilTest {
	CreateFileUtil c = new CreateFileUtil();

	@Test
	public boolean createFileTest() {
		boolean expected = true;
		boolean actual = c.CreateFileUtil("My Text.txt", "this is test file");
		assertEquals(expected, actual);
		return actual;
	}// end of createFileTest

}// end of class
