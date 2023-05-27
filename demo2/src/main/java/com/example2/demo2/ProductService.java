package com.example2.demo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pr;
	
	public List<Product> getAllProduct() {
		
		return  pr.findAll();
	}
	
	
	public Product createProduct(int id,String name) {
		Product p=new Product();
		p.setId(id);
		p.setName(name);
		return pr.save(p);
		
	}

}
