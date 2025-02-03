package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmoDAO {
	
	public List<Employee>  getEmpbydesg(String s1,String s2,String s3) throws Exception;

}
