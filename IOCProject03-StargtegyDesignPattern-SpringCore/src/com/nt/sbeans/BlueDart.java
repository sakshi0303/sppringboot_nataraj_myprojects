package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Dependent class 1
@Component("bluedart")
@Lazy(true)
public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart classs");
	}

	@Override
	public String delivery(int oid) {
		
		return "BlueDart is ready to  delivery"+oid+" with oid amount";
	}

}
