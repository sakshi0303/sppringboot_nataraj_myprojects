package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartMethod;

public final class StrategyDPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flipkart  fkpt=FlipkartMethod.getinstance("bluedart");
		String restmsg=fkpt.shopping(new String [] {"shirt","trouser"},new double[] {2000.0,5000.0});
		System.out.println(restmsg);
		
		
		Flipkart  fkpt2=FlipkartMethod.getinstance("dtdc");
		String restmsg2=fkpt.shopping(new String [] {"shirt","trouser"},new double[] {2000.0,5000.0});
		System.out.println(restmsg2);
	}

}
