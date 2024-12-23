package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier{
	public DTDC() {
		System.out.println("DTDC zero param constructor");
	}

	@Override
	public String delivery() {
		// TODO Auto-generated method stub
		return "dtdc delivery";
	}

}
