package com.ibm.spring_ioc_container1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		
	ApplicationContext ap = new ClassPathXmlApplicationContext("myspring.xml");
	Student st = (Student) ap.getBean("Student");
	int a = st.avrage(14);
	System.out.println(a);
	System.out.println(st);
	} 
}
