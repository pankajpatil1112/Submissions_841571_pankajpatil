package com.cognizant.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cognizant.product.model.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
