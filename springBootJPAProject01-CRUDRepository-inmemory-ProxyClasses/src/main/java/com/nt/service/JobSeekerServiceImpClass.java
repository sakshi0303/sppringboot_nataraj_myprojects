package com.nt.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;
@Service("jsService")
public class JobSeekerServiceImpClass implements IJobSeekerSrvMgtService {
	
	@Autowired
	private IJobSeekerRepository jsrepo;
	

	@Override
	public String register(JobSeeker js) {
		// TODO Auto-generated method stub
		System.out.println("jsrepo in-memory proxy class name"+jsrepo.getClass());
		System.out.println("proxy class implementated interface"+Arrays.toString(js.getClass().getInterfaces()));
		System.out.println("get only current class declared method"+Arrays.toString(jsrepo.getClass().getDeclaredMethods()));
		
		//js: old job_seker obj without id
		// saved js=new job_seekerobj  with record id value 
		
		//System.out.println("old js obj without id"+js.getJid());
		JobSeeker savedjs=jsrepo.save(js);
		
		//System.out.println("new js obj after save with id"+savedjs.getJid());
		return "jobseeker obj saved(record inserted) with id value: "+savedjs.getJid();
		
		
	}

	@Override
	public Boolean isidexist(int id) {
		Boolean flag=jsrepo.existsById(id);
		return flag;
	}

	@Override
	public Iterable<JobSeeker> findall() {
		return  jsrepo.findAll();
	}

	@Override
	public Long countv() {
		// TODO Auto-generated method stub
		return jsrepo.count();
	}

	@Override
	public Iterable<JobSeeker> findallbyids(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return jsrepo.findAllById(ids);
	}

	@Override
	public Optional<JobSeeker> findbyID(int id) {
		 return jsrepo.findById(id);
		 	
	}

	@Override
	public String findbyId(int id) {
		Optional<JobSeeker> opt=jsrepo.findById(id);
		if(opt.isPresent()) {
			return "id found with tostring :"+opt.get().toString();
			
		}else {
			return "no id found";
			
		}
	}

	@Override
	public JobSeeker fetchbyIdOrElseThrow(int id) {
		JobSeeker js=jsrepo.findById(id).orElseThrow(()->new IllegalArgumentException("no record found"));
		return js;
		
	}

	@Override
	public JobSeeker fetchbiddummyOrElsedummyobj(int id) {
		JobSeeker js=  jsrepo.findById(id).orElse(new JobSeeker("swarna from dummy",0,false,00L,00.0f));
		
		return js;
	}

	@Override
	public String registerorupdate(JobSeeker js) {
		
		Optional<JobSeeker> opt= jsrepo.findById(js.getJid());
		if(opt.isPresent()) {
			int newid=jsrepo.save(js).getJid();
			return "Rrecod is updated properly with updated id"+newid;
			
		}
		else {
			int newid=jsrepo.save(js).getJid();
			return "Record is inserted properly with new id"+newid;
		}
		
				
	
	}

	@Override
	public String removeJobSeeker(int id) {
		
		Optional<JobSeeker> opt=jsrepo.findById(id);
		
		if (opt.isPresent()) {
			jsrepo.deleteById(id);
			return "id deleted successfully";
		}
		return "id not found";
		
	}

	@Override
	public String removejobSeakkerwithentireobj(JobSeeker js) {
		Optional<JobSeeker> opt=jsrepo.findById(js.getJid());
		if(opt.isPresent()) {
			jsrepo.delete(js);// whole obj is given
			return js.getJid()+"id is deleted";
		}
		return js.getJid()+"eid not found";
	}

	@Override
	public String removejobSeekerDeleteAllVoid() {
		Long count=jsrepo.count();
		if (count!=0) {
			jsrepo.deleteAll();
			return "all records are delete, 1 selelct and muple delete query, NO bulk delete return void always";
		}
		return "no record found";
	}

	@Override
	public String removejobSeekerbyIds(Iterable<Integer> ids) {
		
		Iterable<JobSeeker> validids=jsrepo.findAllById(ids);
		
		List<JobSeeker> list=(List<JobSeeker>)validids; //typecasting
		
		int count=list.size();
		jsrepo.deleteAllById(ids);
		return "no of records found and deleted"+count;
		
//		ids.forEach(id->{
//			Optional<JobSeeker> opt = jsrepo.findById(id);
//			if (opt.isPresent()) {
//				
//				jsrepo.deleteById(id);
//				System.out.println( "id row gor delted .deletebyid(ids)"+id);
//			}
//			System.out.println("id not found "+id);
//			
//		});
//		
//		return "deleted ids ";
	}

//	@Override
//	public String DeleteAllthorughIterableEntities(Iterable<?>...iterables) {
//		
//		Iterable<Long>
//		js.forEach((obj)->{
//			jsrepo.delete(obj);
//			
//		});
//		return "deleted all obj";
//	}
//	
	
	

}
