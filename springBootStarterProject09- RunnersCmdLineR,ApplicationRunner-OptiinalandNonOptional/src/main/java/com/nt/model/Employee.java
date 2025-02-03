package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private Integer empno;
	private String empname;
	private String job;
	private Double salary;
	private Integer deptno;
	private Double NetSalary;
	private Double GrossSalary;

}
