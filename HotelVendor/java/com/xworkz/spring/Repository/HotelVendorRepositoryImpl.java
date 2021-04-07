package com.xworkz.spring.Repository;

import com.xworkz.spring.Entity.HotelVendorEntity;


public class HotelVendorRepositoryImpl implements HotelVendorRepository {
	
	public HotelVendorRepositoryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save" + entity);

	}

}
