package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String bname;
	String publised_date;
	@ManyToOne()
	@JsonIgnoreProperties("author")
	 @JoinColumn(name="a_id")
	 Author author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getPublised_date() {
		return publised_date;
	}
	public void setPublised_date(String publised_date) {
		this.publised_date = publised_date;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}


}
