package com.nt.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.DrivingLicience;

public interface IDLRepo extends MongoRepository<DrivingLicience, String> {
	
}
