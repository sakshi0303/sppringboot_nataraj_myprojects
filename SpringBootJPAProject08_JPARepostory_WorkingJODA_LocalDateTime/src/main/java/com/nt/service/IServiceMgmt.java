package com.nt.service;

import java.time.LocalDateTime;
import java.util.List;

import com.nt.entity.Doctor;

public interface IServiceMgmt {
	
	public String registerDoctor(Doctor doc);
	public List<Doctor> getalldocs();
	public Float showdagebyid(Integer i);

}
