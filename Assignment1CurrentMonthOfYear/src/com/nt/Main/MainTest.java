package com.nt.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Sbeans.SeasonFinder;
import com.nt.config.AppConfig;

public class MainTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main class-------");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
//		SeasonFinder obj =ctx.getBean("sf", SeasonFinder.class);
//		System.out.println(obj.ShowSeasonName("Sakshi season name"));
//		ctx.close();
		

	}

}
