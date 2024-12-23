package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

@Component("p1infoenvi")
public class P1InfoEnvironemnt {
	public P1InfoEnvironemnt() {
		System.out.println("inside p1infoenviroenment class");
	}
	
	@Autowired
	private ConfigurableEnvironment env;
	
	
	public void showdata() {
		System.out.println(env.getProperty("per.sal"));
		
	}

	
	
	

	
}
