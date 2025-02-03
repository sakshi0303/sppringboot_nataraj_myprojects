package com.nt.runner;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.IPLTeam;
import com.nt.service.IServiceMgmt;

@Component
public class DPTestRunner implements CommandLineRunner {
	
	@Autowired
	private IServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
		IPLTeam nIplTeam=new IPLTeam();
		nIplTeam.setName("sakshi");
		nIplTeam.setCity("bangalore");
		nIplTeam.setCaptain("Prettyzinta");
		nIplTeam.setOwner("owner");
		nIplTeam.setId(UUID.randomUUID().toString());
		
		//IPLTeam nIplTeam=new IPLTeam("KOlkattarnbyMongodbinsert","kolkata","srk","virath");
		System.out.println(service.registerIPLTeam(nIplTeam));
		
		IPLTeam team1=new IPLTeam();
		team1.setName("team1");
		team1.setId(UUID.randomUUID().toString());
		
		IPLTeam team2=new IPLTeam();
		team2.setName("team2");
		team2.setOwner("KK");
		//team2.setId(new Random().nextInt(10000));
		team2.setId(new Random().toString());
		
		System.out.println(service.registerMultipleTeams(List.of(team1,team2)));
		
		//service.findall().forEach(System.out::println);
		//System.out.println(service.findbyid("679ae6331252e600ce7b10f"));
		//System.out.println(service.findbyid("679ae133f7cf32532d485396"));
		
		
		
		

	}

}
