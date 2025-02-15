package com.nt.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class SeasonFinderImp implements ISeasonFinder {

	@Override
	public String findseason() {
		
		LocalDateTime lt=LocalDateTime.now();
		int month=lt.getMonthValue();
		if(month>3 && month<6) {
			return "summer season";
		}else if(month>6 && month<9){
			return "rainy season";
		}else {
			return "winter season";
		}
	}
	
	

}
