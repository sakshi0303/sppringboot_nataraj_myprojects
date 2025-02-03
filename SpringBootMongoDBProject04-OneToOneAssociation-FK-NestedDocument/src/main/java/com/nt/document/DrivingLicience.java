package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class DrivingLicience {
	
	
	@Id
	private String id;
	
	@NonNull
	private String type;
	
	@NonNull
	private LocalDateTime IssueAt;
	
	@NonNull
	private LocalDateTime valiDTo;
	
	
	private Person person;


	@Override
	public String toString() {
		return "DrivingLicience [id=" + id + ", type=" + type + ", IssueAt=" + IssueAt + ", valiDTo=" + valiDTo + "]";
	}
	
//	@Version
//	private Integer version;
	public DrivingLicience(){
		System.out.println("0 param constructor=---DrivingLicience");
		
	}
	
	
}
