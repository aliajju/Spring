package com.xworkz.spring.Repository;

import com.xworkz.spring.Entity.CustomerEntity;

public class CustomerRepositoryImpl  implements CustomerRepository{
	
	public CustomerRepositoryImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("created Repo" + this.getClass().getName());
	}

	@Override
	public void save(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save" + customerEntity);
		
	}
	

}
