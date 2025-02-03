package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmpServiceMgmtImp implements IEmpServiceMgmt {
	
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetchEmpbydesig(String s1, String s2, String s3) throws Exception {
		
		List<Employee> list=dao.getEmpbyDesig(s1, s2, s3);
		
		list.forEach(emp->{
			//business logic to develop gross-salary and net salary
			emp.setGrossSalary(emp.getSalary()+(0.4*emp.getSalary()));
			emp.setNetSalary(emp.getGrossSalary()-(0.2*emp.getGrossSalary()));
		});
		
		//list.
		return list;
	}

}
