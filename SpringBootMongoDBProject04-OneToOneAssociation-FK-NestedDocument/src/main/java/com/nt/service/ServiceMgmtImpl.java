package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicience;
import com.nt.document.Person;
import com.nt.repo.IDLRepo;
import com.nt.repo.IPersonRepo;

@Service
public class ServiceMgmtImpl implements IServiceManagement {
	@Autowired
	private IPersonRepo perrepo;
	
	@Autowired
	private IDLRepo dlrepo;
	

	@Override
	public String saveParentanditsChildNestedDocument(Person per) {
		return perrepo.insert(per).getId()+"per saved with its nested dl";
	}

	@Override
	public String saveChildanditsParentNestedDocument(DrivingLicience dl) {
		return dlrepo.insert(dl).getId()+"dl saved with its nested person";
	}

}
