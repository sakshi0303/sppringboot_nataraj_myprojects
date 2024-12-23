package com.nt.config;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages="com.nt.Sbeans")
@Lazy(true)
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig class");
	}
	@Bean(name="ldt")
	@Lazy(true)
	public LocalDateTime createdt(){
		System.out.println("method creatdt()");
		return LocalDateTime.now();
	}
	
	

}
