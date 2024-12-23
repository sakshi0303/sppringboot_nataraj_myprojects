package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	//resource bundle messagesource is responsible for locating the file based on the locale data we provide
	//fixed beanid for ctx.getmessage() that internally calls ctx.getbean with beanid=messageSource
	@Bean(name="messageSource") 
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("com/nt/commons/App");
		return source;
	}
}