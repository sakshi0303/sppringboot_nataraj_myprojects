package com.nt.service;

import java.util.List;

import com.nt.document.PersonalInfo;

public interface IPInfoServiceMgmt {
	
	String registerPerson(PersonalInfo per);
	String registerMultiple(List<PersonalInfo> persons);

}
