package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbean.Vehicle;

@SpringBootApplication
@ComponentScan("com.nt.sbean")
public class SpringBootStarterProject2DependencyIngectionStratedgydesignApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject2DependencyIngectionStratedgydesignApplication.class, args);
		Vehicle vehmes=ctx.getBean("vehicle",Vehicle.class);
		
		System.out.println(vehmes.journey(LocalDate.now(), LocalDate.now().plusDays(1)));
		
	}

}
