package com.nt.client;
//implement strategy dp on vehicle and engine class(petrol engine, deseal engine,electric engine)

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleMethod;

public class StrategyDesignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle veh=VehicleMethod.getinstance("diseal");
		veh.enginebuisnesslogic();

	}

}
