package com.ibm.spring_ioc_container1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("constructor.xml");
		
		Employee emp = (Employee) ap.getBean("employee");
		System.out.println(emp);
	}

}
