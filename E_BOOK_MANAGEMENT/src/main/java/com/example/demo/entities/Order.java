package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="custorders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int oid;
	String orderdescription;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="U_id",referencedColumnName="uid")
	UserCreation user;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="o_id",referencedColumnName="oid")
	List<Shoppingcart> cartItems;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrderdescription() {
		return orderdescription;
	}
	public void setOrderdescription(String orderdescription) {
		this.orderdescription = orderdescription;
	}
	public UserCreation getUser() {
		return user;
	}
	public void setUser(UserCreation user) {
		this.user = user;
	}
	public List<Shoppingcart> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<Shoppingcart> cartItems) {
		this.cartItems = cartItems;
	}
	
	
}
