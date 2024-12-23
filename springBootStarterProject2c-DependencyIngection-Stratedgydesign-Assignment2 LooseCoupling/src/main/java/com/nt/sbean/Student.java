package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public final class Student {
	@Qualifier("mat")
	@Autowired
	private IMaterial material;
	
	//bmethod
	public String prepare() {
		
		return material.examschedule()+material.professionDetails()+material.Sylabus();
		
	}
	
	

}
