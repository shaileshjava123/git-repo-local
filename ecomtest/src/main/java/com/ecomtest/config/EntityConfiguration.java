package com.ecomtest.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ecomtest.entity.ContactDaoDb;
import com.ecomtest.entity.UserDetailsDb;



public class EntityConfiguration {

	public Session getSession()
	{
	Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(UserDetailsDb.class).addAnnotatedClass(ContactDaoDb.class);
	
	
	
	
	
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	
	Session session=sessionFactory.openSession();
	
	return session;
}
}
