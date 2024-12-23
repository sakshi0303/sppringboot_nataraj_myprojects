package com.nt.sbean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("cngengine")
public final class CNGEngine implements IEngine {

	@Override
	public String engine_start() {
		
		return "CNG engine started";
	}

	@Override
	public String engine_stop() {
		
		return "CNG engine stopped";
	}

}
