package com.nt.comps;

import java.util.Arrays;
import java.util.Random;
import com.nt.comps.Courier;

public final class Flipkart {
	public Flipkart() {
		System.out.println("Flipkart method");
	}
	
	private Courier courier;
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}
	
	
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
