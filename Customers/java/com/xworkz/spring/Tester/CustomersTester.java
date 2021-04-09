package com.xworkz.spring.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.Entity.CustomersEntity;
import com.xworkz.spring.Service.CustomersService;

public class CustomersTester {
	
	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
		
		CustomersService service=container.getBean(CustomersService.class);
		CustomersEntity entity=new CustomersEntity("Swamy", "mangolare", 12345, 11, 25, "Swamy@gamil.com");
		service.validateAndSave(entity);
		
		
		
	}

}
