package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadDataFile {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;

		File f1 = new File("File1.txt");
		File f2 = new File("destfile");

		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
			byte[] b = new byte[1024];
			int length;
			while ((length = in.read(b)) > 0) {
				out.write(b, 0, length);
			}
			if (in != null)
				in.close();
			if (out != null)
				out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
