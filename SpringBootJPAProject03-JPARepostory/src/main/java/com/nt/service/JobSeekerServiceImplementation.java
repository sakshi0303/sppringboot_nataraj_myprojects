package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
	public String deleteAllinBatch(List<Integer> ids) {
		Iterable<JobSeeker> validids=jsrepo.findAllById(ids);
		Integer count= ((List<JobSeeker>)validids).size();
		jsrepo.deleteAllByIdInBatch(ids);
		
		return count+"no of records got deleted";
	}

	@Override
	public List<JobSeeker> SearchRecordsByExampleData(JobSeeker js,boolean AscOrder, String... properties) {
		Sort sort=Sort.by(AscOrder?Direction.ASC:Direction.DESC,properties);
		
		ExampleMatcher matcher = ExampleMatcher.matching()
			    .withIgnoreNullValues()
		  		.withIgnoreCase("name"); // Ignore fields with null values
		Example<JobSeeker> example = Example.of(js, matcher);
		//Example<JobSeeker> example=Example.of(js);// all nonnull values of example will be added in Example container
		
		List<JobSeeker> list= jsrepo.findAll(example, sort);
		
		return list;
	}

	@Override
	public Optional<JobSeeker> getjobid(int id) {
		return jsrepo.findById(id);
		
		
	}

	@Override
	public JobSeeker getrefrencebyidfromjparepo(int id) {
		// TODO Auto-generated method stub
		return jsrepo.getReferenceById(id);
	}

	@Override
	public JobSeeker InsertValues(JobSeeker js) {
		return jsrepo.save(js);
		
	}

}
