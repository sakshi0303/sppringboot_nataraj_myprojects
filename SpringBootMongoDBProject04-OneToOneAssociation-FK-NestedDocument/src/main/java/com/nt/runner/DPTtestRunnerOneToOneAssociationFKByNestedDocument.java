package com.nt.runner;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicience;
import com.nt.document.Person;
import com.nt.repo.IDLRepo;
import com.nt.repo.IPersonRepo;
import com.nt.service.IServiceManagement;

@Component
public class DPTtestRunnerOneToOneAssociationFKByNestedDocument implements CommandLineRunner {
	
	@Autowired
	private IServiceManagement service;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		DrivingLicience dl=new DrivingLicience("Restriction",LocalDateTime.now(),
				LocalDateTime.of(2050, Month.FEBRUARY, 2, 11, 23));
		
		Person p= new Person("swarma",10,new String[] {"red","yellow","blue"},3153851203L);
		
//		System.out.println("----ParenttoChild----------");
//		p.setDLicience(dl);
//		System.out.println(service.saveParentanditsChildNestedDocument(p));
		
		System.out.println("----ChildtoParent----------");
		dl.setPerson(p);
		System.out.println(service.saveChildanditsParentNestedDocument(dl));
		
	}

}
