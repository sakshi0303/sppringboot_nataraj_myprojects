package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Dependent class 1
//@Component("dtdc")
@Component("courier")
@Primary
@Lazy(true)
public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("dtdc classs");
	}

	@Override
	public String delivery(int oid) {
		// TODO Auto-generated method stub
		return ("DTDC  is ready to delivery"+oid+"oid amount");
	}

}
