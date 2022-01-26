package com.ashokit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ashokit.entities.CustomerEntity;
import com.ashokit.service.PasswordService;
import com.ashokit.util.HibernateUtil;

public class ClientUtil {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
//		Transaction t = session.beginTransaction();
//		CustomerEntity customerEntity = new CustomerEntity(104, "Vijay", "vijay@gmail.com", 90897546523L);
//		session.save(customerEntity);
//		t.commit();
		CustomerEntity cust = session.load(CustomerEntity.class, 101);
		System.out.println(cust.getCustomerName());
		session.close();
		HibernateUtil.closeSessionFactory();
		
	}

}
