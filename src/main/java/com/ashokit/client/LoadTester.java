package com.ashokit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ashokit.entities.CustomerEntity;
import com.ashokit.util.HibernateUtil;

public class LoadTester {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		CustomerEntity customerEntity =  session.load(CustomerEntity.class, 101);
		System.out.println(customerEntity);
		session.close();
		HibernateUtil.closeSessionFactory();
		
	}
}
