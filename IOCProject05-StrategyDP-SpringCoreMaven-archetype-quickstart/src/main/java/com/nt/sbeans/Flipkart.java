package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.sbeans.Courier;

//Target Class
@Component("fkpt")
public final class Flipkart {
	public Flipkart() {
		System.out.println("Flipkart method");
	}
	@Autowired
	@Qualifier("bluedart") // prefered as the beanid can be taken directly from property file instead of changing src code
	private Courier courier;
		
	public String shopping(String items[], double prices[]) {
		double billamount=0.0f;
		for(double p:prices) {
			billamount+=p;
		}
		//bluedart courtype delivery type will be called
		int oid=new Random().nextInt(1000);
		String msg=courier.delivery(oid);
		return Arrays.toString(items)+"are shopped having amount: "+billamount+" msg->"+msg;
	}
	
}
