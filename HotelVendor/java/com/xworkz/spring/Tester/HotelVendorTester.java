package com.xworkz.spring.Tester;

import com.xworkz.spring.Constants.VendorType;
import com.xworkz.spring.Entity.HotelVendorEntity;
import com.xworkz.spring.Repository.HotelVendorRepository;
import com.xworkz.spring.Repository.HotelVendorRepositoryImpl;
import com.xworkz.spring.Service.HotelVendorService;
import com.xworkz.spring.Service.HotelVendorServiceImpl;

public class HotelVendorTester {
	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("ali", "hospet", 5, 234567,
				VendorType.PRIVATE_LIMITED, "Silk board", "ali.xworkz@gmail.com");

		HotelVendorRepository repository = new HotelVendorRepositoryImpl();
		repository.save(entity);

		HotelVendorService vendorService = new HotelVendorServiceImpl(repository);
		vendorService.validateAndSave(entity);
	}

}
