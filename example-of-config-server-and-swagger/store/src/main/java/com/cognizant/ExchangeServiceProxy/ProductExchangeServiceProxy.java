package com.cognizant.ExchangeServiceProxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.store.entity.Product;
@FeignClient(name = "product-service")
public interface ProductExchangeServiceProxy {
	@GetMapping("/product/{product_id}")
	public Product getProductById(@PathVariable("product_id") int id);
}
