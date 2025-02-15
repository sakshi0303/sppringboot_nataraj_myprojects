package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication

//spring boot started default starter has scheduling, logging, yaml,autoconfiguration, sping jars already added,
public class SpringBootSchedulingProject01Application {

	public static void main(String[] args) {
		System.out.print("------Application is STARTED ON ------------------" +new Date());
		SpringApplication.run(SpringBootSchedulingProject01Application.class, args);
		System.out.print("-------Application is ENDED ON ------------------:.main():: ended" +new Date());
	}

}
