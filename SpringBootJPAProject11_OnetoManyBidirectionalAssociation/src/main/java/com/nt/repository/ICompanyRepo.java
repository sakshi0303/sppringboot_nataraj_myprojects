package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Company;

public interface ICompanyRepo extends JpaRepository<Company, Integer> {
	
@Query("select c.cid,c.cname,czipcode,c.address,j.jid,j.jspecialty,j.minSalary,j.maxSalary,j.noofjobopenings from Company c inner join c.jobs j")
public List<Object[]> getHQLJOINS();
	
@Query("select  c.cid,c.cname,czipcode,c.address,j.jid,j.jspecialty,j.minSalary,j.maxSalary,j.noofjobopenings  from Company c left join c.jobs j")
//@Query("select  c.cid,c.cname,czipcode,c.address,j.jid,j.jspecialty,j.minSalary,j.maxSalary,j.noofjobopenings  from Company c left outer join c.jobs j")
public List<Object[]> getHQLrightjoin();
	

}
