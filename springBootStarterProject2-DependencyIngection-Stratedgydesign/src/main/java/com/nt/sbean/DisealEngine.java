package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("disealengine")
public final class DisealEngine implements IEngine {

	@Override
	public String engine_start() {
		
		return "Diseal engine started";
	}

	@Override
	public String engine_stop() {
		
		return "Diseal engine stopped";
	}

}
