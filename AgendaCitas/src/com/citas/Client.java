package com.citas;

public class Client 
{
	private String id;
	private String name;
	private String lastName;
	private String phone;
	
	public Client(String id, String name, String lastName, String phone) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
