package com.ibm.spring_ioc_container1.classconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value= "myCustomer")
public class Customer {

	private int id;
	private String name;
	
	public Customer(@Value(value = "12345") int id,@Value(value = "Shagun") String name) {
		super();
		this.id = id;
		this.name = name;    // is tarike se bhi kersakte h 
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
