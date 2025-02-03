package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IServiceMgt;

@Component
public class DPTestPLSQLProcedure implements CommandLineRunner {
	
	@Autowired
	private IServiceMgt service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		service.showDatabypercentage(30.0f, 55.0f).forEach(System.out::println);

	}

}



