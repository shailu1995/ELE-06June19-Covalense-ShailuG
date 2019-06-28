package com.covalense.javaapp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("swati.properties");

			Properties pro = new Properties();
			pro.load(fin);

			String phonenum = pro.getProperty("phonenum");
			String name = pro.getProperty("company");

			log.info("phone number is " + phonenum);
			log.info(" company name is " + name);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
