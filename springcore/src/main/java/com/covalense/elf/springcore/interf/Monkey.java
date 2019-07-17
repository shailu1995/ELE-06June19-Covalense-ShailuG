package com.covalense.elf.springcore.interf;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {

	public void eat() {
		log.info("eats banana");
	}

	public void makeSound() {
		log.info("___________________!");
	}

}
