package com.ecomtest.dal;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ecomtest.config.EntityConfiguration;
import com.ecomtest.dao.ContactDao;
import com.ecomtest.entity.ContactDaoDb;

public class ContactOperation {

	public boolean addContact(ContactDao contactDao) {

		try {
			ContactDaoDb contactDaoDb = new ContactDaoDb();

			EntityConfiguration entityConfiguration = new EntityConfiguration();

			Session session = entityConfiguration.getSession();

			session.beginTransaction();

			contactDaoDb.setName(contactDao.getName());
			contactDaoDb.setEmail(contactDao.getEmail());
			contactDaoDb.setMessage(contactDao.getMessage());

			session.save(contactDaoDb);

			session.getTransaction().commit();

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}
