package com.nt.sbean;
import org.springframework.stereotype.Component;

@Component("javaclass")
public final class JavaCourse implements IMaterial {

	@Override
	public String examschedule() {
		// TODO Auto-generated method stub
		return "java course examschedule ";
	}

	@Override
	public String professionDetails() {
		// TODO Auto-generated method stub
		return "java course professionDetails";
	}

	@Override
	public String Sylabus() {
		// TODO Auto-generated method stub
		return "java course Sylabus";
	}

}
