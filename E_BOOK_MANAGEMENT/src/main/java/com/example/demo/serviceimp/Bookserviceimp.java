package com.example.demo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.entities.Book;


import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookInterface;
@Component
public class Bookserviceimp implements BookInterface {
	@Autowired
	BookRepository br;
	@Override
	public Book createbook(Book book) {	
		return  br.save(book);
	}

	@Override
	public Book getbookbyid(int id) {
		return br.findById(id).get();
	}
	@Override
	public List<Book> allbooks() {
		return br.findAll();
	}

	@Override
	public Book updatebookbyid(int id, Book book) {
		Book b=br.findById(id).get();b.setAuthor(book.getAuthor());b.setBname(book.getBname());b.setPublised_date(book.getPublised_date());
		return br.save(b);
	}

	@Override
	public String deletebookbyid(int id) {
		br.deleteById(id);
		return "deleted";}
	
	


}
