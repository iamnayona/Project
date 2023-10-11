package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int a_id;
	String aname;
	String phone;
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL)
	 @JsonIgnoreProperties("book")
	List<Book> book;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public List<Book> getBook() {
		return book;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
}
