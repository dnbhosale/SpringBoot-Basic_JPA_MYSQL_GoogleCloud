package com.example2.demo2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {

	@Id
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

}
