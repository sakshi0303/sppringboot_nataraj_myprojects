package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("bluedart")
public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart zero param constructor");
	}

	@Override
	public String delivery() {
		return "BlueDart delivery";
	}

}
