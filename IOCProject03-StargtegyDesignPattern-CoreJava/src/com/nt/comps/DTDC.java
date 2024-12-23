package com.nt.comps;

public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("dtdc classs");
	}

	@Override
	public String delivery(int oid) {
		// TODO Auto-generated method stub
		return ("DTDC  is ready to delivery"+oid+"oid amount");
	}

}
