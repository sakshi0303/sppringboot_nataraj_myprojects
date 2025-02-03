package com.nt.service;

import java.util.Optional;

import javax.imageio.spi.RegisterableService;

import com.nt.entity.AirtelCallerTune;

public interface IServMgt {
	
	public String RegisterableService(AirtelCallerTune tune);
	
	public Optional<AirtelCallerTune> showcallertunebyid(int id);
	
	public String updateTnameWithID(Integer id,String newname);

}
