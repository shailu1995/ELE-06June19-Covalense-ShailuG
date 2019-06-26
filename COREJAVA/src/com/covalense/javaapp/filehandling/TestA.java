package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class TestA {

	public static void main(String[] args) {
		File f=new File("shailu.txt");
		
		try {
			boolean res=f.createNewFile();
			System.out.println("RESULT IS "+res);
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
