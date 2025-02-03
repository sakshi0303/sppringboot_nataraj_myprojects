package com.nt.service;

import java.util.List;
import java.util.Properties;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entiry.JobSeeker;
import com.nt.repository.jobSeekerRepo;

@Service
public class JobSeekerServiceImplementation implements IJobSeekerService {
	
	@Autowired
	private jobSeekerRepo jsrepo;
	
	@Override
	public Iterable<JobSeeker> displayjobseekerSort(Boolean AscOrder, String... properties) {
		Sort sort=Sort.by(AscOrder?Direction.ASC:Direction.DESC, properties);
		Iterable<JobSeeker> it= jsrepo.findAll(sort);		
		return it;
	}

	@Override
	public Page<JobSeeker> pagination(Integer pageno, Integer pagesize) {
		PageRequest pagenable=PageRequest.of(pageno, pagesize);
		Page<JobSeeker> page=jsrepo.findAll(pagenable);
		return page;
	}

	@Override
	public Page<JobSeeker> pageandSortingTogether(Integer pageno, Integer pagesize,boolean AscOrder,String ...properties) {
		Sort sort=Sort.by(AscOrder?Direction.ASC:Direction.DESC, properties);
		PageRequest pagenable=PageRequest.of(pageno, pagesize, sort);
		Page<JobSeeker> pg =jsrepo.findAll(pagenable);
		return pg;
	}

	@Override
	public void showrecordbypageno(int pagesize,boolean AscOrder,String ... properties) {
		long count=jsrepo.count();
		long pagecount=count/pagesize;
		if(count%pagesize!=0) {
			++pagecount;
		}
		for (int i=0;i<pagecount;i++) {
			Sort sort=Sort.by(AscOrder?Direction.ASC:Direction.DESC,properties);
			PageRequest pageable=PageRequest.of(i,pagesize,sort);
			Page<JobSeeker> pg=jsrepo.findAll(pageable) ;
			System.out.println("pgnumber"+(pg.getNumber()+1)+"/"+pg.getTotalElements()+"pageconternt -->");
			pg.getContent().forEach(System.out::println);

		}
		
	}

}
