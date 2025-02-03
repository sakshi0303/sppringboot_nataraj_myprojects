package com.nt.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerSrvMgtService;

@Component
public class CRUDRepositoryRunner implements CommandLineRunner {
	
	
	@Autowired
	private IJobSeekerSrvMgtService service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try {
		JobSeeker jbSkr=new JobSeeker("sakshi",20,true,13242L,89.62f);
		String resultmsg=service.register(jbSkr);
		Boolean flag=service.isidexist(1005);
		System.out.println("resultmesg"+resultmsg+"1005 as idexsits?: "+flag);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	
		
		Iterable<JobSeeker> eles=service.findall();
//		eles.forEach(ele->{
//			System.out.println("findall------------>"+ele);
//		});
		eles.forEach(System.out::println);
		
		//service.findallbyids(List.of(1,32,23,23)).forEach(System.out::println);
						//.filter(Objects::nonNull)
						
		//service.findallbyids(List.of(2,3,null)).forEach(System.out::println);//--> null point exception
		// because list of does not allow null
		
		List<Integer> li=new ArrayList();
		li.add(1);
		li.add(null);
		li.add(2);
		//service.findallbyids(li).forEach(System.out::println); // process without error
		//service.findallbyids(null).forEach(System.out::println); // IllLegalArg exception
		//service.findallbyids(List.of(1,null,23)).forEach(System.out::println); //null point exception because of list.of-java 9 immutable obj
		
		
		
		
		System.out.println("-----------------------------BESt optional----------");
		
		// way1
//		Optional<JobSeeker> opt=service.findbyID(-101);
//		if(opt.isPresent()){
//			
//			System.out.println("id found "+opt.get());
//			
//		}
//		else {
//			System.out.println("no id found");
//		}
		
		//way2
//		String opt1=service.findbyId(1001);
//		
//		System.out.println(opt1);
//		System.out.println("---------------------------------------");
//		
		
		//way3 Jobseeker return type , repo.findbyid(1).orElseThrow(()-> new IllegalArgumentException e)
		try {
		JobSeeker js = service.fetchbyIdOrElseThrow(-111);
		System.out.println("js info //way3 Jobseeker return type , repo.findbyid(1).orElseThrow(()"+js);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------IllegaalArgumentException e--------------------------");
		
		
		
		System.out.println("---------------------------------------");
		JobSeeker js =service.fetchbiddummyOrElsedummyobj(-12);
		System.out.println("fetchbyid(1).orElse new dummy object"+js);
		
		System.out.println("---------------------------------------");
//		try {
//		JobSeeker jb=new JobSeeker(-11,"sakshi",20,true,13242L,89.62f);
//		//JobSeeker js1=new JobSeeker(121,"rrr",20,true,13242L,89.62f);
//		String resultmsg =service.registerorupdate(jb);
//		System.out.println(resultmsg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		

		System.out.println(service.removeJobSeeker(1));
		
		System.out.println("---------------------------");
		
		JobSeeker js1=new JobSeeker();
		js1.setJid(1000);
		js1.setPhone(42244L);
		js1.setPercentage(32.09f);
		System.out.println(service.removejobSeakkerwithentireobj(js1));
		
		System.out.println("---------------------------");
		
		//System.out.println(service.removejobSeekerDeleteAllVoid());
		
		System.out.println("---------------------------");
		
		System.out.println(service.removejobSeekerbyIds(List.of(1,1068,1066,2,3)));
		
		JobSeeker obj1= new JobSeeker("sakshinow",20,true,13242L,89.62f);
		JobSeeker obj2= new JobSeeker("sakshinow",20,true,13242L,89.62f);
		JobSeeker obj3= new JobSeeker("sakshinow",20,true,13242L,89.62f);
		
		//service.DeleteAllthorughIterableEntities(Iterable<JobSeeker>,obj1, obj2,obj3);
		
	
	}
	

}
