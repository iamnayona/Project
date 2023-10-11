package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.UserCreation;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Userinterface;
@Component
public class Userserviceimp implements Userinterface {
	@Autowired
	UserRepository ur;
	@Override
	public UserCreation createuser(UserCreation user) {
		return ur.save(user);}

	@Override
	public UserCreation getuserbyid(int id) {
		return ur.findById(id).get();}

	@Override
	public List<UserCreation> allUser() {
		return ur.findAll();}

	@Override
	public UserCreation updateuserbyid(int id, UserCreation user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteuserbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
