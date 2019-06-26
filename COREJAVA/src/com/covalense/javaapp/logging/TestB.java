package com.covalense.javaapp.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestB {
	private static final Logger loger = Logger.getLogger("Filpkart");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		try {
			FileHandler fh = new FileHandler("myFileData.log", true);
			fh.setLevel(Level.WARNING);
			loger.addHandler(fh);
			fh.setFormatter(new SimpleFormatter());

			loger.log(Level.SEVERE, "hi its a SEVERE message");
			loger.log(Level.WARNING, "hi its a WARNING message");
			loger.log(Level.INFO, "hi its a INFO message");
			loger.log(Level.CONFIG, "hi its a CONFIG message");
			loger.log(Level.FINE, "hi its a FINE message");
			loger.log(Level.FINER, "hi its a FINER message");
			loger.log(Level.FINEST, "hi its a FINEST message");

			BuyProduct by = new BuyProduct();
			by.buy();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
