package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class TestB {

	public static void main(String[] args) {
		
			File f=new File("programfiles/songs.txt");
			boolean res=f.mkdir();
			
			
			
			System.out.println("RESULT IS "+res);
		
		
		}

	}


