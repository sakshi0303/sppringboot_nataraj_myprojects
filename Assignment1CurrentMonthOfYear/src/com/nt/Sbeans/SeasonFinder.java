package com.nt.Sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("sf")
@Lazy(true)
public class SeasonFinder {
	
	
	public SeasonFinder() {
		System.out.println("SeasonFinderClass");
	}
	@Autowired
	private LocalDateTime datetime;
	
	
	public String ShowSeasonName(String User) {
		Month month=datetime.getMonth();
		
		if (month.getValue()==1) {
			return User+"happy newyear";
		}else if(month.getValue()==12) {
			return User+"Marry Chrishtmat";
		}else {
			return User+"Random Holiday";
		}
		
	}
	

}
