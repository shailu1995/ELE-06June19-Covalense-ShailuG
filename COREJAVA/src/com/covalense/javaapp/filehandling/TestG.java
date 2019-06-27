package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestG {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("swati");
		p.setId(22);

		try {
			FileOutputStream fout = new FileOutputStream("TYSS.txt");

			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(p);
			objout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
