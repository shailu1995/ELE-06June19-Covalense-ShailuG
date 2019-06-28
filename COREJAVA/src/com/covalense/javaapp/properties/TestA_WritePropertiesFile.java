package com.covalense.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class TestA_WritePropertiesFile {

	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("swati.properties");

			Properties p = new Properties();
			p.setProperty("company", "covalense");
			p.setProperty("phonenum", "8971048836");
			p.store(fout, "company details");
			log.info("done");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
