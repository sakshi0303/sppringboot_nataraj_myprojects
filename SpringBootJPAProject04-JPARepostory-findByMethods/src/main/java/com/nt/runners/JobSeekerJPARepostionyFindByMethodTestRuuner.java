package com.nt.runners;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;


import com.nt.repository.jobSeekerRepo;


@Component
public class JobSeekerJPARepostionyFindByMethodTestRuuner implements CommandLineRunner {
	
	@Autowired
	private jobSeekerRepo jsrepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		
		//jsrepo.findByNameEndingWithEquals("hi").forEach(System.out::println);
		
		//jsrepo.getByNameEndingWithIs("hi").forEach(System.out::println);
		
		
//		jsrepo.readByName("sakshi").forEach(System.out::println);
//		jsrepo.findByNameEquals("sakshi").forEach(System.out::println);
//		jsrepo.getByNameIs("sakshi").forEach(System.out::println);
//		
//		
//		jsrepo.findByNameEndingWith("hi").forEach(System.out::println);
//		jsrepo.findByAgeBetween(20, 21).forEach(System.out::println);
//		jsrepo.findByNameLike("s%").forEach(System.out::println);
		
		//jsrepo.findByphoneIsNull().forEach(System.out::println);
		jsrepo.findByNameInOrderByAgeDesc(List.of("sakshi","swarna")).forEach(System.out::println);
		
		//jsrepo.fingByNameStartingWithIgnoreCase("s").forEach(System.out::println);
		
		
		
	}
	
	
		
	

}
