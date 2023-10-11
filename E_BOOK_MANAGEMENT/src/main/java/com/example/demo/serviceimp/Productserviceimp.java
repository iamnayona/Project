package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.Productservice;
@Component
public class Productserviceimp implements Productservice {
	@Autowired
	ProductRepository pr;
	@Override
	public Product setproduct(Product pro) {
		return pr.save(pro) ;}
	@Override
	public String deleteprobyid(int id) {
		 pr.deleteById(id);
		 return "deletd";}

	@Override
	public Product updatebyid(int id, Product pro) {
		Product p=pr.findById(id).get();
		p.setAvailablequentity(pro.getAvailablequentity());p.setPname(pro.getPname());
		return pr.save(p);
	}

	@Override
	public Product getbyid( int id) {
		return pr.findById(id).get();
	}

	@Override
	public List<Product> getallProduct() {
		return pr.findAll();
		 
	}

}
