package com.cognizant.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.store.entity.Product;
import com.cognizant.store.entity.Store;
import com.cognizant.store.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
   @Autowired
   StoreService ss;
   @PutMapping("/add")
   public void addStore(@RequestBody Store store){
	   ss.addStore(store);
   }
   @GetMapping("/{name}")
   public List<Product> getProduct(@PathVariable String name){
	   return ss.getProduct(name);
   }
}
