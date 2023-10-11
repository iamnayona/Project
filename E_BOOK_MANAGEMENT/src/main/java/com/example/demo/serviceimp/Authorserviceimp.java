package com.example.demo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.Authorinterface;
@Component
public class Authorserviceimp implements Authorinterface {
	@Autowired
	AuthorRepository ar;
	@Autowired
	BookRepository br;
	
	@Override
	public Author createAuthor(Author author) {
		return ar.save(author);
	}

	@Override
	public Author getAuthorbyid(int id) {
		Author a=ar.findById(id).get();
		return a;
	}

	@Override
	public List<Author> allAuthors() {
		List<Author> ls=ar.findAll();
		return ls;
	}

	@Override
	public Author updateAuthorbyid(int id, Author au) {
		Author a=ar.findById(id).get();
		a.setAname(au.getAname());a.setPhone(au.getPhone());
		return ar.save(a) ;
		
	}

	@Override
	public String deleteauthorbyid(int id) {
		ar.deleteById(id);
		return "deleted";
	}

	@Override
	public String setbookandauthor(int bid, int aid) {
		Book b=br.findById(bid).get();
		 Author a=ar.findById(aid).get();
		List<Book> ls=new ArrayList();
		ls.add(b);
	a.setBook(ls);b.setAuthor(a);ar.save(a);
		
		return "assigned";
		
	}

	

}
