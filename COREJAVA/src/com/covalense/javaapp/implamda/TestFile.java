package com.covalense.javaapp.implamda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {

		String msg = "Hello";
		byte[] by = msg.getBytes();

		try (FileOutputStream fout = new FileOutputStream("ASSIGN.txt")) {
			fout.write(by);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
