package com.cognizant.store.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.ExchangeServiceProxy.ProductExchangeServiceProxy;
import com.cognizant.store.entity.Product;
import com.cognizant.store.entity.Store;
import com.cognizant.store.repository.StoreRepository;
@Component
public class StoreDaoImpl implements StoreDao{
	@Autowired
	StoreRepository sr;
	@Autowired
	ProductExchangeServiceProxy serviceProxy;
	@Override
	public void addStore(Store store) {
		
		sr.save(store);
	}
	@Override
	public List<Product> getProduct(String name) {
		
		List<Integer>  list = new ArrayList<>();
		List<Product>  list1 = new ArrayList<>();
		list = sr.getProductNumberByStoreName(name);
		list.forEach(n -> list1.add(serviceProxy.getProductById(n)));
		return list1;
	}

}
