package com.nt.entity;

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
public class Movie {
	
	@Id
	@SequenceGenerator(name="gen",sequenceName = "seq1",initialValue = 100,allocationSize = 12)
	@GeneratedValue(generator="gen",strategy = GenerationType.SEQUENCE)
	private Integer movieid;
	
	
	@NonNull
	private String movieName;
	
	@NonNull
	private String movieUsername;
	
	@NonNull
	private String movieGenere;
	
	@NonNull
	private Double movieRating;
		
}
