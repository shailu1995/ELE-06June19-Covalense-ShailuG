package com.covalense.javaapp.filehandling;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileHandling {

	public static void main(String[] args) {
		
		try {
			FileUtils.writeStringToFile(new File("MyTestFile.txt"), "ighjhgtygtty");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
