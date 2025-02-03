package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.PersonalInfo;

public interface IPInfoRepo extends MongoRepository<PersonalInfo, String> {

}
