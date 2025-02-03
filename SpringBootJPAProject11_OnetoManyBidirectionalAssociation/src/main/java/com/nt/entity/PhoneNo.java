package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class PhoneNo {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NonNull
	private String serviceetype;
	
	
	@ManyToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName = "uid")
	private User user;


	@Override
	public String toString() {
		return "PhoneNo [pid=" + pid + ", serviceetype=" + serviceetype + "]";
	}
	
	public PhoneNo() {
		System.out.println("0 param constructor: PhoneNo");
	}

}
