package com.nt.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.IPLTeam;

public interface IIPLTeameposiotry extends MongoRepository<IPLTeam, String> {

	

}
