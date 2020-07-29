package com.cognizant.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int product_id;
	String name;

	public Store() {

	}

	public Store(int id, int product_id, String name) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
