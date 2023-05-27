package com.example2.demo2;

import java.util.List;
import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;

	@GetMapping("/products")
	public List<Product> getAllProduct() {

		return ps.getAllProduct();

	}

	@PostMapping(value = "/products", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> createProduct(@RequestBody Product p) {
		Product createProduct = ps.createProduct(p.getId(), p.getName());

		return ResponseEntity.ok(createProduct);

	}

}
