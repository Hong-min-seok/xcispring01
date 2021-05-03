package net.developia.spring01.di2;

import java.io.FileInputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TVUser {
	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/java/net/developia/spring01/di1/beaninit.xml"));
		
		// TV tv = new HyundaiTV();
		
		//GenericApplicationContext context = new GenericXmlApplicationContext("net/developia/spring01/di1/beaninit.xml");
		GenericApplicationContext context = new GenericXmlApplicationContext(TVUser.class, "beaninit.xml");
		
		TV tv = (TV) context.getBean("lgtv");
		
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
		//LgTV¿¡ OrangeSpeaker¸¦ setter injection
		
		TV tv2 = (TV) context.getBean("hyundaitv");
		
		tv2.powerOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.soundUp();
		tv2.soundUp();
		tv2.soundDown();
		tv2.powerOff();
		
		MessageBean message = (MessageBean) context.getBean("message");
		System.out.println(message.getMessage());
		System.out.println("hashCode : " + message.hashCode() + "\n");
		
		
		MessageBean message2 = (MessageBean) context.getBean("message");
		System.out.println(message2.getMessage());
		System.out.println("hashCode : " + message2.hashCode() + "\n");
		
	}

}
