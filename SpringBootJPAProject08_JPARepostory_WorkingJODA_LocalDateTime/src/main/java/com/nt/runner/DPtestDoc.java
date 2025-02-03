package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IServiceMgmt;

@Component
public class DPtestDoc implements CommandLineRunner {
	
	@Autowired
	private IServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Doctor doct = new Doctor();
		doct.setDname("rene");
		doct.setSpecilization("dental");
		doct.setDob(LocalDateTime.of(1990,3, 3, 11, 23));
		doct.setDoj(LocalDate.of(2025, 12, 3));
		doct.setToj(LocalTime.of(22, 45));
		
		System.out.println(service.registerDoctor(doct));
		
		System.out.println("enter docs records--->");
		service.getalldocs().forEach(System.out::println);
		
		System.out.println("get doctor age by id: "+service.showdagebyid(15));
		

	}

}
