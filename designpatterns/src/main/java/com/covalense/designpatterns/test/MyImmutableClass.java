package com.covalense.designpatterns.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class MyImmutableClass {
	private String name;
	private int age;
	private long phone;
}//END OF CLASS
