package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmpServiceMgmt {
	
	
	public List<Employee> fetchEmpbydesig(String s1,String s2,String s3) throws Exception;

}
