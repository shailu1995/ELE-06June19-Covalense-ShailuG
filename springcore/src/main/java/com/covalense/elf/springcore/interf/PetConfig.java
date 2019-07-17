package com.covalense.elf.springcore.interf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {
	@Bean
	public Pet gePet() {
		return new Pet();

	}

	@Bean(name="monkey")
	public Animal getMonkey() {
		return new Monkey();

	}
	@Bean(name="donkey")
	public Animal getDonkey() {
		return new Donkey();

	}
}
