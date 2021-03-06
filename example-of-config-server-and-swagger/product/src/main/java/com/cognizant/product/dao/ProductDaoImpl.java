package com.cognizant.product.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.product.model.Product;
import com.cognizant.product.repository.ProductRepository;
@Component
public class ProductDaoImpl implements ProductDao{
	@Autowired
    private ProductRepository productRepository;
	@Override
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<>();
		productRepository.findAll().forEach(product -> list.add(product));
		return list;
	}
	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	@Override
	public void modifyProduct(Product product) {
		productRepository.save(product);
	}
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

}
