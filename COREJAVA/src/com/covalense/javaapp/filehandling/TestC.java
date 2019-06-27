package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestC {

	public static void main(String[] args) {
		
		//byte[] b=msg.getBytes();
		
		try {
			String msg= "have a great evening";
			FileOutputStream fout=new FileOutputStream("C://swati.txt");
			byte[] b=msg.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("data is written in to file");
			} catch (Exception e) {
			e.printStackTrace();
			} 
		

	}

}
