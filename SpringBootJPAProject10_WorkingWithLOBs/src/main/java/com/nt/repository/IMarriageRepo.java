package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.nt.entity.MatrimonialProfile;

@Service
public interface IMarriageRepo extends JpaRepository< MatrimonialProfile, Integer> {
	
	
}