package com.nt.runners;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.nt.entiry.JobSeeker;
import com.nt.repository.jobSeekerRepo;


@Component
public class JobSeekerJPARepostionyQueryMethodTestRuuner implements CommandLineRunner {
	
	@Autowired
	private jobSeekerRepo jsrepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		
		//jsrepo.showalldata().forEach(System.out::println);
		
		//jsrepo.showalldatawithagebetween(19, 21).forEach(System.out::println);
		
		//jsrepo.showalldatawithagebetweenwithparam( 20,21).forEach(System.out::println);
		
//		List<Object[]> jbskr=jsrepo.showbyname("sakshi", "swarna", "ruchi");
//		jbskr.forEach(rowObj->{
//			System.out.println(Arrays.toString(rowObj));
//		});
//		
//		jbskr.forEach(rowobj->{
//			for(Object val :rowobj) {
//				System.out.print(val+"  ");
//			}
//			System.out.println();
//		});
		
		
		List<Object[]> jbn =jsrepo.showbyname("sakshi", "ruchi", "sahsan");
		
		//option 1: for each nested inside for
		jbn.forEach(row->{
			for(Object col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		});
		///// option 2: Arrays.toString(row)
		jbn.forEach(row->{
			System.out.println(Arrays.toString(row));
		});
		
		
		//jsrepo.showallmobilenobynameinitalchars("r%").forEach(System.out::println);
		
		System.out.println("all columns with one record "+jsrepo.showage(21));
		
		
		System.out.println("2 or more column with single record, Object Class obj pointing to Object[]");
		Object obj[]=(Object[]) jsrepo.showage2(3);
		System.out.println(Arrays.toString(obj));
		for(Object col:obj) {
			System.out.print(col+" ");
		}
		
		System.out.println(jsrepo.showage3(3));
		
//		
//		Object obj[]=(Object[])jsrepo.showage2(21);
//		System.out.println(Arrays.toString(obj));
//		
		Object[] details=(Object[])jsrepo.showjobseekeraggrfunction();
		System.out.println("aggregiate results"+Arrays.toString(details));
		System.out.println("count : "+details[0]+"min(age)"+details[1]+"max(age)"+details[2]+"avg(age)"+details[3]+"sum(age)"+details[4]);
		
		
		//or
		
		Object details1[]=(Object[])jsrepo.showjobseekeraggrfunction();
		System.out.println("aggregiate results"+Arrays.toString(details));
		System.out.println("count : "+details1[0]+"min(age)"+details1[1]+"max(age)"+details1[2]+"avg(age)"+details1[3]+"sum(age)"+details1[4]);
		
		
	    Integer count=jsrepo.updatejobseekerpercentagebyname("sakshi",22f);
	    System.out.println(count);
	    
	    System.out.println(jsrepo.deleteJobseekerWithNoPhoneAndNoAgeisNull());
	    System.out.println(jsrepo.showsysdate());
	    
	}
	
	
		
	

}
