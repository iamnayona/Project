package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Product;

public interface Productservice {
	Product setproduct(Product pro);
	String deleteprobyid(int id);
	Product updatebyid(int id,Product pro);
	Product getbyid(int id);
	List<Product> getallProduct();

}
