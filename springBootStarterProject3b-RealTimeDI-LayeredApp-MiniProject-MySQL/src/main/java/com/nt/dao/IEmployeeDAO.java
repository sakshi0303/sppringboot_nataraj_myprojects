package com.nt.dao;
import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	
	public List<Employee> getEmpbyDesig(String s1,String s2,String s3) throws Exception;

}
