package com.xworkz.spring.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Custome")

public class CustomersEntity implements Serializable {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "PHONENO")
	private int phoneNo;
	@Column(name = "RATING")
	private int rating;
	@Column(name = "AGE")
	private int age;
	@Column(name = "EMAIL")
	private String email;

	public CustomersEntity(String name, String location, int phoneNo, int rating, int age, String email) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.location = location;
		this.phoneNo = phoneNo;
		this.rating = rating;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getPhoneNo() {
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

	public void setPhoneNo(int phoneNo) {
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
		return "CustomersEntity [id=" + id + ", name=" + name + ", location=" + location + ", phoneNo=" + phoneNo
				+ ", rating=" + rating + ", age=" + age + ", email=" + email + "]";
	}

}
