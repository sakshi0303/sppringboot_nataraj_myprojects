package com.nt.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Person;

public interface IPersonRepo extends MongoRepository<Person, String> {
	
	

}
