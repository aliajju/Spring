package com.xworkz.spring.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.spring.Entity.CustomersEntity;

public class CustomersRepositoryImpl implements CustomersRepository {
	private SessionFactory factory;

	public CustomersRepositoryImpl(SessionFactory factory) {
		// TODO Auto-generated constructor stub
		System.out.println("created CustomersReositoryImpl" + this.getClass().getSimpleName());
		this.factory = factory;
	}

	@Override
	public void save(CustomersEntity entity) {

		System.out.println("invoked CustomersReositoryImpl" + entity);
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

}
