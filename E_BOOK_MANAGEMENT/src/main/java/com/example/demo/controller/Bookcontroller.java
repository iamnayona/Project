package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.serviceimp.Bookserviceimp;
@RestController
public class Bookcontroller {
	      @Autowired
	     Bookserviceimp bs;
	      @PostMapping("/createbook")
	      Book createauthor(@RequestBody Book b) {
	    	  return bs.createbook(b);}
	      @GetMapping("/getallbooks")
	  	List<Book> getallbook(){
	  		return bs.allbooks();}
	  	
	  	@GetMapping("/getbookbyid/{sid}")
	  	Book getbookbyid(@PathVariable("sid") int id){
	  		return bs.getbookbyid(id);}
	  	
	  	@PutMapping("/updatebookbyid/{id}")
	  	Book updatebookbyid(@PathVariable("id") int id,@RequestBody Book std){
	  		return bs.updatebookbyid(id, std);}
	  	
	  	@DeleteMapping("/deletebookbyid/{id}")
	  	String deletebookbyid(@PathVariable("id")int id) {
	  		return bs.deletebookbyid(id);}
	  	
	  	
	      

}
