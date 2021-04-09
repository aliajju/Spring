package com.xworkz.spring.Service;

import com.xworkz.spring.Entity.CustomersEntity;
import com.xworkz.spring.Repository.CustomersRepository;

public class CustomersServiceImpl implements CustomersService {
	
	private CustomersRepository customersRepository;
	
	public CustomersServiceImpl(CustomersRepository customersRepository) {
		// TODO Auto-generated constructor stub
		System.out.println("created CustomersServiceImpl" + this.getClass().getSimpleName());
		this.customersRepository=customersRepository;
	}

	@Override
	public boolean validateAndSave(CustomersEntity entity) {
		
		if (entity != null) {
			System.out.println("entity is valid");
			this.customersRepository.save(entity);
		} else {
			System.out.println("entity is not valid");
		}
		
		return false;
	}
	

}
