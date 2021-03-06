package com.xworkz.spring.Entity;

import java.io.Serializable;

public class CustomerEntity implements Serializable {

	private String name;
	private String location;
	private long phoneNo;
	private int rating;
	private int age;
	private String email;

	public CustomerEntity(String name, String location, int phoneNo, int rating, int age, String email) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.location=location;
		this.phoneNo=phoneNo;
		this.rating=rating;
		this.age=age;
		this.email=email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerEntity other = (CustomerEntity) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public int getRating() {
		return rating;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + ", phoneNo=" + phoneNo + ", rating=" + rating
				+ ", age=" + age + ", email=" + email + "]";
	}

}
