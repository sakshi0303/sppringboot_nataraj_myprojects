package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("dotnetclass")
public final class DotNetCourse implements IMaterial {

	@Override
	public String examschedule() {
		// TODO Auto-generated method stub
		return "DotNet course examschedule ";
	}

	@Override
	public String professionDetails() {
		// TODO Auto-generated method stub
		return "DotNet course professionDetails";
	}

	@Override
	public String Sylabus() {
		// TODO Auto-generated method stub
		return "DotNet course Sylabus";
	}

}
