package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.AirtelCallerTune;
import com.nt.service.IServMgt;

@Component
public class VeersionTimeStampingRunner  implements CommandLineRunner{
	
	@Autowired
	private IServMgt service;

	@Override
	public void run(String... args) throws Exception {
		
//		AirtelCallerTune tune=new AirtelCallerTune();
//		tune.setTname("sakshi");
//		tune.setMobileNo(5623823L);
//		
//		System.out.println("Registrable Service"+service.RegisterableService(tune));
//		
		Optional<AirtelCallerTune> tune1= service.showcallertunebyid(52);
		if(tune1.isPresent()) {
			System.out.println(tune1.get()+"\n version "+tune1.get().getUpdateCount()+"created at: "
				+tune1.get().getCreatedAt()+"last modified at : "	+tune1.get().getUpdateAt());
			
		}else {
			System.out.println(Optional.empty()+"record not found");
		}
		
		
		System.out.println(service.updateTnameWithID(202, "Eva232"));
		
		
	}
	
	

}
