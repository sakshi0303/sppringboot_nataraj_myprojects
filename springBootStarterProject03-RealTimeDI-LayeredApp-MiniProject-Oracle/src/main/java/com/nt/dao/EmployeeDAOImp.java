package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("Empdao")
public class EmployeeDAOImp implements IEmployeeDAO {
	
	private static final String GET_EMP_WITH_DESIG="SELECT empno, empname,salary,deptno,job FROM emp WHERE JOB in (?,?,?) ORDER BY JOB";
	
	@Autowired
	private DataSource ds;
	
	List<Employee> list=null;

	@Override
	public List<Employee> getEmpbyDesig(String s1, String s2, String s3) throws Exception {
		
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMP_WITH_DESIG)
			){
			ps.setString(1,s1);ps.setString(2, s2);ps.setString(3, s3);
			
			try(ResultSet rs=ps.executeQuery();
					){
				
				list=new ArrayList();
				
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					emp.setSalary(rs.getDouble(3));
					emp.setDeptno(rs.getString(4));
					emp.setJob(rs.getString(5));
					list.add(emp);
				}//while end
				
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return list;
	}

}
