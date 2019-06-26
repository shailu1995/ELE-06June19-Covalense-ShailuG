package com.covalense.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
	public static void main(String[] args) {
		FileInputStream fin=null;
		ObjectInputStream objin=null;
		
		try {
			fin=new FileInputStream("TYSS.txt");
			objin=new ObjectInputStream(fin);
			Person p=(Person)objin.readObject();
		    System.out.println("name "+p.getName());
		    System.out.println("id "+p.getId());
		
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
		e.printStackTrace();
		}catch (IOException e) {
		e.printStackTrace();
		}
		finally {
			if(objin !=null) {
				try {
					objin.close();
				}
					
		 catch (Exception e2) {
					System.out.println("**********");
				}
				}
			}
	}
}
