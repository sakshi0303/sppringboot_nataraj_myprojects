package com.nt.entity.offer;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="MultiDB-Offer")
public class Offer {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "offer_seq",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
	private Integer oid;
	
	@NonNull
	private String offer_name;
	
	@NonNull
	private String offer_code;
	
	@NonNull
	private Double discountPercentage;
	
	@NonNull
	private LocalDateTime expDate;
	
}
