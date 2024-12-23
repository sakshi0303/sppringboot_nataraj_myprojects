package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("p2")
public class P2 {
	
	@Autowired
	private Environment env;
	
	public void showenvvalued() {
	System.out.println(env.getProperty("per.name"));
	
	}
	
	

	
}
