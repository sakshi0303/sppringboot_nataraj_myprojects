package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

@Configuration
@ComponentScan(basePackages="com.nt.ston")
public class AppConfig {
	
	@Bean(name="prn")
	@Scope("prototype")
	public Printer getinstance() {
		return Printer.getinstance();
	}
	
	
	

}
