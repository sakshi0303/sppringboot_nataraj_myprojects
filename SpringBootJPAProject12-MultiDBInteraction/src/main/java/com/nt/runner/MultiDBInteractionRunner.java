package com.nt.runner;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.offer.Offer;
import com.nt.entity.product.Product;
import com.nt.repository.offer.IOfferRepo;
import com.nt.repository.product.IProductRepo;

@Component
public class MultiDBInteractionRunner implements CommandLineRunner {
	
	
//	@Autowired
//	private IProductRepo prodrepo;
//	
	@Autowired
	private IOfferRepo offerrepo;

	
	@Override
	public void run(String... args) throws Exception {
//		Product p=new Product("laptop", 2300.0, new String[] {"electronics","reburnished","laptop"},10 );
//		Integer nid= prodrepo.save(p).getPid();
//		System.out.println("priduct saved with id: "+nid);
		
		System.out.println("------------");
		Offer o=new Offer("dewali-sale", "OCT01Z", 30.0, LocalDateTime.now());
		Integer oid=offerrepo.save(o).getOid();
		System.out.println("offer saved with id: "+oid);
		
		

	}

}
