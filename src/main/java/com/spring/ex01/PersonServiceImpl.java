package com.spring.ex01;

import lombok.Setter;

@Setter
public class PersonServiceImpl implements PersonService {

	private String name;
	private int age;
	
	@Override
	public void sayHello() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}

}
