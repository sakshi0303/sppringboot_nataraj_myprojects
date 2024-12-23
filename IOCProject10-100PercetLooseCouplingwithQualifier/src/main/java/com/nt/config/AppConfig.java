package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ComponentScan(basePackages="com.nt.sbean")
@ImportResource("com/nt/cfgs/applicationContext.xml") // to connect to xml file + java code

//@PropertySource("com/nt/commons/info.properties") // only java code, through exception
public class AppConfig {
	

}