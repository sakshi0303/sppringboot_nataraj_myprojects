package com.nt.comps;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart classs");
	}

	@Override
	public String delivery(int oid) {
		
		return "BlueDart is ready to  delivery"+oid+" with oid amount";
	}

}
