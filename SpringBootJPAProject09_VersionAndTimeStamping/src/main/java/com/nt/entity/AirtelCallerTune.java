package com.nt.entity;

import java.time.LocalDateTime;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class AirtelCallerTune {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tid;
	
	@Column(length = 12)
	@NonNull
	private String tname;
	
	@NonNull
	private Long mobileNo;
	
	//no need to write non null on version, creationtimestamp and updatetimestamp
	@Version
	private Integer updateCount; //version
	
	@CreationTimestamp 
	private LocalDateTime createdAt; //timestamp1 once and never change after that
	
	
	@UpdateTimestamp 
	private LocalDateTime updateAt;  //timestamp2 latest modified date and time

}
