package com.entity;

import lombok.Data;


@Data
public class Student {
	
	private int id;
	private String name;
	private String email;
	private String dob;
	private String address;
	private String phonenum;
	private String gender;
	private String password;
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getDob() {
		// TODO Auto-generated method stub
		return dob;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	public String Phonenum() {
		// TODO Auto-generated method stub
		return phonenum;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public void setName(String fname) {
		// TODO Auto-generated method stub
		this.name=fname;
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
		this.email=email2;
	}

	public void setDob(String dob2) {
		// TODO Auto-generated method stub
		
		this.dob=dob2;	
	}

	public void setAddress(String address2) {
		// TODO Auto-generated method stub
		this.address=address2;
	}

	public void setPhonenum(String phonenum2) {
		// TODO Auto-generated method stub
		this.phonenum=phonenum2;
	}

	public void setGender(String gender2) {
		// TODO Auto-generated method stub
		this.gender=gender2;
	}

	public void setPassword(String password2) {
		// TODO Auto-generated method stub
		this.password=password2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
