package com.nt.runners;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entiry.JobSeeker;
import com.nt.service.IJobSeekerService;

@Component
public class JobSeekerJPARepostiony implements CommandLineRunner {
	
	@Autowired
	private IJobSeekerService service;

	@Override
	public void run(String... args) throws Exception {
		
		//System.out.println(service.deleteAllinBatch(List.of(12,1065,1069,23)));
		
		JobSeeker jbS=new JobSeeker();
		jbS.setName("pink");
		//jbS.setPhone(13242L);
		
		service.SearchRecordsByExampleData(jbS, true, "name").forEach(System.out::println);
		
		
		Optional<JobSeeker> jsO=  service.getjobid(1063);
		if(jsO.isPresent()) {
			System.out.println("js0-->"+jsO.get());
		}else {
			System.out.println("jso not present"+jsO.empty());
		}
		
		
		
//		JobSeeker jbinsert=new JobSeeker();
//		jbinsert.setName("ruchi");
//		jbinsert.setGender(false);
//		jbinsert.setAge(21);
//		jbinsert.setPhone(315234L);
//		jbinsert.setPercentage(99.01f);
//		
//		service.InsertValues(jbinsert);
		
		JobSeeker  jsgetref= service.getrefrencebyidfromjparepo(20);
		System.out.println("lazy loading, gives proxy obj"+jsgetref.getClass()+"  Entity class is super class of proxy class  "+jsgetref.getClass().getSuperclass());
		
		System.out.println("getrefernebyid JPA Repository , calling id property, no DB hit ::"+jsgetref.getJid());
		
		System.out.println("getrefernebyid JPA Repository , calling non id property, FIRST time DB hits ::"+jsgetref.getName());
		
		System.out.println("getrefernebyid JPA Repository , calling non id property again, no DB hit ::"+jsgetref.getAge());
		
		System.out.println("--------------------------------");
		
		try{

		JobSeeker jSeeker=	service.getrefrencebyidfromjparepo(40);
			System.out.println(jSeeker.toString());
			
			
		}catch(Exception e) {
			
			System.out.println("id not found");
			e.printStackTrace();
		}
		
	}

}
