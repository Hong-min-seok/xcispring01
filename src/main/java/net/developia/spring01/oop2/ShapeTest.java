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
	         System.out.println("�������� " + c.r + "�� ���� ���̴� " + s.res + "�Դϴ�.");
	      } else if (s instanceof Rectangle) {
	         Rectangle r = (Rectangle)s;
	         System.out.println("���ΰ� " + r.w + ",���ΰ� " + r.h + "�� �簢���� ���̴� " + s.res);
	      } else if (s instanceof Triangle) {
	    	  Triangle t = (Triangle)s;
	    	  System.out.println("���ΰ� " + t.w + ",���ΰ� " + t.h + "�� �ﰢ���� ���̴� " + t.res);
	      }
	   }
	}