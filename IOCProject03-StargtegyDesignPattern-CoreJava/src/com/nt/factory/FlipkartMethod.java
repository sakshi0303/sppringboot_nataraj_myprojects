package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public final class FlipkartMethod {
	
	public static Flipkart   getinstance(String type) {
		Courier courier=null; 
		if (type.equalsIgnoreCase("bluedart")) {
			courier= new BlueDart();
		}else if(type.equalsIgnoreCase("dtdc")) {
			courier=new DTDC();
		}else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		
		// creating target class object
		Flipkart fkpt=new Flipkart();
		fkpt.setCourier(courier);
		
		return fkpt;
	}

}
