package com.nt.sbean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("emp")
@ConfigurationProperties(prefix = "org.nt")
@Setter //happen after field injection, so setter injection value will override value field injection 
@ToString
public class Employee {
	// order doesn't matters
	//to check if bulk injection happens quickly use to string()
	
	private String name;
	@Value("${org.nt.location2}") // @value field injection happen first then setter injection .
	private String location; // setter injection value overrides field injection value 
	private Integer age;
	private Double salary;
	
	//same key as application.property.application.property has high precedence to info.properties
	private String email;
	
	//injecting through info.properties
	private String owner;
	private String filetype;
	
	// insert in Array,List,map from UserDefind property file or application.property, 
	// we do not need to do @propertySouce(applicatoin.property) file, as it is taken care by SpringApplication.run()
	private Set<Long> phones; //remove duplicates
	private List<String> owners; // will have duplicates, dynamic size,flexible operation sorting,searching
	private String[] jobs;
	private String[] branches; // will have duplicates ,array fixed file, no flexible operation
	
	
	// map and has a properties
	private Map<String,Object> iddetails;
	
	//has a property
	private Liscence licendDetails;
	
	
	
}
