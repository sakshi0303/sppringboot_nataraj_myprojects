package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.PersonalInfo;
import com.nt.repo.IPInfoRepo;

@Service
public class PInfoServiceMgmtImp implements IPInfoServiceMgmt {
	
	@Autowired
	private IPInfoRepo prepo;

	@Override
	public String registerPerson(PersonalInfo per) {
		
		return "person is registered successfully with id: "+prepo.insert(per).getId();
	}

	@Override
	public String registerMultiple(List<PersonalInfo> persons) {
		prepo.insert(persons);
		return persons.size()+"persons are saved at once";
	}

}
