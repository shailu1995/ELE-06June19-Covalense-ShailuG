package com.covalense.elf.springcore.interf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet {
	public String name;
	@Autowired
	//@Qualifier("monkey")
	private Animal animal;

	public void doSomething() {
		animal.eat();
		animal.makeSound();
	}
}
