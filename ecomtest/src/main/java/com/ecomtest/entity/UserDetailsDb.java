package com.ecomtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class UserDetailsDb {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(unique = true)
	private String userName;
	private String password;
	private String email;

//	public UserRegDetails(int id, String userName, String password, String email) {
//		super();
//		this.id = id;
//		this.userName = userName;
//		this.password = password;
//		this.email = email;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserRegDetails [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ "]";
	}

}
