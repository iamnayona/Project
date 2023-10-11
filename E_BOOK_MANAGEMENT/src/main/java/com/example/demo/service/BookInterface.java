package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Book;

public interface BookInterface {
	Book createbook(Book book);
	Book getbookbyid(int id);
	List<Book> allbooks();
	
	Book updatebookbyid(int id,Book book);
	String deletebookbyid(int id);
	
}
