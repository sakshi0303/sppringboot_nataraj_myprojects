package com.nt.sbean;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	//@Qualifier("petrolengine")
	@Autowired
	private IEngine engine;
	
	public String journey(LocalDate localDate,LocalDate localDate2) {
		
		System.out.println("jusrney started "+localDate+" "+engine.engine_start());
		
		
		System.out.println("jusrney going on");
		
		System.out.println("jusrney stopped "+localDate2+" "+engine.engine_stop());
		return "Execcelled jurney it was";
		
		
		
	}
	

}