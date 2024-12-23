package com.nt.ston;

// make singleton Class 
// make constructor private // other outer class cannot create the object of current class with new operator
// use  PUBLIC static factory method to check the singleton logic in getinstance
// check the singleton logic, if the object is already preset return that obj reference otherwise create new object
// obj refernce will be save in private static reference name , static factory method always use static variable
//  In multithreaded envoirnemt and cloning we can still create the object: those above code has minimum standard for creating singleton object  
public class Printer {
	// static method getinstance will only take static variable name
	private static Printer INSTANCE;
	
	private Printer() {
		// other outer class cannot create the object of current class with new operator
		System.out.println("Printer private construtor, no obj can be created outside class with new operator");
	}
	
	public static Printer getInstance() {
		if (INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE	;
	}
	
	//Business logic
	public void printmsg(String msg) {
		System.out.println("printer messane");
	}
	

}
