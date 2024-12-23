package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.ston.Printer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Printer p1= ctx.getBean("prn", Printer.class);
    	Printer p2=ctx.getBean("prn", Printer.class);
    	
    	System.out.println(p1.hashCode()+"  "+p2.hashCode());
    	
    			
    }
}
