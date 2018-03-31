package com.ecomtest.dal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecomtest.config.EntityConfiguration;
import com.ecomtest.dao.UserDetails;
import com.ecomtest.entity.UserDetailsDb;

public class LoginOperation {

	
	
	public UserDetails userLogin(UserDetails userDetails) {
		
EntityConfiguration entityConfiguration=new EntityConfiguration();
		
		Session session=entityConfiguration.getSession();
		
			
		session.beginTransaction();
		
		Query query = session.createQuery("from UserDetailsDb where userName= ? AND password= ?");

		query.setParameter(0, userDetails.getUserName());
		query.setParameter(1, userDetails.getPassword());
		
		 
		
		UserDetailsDb userDetailsDb=(UserDetailsDb) query.uniqueResult();
		
		session.getTransaction().commit();
		
		if(userDetailsDb==null)
		{
			return null;
		}
		
		userDetails.setId(userDetailsDb.getId());
		userDetails.setEmail(userDetailsDb.getEmail());
		userDetails.setPassword(userDetailsDb.getPassword());
		userDetails.setUserName(userDetailsDb.getUserName());
		
		

		return userDetails;
		
		
		
		
		
	}

}
