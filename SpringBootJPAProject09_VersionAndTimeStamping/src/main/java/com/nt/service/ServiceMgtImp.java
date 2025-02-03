package com.nt.service;

import java.util.Optional;

import javax.crypto.interfaces.DHPublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.AirtelCallerTune;
import com.nt.repository.IDAORepo;

import net.bytebuddy.asm.Advice.Return;

@Service
public class ServiceMgtImp implements IServMgt {
	
	@Autowired
	private IDAORepo actrepo;

	@Override
	public String RegisterableService(AirtelCallerTune act) {
		// TODO Auto-generated method stub
		
	Integer ntid=actrepo.save(act).getTid();
		return "new AirtelCallerTune is added with id= "+ntid;
	}

	@Override
	public Optional<AirtelCallerTune> showcallertunebyid(int id) {
		
		return actrepo.findById(id);
	}

	@Override
	public String  updateTnameWithID(Integer id, String newname) {
		Optional<AirtelCallerTune> act =actrepo.findById(id);
		if( act.isPresent()){
			AirtelCallerTune obj=act.get();
			
			obj.setTname(newname);
			AirtelCallerTune nobj =actrepo.save(obj);
			return nobj.getTid()+"version: "+nobj.getUpdateCount()+" createdAt "+nobj.getCreatedAt()+" updated at"+nobj.getUpdateAt();
			
			
		}else {
			 return "record not found";
		}
		
		
	}

}
