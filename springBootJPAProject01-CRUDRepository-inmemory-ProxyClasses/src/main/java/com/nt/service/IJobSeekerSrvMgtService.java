package com.nt.service;

import java.rmi.server.Operation;
import java.util.Optional;
import java.util.stream.Stream;

import com.nt.entity.JobSeeker;

public interface IJobSeekerSrvMgtService {
	
	public String register(JobSeeker js);
	public Boolean isidexist(int id);
	public Iterable<JobSeeker> findall(); 
	public Long countv();
	public Iterable<JobSeeker> findallbyids(Iterable<Integer> ids);
	public Optional<JobSeeker> findbyID(int id);  // best 
	public String findbyId(int id);
	public JobSeeker fetchbyIdOrElseThrow(int id); // in this the orElseThrow exception or return orElse Dummy obj
	public JobSeeker fetchbiddummyOrElsedummyobj(int id);
	public String registerorupdate(JobSeeker js );
	public String removeJobSeeker(int id);
	public String removejobSeakkerwithentireobj(JobSeeker js);
	public String removejobSeekerDeleteAllVoid();
	public String removejobSeekerbyIds(Iterable<Integer> ids);
	//public String DeleteAllthorughIterableEntities(Iterable<JobSeeker> js);
	


}
