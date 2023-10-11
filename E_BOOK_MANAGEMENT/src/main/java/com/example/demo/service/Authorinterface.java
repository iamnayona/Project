package com.example.demo.service;

import java.util.List;

//import com.example.demo.entities.Author;
import com.example.demo.entities.*;

public interface Authorinterface {
	Author createAuthor(Author Author);
	Author getAuthorbyid(int id);
	List<Author> allAuthors();
	Author updateAuthorbyid(int id,Author book);
	String deleteauthorbyid(int id);
	String setbookandauthor(int bid,int aid);
}
