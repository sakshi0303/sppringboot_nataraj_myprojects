package com.nt.service;



import java.util.List;
import java.util.Optional;

import org.hibernate.persister.entity.mutation.InsertCoordinatorStandard.InsertValuesAnalysis;
import org.hibernate.sql.Delete;
import org.springframework.data.domain.Page;

import com.nt.entiry.JobSeeker;


public interface IJobSeekerService {
	
	public String deleteAllinBatch(List<Integer> ids);
	public List<JobSeeker> SearchRecordsByExampleData(JobSeeker js,  boolean AscOrder, String ... properties);
	public Optional<JobSeeker> getjobid(int id);
	public JobSeeker getrefrencebyidfromjparepo(int id);
	public JobSeeker InsertValues(JobSeeker js);
	
	}
