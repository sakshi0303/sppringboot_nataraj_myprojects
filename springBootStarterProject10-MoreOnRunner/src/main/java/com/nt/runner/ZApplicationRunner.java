package com.nt.runner;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(2)
public class ZApplicationRunner implements ApplicationRunner {
	
	public ZApplicationRunner() {
		System.out.println("ApplicationRunnerC--order 2");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//seperate betwen optional and non-optianal value
		Set<String> optionalarg=args.getOptionNames();
		
		System.out.println("optional args name and value");
		for (String name : optionalarg) {
			System.out.println(name+": "+args.getOptionValues(name));
			
		}
		for (String nonargvalue : args.getNonOptionArgs()) {
			System.out.println("non optianl args-->"+nonargvalue);
			
		}
		
		

	}

}
