package com.spring.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(PersonTest.class, "person.xml");
		//PersonService person = (PersonService) context.getBean("personService");
		PersonService person = context.getBean("personService", PersonService.class);
		
		person.sayHello();
	}

}
