package net.developia.spring01.di4;

import java.io.IOException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	private FileOutputter fileOutputter;
	
	public void sayHello() {
		System.out.println(name + " ��, " + greeting);
		try {
			fileOutputter.output(name + " ��, " + greeting);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
