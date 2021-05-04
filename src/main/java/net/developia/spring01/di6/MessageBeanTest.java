package net.developia.spring01.di6;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageBeanTest {
	public static void main(String[] args) {
		GenericApplicationContext context = new GenericXmlApplicationContext(MessageBeanTest.class, "beaninit.xml");
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");
		
		messageBean.sayHello();
	}
}
