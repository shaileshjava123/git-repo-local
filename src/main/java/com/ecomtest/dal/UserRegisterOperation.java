package com.ecomtest.dal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ecomtest.config.EntityConfiguration;
import com.ecomtest.dao.UserDetails;
import com.ecomtest.entity.UserDetailsDb;

public class UserRegisterOperation {

	public boolean addRegUser(UserDetails userRegDetails) {

		try {
			// transfer from dao to entity

			UserDetailsDb userDetailsDb = new UserDetailsDb();
			userDetailsDb.setEmail(userRegDetails.getEmail());
			userDetailsDb.setPassword(userRegDetails.getPassword());
			userDetailsDb.setUserName(userRegDetails.getUserName());

			EntityConfiguration entityConfiguration = new EntityConfiguration();

			Session session = entityConfiguration.getSession();

			session.beginTransaction();

			session.save(userDetailsDb);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
