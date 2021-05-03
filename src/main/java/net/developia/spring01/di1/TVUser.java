package net.developia.spring01.di1;

import java.io.FileInputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TVUser {
	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/java/net/developia/spring01/di1/beaninit.xml"));
		
		// TV tv = new HyundaiTV();
		
		//GenericApplicationContext context = new GenericXmlApplicationContext("net/developia/spring01/di1/beaninit.xml");
		GenericApplicationContext context = new GenericXmlApplicationContext(TVUser.class, "beaninit.xml");
		TV tv = (TV) context.getBean("htv");
		
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
		//LgTV¿¡ OrangeSpeaker¸¦ setter injection
		
	}

}
