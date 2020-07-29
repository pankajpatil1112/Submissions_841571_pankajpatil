package com.cognizant.store.service;

import java.util.List;

import com.cognizant.store.entity.Product;
import com.cognizant.store.entity.Store;

public interface StoreService {
   public void addStore(Store store);
   public List<Product> getProduct(String name);
}
