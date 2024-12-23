package com.nt.sbean;
import org.springframework.stereotype.Component;

@Component("phpcourseclass")
public final class PHPCourse implements IMaterial {

	@Override
	public String examschedule() {
		// TODO Auto-generated method stub
		return "PHP course examschedule ";
	}

	@Override
	public String professionDetails() {
		// TODO Auto-generated method stub
		return "PHP course professionDetails";
	}

	@Override
	public String Sylabus() {
		// TODO Auto-generated method stub
		return "PHP course Sylabus";
	}

}
