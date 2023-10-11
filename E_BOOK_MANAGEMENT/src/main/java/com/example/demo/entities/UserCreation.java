package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class UserCreation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int uid;
	String email;
	String uname;
	String phone;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
