package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeeker;

public interface IServiceMgt {
	
	public List<JobSeeker> getjobSeekerbypercentage( Float start, Float end);

}
