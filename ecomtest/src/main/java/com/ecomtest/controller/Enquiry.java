package com.ecomtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecomtest.dal.ContactOperation;
import com.ecomtest.dao.ContactDao;




@Controller
public class Enquiry {
	
	@Autowired
	private ApplicationContext context;

	@RequestMapping("/enquiry")
	public ModelAndView enquiry(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("message")String message)
	{
		
		Boolean status=false;
		
		ModelAndView modelAndView=new ModelAndView();
		
		ContactDao contactDao=context.getBean(ContactDao.class);
		
		contactDao.setEmail(email);
		contactDao.setMessage(message);
		contactDao.setName(name);
		
		System.out.println(contactDao);
		//add to db
		
		
		ContactOperation contactOperation=new ContactOperation();
		
		status=contactOperation.addContact(contactDao);
		
		if(status)
		{
		modelAndView.addObject("statusMsg", "<h3 style=\"color: green\" >message send successfull <br/> will be in touch soon <br/> Have a nice day..</h3>");
		}
		else
		{
			modelAndView.addObject("statusMsg", "<h3 style=\"color: red\" >something went wrong <br/> please try after some time.. <br/> thank you..</h3>");

		}
		modelAndView.setViewName("contact");
		
		return modelAndView;
	}
	
}
