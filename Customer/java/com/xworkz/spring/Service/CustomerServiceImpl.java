package com.xworkz.spring.Service;

import com.xworkz.spring.Entity.CustomerEntity;
import com.xworkz.spring.Repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository2) {
		// TODO Auto-generated constructor stub
		System.out.println("created service" + this.getClass().getName());
		this.customerRepository=customerRepository2;
	}

	@Override
	public boolean validateAndSave(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		System.out.println("invoked validateAndSave" + customerEntity);
		if(customerEntity!=null) {
			System.out.println("entity is valid");
			
			customerRepository.save(customerEntity);
		}else {
				System.out.println("entity is notvalid");
				
			}
		
		return false;
	}
	

}
