package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entiry.JobSeeker;

public interface jobSeekerRepo extends JpaRepository<JobSeeker, Integer> {

}
