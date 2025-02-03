package com.nt.service;



import org.springframework.data.domain.Page;

import com.nt.entiry.JobSeeker;


public interface IJobSeekerService {
	
	
	public Iterable<JobSeeker> displayjobseekerSort(Boolean AscOrder ,String ... properties);
	public Page<JobSeeker> pagination(Integer pageno , Integer pagesize);

	public Page<JobSeeker> pageandSortingTogether(Integer pageno,Integer pagesize,boolean ArscOrder ,String... properties);

	public void showrecordbypageno(int pagesize,boolean AscOrder,String ... properties);
}
