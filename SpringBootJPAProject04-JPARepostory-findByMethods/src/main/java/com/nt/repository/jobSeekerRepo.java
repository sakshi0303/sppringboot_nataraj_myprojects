package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entiry.JobSeeker;

public interface jobSeekerRepo extends JpaRepository<JobSeeker, Integer> {
	
	
	
	public List<JobSeeker> readByName(String s); // multiple record with same name can come
	public List<JobSeeker> findByNameEquals(String s); // multiple record with same name can come
	public List<JobSeeker> getByNameIs(String s);
	
	public List<JobSeeker> findByNameEndingWith(String s);
	
	//public List<JobSeeker> fingByNameStartingWithIgnoreCase(String s);
	
	public List<JobSeeker> findByAgeBetween(int starts,int ends);
	
	public List<JobSeeker> findByNameLike(String expression);
	
	//all recods whose mobile number is null
	public List<JobSeeker> findByphoneIsNull();
	
	
	public List<JobSeeker> findByNameInOrderByAgeDesc(List<String> s);

	
 
}
