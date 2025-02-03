package com.nt.runners;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entiry.JobSeeker;
import com.nt.service.IJobSeekerService;

@Component
public class JobSeekerPageingandSorting implements CommandLineRunner {
	
	@Autowired
	private IJobSeekerService service;

	@Override
	public void run(String... args) throws Exception {
		
		service.displayjobseekerSort(true, "jid","name").forEach(System.out::println);
		 
		Page<JobSeeker>pg= service.pagination(0, 3); //page no is zero based
		List<JobSeeker> list= pg.getContent();
		System.out.println("pagecontent-->");
		list.forEach(System.out::println);
		System.out.println("pageno-->"+(pg.getNumber()+1));
		System.out.println("Total pageno-->"+pg.getTotalPages());
		System.out.println("itotal elements-->"+pg.getTotalElements());
		System.out.println("islast-->"+pg.isLast());
		System.out.println("isfirst-->"+pg.isFirst());
		
		System.out.println("-------------------------");
		Page<JobSeeker> pgo = service.pageandSortingTogether(1, 3, true, "jid","name");// first sort entire table then do pagination
		List<JobSeeker> list2=pgo.getContent();
		System.out.println("pagecontent of list2-->");
		list2.forEach(System.out::println);
		System.out.println("pageno-->"+(pgo.getNumber()+1));
		System.out.println("Total pageno-->"+pgo.getTotalPages());
		System.out.println("itotal elements-->"+pgo.getTotalElements());
		System.out.println("islast-->"+pgo.isLast());
		System.out.println("isfirst-->"+pgo.isFirst());
		
		
		System.out.println("-------------------------");
		service.showrecordbypageno(3, false, "jid","name");
		
		
		
	
		

	}

}
