package com.nt.entity;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
// No @Data as to string property will take collection has a property in tostring method by default
// one to many 1 company many job openings
public class Company {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Company_seq",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer cid;
	
	@NonNull
	@Column(length = 15)
	private String cname;
	
	@NonNull
	private Long czipcode;
	
	@NonNull
	private String address;
	// 1 to M Association, Parent class COmpany can access multiple child class objs.
	// mappedby::: private Company company----> property name  of company in child class
	// cascade all operations from parent obj to all associated child objects. All,Persisit,remove,Merge,Detach,refresh
	// instead of writing @JoinColumn here in parent entity class, write in child class affter writting mapped by in @onetomany
	@OneToMany(targetEntity = TechincalJob.class,cascade = CascadeType.ALL,mappedBy = "company",fetch = FetchType.EAGER)
	private Set<TechincalJob> jobs; 
	
	
	public Company() {
		System.out.println("zero param constrotor Company");
	}

	
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", czipcode=" + czipcode + ", address=" + address + "]";
	}
	

}
