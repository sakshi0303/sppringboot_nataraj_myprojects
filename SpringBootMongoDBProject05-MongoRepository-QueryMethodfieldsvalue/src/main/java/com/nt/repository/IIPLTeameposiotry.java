package com.nt.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.IPLTeam;

public interface IIPLTeameposiotry extends MongoRepository<IPLTeam, String> {

	

	// by deault id will be 1 involve and we dont have to mention in fields 
	//ordinal postional parameter start_at=0
	@Query(fields = "{name:1,city:1,budget:1,captain:1}",value = "{captain:?0}")
	public List<IPLTeam> fetchbycaptain(String c); 
	
	//-->Throws ERROR non id columns cannot be 0 in fields, only id:0 can be used, rest all 1
	//@Query(fields = "{name:1,id:0,budget:1,captain:0}",value = "{name:?0}")  
	@Query(fields = "{name:1,id:0,budget:1,captain:1}",value = "{name:?0}")
	public List<Object[]> fetchbyname(String s);
	
	@Query(fields = "{budget:1,name:1,captain:1}",value = "{budget:?0}")
	public Object[] fetchbybudget(Integer Budget);
	
	// if budget column is not there in the mongodb document it will not show in the output.
	@Query(value = "{$or:[{name:?0},{name:?1},{name:?2}]}", fields="{id:0,name:1,budget:1,owner:1,city:1}")
	public List<Object[]> fetchbynames(String a,String b,String c);
	
	@Query(fields = "{name:1,city:1,budget:1,captain:1}",value = "{budget:{$gte:?0},budget:{$lte:?1}}")
	public List<Object[]> fetchbetweenBudget(Integer startbudget,Integer endbudget);
	
	//@Query(fields="{name:1,city:1}",value = "{name:{$regex:?0}}")
	@Query(fields="{id:0,name:1}" ,value="{name:{$regex:?0,$options:'i'}}")
	public List<Object[]> fetchbynamewithinitalchars(String initialchars);
	
}
