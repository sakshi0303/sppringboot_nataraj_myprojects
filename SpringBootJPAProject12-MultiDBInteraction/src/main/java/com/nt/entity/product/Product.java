package com.nt.entity.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="MultiDB-Product")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer pid;
	
	@NonNull
	@Column(length = 12)
	public String pdetails;
	
	@NonNull
	public Double price;
	
	@NonNull
	public String[] category;
	
	@NonNull
	public Integer quantity;
}
