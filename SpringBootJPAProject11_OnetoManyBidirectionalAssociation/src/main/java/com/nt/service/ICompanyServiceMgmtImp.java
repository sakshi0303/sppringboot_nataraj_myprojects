package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Company;
import com.nt.entity.TechincalJob;
import com.nt.repository.ICompanyRepo;
import com.nt.repository.ITechJobRepo;

import jakarta.transaction.Transactional;

@Service
public class ICompanyServiceMgmtImp implements ICompanyServiceMgmt {
	
	
	@Autowired
	private ICompanyRepo comprepo;
	
	
	@Autowired
	private ITechJobRepo techJobrepo;


	@Override
	public String savedatausingparent() {
		
		Company comp1=new Company("IBM-now",98101L,"washington,USA");
		TechincalJob techjob1=new TechincalJob("Analysit-now",3000.0,10000.0,3);
		TechincalJob techjob2=new TechincalJob("Developer-now",12000.0,12000.0,1);
		
		//linking from parent ot child
		comp1.setJobs(Set.of(techjob1,techjob2));
		
		// linking from child to paarent 
		techjob1.setCompany(comp1);
		techjob2.setCompany(comp1);
		
		//save  parent to child obj
		Integer ncid= comprepo.save(comp1).getCid();
		
		
		
		
		return "Parent and its associated child obj are saved successfully companyid= "+ncid;
	}


	@Override
	public String savedatausingchild() {
		Company cmp2=new Company("Amdocs Child",1313L,"pune maharashtra");
		TechincalJob job1=new TechincalJob("Analysit-Child",3000.0,10000.0,3);
		TechincalJob techjob2=new TechincalJob("Developer-child",12000.0,12000.0,1);
		
		cmp2.setJobs(Set.of(job1,techjob2));
		
		job1.setCompany(cmp2); 
		techjob2.setCompany(cmp2);
		
		//save from child to parent obj
		techJobrepo.save(job1);
		//techJobrepo.save(techjob2);
		
		return "Child and its associated parent obj are saved successfully ";
	}


	@Override
	@Transactional
	public void loadallParentAnditsAssociatedChildObjsOnetoManyDefaultfetchTypeLAZY() {
		
		List<Company> clist=comprepo.findAll();
		//get all parents
		clist.forEach(comp->{
			System.out.println("parent-->"+comp);
			//get all child objs is @OnetoMany(fetch=fetchType.EAGER)
			Set<TechincalJob> joblist=comp.getJobs();
			
			// by default child obj are lazy loaded, only when child utilisationis called,
			//no db hibernate query hit
			
			
			// no need of hitiing the job opearion is @OnetoMany(fetch=fetchType.EAGER)
//			joblist.forEach(job->{
//				System.out.println("child-->"+job);
//				
//			});
			System.out.println("------");
		});
		
		
	}


	@Override
	public void loadrecordsfromChildManyToOneDefaultfetctypeEAGER() {
		// fetch from child class
		List<TechincalJob> jblist=techJobrepo.findAll();
		
		jblist.forEach(tjob->{
			System.out.println("child->"+tjob);
			System.out.println("parent-->"+tjob.getCompany());
			
			
		});
		System.out.println("-----------");
		
		
		
	}
	
	@Override
	public String deleteparentanditsAssociatedChild(Integer pid) {
		
		Optional<Company> cmpo= comprepo.findById(pid);
		
		if (cmpo.isPresent()) {
			comprepo.delete(cmpo.get());
			return "parent and its associated child class objs are deleted";
		}
		return "parent id not found";
	}
	
	@Override
	public String deletefromChildrecordthathassiblingrecord(Integer pid) {
		Optional<TechincalJob> opt= techJobrepo.findById(pid);
		if(opt.isPresent()) {
			techJobrepo.delete(opt.get());
			return "child and its parent and its parent's other child records are deleted successfullt";
		}
		
		
		return "id not found in child  TechnicalJobtable";
	}


	@Override
	public String addingAnotherChildtoParent(Integer parentid) {
		
		
		Optional<Company> opt=	comprepo.findById(parentid);
		System.out.println("--------------"+parentid+opt);
		if(opt.isPresent()) {
			Company cobj=opt.get();
			Set<TechincalJob> tjset= cobj.getJobs();
			TechincalJob nt=new TechincalJob("HElper",2000.00,3000.00,10);
			nt.setCompany(cobj);
			tjset.add(nt);
			cobj.setJobs(tjset);
			Integer cid=comprepo.save(cobj).getCid();
			return "another child added to parent id"+cid;
			
		}
		else {
			
			return "parent id nott found---------------------";
		}
		
	}


	@Override
	public List<Object[]> getHQLinnerjoinFromCustomParentRepo() {
		
		return comprepo.getHQLJOINS();
		
	}


	@Override
	public List<Object[]> showParent2ChildJoinsData() {
		// TODO Auto-generated method stub
		return comprepo.getHQLrightjoin();
	}


	@Override
	public List<Object[]> showChild2ParentJoinsData() {
		// TODO Auto-generated method stub
		return techJobrepo.getfromchildtoparentHQLjoins();
	}
	
	

	
	
	
	
	

}
