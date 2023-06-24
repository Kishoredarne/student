package com.mongo.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

	private String street;
	private String city;
	private String country;
	private String pincode;
	
	public Address( ) {
		
	} 
	public Address(String street, String city, String country, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
}
