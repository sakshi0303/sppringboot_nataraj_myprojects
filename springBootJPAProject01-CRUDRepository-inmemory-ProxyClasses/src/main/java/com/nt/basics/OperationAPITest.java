package com.nt.basics;

import java.util.Date;
import java.util.Optional;

import org.antlr.v4.runtime.atn.SemanticContext.AND;

import com.nt.entity.JobSeeker;

public class OperationAPITest {
	
	
	public static Optional<Date> getmonth(int n){
		if (n>0 && n<=12) {
			return Optional.of(new Date());
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Date> opt= getmonth(112);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}else {
			System.out.println("invalid month");
		}
		

	}

}
