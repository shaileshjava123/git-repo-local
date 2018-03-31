package com.ecomtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactDaoDb {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
//	@Column(unique = true)
	String email;
	String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactDao [name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	
	
	
	
	
}
