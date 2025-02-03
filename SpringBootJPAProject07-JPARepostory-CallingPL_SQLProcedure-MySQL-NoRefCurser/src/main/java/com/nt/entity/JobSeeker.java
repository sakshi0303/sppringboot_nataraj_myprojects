package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class JobSeeker {
	
	@Id
	@SequenceGenerator(name="gen",initialValue = 20,allocationSize = 2,sequenceName = "job_seeker_info1")
	@GeneratedValue(generator="gen",strategy = GenerationType.SEQUENCE)
	private Integer jid;
	

	
	@NonNull
	@Column(length = 20)
	private String name;

	private Integer age;
	private Boolean gender;
	
	@NonNull
	private Long phone;
	
	//@Transient
	private Float percentage;
	
	
}
