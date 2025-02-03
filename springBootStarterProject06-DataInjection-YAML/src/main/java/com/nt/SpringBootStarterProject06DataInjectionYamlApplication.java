package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.EmployeeInfo;

@SpringBootApplication
public class SpringBootStarterProject06DataInjectionYamlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject06DataInjectionYamlApplication.class, args);
		EmployeeInfo empm =ctx.getBean("emp", EmployeeInfo.class);
		System.out.println(empm);
		ctx.close();
	}

}
