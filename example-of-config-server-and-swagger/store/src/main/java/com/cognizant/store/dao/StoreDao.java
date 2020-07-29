package com.cognizant.store.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.store.entity.Product;
import com.cognizant.store.entity.Store;

@Component
public interface StoreDao {
   public void addStore(Store store);
   public List<Product> getProduct(String name);
}
