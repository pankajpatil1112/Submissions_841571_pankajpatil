package com.cognizant.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.store.entity.Store;
@Repository
public interface StoreRepository extends CrudRepository<Store, Integer>{
	@Query(value = "select product_id from store where name = ?1", nativeQuery = true)
    public List<Integer> getProductNumberByStoreName(String storeName);
}
