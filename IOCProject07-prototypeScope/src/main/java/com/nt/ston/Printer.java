package com.nt.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("prn")
//@Scope("prototype") // whenever bean id is called  it will create the new bean id
public class Printer {
	
	private static Printer instance;
	
	public static Printer getinstance() {
		if (instance==null) {
			instance=new Printer();
		}
		return instance;
	}
	
	// b-method
	public void getmessage(String msg) {
		System.out.println(msg);
	}

}
