package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MatrimonialProfile;
import com.nt.repository.IMarriageRepo;

@Service
public class MatrimonyServiceImple implements IMatrimonyService{
	
	@Autowired
	private IMarriageRepo repo;

	@Override
	public String registerInfo(MatrimonialProfile profile) {
	Integer id=repo.save(profile).getPid();
		return "profile saved successfully with id: "+id;
	}

}
