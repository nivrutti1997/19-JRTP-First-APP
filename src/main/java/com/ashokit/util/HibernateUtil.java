package com.ashokit.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	
	private HibernateUtil() {}
	
	public synchronized static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();			
		}
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
		
	}
}
