package com.ibm.spring_ioc_container1.classconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Value(value = "123")
	private int id;
	
	@Value(value = "HP")
	private String name;
	
	@Value(value = "BLACK")
	private String color;
	
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
}
