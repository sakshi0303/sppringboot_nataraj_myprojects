package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entiry.JobSeeker;

public interface jobSeekerRepo extends JpaRepository<JobSeeker, Integer> {
	
	//@Query("from JobSeeker")
	//@Query("from com.nt.entity.JobSeeker")
	//@Query("select cv from JobSeeker cv where cv.")
	//public List<JobSeeker> showalldata();
	
//	@Query("from JobSeeker where age>=:start and age<=:end")
//	public List<JobSeeker> showalldatawithagebetween(int start,int end);
//
//==================MULTIPLE Records=====allcols,some cols,1 cols===============================================================	
	@Query("from JobSeeker where age>=:min and age<=:max ")
	public List<JobSeeker> showalldatawithagebetweenwithparam(@Param("min") int start,@Param("max") int end);
	
	@Query(" select name,phone,jid from JobSeeker where name in (?1,?2,?3) order by name desc")
	public List<Object[]> showbyname(String n1,String n2,String n3);
	
	@Query("select phone from JobSeeker where name like :initchar")
	public List<Long> showallmobilenobynameinitalchars(String initchar);
	
	//===============Single Records===========allcols,some cols,1 cols==========Object[] dt=(Object[])jsrepo.gerage()============================================	
	// select single record, list wont be presnet in return type and Object class obj pointing object array
	//obj Class  pointing to Object[] array
	//all columns with only single record
	@Query("from JobSeeker where age =:agev")
	public JobSeeker showage(int agev);
	
	//Two or more columns with single record
	@Query(" select name, age,percentage,phone from JobSeeker where age=:agev")
	public Object showage2(int agev);
	
	//One column with single record
	@Query("select name from JobSeeker where age=:agev")
	public String showage3(int agev);
		
	/// ==================USING AGGEGRIATE OPERATIONS-=============================
	@Query("select count(*),min(age),max(age),avg(age),sum(age) from JobSeeker")
	public Object showjobseekeraggrfunction();
	
	
	/// ==================Non Select query========================================
	@Query("update JobSeeker set percentage=percentage+(percentage*:percent/100.0) where name=:n")
	@Modifying //non sql update ,deltete
	@Transactional
	public Integer updatejobseekerpercentagebyname(String n,Float percent); 
	

	
	@Query("delete from JobSeeker where phone is NULL and age is NULL")
	@Transactional
	@Modifying
	public Integer deleteJobseekerWithNoPhoneAndNoAgeisNull();
	
	
	///==========================NativeSQl queries=========================================
	
	@Query(nativeQuery = true,value = "select now() from dual")//contain date and value
	public String showsysdate();
	
}
