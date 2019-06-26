package com.covalense.javaapp.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestA {
	private static final Logger loger = Logger.getLogger("shailu");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.CONFIG);
		loger.addHandler(ch);

		loger.log(Level.SEVERE, "hi its a SEVERE message");
		loger.log(Level.WARNING, "hi its a WARNING message");
		loger.log(Level.INFO, "hi its a INFO message");
		loger.log(Level.CONFIG, "hi its a CONFIG message");
		loger.log(Level.FINE, "hi its a FINE message");
		loger.log(Level.FINER, "hi its a FINER message");
		loger.log(Level.FINEST, "hi its a FINEST message");
	}
}
