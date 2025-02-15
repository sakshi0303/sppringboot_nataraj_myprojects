package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IServiceMgmt;

@Component
public class DPRunneerJavaMailSender implements CommandLineRunner {
	
	@Autowired
	private IServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
		String msg=service.pricesSendJavaMailWithAttachment(new String[] {"laptop","pen","pencil"}, 
				new Double[] {5.3,2.4,32.3},
				new String[] {"sakshifnu171@gmail.com"} );
		System.out.println(msg);
		

	}

}
