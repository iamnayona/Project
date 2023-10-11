package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Author;
import com.example.demo.serviceimp.Authorserviceimp;

@RestController
public class AuthorController {
      @Autowired
      Authorserviceimp as;
      @PostMapping("/createauthor")
      Author createauthor(@RequestBody Author a) {
    	  return as.createAuthor(a);}
      @GetMapping("/getallauthors")
  	List<Author> getallauthor(){
  		return as.allAuthors();}
  	
  	@GetMapping("/getauthorbyid/{sid}")
  	Author getstudentbyid(@PathVariable("sid") int id){
  		return as.getAuthorbyid(id);}
  	
  	@PutMapping("/updatebyid/{id}")
  	Author updatebyid(@PathVariable("id") int id,@RequestBody Author std){
  		return as.updateAuthorbyid(id,std);}
  	
  	@DeleteMapping("/deletebyid/{id}")
  	String deletebyid(@PathVariable("id")int id) {
  		return as.deleteauthorbyid(id);
  	}
  	@PutMapping("/assignauthortobook/{bid}/{aid}")
  	String assignbooktoauthor(@PathVariable int bid,@PathVariable int aid) {
		return as.setbookandauthor(bid, aid);
  		
  	}
      
      
}
