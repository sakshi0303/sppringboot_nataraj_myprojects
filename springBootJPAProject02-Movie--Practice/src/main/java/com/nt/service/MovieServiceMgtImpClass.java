package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieDAO;

@Service
public class MovieServiceMgtImpClass implements IIMovieServiceMgt {
	
	@Autowired
	private  IMovieDAO dao;
	
	
	@Override
	public String register(Movie myMovie) {
		System.out.println("myMovie: before id"+myMovie);
		Movie saveobj=dao.save(myMovie);
		System.out.println("myMovie: after id"+saveobj);
		return "my movie saveobj+="+saveobj;
	}


	@Override
	public Long countno(Integer id) {
		//dao.
		return dao.count();
		
	}
	

}
