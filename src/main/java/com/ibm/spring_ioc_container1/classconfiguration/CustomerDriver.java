package com.ibm.spring_ioc_container1.classconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerDriver {

	public static void main(String[] args) {
	
		Customer customer = new AnnotationConfigApplicationContext(MyConfig.class).getBean(Customer.class);
		System.out.println(customer);
	}

}
