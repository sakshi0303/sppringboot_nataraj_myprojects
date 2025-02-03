package com.nt.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1000)
public class CmdlineRunner implements CommandLineRunner {
	// ioc container will execute all runner class as one-time execution while startup of sun method
	public CmdlineRunner() {
		System.out.println("order 1000");
	}
	// Difference between optional and non-optional values
	@Override
	public void run(String... args) throws Exception {
		System.out.println("cmd-line args: "+Arrays.toString(args));
		System.out.println("--------------------------------------------");
		for (String arg : args) {
			System.out.println(arg);
		}
		

	}

}
