package com.nt.springbeans;
// TARGET CLASS
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("wmg")
@Lazy(true)
public class WishMessenger {
	
	///@Autowired field injecteion, setter and contructor method internall call the field injection
	private LocalDateTime gettime;
	private Date dt;
	
	
	public WishMessenger() {
		System.out.println("Wishmessanger with  NO Parametried Construtor ");
	}
	
//	@Autowired   // Parameterised Constructor Injection
//	public WishMessenger(LocalDateTime gettime ) {
//		System.out.println("Wishmessanger with parametried Construtor ");
//		this.gettime=gettime;
//		this.dt=new Date();
//	}
	
//	@Autowired // THROWS ERROR AS COMPILER WILL BE IN AMBIGUITY WHICH PARAMETRIED CONSTCTOR SHOULD IT CHOOSE
//	public WishMessenger(Date dt) {
//		System.out.println("Wishmessanger with parametried Construtor ");
//		this.dt=dt;
//	}
//	
	
	// setter Depenedency injection
//	@Autowired
//	public void setGettime(LocalDateTime gettime) {
//		System.out.println("setGettime() setter injection");
//		this.gettime=gettime;
//	}
//	
//	@Autowired
//	public void setDt() {
//		System.out.println("setDt() setter injection");
//		this.dt=new Date();
//	}
	
	// Arbitary method declarion
	@Autowired
	public void arbitarymethod(LocalDateTime gettime ) {
		System.out.println("arbitarymethod()");
		this.gettime=gettime;
	}
	
	@Autowired
	public void randommethod2() {
		System.out.println("randommethod2()");
		this.dt=new Date();
	}
	
	public String showMessage(String user) {
		System.out.println(gettime+"inside showmessage"+dt);
		
		int hours =gettime.getHour();
		if (hours<10) {
			return "gm"+user;
		}else if(hours<16){
			return "good afternoon"+user;
		}else if(hours<20) {
			return "good evening"+user;
		}else{
			return "gn"+user;
			}
	}
	
	

}
