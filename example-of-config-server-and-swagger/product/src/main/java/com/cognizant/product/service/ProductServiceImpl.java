package com.cognizant.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.product.dao.ProductDao;
import com.cognizant.product.model.Product;
@Service("productService")
public class ProductServiceImpl implements ProductService{
	@Autowired
    private ProductDao productDao;
	@Override
	public List<Product> getProductList() {
		return productDao.getAllProduct();
	}
	@Override
	public void addProduct(Product product) {
	    productDao.addProduct(product);
	}
	@Override
	public void modifyProduct(Product product) {
		  productDao.addProduct(product);
	}
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productDao.getProduct(id);
	}

}
