package com.ibm.spring_ioc_container1.classconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop laptop = new AnnotationConfigApplicationContext(MyConfig.class).getBean(Laptop.class);
		System.out.println(laptop);
	}

}
