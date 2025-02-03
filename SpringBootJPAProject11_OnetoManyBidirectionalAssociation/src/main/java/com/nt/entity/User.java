package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer uid;
	
	@NonNull
	private String uname;
	
	
	@NonNull
	private String Address;
	
	// one User can have mupltiple Phones
	
	@OneToMany(targetEntity = PhoneNo.class,cascade = CascadeType.ALL,mappedBy = "user" )
	private Set<PhoneNo> phoneno;

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", Address=" + Address + "]";
	}
	
	public User() {
		System.out.println("zerp param constructor : User");
	}
	

}
