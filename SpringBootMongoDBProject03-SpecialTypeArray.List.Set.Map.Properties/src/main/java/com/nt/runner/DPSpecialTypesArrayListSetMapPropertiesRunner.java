package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.PersonalInfo;
import com.nt.repo.IPInfoRepo;
import com.nt.service.IPInfoServiceMgmt;

@Component
public class DPSpecialTypesArrayListSetMapPropertiesRunner implements CommandLineRunner {
	
	
	@Autowired
	private IPInfoServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
		Properties qaprop=new Properties();
		qaprop.put("BTECH", "UPTU");qaprop.put("10", "USCIS");
		
		PersonalInfo peRepo=new PersonalInfo("sakshi",new String[]{"red","greem","yellow"},
				List.of("swaran","ruchu"),
				Set.of(3153851203L,999999L,232L),
				Map.of("adharno",23423,"passport",234,"drivinglicentce",23432),
				qaprop
				);
		
		System.out.println(service.registerPerson(peRepo));
		
	}

}
