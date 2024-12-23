package com.nt.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class P1 {
	
	@Value("${per.name}")
	private String namep1;
	
	@Value("${os.name}")
	private String osnamep1;

	@Override
	public String toString() {
		return "P1 [namep1=" + namep1 + ", osnamep1=" + osnamep1 + "]";
	}
	
	

}
