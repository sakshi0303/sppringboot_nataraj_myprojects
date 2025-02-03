package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IIMovieServiceMgt;

@Component
public class DBTestCRUD implements CommandLineRunner {
	
	@Autowired
	public IIMovieServiceMgt service;

	@Override
	public void run(String... args) throws Exception {
		
		Movie mobj=new Movie("titanic","richard","romantic",3.4);
		
		String resultmsg=service.register(mobj);
		
		System.out.println(resultmsg);
		

	}

}
