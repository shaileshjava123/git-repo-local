package com.ecomtest.dao;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserDetails {


	private Integer id;
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

	
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("userdetatils init method invoked.." );
	}

	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
	
	
	
	
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
