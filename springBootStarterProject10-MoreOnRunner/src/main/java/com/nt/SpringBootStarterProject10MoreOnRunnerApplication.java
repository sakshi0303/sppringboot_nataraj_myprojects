package com.nt;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringBootStarterProject10MoreOnRunnerApplication {
	
	@Bean
	@Order(120)
	public CommandLineRunner createcmdlineRunner(){
		CommandLineRunner ctx=(String ... args)->{
			System.out.println("LAMBDA CommandLineRunner run method");
		};
		return ctx;		
	}
	
	@Bean
	@Order(1000)
	public ApplicationRunner createAppRunner() {
		ApplicationRunner ar=(ApplicationArguments args)->{
			// calls annonympous run method
			System.out.println("LAMBDA ApplicationRunner run method");
		};
		return ar;
	}
		
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootStarterProject10MoreOnRunnerApplication.class, args);
	}

}
