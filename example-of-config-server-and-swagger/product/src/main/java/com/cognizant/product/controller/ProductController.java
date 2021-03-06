package com.cognizant.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.product.model.Product;
import com.cognizant.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	@Qualifier("productService")
    private ProductService productService;
	@GetMapping("/getAll")
	public List<Product> getAllProduct(){
		return productService.getProductList();
	}
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id){
		return productService.getProduct(id);
	}
	@PutMapping("/add")
	public void addProduct(@RequestBody Product product){
		productService.addProduct(product);
	}
	@PostMapping("/modify/{id}")
	public void modifyProduct(@RequestBody Product product,@PathVariable int id){
		productService.addProduct(product);
	}
}
