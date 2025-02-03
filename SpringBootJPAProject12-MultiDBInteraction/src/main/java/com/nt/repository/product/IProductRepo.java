package com.nt.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.product.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
