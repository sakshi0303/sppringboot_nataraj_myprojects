package com.nt.entity;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;



import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Doctor {
	
	

	@Id
	@SequenceGenerator(name="gen1",initialValue = 10,allocationSize = 2,sequenceName = "doc_seq1")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
	private Integer did;
	
	@NonNull
	@Column(length = 20)
	private String dname;
	
	
	private Integer dage;
	
	@NonNull
	private String Specilization;
	
	@NonNull
	private LocalDateTime dob; // JODA java object date and time API
	
	@NonNull
	private LocalDate doj;
	
	@NonNull
	private LocalTime toj;
	

}
