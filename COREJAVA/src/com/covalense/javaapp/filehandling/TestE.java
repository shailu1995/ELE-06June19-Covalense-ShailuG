package com.covalense.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class TestE {

	public static void main(String[] args) {
		
		String msg="Ding Ding digana...dam damdam";
		char c[]=msg.toCharArray();
		
		
		try {
			FileWriter fw=new FileWriter("password.txt");
			fw.write(c);
			fw.flush();
			fw.close();
			System.out.println("done...");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
