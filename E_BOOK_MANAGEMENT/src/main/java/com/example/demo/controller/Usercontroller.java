package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.entities.UserCreation;
import com.example.demo.serviceimp.Bookserviceimp;
import com.example.demo.serviceimp.Userserviceimp;
@RestController
public class Usercontroller {
	  @Autowired
	     Userserviceimp us;
	      @PostMapping("/createuser")
	      UserCreation createuser(@RequestBody UserCreation  uc) {
	    	  return us.createuser(uc);}
	      @GetMapping("/getalluser")
	  	List<UserCreation> getalluser(){
	  		return us.allUser();}
	  	
	  	@GetMapping("/getuserbyid/{uid}")
	  	UserCreation getbookbyid(@PathVariable("uid") int id){
	  		return us.getuserbyid(id);}
	  	
}
