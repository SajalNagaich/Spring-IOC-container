package com.ibm.spring_ioc_container1;

public class Employee {

	private int id;
	private String name;
	private String email;
	
	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
