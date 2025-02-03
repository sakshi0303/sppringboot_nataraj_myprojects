package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICompanyServiceMgmt;

@Component
public class DPTestAssociationOneToManyBiDirectional implements CommandLineRunner {
	
	@Autowired
	private ICompanyServiceMgmt service;
	
	@Override
	public void run(String... args) throws Exception {
		//System.out.println(service.savedatausingparent());
		//System.out.println(service.savedatausingchild());
		
		//service.loadallParentAnditsAssociatedChildObjsOnetoManyDefaultfetchTypeLAZY();
		//service.loadrecordsfromChildManyToOneDefaultfetctypeEAGER();
		//service.deleteparentanditsAssociatedChild(103);
		//service.deletefromChildrecordthathassiblingrecord(5);
		//System.out.println(service.addingAnotherChildtoParent(100));
		
//		List<Object[]> list =service.getHQLinnerjoinFromCustomParentRepo();
//		list.forEach(row->{
//			for(Object col:row) {
//				System.out.print(" "+col);
//			}
//			System.out.println();
//			
//		});
		
//		List<Object[]> list1 =service.fromParentTablegetHQLrightjoin();
//		list1.forEach(row->{
//			for(Object col:row) {
//				System.out.print(" "+col);
//			}
//			System.out.println();
//			
//		});
		
		List<Object[]> list1 =service.showChild2ParentJoinsData();
		list1.forEach(row->{
			for(Object col:row) {
				System.out.print(" "+col);
			}
			System.out.println();
			
		});
		
		

	}

}
