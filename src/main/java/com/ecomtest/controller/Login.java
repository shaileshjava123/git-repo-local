package com.ecomtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecomtest.config.springConfig;
import com.ecomtest.dal.LoginOperation;
import com.ecomtest.dal.UserRegisterOperation;
import com.ecomtest.dao.UserDetails;
import com.sun.glass.ui.Application;

@Controller
public class Login {

//	@Autowired
//	private UserDetails userDetails;
	
	@Autowired
	private ApplicationContext context;

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String userName, @RequestParam("password") String password) {

		
		System.out.println("entered to login..");
		
		
//		 AnnotationConfigApplicationContext context =
//		 new AnnotationConfigApplicationContext(springConfig.class);
		
		 UserDetails userDetails=context.getBean(UserDetails.class);

		
		LoginOperation loginOperation = new LoginOperation();

		userDetails.setUserName(userName);
		userDetails.setPassword(password);

		userDetails = loginOperation.userLogin(userDetails);

		if (userDetails!=null) {
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.addObject("username", userDetails.getUserName());

			modelAndView.setViewName("index");

			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.addObject("regStatusRed", "invalid username or password..");

			modelAndView.setViewName("register");

			return modelAndView;
		}
	}

	@RequestMapping(value = "/register")
	public ModelAndView register(@RequestParam("username") String userName, @RequestParam("email") String email,
			@RequestParam("password") String password) {

		
		
		System.out.println("entered to register..");
		
		boolean regsteredUser = false;
		ModelAndView modelAndView = new ModelAndView();
		UserRegisterOperation userRegister = new UserRegisterOperation();

//		 ApplicationContext context =
//		 new AnnotationConfigApplicationContext(springConfig.class);
		
		 UserDetails userDetails=context.getBean(UserDetails.class);
  
		
		
		userDetails.setUserName(userName);
		userDetails.setPassword(password);
		userDetails.setEmail(email);
		

		regsteredUser = userRegister.addRegUser(userDetails);

		if (regsteredUser) {

			modelAndView.addObject("regStatusGreen", "User Added Succesfully");

			modelAndView.setViewName("register");

		} else {
			modelAndView.addObject("regStatusRed", "Something Went Wrong..<br/> Please try after sometime");

			modelAndView.setViewName("register");
		}

		return modelAndView;
	}

}
