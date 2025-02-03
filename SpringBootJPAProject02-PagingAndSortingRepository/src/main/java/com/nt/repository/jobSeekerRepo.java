package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entiry.JobSeeker;

public interface jobSeekerRepo extends PagingAndSortingRepository<JobSeeker, Integer> ,CrudRepository<JobSeeker, Integer>{

}
