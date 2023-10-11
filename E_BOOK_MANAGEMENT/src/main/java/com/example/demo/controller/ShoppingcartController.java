package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.serviceimp.Productserviceimp;

@RestController
public class ShoppingcartController {
	@Autowired
	Productserviceimp ps;
	@PostMapping("/createproduct")
	Product createproduct(@RequestBody Product pro) {
		return ps.setproduct(pro);}
	@GetMapping("/getallproductlist")
	List<Product> getallpro(){
		return ps.getallProduct();}
	@GetMapping("/getaproductbyid/{id}")
	Product getproductbyid(@PathVariable int id) {
		return ps.getbyid(id);
	}
}
