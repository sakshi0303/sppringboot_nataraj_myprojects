package com.nt.repository.offer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.offer.Offer;

public interface IOfferRepo extends JpaRepository<Offer, Integer> {

}
