package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.Student;

@SpringBootApplication
public class SpringBootStarterProject2bDependencyIngectionStratedgydesignAssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProject2bDependencyIngectionStratedgydesignAssignmentApplication.class, args);
		Student sto=ctx.getBean("student", Student.class);
		System.out.println(sto.prepare());
	}

}
