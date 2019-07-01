package com.covalense.filecreationutilnew.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.filecreationutilnew.util.CreateFileUtil;

public class CreateFileUtilTest {
	CreateFileUtil c=new CreateFileUtil();
	
	@Test
	public void createFileTest() {
		boolean expected=true;
		boolean actual=c.creatFile("My Text.txt","this is test file");
		assertEquals(expected, true);
	
	}//end of createFileTest

}//end of class
