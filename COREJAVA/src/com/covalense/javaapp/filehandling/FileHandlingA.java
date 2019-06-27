package com.covalense.javaapp.filehandling;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileHandlingA {

	public static void main(String[] args) {
		System.out.println("Reading the file..");
		String fileData=null;
		try {
			fileData = FileUtils.readFileToString(new File("test.txt"), "BIDAR");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
        System.out.println("file is "+fileData);
	}

}
