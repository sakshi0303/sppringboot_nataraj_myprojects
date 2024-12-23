package com.nt.factory;

import com.nt.comps.Diseal;
import com.nt.comps.Electric;
import com.nt.comps.Engine;
import com.nt.comps.Petrol;
import com.nt.comps.Vehicle;

public final class VehicleMethod {
	
	public VehicleMethod() {
		System.out.println("VehicleMethod is called");
	}
	
	public static Vehicle getinstance(String type) {
		
		Engine engine=null;
		if (type.equalsIgnoreCase("diseal")) {
			engine=new Diseal();
			 
		}else if(type.equalsIgnoreCase("petrol")) {
			engine=new Petrol();
		}else if(type.equalsIgnoreCase("Electric")) {
			engine=new Electric();
		}else {
			throw new IllegalArgumentException("illegal argument");
		}
		
		// Creating TargetClass
		
		Vehicle veh=new Vehicle();
		
		veh.setEngine(engine);
		
		return veh;
		
	}
	
	
	
	

}
