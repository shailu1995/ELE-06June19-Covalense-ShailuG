package com.covalense.javapp.assignlamda;

import java.util.logging.Logger;

import lombok.extern.java.Log;

/*
 * WAP to addd num using lamda expression 
 */
@Log
public class TestAdd {
	

static Add s=(a,b)-> a+b;
	public static void main(String[] args) {
		int i=s.add(50,10);
		log.info("addtion= "+i);
		
	}

}

