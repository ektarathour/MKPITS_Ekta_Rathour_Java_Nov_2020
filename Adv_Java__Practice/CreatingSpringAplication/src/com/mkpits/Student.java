package com.mkpits;

public class Student {
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("name:"+name);
		System.out.println("address:"+address);
		;
	}
	

}
