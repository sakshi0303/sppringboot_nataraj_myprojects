package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.IPLTeam;

public interface IServiceMgmt {
	
	public String registerIPLTeam(IPLTeam ipl);
	public String registerMultipleTeams(List<IPLTeam> iplteams);
	

}
