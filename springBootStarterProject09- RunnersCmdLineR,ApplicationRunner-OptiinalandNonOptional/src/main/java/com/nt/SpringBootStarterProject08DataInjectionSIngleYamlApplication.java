package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmpCont;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringBootStarterProject08DataInjectionSIngleYamlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterProject08DataInjectionSIngleYamlApplication.class, args);
//		ConfigurableApplicationContext ctx	//SpringApplication app=new SpringApplication(SpringBootStarterProject08DataInjectionSIngleYamlApplication.class);
		//app.setAdditionalProfiles("dev");
		//ConfigurableApplicationContext ctx=app.run(args);
		
		
	}

}
