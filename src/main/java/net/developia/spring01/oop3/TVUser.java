package net.developia.spring01.oop3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
		
		Properties props = new Properties();
		props.load(new FileInputStream("src/main/java/net/developia/spring01/oop3/product.properties"));
		
		Class classTV = Class.forName(props.getProperty("tv"));
		Class classSpeaker = Class.forName(props.getProperty("speaker"));
		
		Speaker speaker = (Speaker)classSpeaker.getConstructor().newInstance();
		TV tv = (TV) classTV.getConstructor().newInstance();

		tv.setSpeaker(speaker);
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
