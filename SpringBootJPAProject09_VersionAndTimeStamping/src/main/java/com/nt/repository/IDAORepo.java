package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.AirtelCallerTune;

public interface IDAORepo extends JpaRepository<AirtelCallerTune, Integer> {

}
