package com.nt.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service
public class ServiceMgtImp implements IServiceMgmt {
	
	@Autowired
	public IDoctorRepo docrepo;

	@Override
	public String registerDoctor(Doctor doc) {
		Integer ndid= docrepo.save(doc).getDid();
		return "doctor saved successfully with id"+ndid;

	}

	@Override
	public List<Doctor> getalldocs() {
		
		return docrepo.findAll();
	}

	@Override
	public Float showdagebyid(Integer i) {
		// TODO Auto-generated method stub
		return docrepo.showagebyid(i);
	}

}
