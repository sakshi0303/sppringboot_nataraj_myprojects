package com.nt.service;

import java.time.LocalDate;
import java.util.Date;import org.springframework.objenesis.instantiator.android.Android10Instantiator;
import org.springframework.stereotype.Service;

@Service
public class ServiceMgmtClass implements IService {

	@Override
	public String findSeasonbasedonMonth() {
		LocalDate date=LocalDate.now();
		Integer month=date.getMonthValue();
		if(month>1 && month<7) {
			return "Summer Season";
		}else if(month>6 && month<9){
			return "Rainy Season";
		}else {
			return "Winter Season";
		}

	}

}
