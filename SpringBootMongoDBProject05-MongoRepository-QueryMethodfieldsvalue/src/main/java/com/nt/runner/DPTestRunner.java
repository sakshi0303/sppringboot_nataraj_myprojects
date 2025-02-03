package com.nt.runner;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.IPLTeam;
import com.nt.repository.IIPLTeameposiotry;


@Component
public class DPTestRunner implements CommandLineRunner {
	
	@Autowired
	private IIPLTeameposiotry iplrepo;

	@Override
	public void run(String... args) throws Exception {
		
//		IPLTeam ipl= iplrepo.fetchbycaptain("Prettyzinta");
//		System.out.println(ipl==null?"no record found":"recod found"+ipl);
		
		//iplrepo.fetchbycaptain("virath").forEach(System.out::println);
		
		List<Object[]> obj=iplrepo.fetchbyname("sakshi");
		obj.forEach(row->{
			for(Object col:row) {
				System.out.println(col);
			}
		});
		
		Object[] obj1=(Object[]) iplrepo.fetchbybudget(2000);
		System.out.println(obj1==null?"no record found":Arrays.toString(obj1));
		
		List<Object[]> obj2=iplrepo.fetchbynames("sakshi", "team2", "KOlkattarnbyMongodbinsert");
		obj2.forEach(row->{
			for(Object col:row) {
				System.out.println(col);
			}
		});
		
		System.out.println("--------------");
		List<Object[]> obj3=iplrepo.fetchbetweenBudget(1, 2000);
		obj3.forEach(row->{
			for(Object col:row) {
				System.out.println(col);
			}
		});
		
		System.out.println("----options:'i' for all case ----------");
		
		List<Object[]> obj4=iplrepo.fetchbynamewithinitalchars("k");
		obj4.forEach(row->{
			for(Object col:row) {
				System.out.println(col);
			}
		});


	}

}
