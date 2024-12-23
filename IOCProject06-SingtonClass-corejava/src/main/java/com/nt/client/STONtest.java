package com.nt.client;

import com.nt.ston.Printer;

/**
 * Hello world!
 */
public class STONtest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Printer p1=Printer.getInstance();
        Printer p2=Printer.getInstance();
        Printer p3=Printer.getInstance();
        
        System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
        System.out.println("p1==p2?"+(p1==p2));
        
    }
}
