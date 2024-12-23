package com.nt.factorymethod;

import com.nt.bike.Bike;
import com.nt.bike.ElecticBike;
import com.nt.bike.SportsBike;
import com.nt.bike.StandardBike;

public class Bikefactory {
	// here we are not interested bike-factory obj in main class, 
	//instead we abstract it and used static public get-bike directly
	public static Bike getBike(String type) {
		if (type.equalsIgnoreCase("standard")) {
			return new StandardBike();
		}else if(type.equalsIgnoreCase("electric")){
			return new ElecticBike();
		}else if(type.equalsIgnoreCase("sports")) {
			return new SportsBike();
		}else {
			throw new IllegalArgumentException("invalid bike type");
		}
		
	}

}
