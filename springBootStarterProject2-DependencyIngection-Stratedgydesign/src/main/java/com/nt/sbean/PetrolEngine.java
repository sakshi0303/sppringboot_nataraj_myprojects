package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("petrolengine")
public class PetrolEngine implements IEngine {

	@Override
	public String engine_start() {
		
		return "Petrol engine started";
	}

	@Override
	public String engine_stop() {
		
		return "Petrol engine stopped";
	}

}
