package com.nt.comps;
// target class
public final class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle");
	}
	
	// has a composition
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine=engine;
		// TODO Auto-generated method stub
		
	}
	
	public void enginebuisnesslogic() {
		String msg=engine.startsWith();
		System.out.println("enginebuisnesslogic()"+msg);
	}

}
