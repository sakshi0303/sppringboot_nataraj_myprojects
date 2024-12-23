package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.nt.sbean")
@PropertySource("com/nt/commons/info.properties")
public class AppConfig {
	

}
