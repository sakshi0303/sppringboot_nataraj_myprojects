package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private String empname;
	private Integer empno;
	private String job;
	private Integer deptno;
	private Double salary;
	private Double NetSalary;
	private Double GrossSalary;

}
