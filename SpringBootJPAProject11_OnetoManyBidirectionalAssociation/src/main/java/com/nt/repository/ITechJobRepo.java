package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.TechincalJob;

public interface ITechJobRepo extends JpaRepository<TechincalJob, Integer> {
	
	
@Query("select j.jid,j.jspecialty,j.minSalary,j.maxSalary,j.noofjobopenings,c.cid,c.cname,czipcode,c.address from TechincalJob j left join j.company c")
	public List<Object[]> getfromchildtoparentHQLjoins();

}
