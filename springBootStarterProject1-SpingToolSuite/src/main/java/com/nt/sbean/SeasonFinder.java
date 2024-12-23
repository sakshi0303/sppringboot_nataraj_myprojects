package com.nt.sbean;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("sf")
public class SeasonFinder {
	public SeasonFinder() {
		System.out.println("Season finder class");
	}	
	@Autowired
	private LocalDate dt;
	//b-method
	public String Seasonbuisnessm() {
		int dtm=dt.getMonthValue();
		if(dtm<4) {
			return "Summer Season";
		}else if(dtm<10){
			return "Rainy Season";
		}else {
			return "Winter Season";
		}
	}
}