package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.springbeans.WishMessenger;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---main class----");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		// super class will only access common overridden method NOT DIREVT METHOD
		//Object obj=ctx.getBean("wmg");
		// So we need to TypeCasting, 
		//WishMessenger fixed=(WishMessenger)obj;
		//System.out.println(fixed.showMessage("Rohan"));
		
		//generic (double argument method("beanid","bean.class") dynamic return value changes
		// getbean  method with beanid wmg is invokend so lazy intialisation of wmg will happen
		WishMessenger generator =ctx.getBean("wmg", WishMessenger.class);
		System.out.println(generator.showMessage("Roy"));
		
		ctx.close();

	}

}
