package com.covalense.elf.springcore.interf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PetTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("petconfig.xml");
		Pet pet = (Pet)context.getBean("pet");
		pet.doSomething();
		//ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		//Pet pet = context.getBean(Pet.class);
	}

}
