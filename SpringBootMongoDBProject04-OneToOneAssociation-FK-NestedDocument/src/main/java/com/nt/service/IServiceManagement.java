package com.nt.service;

import java.util.List;

import com.nt.document.DrivingLicience;
import com.nt.document.Person;

public interface IServiceManagement {
	
	public String saveParentanditsChildNestedDocument(Person per);
	
	public String saveChildanditsParentNestedDocument(DrivingLicience dl);

}
