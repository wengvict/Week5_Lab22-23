package com.homeworkgc.CoffeeShop;

public class UserAccount {
	
	private String firstName;
	private String lastName; 
	private String gender;
	private String phone;
	private String email;
	private String password;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public UserAccount() {
		
	}

	public UserAccount(String firstName, String lastName, String gender, String phone, String email, String password,
			String street, String city, String state, String zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return firstName + ","+ lastName + "," + gender + "," + phone + 
				"," + email + "," + password + "," + street + "," + city +
				"," + state + "," + zip;
	}
	
	
	
		
}
