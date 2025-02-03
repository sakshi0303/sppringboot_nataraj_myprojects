package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IServiceMgt;

@Component
public class DPTestRunnerPLSQL_MySQL implements CommandLineRunner {
	
	@Autowired
	private IServiceMgt service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		service.getjobSeekerbypercentage(33f, 300f).forEach(System.out::println);

	}

}
