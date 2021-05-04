package net.developia.spring01.di6;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component(value="messageBean")
public class MessageBeanImpl implements MessageBean {
	
	@Autowired 
	private FileOutputter fileOutputter;
	@Value("${name}")
	private String name;
	@Value("${greeting}")
	private String greeting;
	
	public void sayHello() {
		System.out.println(name + "¾¾, " + greeting);
		try {
			fileOutputter.output(name + "¾¾, " + greeting);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
