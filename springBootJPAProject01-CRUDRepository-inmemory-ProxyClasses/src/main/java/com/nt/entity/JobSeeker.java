package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity //convert spring bean class  
@Table(name="JOB_SEEKER") // table name in the db table
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor

public class JobSeeker {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //1,2,50,52,102
	// gen will be any logical name
	@SequenceGenerator(name="gen" ,sequenceName = "job_seeker_seq" , initialValue = 1000 , allocationSize = 1 )
	@GeneratedValue(generator = "gen",strategy = GenerationType.SEQUENCE)
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jid;
	
	
	
	@NonNull
	@Column(name="namee",length = 20)
	private String name;
	
	
	@NonNull
	@Column(name="agee")
	private Integer age;
	
	@NonNull
	@Column(name="genderr")
	private boolean gender;
	
	@NonNull
	@Column(name="phonenoo")
	private Long phone;
	
	//@Transient
	@NonNull
	private Float percentage;
	
	public JobSeeker() {
		System.out.println("Job_Seeker 0 param method");
	}
	

}
