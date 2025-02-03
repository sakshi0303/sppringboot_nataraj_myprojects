package com.nt.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class MatrimonialProfile {
	
	

	public MatrimonialProfile(String name2, Long mobile2, byte[] photocontent, char[] resumecontent) {
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue
	private Integer pid;
	
	@NonNull
	private String name;
	
	@NonNull
	private Long mobile;
	
	@NonNull
	@Lob
	@Column(length = 1000)
	private byte[] photo;
	
	@NonNull
	@Lob
	@Column(length = 1000)
	private char[] resume;
	
	@Version
	private Integer Vcounter;
	
	@CreationTimestamp
	private String createAt;
	
	
	@UpdateTimestamp
	private String updateAt;
	
	// /Users/sakshisrivastava/Desktop/hanumant_fullstackfinal/hanumant_fullstack/SpringBoot_Microservices_NatarajSir/smallsizephoto.webp
// /Users/sakshisrivastava/Downloads/smmall_size_text_copy.csv
	// /Users/sakshisrivastava/Desktop/hanumant_fullstackfinal/hanumant_fullstack/SpringBoot_Microservices_NatarajSir/downsign-gif.gfif.gif
}
