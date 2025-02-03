package com.nt.document;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Person {
	
	@Id
	private String id;
	
	@NonNull
	private String name;
	
	@NonNull
	private Integer age;
	
	@NonNull
	private String[] favColors;
	
	//no Association JoinColum ,onetomany in MONGODB. Here NESTED DOCS with SEPERATE REPO
	private DrivingLicience dLicience;
	
	@NonNull
	private Long phoneno;
	
	
	
	public Person(){
		System.out.println("0 param constructor=---Person");
		
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", favColors=" + Arrays.toString(favColors)
				+ ", phoneno=" + phoneno + "]";
	}
}
