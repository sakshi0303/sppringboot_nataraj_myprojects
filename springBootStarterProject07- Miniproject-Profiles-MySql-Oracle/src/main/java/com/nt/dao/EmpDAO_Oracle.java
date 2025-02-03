package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO-oracle")
@Profile({"prod","uat"})// user acceptance testing
public class EmpDAO_Oracle implements IEmoDAO {
	private static final String GET_EMPS_BY_DESGS="SELECT empno,empname,job,salary,deptno from emp_oracle where job in (?,?,?) ORDER BY JOB";
	
	@Autowired
	private DataSource ds;
	
	
	List<Employee> list=null;
	public EmpDAO_Oracle() {
		System.out.println("EmpDAO_Oracle-0 param constructor");
	}
	

	@Override
	public List<Employee> getEmpbydesg(String s1, String s2, String s3) throws Exception {
		// TODO Auto-generated method stub
		
		
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESGS);
					){
				ps.setString(1, s1);
				ps.setString(2, s2);
				ps.setString(3, s3);
				
				try( ResultSet rs=ps.executeQuery()){
					list=new ArrayList();
					
					while(rs.next()) {
						Employee emp=new Employee();
						emp.setEmpno(rs.getInt(1));
						emp.setEmpname(rs.getString(2));
						emp.setJob(rs.getString(3));
						emp.setSalary(rs.getDouble(4));
						emp.setDeptno(rs.getInt(5));
						list.add(emp);
						
					}
					
					
				}
				catch(SQLException se) {
					se.printStackTrace();
					throw se;
					
				}
				catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
				
			}
		
		return list;
	}

}
