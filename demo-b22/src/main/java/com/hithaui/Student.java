package com.hithaui;

public class Student {
	private String ID;
	private String Name;
	private String Email;
	private String Address;
	
	public Student() {
		
	}
	public Student(String ID, String Name, String Email, String Address)
	{
		this.ID = ID;
		this.Name=Name;
		this.Email=Email;
		this.Address=Address;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
