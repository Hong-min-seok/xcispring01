package net.developia.spring01.oop2;

public class ShapeTest {
	   public static void main(String[] args) {
	      printArea(new Circle());
	      printArea(new Rectangle());
	      printArea(new Triangle());
	   }

	   private static void printArea(Shape s) {
	      s.area();
	      if (s instanceof Circle) {
	         Circle c = (Circle)s;
	         System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + s.res + "입니다.");
	      } else if (s instanceof Rectangle) {
	         Rectangle r = (Rectangle)s;
	         System.out.println("가로가 " + r.w + ",세로가 " + r.h + "인 사각형의 넓이는 " + s.res);
	      } else if (s instanceof Triangle) {
	    	  Triangle t = (Triangle)s;
	    	  System.out.println("가로가 " + t.w + ",세로가 " + t.h + "인 삼각형의 넓이는 " + t.res);
	      }
	   }
	}