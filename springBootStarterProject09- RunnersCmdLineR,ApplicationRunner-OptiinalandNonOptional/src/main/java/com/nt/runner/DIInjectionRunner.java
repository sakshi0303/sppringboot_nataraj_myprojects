package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmpCont;
import com.nt.model.Employee;


@Component
public class DIInjectionRunner implements CommandLineRunner {
	
	@Autowired
	private EmpCont controller;
	

	@Override
	public void run(String... args) throws Exception {
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		List<Employee> list=controller.showEmpbyDesg("Lead", "Manager", "Test");
		
		System.out.println("-------------------------------------------------");
		list.forEach(emp->{
			System.out.println(emp+"/n");
		});
		
	}

}
