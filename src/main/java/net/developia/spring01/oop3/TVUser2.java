package net.developia.spring01.oop3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class TVUser2 {
	public static void main(String[] args) throws Exception {
		
		SamsungTV tv = new SamsungTV(new HDTV());

		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
