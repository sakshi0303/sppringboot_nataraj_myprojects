package com.nt.client;

import com.nt.bike.Bike;
import com.nt.factorymethod.Bikefactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// not interested in creating bike object instead need to access static methods
//		Bikefactory obj=new Bikefactory();
//		obj.getBike("standard").start();
		
		Bike b1=Bikefactory.getBike("standard");
		b1.start();b1.drive();b1.stop();b1.park();
		
		Bike b2=Bikefactory.getBike("electric");
		b2.start();b2.drive();b2.stop();b2.park();
		
		

	}

}
