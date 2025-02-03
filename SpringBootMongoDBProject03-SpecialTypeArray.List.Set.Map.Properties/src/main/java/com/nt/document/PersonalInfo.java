package com.nt.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(collection = "personal_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class PersonalInfo {
	
	@Id
	private String id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String[] favColor;
	
	@NonNull
	private List<String> friends;
	
	@NonNull
	private Set<Long> phonno;
	
	@NonNull
	private Map<String,Integer> iddetails;
	
	@NonNull
	private Properties qalification;
	
}
