package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ServiceMgtImp implements IServiceMgt {
	
	//
	
//	CREATE DEFINER=`root`@`localhost` PROCEDURE `P1_GET_JS_BY_PREC`(in start float, in end float)
//			BEGIN
//			 select * from job_seeker where percentage>=start and percentage<=end;
//			END
	//
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<JobSeeker> getjobSeekerbypercentage(Float start, Float end) {
		
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P1_GET_JS_BY_PREC", JobSeeker.class);
		
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		
		query.setParameter(1, start);
		query.setParameter(2, end);
		 List<JobSeeker> list=query.getResultList();
		
		
		return list;
	}

}
