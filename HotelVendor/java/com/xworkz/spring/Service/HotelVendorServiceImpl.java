package com.xworkz.spring.Service;

import com.xworkz.spring.Entity.HotelVendorEntity;
import com.xworkz.spring.Repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService{
	
	private HotelVendorRepository repository;

	public HotelVendorServiceImpl(HotelVendorRepository repository) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.repository = repository;
	}

	public boolean validateAndSave(HotelVendorEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
