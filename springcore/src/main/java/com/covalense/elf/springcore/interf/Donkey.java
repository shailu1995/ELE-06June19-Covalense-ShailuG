package com.covalense.elf.springcore.interf;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	public void eat() {
		log.info("eats grass");
	}

	public void makeSound() {
		log.info("_________!");
	}

}
