package com.nt.core;

interface IAirthmatic{
	public int add(int a,int b);
}

public class LambaExpTest {
	
	public static void main(String args[]) {
		
		IAirthmatic ar1=(int a,int b)->{ // Anonymous class implementation and obj creation 
			return a+b; // and return the obj reference to interface variable name
			
		};
		System.out.println("ar1 "+ar1.add(10,20));
		
		IAirthmatic ar2=(int a,int b)->  a+b; //remove return in single line
		
		System.out.println("ar2 "+ar2.add(10,20));
		
		IAirthmatic ar3=( a,b)->  a+b; // remove the datatype
		
		System.out.println("ar3 "+ar3.add(10,20));
		
		IAirthmatic ar4=( x,y)->  x+y; // change the variable name
		
		System.out.println("ar4 "+ar4.add(100,10));
		
	}
	

}
