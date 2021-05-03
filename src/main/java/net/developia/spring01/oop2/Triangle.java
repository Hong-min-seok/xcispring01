package net.developia.spring01.oop2;

import org.junit.Test;

public class Triangle extends Shape{
	
	int w = 10;
	int h = 10;
	
	@Override
	public void area() {
		res = w * h / 2;
	}
	
	@Test
	public void areatest() {
		Triangle t = new Triangle();
		t.area();
		System.out.println(res);
	}

}
