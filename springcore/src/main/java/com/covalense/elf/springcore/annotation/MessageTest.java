package com.covalense.elf.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.covalense.elf.springcore.beans.MessageBean;
import com.covalense.elf.springcore.configurations.MessageConfig;

import lombok.extern.java.Log;
@Log
public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		MessageBean message1=context.getBean(MessageBean.class);
		MessageBean message2=context.getBean(MessageBean.class);
		
		log.info("msz1"+message1.getMessage());
		log.info("msz2"+message2.getMessage());
		
		message2.setMessage("hello");
		
		log.info("msz1"+message1.getMessage());
		log.info("msz2"+message2.getMessage());
	}
}
