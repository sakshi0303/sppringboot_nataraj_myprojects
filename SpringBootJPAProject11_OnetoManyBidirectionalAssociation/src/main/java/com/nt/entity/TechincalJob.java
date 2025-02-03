package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class TechincalJob {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "TechincalJob_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer jid;
	

	
	@NonNull
	private String jspecialty;
	
	@NonNull
	private Double minSalary;
	
	@NonNull
	private Double maxSalary;
	
	@NonNull
	private Integer noofjobopenings;
	
	
	@ManyToOne(targetEntity = Company.class,cascade = CascadeType.ALL)
	@JoinColumn(name="company_id",referencedColumnName = "cid")
	// company_id will be forign key in child table poinitng to pk in parent table-Relationshipbetween tables
	private Company company;
		
	public TechincalJob() {
		System.out.println(" zero param constructor: techincal job");
	}

	@Override
	public String toString() {
		return "TechincalJob [jid=" + jid + ", jspecialty=" + jspecialty + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + ", noofjobopenings=" + noofjobopenings + "]";
	}

	
	
	

}
