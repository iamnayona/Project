package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.*;

public interface Userinterface {
	UserCreation createuser( UserCreation user);
	UserCreation getuserbyid(int id);
	List<UserCreation> allUser();
	
	UserCreation updateuserbyid(int id,UserCreation user);
	String deleteuserbyid(int id);
	
}
