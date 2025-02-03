package com.nt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.nt.document.IPLTeam;
import com.nt.repository.IIPLTeameposiotry;

import org.springframework.data.domain.Sort.Direction;

@Service
public class ServiceMgmtImp implements IServiceMgmt {
	
	@Autowired
	private IIPLTeameposiotry iplrepo;

	@Override
	public String registerIPLTeam(IPLTeam ipl) {
	String nid=	iplrepo.insert(ipl).getId(); // single entity save
		return "Successfully saved ipl with id: "+nid;
	}

	@Override
	public String registerMultipleTeams(List<IPLTeam> iplteams) {
		
		iplrepo.insert(iplteams); // iterrable SaveAll
		// TODO Auto-generated method stub
		return iplteams.size()+" records got inserted successfully";
	}

	@Override
	public List<IPLTeam> findall() {
		// TODO Auto-generated method stub
		return iplrepo.findAll();
	}
	
	@Override
	public IPLTeam findbyid(String id) {
		return iplrepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Illegal id"));
	}

	@Override
	public List<IPLTeam> showAlldatabySort(boolean ascOrder, String... props) {
		org.springframework.data.domain.Sort sort=org.springframework.data.domain.Sort.by(ascOrder?Direction.ASC:Direction.DESC, props);
		return iplrepo.findAll(sort);
	}

	

	

	
	

}
