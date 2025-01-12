package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbean.Student;
@ImportResource("classpath:com/nt/config/applicationContext.xml")
@SpringBootApplication
public class SpringBootStarterProject2cDependencyIngectionStratedgydesignAssignment2LooseCoupling {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject2cDependencyIngectionStratedgydesignAssignment2LooseCoupling.class, args);
		Student sto=ctx.getBean("student", Student.class);
		System.out.println(sto.prepare());
	}

}
