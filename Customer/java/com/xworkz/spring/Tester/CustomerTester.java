package com.xworkz.spring.Tester;

import com.xworkz.spring.Entity.CustomerEntity;
import com.xworkz.spring.Repository.CustomerRepository;
import com.xworkz.spring.Repository.CustomerRepositoryImpl;
import com.xworkz.spring.Service.CustomerService;
import com.xworkz.spring.Service.CustomerServiceImpl;

public class CustomerTester {
	
	public static void main(String[] args) {
		
		CustomerEntity customerEntity=new CustomerEntity("Ali", "Hospet", 9662345, 5, 30, "ajju@gmail.com");
		
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		customerRepository.save(customerEntity);
		
		CustomerService customerService=new CustomerServiceImpl(customerRepository);
		customerService.validateAndSave(customerEntity);
		
	}

}
