package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmpServiceMgmt;

@Controller("empController")
public class EmployeeOperationController {
	
	@Autowired
	private IEmpServiceMgmt service;
	
	
	public List<Employee> showEmpwithDesg(String s1,String s2,String s3) throws Exception{
		
		List<Employee> list=service.fetchEmpbydesig(s1, s2, s3);
		
		return list;
		
	}

}
