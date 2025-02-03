package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.DignosticCenter;

@SpringBootApplication
public class SpringBootStarterProject04SimpleDataInjectionSpelExpressionLanguageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject04SimpleDataInjectionSpelExpressionLanguageApplication.class, args);
		DignosticCenter dcm=ctx.getBean("dc", DignosticCenter.class);
		System.out.println(dcm);
		
		ctx.close();
		
	
	}

}
