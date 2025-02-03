package com.nt.sbean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix="emp.info")
public class EmployeeInfo {
	private String name;
	private String location;
	private String address;

	private Double salary;
	
	@Value("${emp.data.email}")
	private String email;
	
	
	private String[] owner;
	private Set<Long> phone;
	private List<String> favColor;
	
	private Map<String, Object> iddetails;
	
	private Licence licencedetails;
	
	private String source;
	
	private String area;
	
	
}
