package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String pname;
	int availablequentity;
	float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAvailablequentity() {
		return availablequentity;
	}
	public void setAvailablequentity(int availablequentity) {
		this.availablequentity = availablequentity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
