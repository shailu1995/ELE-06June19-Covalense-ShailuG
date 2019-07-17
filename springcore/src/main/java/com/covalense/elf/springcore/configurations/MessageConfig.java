package com.covalense.elf.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.covalense.elf.springcore.beans.MessageBean;

@Configuration
public class MessageConfig {
@Bean
@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("HIIII**********");
		return messageBean;
	}

}
