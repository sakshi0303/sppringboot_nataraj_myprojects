package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmoDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmpService implements IEmpServiceMgmt {
	
	@Autowired
	private IEmoDAO dao;
	public EmpService() {
		System.out.println("EmpService=0-param-constructor");
	}
	
	@Override
	public List<Employee> fetchEmpsbydesg(String s1, String s2, String s3) throws Exception {
		// TODO Auto-generated method stub
		
		List<Employee> list =dao.getEmpbydesg(s1, s2, s3);
		
		for (Employee emp : list) {
			emp.setGrossSalary(emp.getSalary()-0.4*emp.getSalary());
			emp.setNetSalary(emp.getGrossSalary()-0.2*emp.getGrossSalary());
		}
		
		
		return list;
	}

}
