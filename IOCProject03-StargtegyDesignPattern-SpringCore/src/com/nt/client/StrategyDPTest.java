package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public final class StrategyDPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fkptobj =ctx.getBean("fkpt", Flipkart.class);
		String msg=fkptobj.shopping(new String [] {"trolly","desktop" }, new double [] {5000.00,300.00});
		System.out.println(msg);
		// error: no unique bean id found 2
		// while injecting  has a property in target class, if multiple dependent class type is found, 
		//then "two unique bean id is found,need 1"
		
		// a> use @Primary at dependent class 1
		// b> use @Qualifier(dynamic bean id) recommended as beanid id can come dynamically from property file
		// c> use has a property type name should be same as bean id of one dependent class
		
		

	}

}
