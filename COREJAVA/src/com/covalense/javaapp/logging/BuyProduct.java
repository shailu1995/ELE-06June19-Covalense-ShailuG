package com.covalense.javaapp.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger Loger = Logger.getLogger("Filpkart");

	void buy() {

		Loger.log(Level.SEVERE, "buy button was clicked");
		Loger.log(Level.WARNING, "hi its a WARNING message for buy product");
		Loger.log(Level.INFO, "hi its a INFO message for buy product");
		Loger.log(Level.CONFIG, "hi its a CONFIG message for buy product");
		Loger.log(Level.FINE, "hi its a FINE message for buy product");
		Loger.log(Level.FINER, "hi its a FINER message for buy product");
		Loger.log(Level.FINEST, "hi its a FINEST message for buy product");
	}
}
