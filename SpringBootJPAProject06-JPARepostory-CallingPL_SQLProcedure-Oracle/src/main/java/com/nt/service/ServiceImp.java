package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entiry.JobSeeker;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ServiceImp implements IServiceMgt{
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<JobSeeker> showDatabypercentage(Float start, Float end) {
		
		
		
	StoredProcedureQuery query=	manager.createStoredProcedureQuery("P_GET_JS_BY_PERCENTAGE", JobSeeker.class);
	
	query.registerStoredProcedureParameter(1, Float.class,ParameterMode.IN);
	query.registerStoredProcedureParameter(2, Float.class, ParameterMode.IN);
	
	query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
	
	
	query.setParameter(1, start);
	query.setParameter(2, end);
	
	List<JobSeeker> list =query.getResultList();
	
	return list;
	}
	
	

}
