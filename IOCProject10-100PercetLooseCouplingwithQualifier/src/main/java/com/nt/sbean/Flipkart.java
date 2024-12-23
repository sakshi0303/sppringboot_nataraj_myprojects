
package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fkpt")
public class Flipkart {
	
	//Issue1
	// @Qualifier("${courier.id}") error we have to user @Value from property file
	//@Qualifier( @Value("${courier.id}")) no nested annotation
	
	//Issue2
	//@Value("${courier.id}")
	//private String id ;
	//Issue3
	//@Qualifier(id);//The value for annotation attribute Qualifier.value must be a constant expression
	
	@Autowired
	@Qualifier("kart")
	private Courier courier;
	
	public String shopping() {
		String msg=courier.delivery();
		
		return "flipkart shopping method from "+msg;
	}

}
